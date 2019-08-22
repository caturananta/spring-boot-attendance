package com.catur.attendance.model;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "absence")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Absence {
	
	@Id
	AbsencePK key;
	
	@Column(name = "time_out")
	private LocalTime timeOut;
	
	@Column(name = "lat_in")
	private Double latIn;
	
	@Column(name = "long_in")
	private Double longIn;

	@Column(name = "lat_out")
	private Double latOut;
	
	@Column(name = "long_out")
	private Double longOut;
	
	public Absence() {
		this.key = new AbsencePK();
	}

	public AbsencePK getKey() {
		return key;
	}

	public void setKey(AbsencePK key) {
		this.key = key;
	}

	public LocalTime getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(LocalTime timeOut) {
		this.timeOut = timeOut;
	}

	public Double getLatIn() {
		return latIn;
	}

	public void setLatIn(Double latIn) {
		this.latIn = latIn;
	}

	public Double getLongIn() {
		return longIn;
	}

	public void setLongIn(Double longIn) {
		this.longIn = longIn;
	}

	public Double getLatOut() {
		return latOut;
	}

	public void setLatOut(Double latOut) {
		this.latOut = latOut;
	}

	public Double getLongOut() {
		return longOut;
	}

	public void setLongOut(Double longOut) {
		this.longOut = longOut;
	}

}
