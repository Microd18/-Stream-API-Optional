package com.example.streamapi1.services;

import com.example.streamapi1.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private static final int SIZE = 10;
    private final List<Employee> employees = new ArrayList<>(SIZE);

    public List<Employee> getEmployees() {
        return employees;
    }

    // Добавить нового сотрудника
    public Employee addEmployee(String name, int department, double salary) {
        Employee people1 = new Employee(name, department, salary);

        if (employees.size() == SIZE) {
            throw new ArrayStoreException("Нет места для нового сотрудника");
        }
        employees.add(people1);

        return people1;
    }

    // Удалить сотрудника
    public Employee remove(String fullName, int department, double salary) {
        Employee employee = new Employee(fullName, department, salary);
        if (!employees.contains(employee)) {
            throw new RuntimeException();
        }
        employees.remove(employee);
        return employee;
    }

    // Найти сотрудника
    public Employee find(String fullName, int department, int salary) {
        Employee employee = new Employee(fullName, department, salary);
        if (!employees.contains(employee)) {
            throw new RuntimeException();
        }
        return employee;
    }

    public List<Employee> getAll() {
        return new ArrayList<>(employees);
    }

}
