package com.myCompany.myCompany.Project.services;

import com.myCompany.myCompany.Project.entity.Employee;

import java.util.List;

public interface EmployeeServices {

    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);

    List<Employee> getAllEmployee();

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long employeeId);
}
