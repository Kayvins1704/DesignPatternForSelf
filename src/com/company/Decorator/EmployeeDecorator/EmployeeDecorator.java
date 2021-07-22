package com.company.Decorator.EmployeeDecorator;

import com.company.Decorator.Employee.Employee;

public class EmployeeDecorator {
    private Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    public String getValues(){
        return "Name: " + employee.getName() + " " + "Age: " + employee.getAge();
    }
}
