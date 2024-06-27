package org.example.testspringrest.employee.service;

import org.example.testspringrest.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public  Employee getEmployee(Long id);

    public void deleteEmployee(Long id);
}
