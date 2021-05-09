package com.zeren.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeren.hrms.entities.Job;

public interface JobDao extends JpaRepository<Job,Integer>{

}
