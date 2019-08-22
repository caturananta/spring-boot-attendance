package com.catur.attendance.rest;

import com.catur.attendance.model.User;

public class UserLoginResponse extends BaseResponse{

	private User profile;
	
	public UserLoginResponse() {
		super();
	}

	public User getProfile() {
		return profile;
	}

	public void setProfile(User profile) {
		this.profile = profile;
	}
	
}
