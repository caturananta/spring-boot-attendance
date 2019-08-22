package com.catur.attendance.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.catur.attendance.model.Absence;
import com.catur.attendance.model.UserLoginData;
import com.catur.attendance.rest.BaseResponse;
import com.catur.attendance.rest.UserLoginRequest;
import com.catur.attendance.rest.UserLoginResponse;
import com.catur.attendance.services.UserServices;

@RestController
public class UserController {
	
	@Autowired
	UserServices userServices;
	
	//catur - 04/05/19
	//user login controller
	@PostMapping (value = "/attm/login")
	public UserLoginResponse login (@RequestBody UserLoginRequest request) {
		
		UserLoginData data = userServices.login (request.getEmail(), request.getPassword());
		
		UserLoginResponse response = new UserLoginResponse();
		
		response.setProfile(data.getProfile());
		response.setFrom(data);
		
		return response;
		
	}
	
	//catur - 05/05/19
	//user absence
	@PostMapping (value = "/attm/checkin")
	public BaseResponse checkIn (@RequestParam("email") String email) throws SQLException {
		BaseResponse response = new BaseResponse();
	
		response = userServices.checkIn(email);
		
		return response;
		
	}
	
	//catur - 05/05/19
	//user go home
	@PostMapping (value = "/attm/checkout")
	public BaseResponse checkOut (@RequestParam("email") String email) throws SQLException {
		BaseResponse response = new BaseResponse();
	
		response = userServices.checkOut(email);
		
		return response;
		
	}

	//catur - 06/05/19
	//user absence history
	
}
