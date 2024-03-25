package com.adepuu.exercises.session5;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
public class Exercise5 {

    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = “asc”
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = “desc”
     * Output: [ 8,7, 5, 2 ]
     */
    public static void main(String[] args) {
        int[] listNum = {2,7,3,9};
        int i = listNum.length - 1;
        ArrayList newListNum = new ArrayList<>();

        while (i >= 0){
            newListNum.add(listNum[i]);
            i--;
        }
        System.out.println(newListNum);
    }
}
