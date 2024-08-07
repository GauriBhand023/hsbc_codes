package Company1.employee.storage;

import Company1.employee.entity.Employee;
import Company1.employee.exceptions.EmployeeAlreadyExistsException;
import Company1.employee.exceptions.EmployeeNotFoundException;

public interface Storage {
    void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
    Employee getEmployee(int empno) throws EmployeeNotFoundException;
}
