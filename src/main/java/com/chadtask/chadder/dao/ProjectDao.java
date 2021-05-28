package com.chadtask.chadder.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.chadtask.chadder.model.ProjectModel;

@Repository()
public interface ProjectDao extends CrudRepository<ProjectModel, String> {
	

}
