package com.lap.sourceit.lesson2.classwork2;

import java.util.Scanner;

public class JavaExampleI {

    /**
     * This program finds the square of the largest of two numbers
     */
    public static void main(String[] args) {

        //init scanner
        Scanner in = new Scanner(System.in);

        //starts input variables
        System.out.print("input a: ");
        int a = in.nextInt();
        System.out.print("input b: ");
        int b = in.nextInt();

        //find max of numbers and print square of it
        if (a > b) {
            System.out.println("a^2 = " + a * a);
        } else {
            System.out.println("b^2 = " + b * b);
        }
    }
}
