package com.zeren.hrms.dataAccess.abstracts.users;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zeren.hrms.entities.users.UnemployedUser;

public interface UnemployedUserDao extends JpaRepository<UnemployedUser,Integer> {

}
