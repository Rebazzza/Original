package com.heavylink.service;

import java.util.List;

import com.heavylink.model.Exam;

public interface IExamService {
	Exam save(Exam exam) throws  Exception;
	Exam update(Exam exam, Integer id) throws  Exception;
    List<Exam> findAll() throws  Exception;
    Exam findById(Integer id) throws  Exception;
    void delete(Integer id) throws  Exception;
}
