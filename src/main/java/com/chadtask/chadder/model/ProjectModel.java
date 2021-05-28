package com.chadtask.chadder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class ProjectModel {
	@Id
	private String ProjectId;
	
	@Column(name="project_name", nullable = false)
	private String ProjectName;
	
	@Column(name="project_start_date", nullable = false)
	private String ProjectStartDate;
	
	@Column(name="project_end_date", nullable = false)
	private String ProjectEndDate;

	@Column(name="project_percent", nullable=false)
	private String ProjectPercent;
	
	
	public ProjectModel() {
	}
	public ProjectModel(String projectId, String projectName, String projectStartDate, String projectEndDate) {
		ProjectId = projectId;
		ProjectName = projectName;
		ProjectStartDate = projectStartDate;
		ProjectEndDate = projectEndDate;
	}
	public String getProjectId() {
		return ProjectId;
	}
	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getProjectStartDate() {
		return ProjectStartDate;
	}
	public void setProjectStartDate(String projectStartDate) {
		ProjectStartDate = projectStartDate;
	}
	public String getProjectEndDate() {
		return ProjectEndDate;
	}
	public void setProjectEndDate(String projectEndDate) {
		ProjectEndDate = projectEndDate;
	}
	
	
}
