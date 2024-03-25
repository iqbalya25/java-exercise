package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        int iterator1;
        int iterator2;
        int iterator3;

        int[] listNum = {1, 2, 3, 4, 5, 6, 7};
        int rotationIndexNum = 4;
//        int newdata = listNum.length - 2;

        ArrayList cutData = new ArrayList<>();
        ArrayList restData = new ArrayList<>();

        for (iterator1 = 0; iterator1 < rotationIndexNum; iterator1++){
//            System.out.println(listNum[iterator1]);
            cutData.add(listNum[iterator1]);
//            System.out.println(cutData);
        }

        for (iterator2 = rotationIndexNum; iterator2 < listNum.length; iterator2++){
//            System.out.println(listNum[iterator2]);
            restData.add(listNum[iterator2]);
//            System.out.println(restData);
        }
        for (iterator3 = 0; iterator3 < rotationIndexNum; iterator3++){
            restData.add(cutData.get(iterator3));
        }
        System.out.println(restData);

    }
}
