package com.catur.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.catur.attendance.model.Report;
import com.catur.attendance.model.ReportPK;

public interface ReportRepo extends JpaRepository<Report, ReportPK>{
	
	 @Query("select rpt from Report rpt where rpt.key.email=:email and rpt.key.datein=:datein")
	 List<Report> getListReport (@Param("email") String email, @Param("datein") String datein);
	
}
