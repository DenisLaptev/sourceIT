package com.lap.sourceit.lesson2.classwork2;

import java.util.Scanner;

public class JavaExampleII {

    /**
     * This program finds the biggest row of the array of rows
     */
    public static void main(String[] args) {

        //init scanner
        Scanner scan = new Scanner(System.in);

        //enter number of rows
        System.out.println("Enter the number of rows: ");
        int numRows = scan.nextInt();

        //init arrays for saving rows and their length
        String[] arrayOfRows = new String[numRows];
        int[] arrayOfRowsLength = new int[numRows];

        //enter and save rows
        for (int i = 0; i < numRows; i++) {
            System.out.println(String.format("Enter the row number %d: ", i + 1));
            String row = scan.next();
            arrayOfRows[i] = row;
            arrayOfRowsLength[i] = row.length();
        }

        //init variables for saving row with max length
        int maxLength = 0;
        String maxLengthRow = arrayOfRows[0];

        //cycle for finding row with max length
        for (int i = 0; i < numRows; i++) {
            if (maxLength < arrayOfRowsLength[i]) {
                maxLength = arrayOfRowsLength[i];
                maxLengthRow = arrayOfRows[i];
            }
        }

        //print row with max length
        System.out.println("The biggest row is: " + maxLengthRow);
    }

}
