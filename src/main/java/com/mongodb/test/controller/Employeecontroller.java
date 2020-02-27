package com.mongodb.test.controller;

import com.mongodb.test.model.Employee;
import com.mongodb.test.service.Employeeservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
public class Employeecontroller {
    @Autowired
    Employeeservice empsvr;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/create")
    public String create(@RequestBody List<Employee> emp){
        System.out.println(emp);
        logger.debug("Save emp");
        empsvr.createEmployee(emp);
        return "Success created emp";
    }

    @GetMapping("/getall")
    public Collection<Employee> getall(){
        logger.debug("Get all data");
       return empsvr.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> showEmployee(@PathVariable(value = "id") int id)
    {
        logger.debug("FindById:",id);
        return empsvr.findEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable("id") int id,@RequestBody Employee e){
        logger.debug("Update employee {}",id);
        System.out.println(e);
        e.setId(id);
        empsvr.updateEmployee(e);
        return "Employee upated" + id;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        logger.debug("delete employee {}",id);
        empsvr.deleteEmployee(id);
        return "Delete User"+ id;
    }

    @DeleteMapping("delete/all")
    public String deleteAll()
    {
        empsvr.deleteAllEmployee();
        logger.debug("all user delete");
        return "Delete all user";
    }

}
