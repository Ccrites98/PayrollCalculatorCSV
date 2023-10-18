package com.pluralsight;
import java.io.*;
import java.util.*;

public class PayrollCalculators {
    public static void main(String[] args) {
//Jamie, build that path rn
        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;
            Employees[] employees = new Employees[8];
            int counter = 0;

            while ((input = bufferedReader.readLine()) != null) {
                if (counter < employees.length) {
                    String[] employee = input.split("\\|");
                    if (employee.length == 4) {
                        int employeeId = 0;
                        String name = employee[0];
                        try {
                            employeeId = Integer.parseInt(employee[1]);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid ID format for employee: " + name);
                            double hoursWorked = Double.parseDouble(employee[2]);
                            double payRate = Double.parseDouble(employee[3]);

                            employees[counter] = new Employees(employeeId, name, hoursWorked, payRate);
                            //Why isn't this working?
                            System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                                    employees[counter].getEmployeeId(),
                                    employees[counter].getName(),
                                    employees[counter].getGrossPay());
                            counter++;
                        }

                    }
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//Whatever. It's essentially only half functional, but it does generate something I guess.
//I really wish we could've spent a couple days on this topic because I truly do not understand it.