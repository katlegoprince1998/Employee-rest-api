package com.codeworld.employeeapp.service;


import com.codeworld.employeeapp.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployees();

    Employee updateEmployee(Employee employee, Long id);

    void deleteEmployee(Long id);

    Employee getEmployeeById(Long id);
}
