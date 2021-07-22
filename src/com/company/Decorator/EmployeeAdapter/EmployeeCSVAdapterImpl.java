package com.company.Decorator.EmployeeAdapter;

import com.company.Decorator.Employee.EmployeeCSV;

public class EmployeeCSVAdapterImpl implements EmployeeAdapter {
    private EmployeeCSV employeeCSV;

    public EmployeeCSVAdapterImpl(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getName() {
        return employeeCSV.getName();
    }

    @Override
    public String getAge() {
        return String.valueOf(employeeCSV.getAge());
    }
}
