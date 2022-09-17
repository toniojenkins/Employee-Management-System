package com.example.Employee.services;

import com.example.Employee.modal.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getEmployees();
}
