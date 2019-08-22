package com.catur.attendance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "users")
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class User {

//	Properties
	
	@Id
	@Column (name = "email")
	private String email;
	
	@Column (name = "username")
	private String name;
	
	@Column (name = "password")
	private String password;
	
	@Column (name = "status")
	private String status;
	
//	Getter & Setter
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
