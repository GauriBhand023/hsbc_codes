package com.exceptions;

public class SingleTryCatch {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exceptions: "+ e.getMessage());
        }
        finally {
            System.out.println("finally block");
        }
    }
}
