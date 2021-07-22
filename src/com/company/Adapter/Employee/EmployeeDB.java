package com.company.Adapter.Employee;

public class EmployeeDB implements Employee{
    private String name;
    private String age;

    public EmployeeDB(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getAge() {
        return null;
    }
}
