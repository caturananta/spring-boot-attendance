package com.catur.attendance.rest;

import com.catur.attendance.model.History;

public class UserHistoryResponse extends BaseResponse{
	
	private History userHistory;

	public UserHistoryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public History getUserHistory() {
		return userHistory;
	}

	public void setUserHistory(History userHistory) {
		this.userHistory = userHistory;
	}

}
