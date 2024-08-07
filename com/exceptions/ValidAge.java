package com.exceptions;

public class ValidAge {
    public String getAge(int age) throws InvalidAge {
        if (age < 0) {
            throw new InvalidAge("Age cannot be negative.");
        }
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("kid");
        }
        return "";
    }
}
