package com.company1.employee1;

import com.company1.employee1.Storage;
import com.company1.employee1.Employee;
import com.company1.employee1.exceptions.EmployeeAlreadyExistsException;
import com.company1.employee1.exceptions.EmployeeNotFoundException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class StorageFileImpl implements Storage {
    private Employee[] employees;
    private int count;

    public StorageFileImpl(String filePath) throws IOException, ParseException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            this.count = (int) br.lines().count();
        }

        this.employees = new Employee[count];
        this.count = 0;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int empno = Integer.parseInt(parts[0].trim());
                String firstName = parts[1].trim();
                String lastName = parts[2].trim();
                String city = parts[3].trim();
                double salary = Double.parseDouble(parts[4].trim());
                Date dateOfJoining = dateFormat.parse(parts[5].trim());

                Employee employee = new Employee(empno, firstName, lastName, city, salary, dateOfJoining);
                employees[count++] = employee;
            }
        }
    }

    @Override
    public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmpno() == e.getEmpno()) {
                throw new EmployeeAlreadyExistsException("Employee with empno " + e.getEmpno() + " already exists.");
            }
        }

        if (count < employees.length) {
            employees[count++] = e;
        } else {
            System.out.println("Storage is full. Cannot add more employees.");
        }
    }

    @Override
    public Employee getEmployee(int empno) throws EmployeeNotFoundException {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmpno() == empno) {
                return employees[i];
            }
        }
        throw new EmployeeNotFoundException("Employee with empno " + empno + " not found.");
    }

    public Employee[] getAllEmployees() {
        return Arrays.copyOf(employees, count);
    }
}
