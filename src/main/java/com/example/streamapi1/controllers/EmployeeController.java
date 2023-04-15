package com.example.streamapi1.controllers;

import com.example.streamapi1.model.Employee;
import com.example.streamapi1.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam("fullName") String fullName,
                        @RequestParam("departmentId") int department,
                        @RequestParam("salary") int salary) {
        return employeeService.addEmployee(fullName, department, salary);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam("fullName") String fullName,
                           @RequestParam("departmentId") int department,
                           @RequestParam("salary") int salary) {
        return employeeService.remove(fullName, department, salary);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam("fullName") String fullName,
                         @RequestParam("departmentId") int department,
                         @RequestParam("salary") int salary) {
        return employeeService.find(fullName, department, salary);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
}
