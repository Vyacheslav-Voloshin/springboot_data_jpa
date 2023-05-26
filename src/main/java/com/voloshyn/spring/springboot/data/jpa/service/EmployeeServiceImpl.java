package com.voloshyn.spring.springboot.data.jpa.service;


import com.voloshyn.spring.springboot.data.jpa.entity.Employee;
import com.voloshyn.spring.springboot.data.jpa.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> allEmployee = employeeRepository.findAll();
        return allEmployee;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee>emp = employeeRepository.findById(id);
        if (emp.isPresent())
            employee = emp.get();
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee>employees = employeeRepository.findAllByName(name);
        return employees;
    }
}
