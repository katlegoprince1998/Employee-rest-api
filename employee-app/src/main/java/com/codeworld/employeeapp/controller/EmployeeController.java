package com.codeworld.employeeapp.controller;

import com.codeworld.employeeapp.entity.Employee;
import com.codeworld.employeeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3003")
@RequestMapping("/api")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String home(){
        return "Employee Management System\nBuilt By katlego Prince Mashego\nFrom Code World";
    }
    @PostMapping("/create")
    public Employee createEmploye(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @GetMapping("/get")
    public List<Employee> getEmployee(){
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return service.getEmployeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRecord(@PathVariable("id") Long id){
        service.deleteEmployee(id);
        return "Record deleted Successfully";
    }

    @PutMapping("/update/{id}")
    public Employee updateEmploye(@RequestBody Employee employee, @PathVariable("id") Long id){
        return service.updateEmployee(employee, id);
    }
}
