package com.exceptions;

public class ThrowsWord {
    public static void main(String[] args) {

        try{
            Devide();
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception: "+e.getMessage());
        }
    }
    public static void Devide() throws ArithmeticException{
        int res = 50/0;
    }
}
