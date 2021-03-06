package com.zeren.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeren.hrms.business.abstracts.JobService;
import com.zeren.hrms.dataAccess.abstracts.JobDao;
import com.zeren.hrms.entities.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobsDao;
	
    @Autowired
	public JobManager(JobDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}

	@Override
	public List<Job> getAll() {
		return this.jobsDao.findAll();
	}

	
}
