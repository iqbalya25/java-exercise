package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     * <p>
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 7, 6, 5, 7, 9}; // Array with repeated integers

        // Create a HashMap to store unique integers as keys
        HashMap<Integer, Boolean> uniqueMap = new HashMap<>();

        // Create an ArrayList to store unique integers in the order they appear
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        // Iterate through the array
        for (int number : numbers) {
            // Check if the number is not already present in the HashMap
            if (!uniqueMap.containsKey(number)) {
                // Add the number to the HashMap and ArrayList
                uniqueMap.put(number, true);
                uniqueNumbers.add(number);
            }
        }

        // Convert the ArrayList back to an array (if needed)
        int[] uniqueArray = new int[uniqueNumbers.size()];
        for (int i = 0; i < uniqueNumbers.size(); i++) {
            uniqueArray[i] = uniqueNumbers.get(i);
        }
        System.out.println(Arrays.toString(uniqueArray));
    }

}
