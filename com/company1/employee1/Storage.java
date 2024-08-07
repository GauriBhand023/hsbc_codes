package com.company1.employee1;
import com.company1.employee1.exceptions.EmployeeAlreadyExistsException;
import com.company1.employee1.exceptions.EmployeeNotFoundException;


public interface Storage {
    void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
    Employee getEmployee(int empno) throws  EmployeeNotFoundException;
}
