package com.adepuu.exercises.session8;

import java.util.Scanner;

public class toDoListUser {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Login");
            System.out.println("2. Create Account");
            System.out.println("3. List Accounts");
            System.out.println("4. To-Do-List (Login First)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    if (loginSystem.loginUser(username, password)) {
                        System.out.println("Login successful! Welcome, " + username + "!");
                        toDolist.viewToDolist();;
                    } else {
                        System.out.println("Login failed. Incorrect username or password.");
                    }
                    break;
                case 2:
                    System.out.print("Enter new username: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String newPassword = scanner.nextLine();
                    loginSystem.addUser(newUsername, newPassword);
                    break;
                case 3:
                    loginSystem.listAccounts();
                    break;
                case 4:
                    if (loginSystem.getCurrentUser() == null) {
                        System.out.println("Please login first.");
                    } else {
                        toDolist.viewToDolist();;
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
