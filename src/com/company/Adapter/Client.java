package com.company.Adapter;

import com.company.Adapter.Employee.Employee;
import com.company.Adapter.Employee.EmployeeCSV;
import com.company.Adapter.Employee.EmployeeDB;
import com.company.Adapter.EmployeeAdapter.EmployeeCSVAdapterImpl;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = new EmployeeDB("Vinit", "26");
        Employee employee2 = new EmployeeCSVAdapterImpl(new EmployeeCSV("Tony,26"));

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
