package com.chadtask.chadder.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chadtask.chadder.dao.ProjectDao;
import com.chadtask.chadder.model.ProjectModel;

@RestController
public class ProjectController {
	@Autowired
	private ProjectDao projectDao;

@GetMapping(value="/Project")
public  List<ProjectModel> getAllProject() {
	List<ProjectModel> Pm = (List<ProjectModel>) projectDao.findAll();
	return Pm;
}

@PostMapping(value="/Project")
public String SaveProject(@RequestBody ProjectModel project) {
	String Resultat ="";
	if(project != null) {
		ProjectModel pMo = projectDao.save(project);
		if(pMo != null) {
			Resultat="Projet enregistrer avec succès";
		}else {
			Resultat="Il y a eu un probleme au niveau de la requete";
		}
	}else {
		Resultat="l'instance envoyée est une instance null";
	}
	
	return Resultat;
}



}
