package Company1.employee.view;

import Company1.employee.entity.Employee;
import Company1.employee.exceptions.EmployeeAlreadyExistsException;
import Company1.employee.exceptions.EmployeeNotFoundException;
import Company1.employee.storage.Storage;
import Company1.employee.storage.StorageFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserUI {
    private Storage storage;
    private Scanner scanner;
    private SimpleDateFormat dateFormat;

    public UserUI() {
        storage = StorageFactory.getStorage();
        scanner = new Scanner(System.in);
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    public void acceptEmpDetailsAndStore() {
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
        scanner.nextLine(); // Consume newline

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
    }

    public void displayEmpByEmpno() {
        System.out.print("Enter Employee Number: ");
        int empno = scanner.nextInt();

        try {
            Employee emp = storage.getEmployee(empno);
            System.out.println("Employee Details:");
            System.out.println("Employee Number: " + emp.getEmpno());
            System.out.println("First Name: " + emp.getFirstName());
            System.out.println("Last Name: " + emp.getLastName());
            System.out.println("City: " + emp.getCity());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Date of Joining: " + dateFormat.format(emp.getDateOfJoining()));
        } catch (EmployeeNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
