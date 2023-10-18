package com.pluralsight;
public class Employees {
        public Employees(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }
    private int employeeId;
    private String name;
    private double hoursWorked;
    final double payRate;

    public int getEmployeeId () {
        return employeeId;
    }
public void setEmployeeId (int employeeId) {
        this.employeeId = employeeId;
    }
    public double getPayRate() {
        return payRate;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked() {
        this.hoursWorked = hoursWorked;
    }
    public double getGrossPay(){
        return  payRate * getHoursWorked();
    }



}