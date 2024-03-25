package com.adepuu.exercises.session5;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 2 ,4 , 5, 2}; // Array with repeated integers
        boolean duplicatedNum = false;

        for (int iterator1 = 0; iterator1 < numbers.length; iterator1++){
            for (int iterator2 = iterator1 +1; iterator2 < numbers.length; iterator2++){
                if(numbers[iterator1] == numbers[iterator2]){
                    duplicatedNum = true;
                    System.out.println("There's Duplicated Number " + numbers[iterator2]);
                    return;
                }
            }
        }
        System.out.println("No duplicated Number");
    }
}
