package Company1.employee.entity;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private int empno;
    private String firstName;
    private String lastName;
    private String city;
    private double salary;
    private Date dateOfJoining;

    // Constructor
    public Employee(int empno, String firstName, String lastName, String city, double salary, Date dateOfJoining) {
        this.empno = empno;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    // Getters and Setters
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empno == employee.empno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno);
    }
}
