package com.mongodb.test.dao;

import com.mongodb.test.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeedao extends MongoRepository<Employee,Integer> {

}
