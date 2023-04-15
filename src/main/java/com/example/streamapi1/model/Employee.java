package com.example.streamapi1.model;

import java.util.Objects;

public class Employee {

    private final String fullName;
    private int department;
    private double salary;
    private static int counter;
    private final int id;


    public Employee(String fullName, int department, double salary) {
        counter++;
        id = counter;
        this.fullName = fullName;
        setDepartment(department);
        setSalary(salary);
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Неверный номер отдела");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return String.format("ФИ: %s, отдел: %d, ЗП: %d", fullName, department, salary);
    }

}
