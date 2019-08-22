package com.catur.attendance.model;

public class GeneralOutput {
	private Boolean success;
	private String message;
	
	public GeneralOutput() {
		success=true;
		message="SUCCESS";
	}
	
	public void makeSuccess(String msg) {
		this.success=true;
		this.message=msg;
	}
	
	public void makeError(String msg) {
		this.success=false;
		this.message=msg;
	}	

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
