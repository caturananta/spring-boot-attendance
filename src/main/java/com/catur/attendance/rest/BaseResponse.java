package com.catur.attendance.rest;

import com.catur.attendance.constant.ResponseStatusConstant;
import com.catur.attendance.model.GeneralOutput;

public class BaseResponse {
	private String status;
	private String message;
	private String code;

//	public BaseResponse() {
//		makeSuccess("");
//	}
	
	public void setFrom(GeneralOutput out) {
		this.status=out.getSuccess()?ResponseStatusConstant.OK:ResponseStatusConstant.ERROR;
		this.message=out.getMessage();
		this.code=null;
	}

	public void makeSuccess(String msg) {
		this.status = ResponseStatusConstant.OK;
		this.message = msg;
	}

	public void makeError(String msg) {
		this.status = ResponseStatusConstant.ERROR;
		this.message = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
