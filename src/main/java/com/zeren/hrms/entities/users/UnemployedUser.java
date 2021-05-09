package com.zeren.hrms.entities.users;


import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "user_unemployed")
public class UnemployedUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name = "id")
	private int id;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "nationalIdentity")
	private long nationalIdentity;
	
	@Column(name = "eMail")
	private String eMail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "birthDate")
	private Date birthDate;

	public UnemployedUser() {
		
	}
	
	public UnemployedUser(int id, String firstName, String lastName, long nationalIdentity, String eMail,
			String password, Date birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.eMail = eMail;
		this.password = password;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(long nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
	
	
	
}
