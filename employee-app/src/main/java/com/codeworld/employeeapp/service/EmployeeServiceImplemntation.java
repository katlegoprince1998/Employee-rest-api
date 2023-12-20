package com.codeworld.employeeapp.service;


import com.codeworld.employeeapp.entity.Employee;
import com.codeworld.employeeapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImplemntation implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;


    @Override
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, Long id) {
        Employee employee1 = repository.findById(id).get();
        if (Objects.nonNull(employee.getName()) &&
                !"".equalsIgnoreCase(employee.getName())){
            employee1.setName(employee.getName());
        }
        if (Objects.nonNull(employee.getLastname()) &&
                !"".equalsIgnoreCase(employee.getLastname())){
            employee1.setLastname(employee.getLastname());
        }
        if (Objects.nonNull(employee.getEmail()) &&
                !"".equalsIgnoreCase(employee.getEmail())){
            employee1.setEmail(employee.getEmail());
        }
        if (Objects.nonNull(employee.getPhone()) &&
                !"".equalsIgnoreCase(employee.getPhone())){
            employee1.setPhone(employee.getPhone());
        }
        return repository.save(employee1);
    }

    @Override
    public void deleteEmployee(Long id) {
      repository.deleteById(id);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).get();
    }
}
