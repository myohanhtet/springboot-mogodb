package com.mongodb.test.service;

import com.mongodb.test.dao.Employeedao;
import com.mongodb.test.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class Employeeserviceimp implements Employeeservice{

    @Autowired
    Employeedao dao;

    @Override
    public void createEmployee(List<Employee> emp) {
            dao.saveAll(emp);
    }

    @Override
    public Collection<Employee> getAllEmployee() {
        return dao.findAll();
    }

    @Override
    public Optional<Employee> findEmployeeById(int id) {
        return dao.findById(id);
    }

    @Override
    public void deleteEmployee(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateEmployee(Employee emp) {
        dao.save(emp);
    }

    @Override
    public void deleteAllEmployee() {
        dao.deleteAll();
    }
}
