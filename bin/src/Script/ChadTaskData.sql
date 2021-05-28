drop database ChadTaskData;
create database ChadTaskData;
use ChadTaskData;
create table Project(project_id varchar(10) primary key, project_name varchar(60), project_start_date Date, project_end_date Date, project_percent int);
create table User(Email varchar(60) primary key, Password varchar(30), Nom varchar(30), Prenom varchar(60), NumeroImage Int);
create table Team(team_id Int primary key, team_name varchar(60), team_capacity Int);
create table TeamMember(TeamMemberId Int primary key, TeamMemberRole varchar(30), TeamId varchar(30));
create table Task(task_id varchar(30) primary key, task_name varchar(60), task_percent Int, task_statut varchar(30), task_location TEXT, project_id varchar(10), Email varchar(60));
create table Sub_Task(TaskId varchar(10) primary key, TaskName varchar(30), TaskPercent Int, TaskStatut varchar(30), TaskLocation text);
create table Task_Approbation(Task_ApprobationId BIGINT primary key auto_increment, Approbation_Role varchar(30), Task_Id varchar(10), Email varchar(60))
