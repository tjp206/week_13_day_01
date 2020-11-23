package com.example.codeclan.employeeTrackingLab;

import com.example.codeclan.employeeTrackingLab.models.Employee;
import com.example.codeclan.employeeTrackingLab.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee tj = new Employee("TJ", 34, 1234, "tj@demo.com");
		employeeRepository.save(tj);
	}

}
