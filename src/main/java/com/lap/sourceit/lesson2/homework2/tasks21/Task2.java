package com.lap.sourceit.lesson2.homework2.tasks21;

import java.util.Scanner;

import static com.lap.sourceit.lesson2.homework2.tasks21.UtilsMethods.enter3Numbers;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class Task2 {
    /*
    Ввести с консоли три числа (a, b, c).
    Решить квадратное уравнение ax^2 + bx + c = 0.
    Результат вывести в консоль.
    */

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers = enter3Numbers();

        int a, b, c;
        a = numbers[0];
        b = numbers[1];
        c = numbers[2];

        double x1;
        double x2;
        double D;
        D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D = " + D);
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Solutions = [ " + x1 + ", " + x2 + " ]");
        } else if (D == 0) {
            x1 = (-b) / (2 * a);
            x2 = (-b) / (2 * a);
            System.out.println("Solutions = [ " + x1 + ", " + x2 + " ]");
        } else {
            System.out.println("Equation has no real solurions.");
        }

    }


}
