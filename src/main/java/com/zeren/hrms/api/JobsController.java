package com.zeren.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeren.hrms.business.abstracts.JobService;
import com.zeren.hrms.entities.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	private JobService jobsService;
	
	@Autowired
	public JobsController(JobService jobsService) {
		super();
		this.jobsService=jobsService;
	}
	
	@GetMapping("/getall")
	public List<Job> getAll(){
		return this.jobsService.getAll();
	}
}
