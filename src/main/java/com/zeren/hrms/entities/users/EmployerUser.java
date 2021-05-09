package com.zeren.hrms.entities.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_employer")
public class EmployerUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name = "id")
	private int id;
	
	@Column(name = "webSite")
	private String webSite;
	
	@Column(name = "eMail")
	private String eMail;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "companyName")
	private String companyName;
	
	public EmployerUser() {}

	public EmployerUser(int id, String webSite, String eMail, String phoneNumber, String password, String companyName) {
		super();
		this.id = id;
		this.webSite = webSite;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
}
