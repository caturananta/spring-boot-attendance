package com.catur.attendance.model;

public class UserLoginData extends GeneralOutput{
	
	public UserLoginData() {
		super();
	}

	private User profile;

	public User getProfile() {
		return profile;
	}

	public void setProfile(User profile) {
		this.profile = profile;
	}
}
