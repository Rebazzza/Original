package com.heavylink.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heavylink.model.Exam;
import com.heavylink.service.IExamService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exams")
public class ExamController {
	private final IExamService service;

	@GetMapping
    public List<Exam> findAll() throws Exception{
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Exam findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public Exam save(@RequestBody Exam exam) throws Exception{
        return service.save(exam);
    }

    @PutMapping("/{id}")
    public Exam update(@PathVariable("id") Integer id, @RequestBody Exam exam) throws Exception{
        return service.update(exam,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) throws Exception{
        service.delete(id);
    }
}
