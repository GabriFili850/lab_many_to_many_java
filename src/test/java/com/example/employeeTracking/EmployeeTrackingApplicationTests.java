package com.example.employeeTracking;

import com.example.employeeTracking.models.Department;
import com.example.employeeTracking.models.Employee;
import com.example.employeeTracking.models.Project;
import com.example.employeeTracking.repositories.DepartmentRepository;
import com.example.employeeTracking.repositories.ProjectRepository;
import com.example.employeeTracking.repositories.employeeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackingApplicationTests {

	@Autowired
	employeeRepository employeerepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	Employee employee;
	Department department;
	Project project;

	@Before
	public void before(){

	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void createNewEmployee(){
		department = new Department("Managment");
		departmentRepository.save(department);

		employee = new Employee("Katharina", 21, 12345, "katharina@email.com", department);
		employeerepository.save(employee);

		ArrayList listOfEmployees = new ArrayList();
		listOfEmployees.add(employee);


		project = new Project("Super Fancy Project", 5);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
