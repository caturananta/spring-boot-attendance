package com.catur.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catur.attendance.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{
	
	User findByEmailAndPassword(String email, String password);
	User findByEmail(String email);
	
	
	
}
