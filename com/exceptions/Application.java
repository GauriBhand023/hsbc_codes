package com.exceptions;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LearningModule learningModule = new LearningModule();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        try {
            String learningCode = learningModule.getLearningCode(name, age);
            System.out.println("Learning Code: " + learningCode);
        } catch (WrongInput e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
