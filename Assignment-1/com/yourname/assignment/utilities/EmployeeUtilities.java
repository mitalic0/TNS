package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.Employee;

/**
 * The EmployeeUtilities class provides utility methods for Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Displays the basic details of an employee.
     * @param emp an Employee object.
     */
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }

    /**
     * Increases the employee's salary by a given percentage.
     * @param emp the Employee object.
     * @param percentage the percentage increase.
     */
    public static void increaseSalary(Employee emp, double percentage) {
        double currentSalary = emp.getSalary();
        emp.setSalary(currentSalary + (currentSalary * percentage / 100));
    }
}
