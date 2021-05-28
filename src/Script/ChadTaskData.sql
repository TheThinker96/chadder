drop database ChadTaskData;
create database ChadTaskData;
use ChadTaskData;
create table project(project_id varchar(10) primary key, project_name varchar(60), project_start_date Date, project_end_date Date, project_percent int);
create table task(task_id varchar(30) primary key, task_name varchar(60), task_percent Int, task_statut varchar(30), task_location TEXT, task_dificulty varchar(20), project_id varchar(10), Email varchar(60));
create table task_approbation(task_approbation_id BIGINT primary key auto_increment, Approbation_Role varchar(30), Task_Id varchar(10), Email varchar(60));
create table task_comment(task_comment_id Int primary key auto_increment, task_comment_message text, task_comment_Date DateTime default current_timestamp, task_id varchar(10), email varchar(60))
create table user(email varchar(60) primary key, password varchar(30), nom varchar(30), prenom varchar(60), numero_image Int);
create table team(team_id Int primary key, team_name varchar(60), team_capacity Int);
create table team_member(team_member_id Int primary key, team_member_role varchar(30), team_id varchar(30));



