package com.catur.attendance.services;

import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catur.attendance.constant.StatusConstant;
import com.catur.attendance.constant.StatusConstant;
import com.catur.attendance.model.Absence;
import com.catur.attendance.model.Report;
import com.catur.attendance.model.User;
import com.catur.attendance.model.UserLoginData;
import com.catur.attendance.repository.AbsenceRepo;
import com.catur.attendance.repository.ReportRepo;
import com.catur.attendance.repository.UserRepo;
import com.catur.attendance.rest.BaseResponse;

@Service
public class UserServices {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	AbsenceRepo absenceRepo;
	
	@Autowired
	ReportRepo reportRepo;
	
//	catur - 05/05/19
//	user log in
	public UserLoginData login ( String email, String password ) {
		
		UserLoginData data = new UserLoginData();
		User user = userRepo.findByEmailAndPassword(email, password);
		
		if ( user == null) {
			
			data.makeError("user tidak ditemukan!");
			return data;
			
		}
		
		data.setProfile(user);
		data.makeSuccess("SUCCESS");
		return data;
	}
	
//	catur - 05/05/19
//	user absen masuk
	public BaseResponse checkIn ( String email ) throws SQLException {
		BaseResponse response = new BaseResponse();
		Absence data = new Absence();
		Report report = new Report();
		
		if (!email.equals(null)) {
			
			data.getKey().setEmail(email);
			data.getKey().setDatein(LocalDate.now());
			data.getKey().setTimein(LocalTime.now());
			data.setLatIn(18.63469650);
			data.setLongIn(73.98948670);
			data.setLatOut(null);
			data.setLongOut(null);
			data.setTimeOut(null);
			
			response.makeSuccess("berhasil absen");
			absenceRepo.save(data);
			
		}
		
		report.getKey().setEmail(email);
		report.getKey().setDatein(data.getKey().getDatein());
		report.getKey().setTimein(data.getKey().getTimein());
		report.setStatus(StatusConstant.STATUS_PENDING);
		reportRepo.save(report);
		
		return response;
	}
	
//	catur - 05/05/19
//	user absen pulang
	public BaseResponse checkOut ( String email ) throws SQLException {
		BaseResponse response = new BaseResponse();
		
		if (!email.equals(null)) {
			
			Absence data = absenceRepo.findByKeyEmailAndKeyDatein(email, LocalDate.now());
			
			if (data.equals(null)) {
				response.makeError("data tidak ditemukan!");
			}
			
			data.setLatOut(18.63469650);
			data.setLongOut(73.98948670);
			data.setTimeOut(LocalTime.now());
			response.makeSuccess("berhasil absen pulang");
			absenceRepo.save(data);
			
		}
		
		return response;
	}
	
//	catur - 06/05/19
//	user create report
	public BaseResponse createReport ( String email) throws SQLException {
		BaseResponse response = new BaseResponse();
		
		if(!email.equals(null)) {
			
		}
		
		return response;
	}
	
//	catur - 06/05/19
//	draft report untuk diupdate
	public List<Report> getDraftWeeklyReport ( String email ) {
		
		List<Report> reports = reportRepo.getListReport(email, yesterday().toString());
		System.out.println("tgl "+yesterday().toString());
		return reports;
		
	}
	
//	catur - 06/05/19
//	get yesterday
	private Date yesterday() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    return cal.getTime();
	}
}
