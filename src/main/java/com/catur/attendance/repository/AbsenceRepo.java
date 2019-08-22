package com.catur.attendance.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catur.attendance.model.Absence;
import com.catur.attendance.model.AbsencePK;

@Repository
public interface AbsenceRepo extends JpaRepository<Absence, AbsencePK>{
	
	Absence findByKeyEmailAndKeyDatein(String email, LocalDate dateIn);

}
