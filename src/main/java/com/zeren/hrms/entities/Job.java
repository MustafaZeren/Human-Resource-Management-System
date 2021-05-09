package com.zeren.hrms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_name")
	private String jobName;
	
	@Column(name = "job_desc")
	private String jobDesc;
	
	public Job() {}

	public Job(int id, String jobName, String jobDesc) {
		super();
		this.id = id;
		this.jobName = jobName;
		this.jobDesc = jobDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	
	

	
}
