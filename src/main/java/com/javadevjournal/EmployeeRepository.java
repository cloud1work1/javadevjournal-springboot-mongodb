package com.javadevjournal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javadevjournal.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
