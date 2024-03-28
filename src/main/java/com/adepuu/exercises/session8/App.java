package com.adepuu.exercises.session8;

import java.util.Scanner;

public class App {
    /**
     * Manages user registration, login, and task management for the To-Do List application.
     * <p>
     * This function enables users to register, log in, and manage their tasks through the console.
     * It provides a clear and concise menu with options to add a task, view tasks, delete a task, or log out.
     * The system handles user input errors gracefully, providing clear feedback and prompting for correct input.
     * </p>
     * <br/>
     * <h3>User Registration and Login:</h3>
     * <ul>
     *     <li>Given a new user, when they input their desired login and password through the console, then the system should create a new account and confirm successful account creation.</li>
     *     <li>Given an existing user, when they input their login and password through the console, then the system should authenticate the user and grant access to the to-do list.</li>
     * </ul>
     *
     * <h3>Task Management:</h3>
     * <ul>
     *     <li>Given a logged-in user, when they input a new task through the console, then the system should add the task to their to-do list and confirm the task has been added.</li>
     *     <li>Given a logged-in user, when they view their to-do list through the console, then the system should display all tasks currently in their list.</li>
     *     <li>Given a logged-in user, when they input a task to delete through the console, then the system should remove the task from their to-do list and confirm the task has been deleted.</li>
     * </ul>
     *
     * <h3>Other:</h3>
     * <ul>
     *     <li>When a user accesses the application, the interface should display a clear and concise menu with options to add a task, view tasks, delete a task, or log out, all accessible through the console.</li>
     *     <li>The system should handle user input errors gracefully, providing clear feedback and prompting for correct input through the console.</li>
     * </ul>
     *
     * <h3>Notes:</h3>
     * <ul>
     *     <li>No need to encrypt user password</li>
     *     <li>Start the program menu inside main function below</li>
     *     <li>Split each functionalities into its own classes</li>
     * </ul>
     */
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
                        toDolist.viewToDolist();
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
