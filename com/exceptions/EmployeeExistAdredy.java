package com.exceptions;

public class EmployeeExistAdredy extends Exception{
    public  EmployeeExistAdredy() {
        super();
    }

    public  EmployeeExistAdredy(String message) {
        super(message);
    }

    public  EmployeeExistAdredy(String message, Throwable cause) {
        super(message, cause);
    }

    public  EmployeeExistAdredy(Throwable cause) {
        super(cause);
    }
}
