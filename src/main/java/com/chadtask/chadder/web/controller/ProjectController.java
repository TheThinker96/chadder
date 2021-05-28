package com.chadtask.chadder.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chadtask.chadder.dao.ProjectDao;
import com.chadtask.chadder.model.ProjectModel;

@RestController
public class ProjectController {
	@Autowired
	private ProjectDao projectDao;

@GetMapping(value="/")
public  List<ProjectModel> getAllProject() {
	List<ProjectModel> Pm = (List<ProjectModel>) projectDao.findAll();
	return Pm;
}


}
