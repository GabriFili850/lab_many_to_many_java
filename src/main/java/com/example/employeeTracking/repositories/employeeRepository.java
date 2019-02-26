package com.example.employeeTracking.repositories;


import com.example.employeeTracking.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Long> {


}
