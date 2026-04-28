package com.heavylink.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heavylink.model.Exam;

public interface IExamRepository 
			extends JpaRepository<Exam, Integer> {

}
