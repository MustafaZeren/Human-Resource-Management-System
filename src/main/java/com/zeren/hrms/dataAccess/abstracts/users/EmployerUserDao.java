package com.zeren.hrms.dataAccess.abstracts.users;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zeren.hrms.entities.users.EmployerUser;

public interface EmployerUserDao extends JpaRepository<EmployerUser,Integer> {

}
