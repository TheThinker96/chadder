package com.chadtask.chadder.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/*task_comment_id Int primary key auto_increment,
task_comment_message text,
task_comment_Date DateTime default current_timestamp,
task_id varchar(10),
email varchar(60)*/
@Entity
@Table(name="task_comment")
public class TaskComment {

}
