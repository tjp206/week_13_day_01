package com.example.codeclan.employeeTrackingLab.repos;

import com.example.codeclan.employeeTrackingLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
