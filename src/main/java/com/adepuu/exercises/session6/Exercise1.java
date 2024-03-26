package com.adepuu.exercises.session6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner inputDataStream = new Scanner(System.in);
        ArrayList<Integer> listNum = new ArrayList<>();
        int sum = 0;

        boolean keepLoop = true;
        while (keepLoop) {
            System.out.println("input number");

            try {
                String inputdata = inputDataStream.next();
                if(inputdata.charAt(0) == 'q') {
                    for (int num : listNum) {
                        sum += num;
                    }
                    double average = (double) sum / listNum.size();
                    System.out.printf("%.2f", average);
                    break;
                }
                else {
                    int numData = Integer.parseInt(inputdata);
                    listNum.add(numData);
                }
            } catch (InputMismatchException e) {
                System.out.println("Input missmatch error");

            } catch (NumberFormatException e) {
                System.out.println("Number Format error");
            }
        }
        inputDataStream.close();

    }
}
