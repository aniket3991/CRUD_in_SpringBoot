package com.myCompany.myCompany.Project.repository;

import com.myCompany.myCompany.Project.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
