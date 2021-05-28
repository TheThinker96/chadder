package com.chadtask.chadder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*// task_id varchar(30) primary key,
task_name varchar(60), 
task_percent Int,
task_statut varchar(30),
task_location TEXT, 
task_dificulty varchar(20),
project_id varchar(10), 
Email varchar(60)*/
@Entity
@Table(name="Task")
public class TaskModel {
	@Id
	@Column(name="task_id", nullable=false)
	private String TaskId;
	
	@Column(name="task_name", nullable=false)
	private String TaskName;
	
	@Column(name="task_percent", nullable=false)
	private String TaskPercent;
	
	@Column(name="task_statut", nullable=false)
	private String TaskStatut;
	
	@Column(name="task_location", nullable=false)
	private String TaskLocation;
	
	@Column(name="task_dificulty", nullable=false)
	private String TaskDificulty;
	
	@Column(name="project_id", nullable=false)
	private String ProjectId;
	
	@Column(name="Email", nullable=false)
	private String Email;
	
	
	public TaskModel() {
		
	}
	
	public TaskModel(String taskId, String taskName, String taskPercent, String taskStatut, String taskLocation,
			String taskDificulty, String projectId, String email) {
	
		TaskId = taskId;
		TaskName = taskName;
		TaskPercent = taskPercent;
		TaskStatut = taskStatut;
		TaskLocation = taskLocation;
		TaskDificulty = taskDificulty;
		ProjectId = projectId;
		Email = email;
	}

	public String getTaskId() {
		return TaskId;
	}
	public void setTaskId(String taskId) {
		TaskId = taskId;
	}
	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	public String getTaskPercent() {
		return TaskPercent;
	}
	public void setTaskPercent(String taskPercent) {
		TaskPercent = taskPercent;
	}
	public String getTaskStatut() {
		return TaskStatut;
	}
	public void setTaskStatut(String taskStatut) {
		TaskStatut = taskStatut;
	}
	public String getTaskLocation() {
		return TaskLocation;
	}
	public void setTaskLocation(String taskLocation) {
		TaskLocation = taskLocation;
	}
	public String getTaskDificulty() {
		return TaskDificulty;
	}
	public void setTaskDificulty(String taskDificulty) {
		TaskDificulty = taskDificulty;
	}
	public String getProjectId() {
		return ProjectId;
	}
	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	

}
