package org.example.testspringrest.employee.controller;

import org.example.testspringrest.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Value("${custom.prop}")
    private String customProperty;

    @GetMapping
    public List<Employee> findAll() {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();

        // Add Employee objects to the list
        employees.add(new Employee(1L, "John", "Doe", LocalDate.of(1980, 1, 1)));
        employees.add(new Employee(2L, "Jane", "Smith", LocalDate.of(1990, 2, 2)));
        employees.add(new Employee(3L, "Jim", "Brown", LocalDate.of(1985, 3, 3)));

        // Print the list of employees
        System.out.println("customProperty");
        System.out.println(customProperty);

        return employees;
    }
}
