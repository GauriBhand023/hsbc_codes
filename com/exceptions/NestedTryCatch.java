package com.exceptions;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int res = 10/0;
            }
            catch (ArithmeticException e){
                System.out.println("Inner catch: "+e.getMessage());
            }
            int[] num = {1,2,3};
            System.out.println(num[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Outer catch: "+e.getMessage());
        }
    }
}
