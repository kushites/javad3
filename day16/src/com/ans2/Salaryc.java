package com.ans2;

import java.util.Comparator;

public class Salaryc implements Comparator<Employee> {
    public int compare(Employee a, Employee b){
        return (int)(a.getSalary() - b.getSalary());
    }
}
