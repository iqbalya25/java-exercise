package com.adepuu.exercises.session8;

import java.util.HashMap;

public class LoginSystem {
    private HashMap<String, User1> users;
    private User1 currentUser;

    public LoginSystem() {
        users = new HashMap<>();
    }

    public void addUser(String username, String password) {
        if (!users.containsKey(username)) {
            User1 user = new User1(username, password);
            users.put(username, user);
            System.out.println("User '" + username + "' has been successfully registered.");
        } else {
            System.out.println("Username already exists. Please choose a different username.");
        }
    }
    public boolean loginUser(String username, String password) {
        if (users.containsKey(username)) {
            User1 user = users.get(username);
            if (user.checkPassword(password)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public void logoutUser() {
        currentUser = null;
        System.out.println("Logged out successfully.");
    }

    public User1 getCurrentUser() {
        return currentUser;
    }

    public void listAccounts() {
        System.out.println("List of registered accounts:");
        for (String username : users.keySet()) {
            System.out.println("- " + username);
        }
    }
}
