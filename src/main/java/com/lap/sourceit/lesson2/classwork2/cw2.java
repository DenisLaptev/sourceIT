package com.lap.sourceit.lesson2.classwork2;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class cw2 {
    public static void main(String[] args) {
        int[] arrayOfInts = {1, 2, 3};
        int searchFor = 1;
        boolean foundIt = false;
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }
        System.out.println(foundIt);
    }
}
