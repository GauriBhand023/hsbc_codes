package com.exceptions;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int[] num= {1,2,3};
            int result = 10/0;
            System.out.println(num[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic Exception: "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds: "+e.getMessage());
        }
    }
}
