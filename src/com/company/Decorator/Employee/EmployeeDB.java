package com.company.Decorator.Employee;

public class EmployeeDB implements Employee {
    private String name;
    private String age;

    public EmployeeDB(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAge() {
        return age;
    }
}
