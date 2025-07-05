package com.example.EmployeeApplication.repository;

import com.example.EmployeeApplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

