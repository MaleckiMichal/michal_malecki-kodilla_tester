package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(String responsibilities, int salary) {
        this.responsibilities = responsibilities;
        this.salary = salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public int getSalary() {
        return salary;
    }
}

