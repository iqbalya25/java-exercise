package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 2, 4, 2, 5}; // Array with repeated integers

                // Create a HashMap to store unique integers
        HashMap<Integer, Boolean> uniqueMap = new HashMap<>();

                // Iterate through the array and add elements to the HashMap
        for (int number : numbers) {
                    uniqueMap.put(number, true); // Using Boolean values as placeholder values
                }

                // Extract unique elements from the keys of the HashMap
        int[] uniqueNumbers = new int[uniqueMap.size()];
        int index = 0;
        for (int key : uniqueMap.keySet()) {
                    uniqueNumbers[index++] = key;
                }

                // Print the unique elements
        System.out.println("Unique elements using HashMap: " + Arrays.toString(uniqueNumbers));
    }
}
