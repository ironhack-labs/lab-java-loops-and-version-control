package org.example;


public class Intern extends Employee{
    private static final int LIMIT=20000;

    public Intern(String name, String email, int age, int salary){
        super(name, email, age, (salary > LIMIT) ? LIMIT : salary);
    }
    public void setSalary(int salary) {
        if (salary > LIMIT) {
            setSalary(LIMIT);
        } else {
            setSalary(salary);
        }
    }
}