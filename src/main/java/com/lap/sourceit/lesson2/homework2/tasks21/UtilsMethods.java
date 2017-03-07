package com.lap.sourceit.lesson2.homework2.tasks21;

import java.util.Scanner;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class UtilsMethods {
    public static int[] enter3Numbers() {
        //init scanner and array of int numbers.
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];

        //input variables from console.
        System.out.print("input number1: ");
        numbers[0] = in.nextInt();
        System.out.print("input number2: ");
        numbers[1] = in.nextInt();
        System.out.print("input number3: ");
        numbers[2] = in.nextInt();
        System.out.println();

        //output the array of numbers to console.
        System.out.print("numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "    ");
        }
        System.out.println();

        return numbers;
    }
}
