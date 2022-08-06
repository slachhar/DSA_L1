package com.shefali;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int CalculateWage(int extraHours) {
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be negative or zero");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Salary cannot be negative or zero");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
