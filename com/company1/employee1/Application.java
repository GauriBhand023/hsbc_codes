package com.company1.employee1;


import com.company1.employee1.exceptions.EmployeeAlreadyExistsException;
import com.company1.employee1.exceptions.EmployeeNotFoundException;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Storage storage = null;

        try {
            storage = new StorageFileImpl("C:\\Users\\Bliss\\IdeaProjects\\Assignments\\src\\com\\employee.txt");
        } catch (IOException | ParseException e) {
            System.out.println("Error initializing storage: " + e.getMessage());
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee");
            System.out.println("3. Get All Employees");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Number: ");
                    int empno = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Date of Joining (yyyy-MM-dd): ");
                    String dateStr = scanner.nextLine();

                    try {
                        Date dateOfJoining = dateFormat.parse(dateStr);
                        Employee employee = new Employee(empno, firstName, lastName, city, salary, dateOfJoining);
                        try {
                            storage.addEmployee(employee);
                            System.out.println("Employee added successfully.");
                        } catch (EmployeeAlreadyExistsException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee Number: ");
                    int searchEmpno = scanner.nextInt();

                    try {
                        Employee emp = storage.getEmployee(searchEmpno);
                        System.out.println("Employee Details:");
                        System.out.println("Employee Number: " + emp.getEmpno());
                        System.out.println("First Name: " + emp.getFirstName());
                        System.out.println("Last Name: " + emp.getLastName());
                        System.out.println("City: " + emp.getCity());
                        System.out.println("Salary: " + emp.getSalary());
                        System.out.println();
                    } catch (EmployeeNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

