package com.mongodb.test.service;

import com.mongodb.test.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface Employeeservice {

    public void createEmployee(List<Employee> emp);

    public Collection<Employee> getAllEmployee();

    public Optional<Employee> findEmployeeById(String id);

    public void deleteEmployee(String id);

    public void updateEmployee(Employee emp);

    public void deleteAllEmployee();
}
