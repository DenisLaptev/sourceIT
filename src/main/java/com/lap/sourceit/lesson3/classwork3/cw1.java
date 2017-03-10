package com.lap.sourceit.lesson3.classwork3;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class cw1 {
    private static boolean flag = false;

    public static void main(String[] args) {
        //At first we input int array.
        //Then we output this array.

        System.out.println("Input of Array");
        int count = 0;
        int[] intArray = new int[10];
        while (count < 10) {
            intArray[count] = count * 10;
            count++;
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        System.out.println("Output of Array");
        count = 0;
        do {
            System.out.print(intArray[count] + " ");
            count++;
        } while (count < 10);
        System.out.println();


        System.out.println("~~~~~~~~~~~~~~~~~~~");

        System.out.println("Searching for 40");
        count = 0;
        do {
            System.out.print(intArray[count] + " ");

            if (intArray[count] == 40) {
                System.out.println("!");
                System.out.println("FOUND 40!");
                flag = true;
                break;
            }
            count++;
        } while (count < 10);
        if (flag == false) {
            System.out.println("40 NOT FOUND!");
        }

    }
}
