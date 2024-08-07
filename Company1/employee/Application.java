package Company1.employee;

import Company1.employee.view.UserUI;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee by Empno");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userUI.acceptEmpDetailsAndStore();
                    break;

                case 2:
                    userUI.displayEmpByEmpno();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
