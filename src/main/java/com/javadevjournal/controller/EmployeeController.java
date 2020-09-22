package com.javadevjournal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javadevjournal.entity.Employee;

@RestController
@RequestMapping("/template")
public class EmployeeController {

	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@GetMapping
	public List<Employee> findAll() {
		return mongoTemplate.findAll(Employee.class);
	}
	
	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return mongoTemplate.save(employee);
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") long id) {
		return mongoTemplate.findById(id, Employee.class);
	}
}
