package com.company.Decorator;

import com.company.Decorator.Employee.Employee;
import com.company.Decorator.Employee.EmployeeCSV;
import com.company.Decorator.Employee.EmployeeDB;
import com.company.Decorator.EmployeeAdapter.EmployeeCSVAdapterImpl;
import com.company.Decorator.EmployeeDecorator.EmployeeDecorator;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = new EmployeeDB("Vinit", "26");
        Employee employee2 = new EmployeeCSVAdapterImpl(new EmployeeCSV("Tony,26"));

        System.out.println(new EmployeeDecorator(employee1).getValues());
        System.out.println(new EmployeeDecorator(employee2).getValues());
    }
}
