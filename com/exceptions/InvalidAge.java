package com.exceptions;

public class InvalidAge extends Exception{
    public InvalidAge() {
        super();
    }

    public InvalidAge(String message) {
        super(message);
    }

    public InvalidAge(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAge(Throwable cause) {
        super(cause);
    }
}
