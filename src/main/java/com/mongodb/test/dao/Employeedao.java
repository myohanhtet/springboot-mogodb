package com.mongodb.test.dao;

import com.mongodb.test.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Employeedao extends MongoRepository<Employee,Integer> {

    Optional<Employee> findById(String id);

    void deleteById(String id);
}
