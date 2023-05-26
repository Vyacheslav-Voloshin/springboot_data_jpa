package com.voloshyn.spring.springboot.data.jpa.dao;

import com.voloshyn.spring.springboot.data.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public List<Employee> findAllByName(String name);
}
