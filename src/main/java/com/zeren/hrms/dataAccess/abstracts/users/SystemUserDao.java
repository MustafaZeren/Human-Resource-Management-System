package com.zeren.hrms.dataAccess.abstracts.users;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zeren.hrms.entities.users.SystemUser;

public interface SystemUserDao extends JpaRepository<SystemUser,Integer> {

}
