package Company1.employee.storage;

import Company1.employee.entity.Employee;
import Company1.employee.exceptions.EmployeeAlreadyExistsException;
import Company1.employee.exceptions.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class StorageImpl implements Storage {
    private List<Employee> employees;

    public StorageImpl() {
        employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
        for (Employee emp : employees) {
            if (emp.getEmpno() == e.getEmpno()) {
                throw new EmployeeAlreadyExistsException("Employee with empno " + e.getEmpno() + " already exists.");
            }
        }
        employees.add(e);
    }

    @Override
    public Employee getEmployee(int empno) throws EmployeeNotFoundException {
        for (Employee emp : employees) {
            if (emp.getEmpno() == empno) {
                return emp;
            }
        }
        throw new EmployeeNotFoundException("Employee with empno " + empno + " not found.");
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
}
