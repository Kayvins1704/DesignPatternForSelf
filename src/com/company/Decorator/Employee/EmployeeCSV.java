package com.company.Decorator.Employee;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private String name;
    private int age;

    public EmployeeCSV(String value) {
        StringTokenizer tokenizer = new StringTokenizer(value, ",");
        if(tokenizer.hasMoreTokens()) this.name = tokenizer.nextToken();
        if(tokenizer.hasMoreTokens()) this.age = Integer.parseInt(tokenizer.nextToken());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
