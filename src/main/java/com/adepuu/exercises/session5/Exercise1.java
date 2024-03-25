package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 35};
        int maxNumber = findHighNum(arr);
        System.out.println(maxNumber);
    }
    // Iterate through the array to find the maximum number
    public static int findHighNum (int[] arr){
        int maxNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }
}
