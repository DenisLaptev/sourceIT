package com.lap.sourceit.lesson2.homework2.tasks21;

import java.util.Scanner;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class UtilsMethods21 {
    //public void myMethod(int...numbers) {  }
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


    public static String[] enterNStrings() {
        //init scanner and array of Strings.
        Scanner in = new Scanner(System.in);
        String[] arrayStrings;
        int numberOfStrings;

        //input the number of Strings in array. (arrayStrings.length)
        System.out.print("Enter the number of Strings: ");
        numberOfStrings = in.nextInt();

        arrayStrings = new String[numberOfStrings];

        //input Strings from console.
        for (int i = 0; i < arrayStrings.length; i++) {
            System.out.print("Enter string" + i + ":");
            arrayStrings[i] = in.next();
        }
        return arrayStrings;


    }

    public static double averageLengthOfStringArray(String[] arrayStrings) {
        //method defines the average length of Strings array.
        double averageLength;
        averageLength = 0;
        for (int i = 0; i < arrayStrings.length; i++) {
            averageLength += arrayStrings[i].length();
        }
        averageLength /= arrayStrings.length;
        return averageLength;
    }

    public static void printArray(String[] arrayStrings) {

        for (int i = 0; i < arrayStrings.length; i++) {
            System.out.println(arrayStrings[i]);
        }

    }
}
