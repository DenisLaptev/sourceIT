package com.lap.sourceit.lesson2.homework2.tasks21;

import static com.lap.sourceit.lesson2.homework2.tasks21.UtilsMethods21.enter3Numbers;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class Task1 {
    /*
    Ввести с консоли три числа,
    подсчитать сумму квадратов двух наибольших чисел.
    Результат вывести в консоль.
    */
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers = enter3Numbers();

        //finding the two maximun integers of array.
        int maxNumber1 = numbers[0];
        int indexOfMaxNumber1 = 0;

        int maxNumber2 = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber1 < numbers[i]) {
                maxNumber1 = numbers[i];
                indexOfMaxNumber1 = i;
            }
        }
        System.out.println("квадрат самого большого числа = " + (int) Math.pow(maxNumber1, 2));


        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber2 < numbers[i] && i != indexOfMaxNumber1) {
                maxNumber2 = numbers[i];
            }
        }
        System.out.println("квадрат второго большого числа = " + (int) Math.pow(maxNumber2, 2));


    }
}
