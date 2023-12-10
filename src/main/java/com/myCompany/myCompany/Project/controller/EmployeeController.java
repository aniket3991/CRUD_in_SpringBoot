package com.myCompany.myCompany.Project.controller;

import com.myCompany.myCompany.Project.entity.Employee;
import com.myCompany.myCompany.Project.services.EmployeeServices;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeServices.createEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long employeeId){
        Employee employee = employeeServices.getEmployeeById(employeeId);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employeeList = employeeServices.getAllEmployee();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long employeeId, @RequestBody Employee employee){
        employee.setEmployeeId(employeeId);
        Employee updatedEmployee = employeeServices.updateEmployee(employee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("id")
    public ResponseEntity<String> deleteEmployee(@PathVariable("Id") Long employeeId){
        employeeServices.deleteEmployee(employeeId);
        return new ResponseEntity<>("Employee was deleted Successfully",HttpStatus.OK);
    }
}
