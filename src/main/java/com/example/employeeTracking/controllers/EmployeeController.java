package com.example.employeeTracking.controllers;

import com.example.employeeTracking.models.Employee;
import com.example.employeeTracking.repositories.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/employees")

public class EmployeeController {

    @Autowired
    employeeRepository repository;

@GetMapping
private List<Employee> getAllEmployees(){
    return repository.findAll();
}


}
