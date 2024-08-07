package com.exceptions;

public class WrongInput extends RuntimeException{
    public WrongInput() {
        super();
    }

    public WrongInput(String message) {
        super(message);
    }

    public WrongInput(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongInput(Throwable cause) {
        super(cause);
    }
}
