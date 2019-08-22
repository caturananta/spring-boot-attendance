package com.catur.attendance.model;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AbsencePK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "date_in")
	private LocalDate datein;
	
	@Column(name = "time_in")
	private LocalTime timein;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDatein() {
		return datein;
	}

	public void setDatein(LocalDate datein) {
		this.datein = datein;
	}

	public LocalTime getTimein() {
		return timein;
	}

	public void setTimein(LocalTime timein) {
		this.timein = timein;
	}
}
