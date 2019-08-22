package com.catur.attendance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "report")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Report {
	
	@Id
	ReportPK key;
	
	@Column(name = "project")
	private String project;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "customer")
	private String customer;
	
	@Column(name = "pm")
	private String pm;
	
	@Column(name = "onsite")
	private String onsite;
	
	@Column(name = "detail")
	private String detail;
	
	@Column(name = "status")
	private String status;

	public Report() {
		this.key = new ReportPK();
	}

	public ReportPK getKey() {
		return key;
	}

	public void setKey(ReportPK key) {
		this.key = key;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public String getOnsite() {
		return onsite;
	}

	public void setOnsite(String onsite) {
		this.onsite = onsite;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
