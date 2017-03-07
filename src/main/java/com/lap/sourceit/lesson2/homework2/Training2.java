package com.lap.sourceit.lesson2.homework2;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class Training2 {
    public static void main(String[] args) {
        System.out.println("----------------------Строки-----------------------------");
        System.out.println();
        System.out.println();
        String str = "april";
        System.out.println("~~~~~~~~~~~~~~~~~~~~1~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str.length());


        System.out.println("~~~~~~~~~~~~~~~~~~~~2~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str.charAt(1));


        System.out.println("~~~~~~~~~~~~~~~~~~~~3~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str.charAt(str.length() - 1));


        System.out.println("~~~~~~~~~~~~~~~~~~~~4~~~~~~~~~~~~~~~~~~~~");
        System.out.println(str.toUpperCase());


        System.out.println("~~~~~~~~~~~~~~~~~~~~5~~~~~~~~~~~~~~~~~~~~");
        String subString;
        subString = "ap";
        printContain(str, subString);
        printContain(str, "fe");


        System.out.println("~~~~~~~~~~~~~~~~~~~~6,7~~~~~~~~~~~~~~~~~~~~");
        str = "tree";
        String newString = str.replace("t", "ag");
        System.out.println(newString);


        System.out.println("~~~~~~~~~~~~~~~~~~~~8~~~~~~~~~~~~~~~~~~~~");
        str = "lorem ipsum dolor sit amet";
        String[] myWords = str.split(" ");
        String lastWord = "words";
        if (myWords.length == 1) {
            lastWord = "word";
        }
        System.out.println("Text contains " + myWords.length + " " + lastWord);


        System.out.println("----------------------Массивы и циклы-----------------------------");
        System.out.println();
        System.out.println();

        int[] intArray;
        intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~1~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Массив [ ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println();


        System.out.println("~~~~~~~~~~~~~~~~~~~~2~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Квадраты [ ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print((int) Math.pow(intArray[i], 2) + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println();


        System.out.println("~~~~~~~~~~~~~~~~~~~~3~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Чётные числа [ ");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                System.out.print(intArray[i] + " ");
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.println();


        System.out.println("~~~~~~~~~~~~~~~~~~~~4~~~~~~~~~~~~~~~~~~~~");
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println("Сумма чисел = " + sum);
        System.out.println();


        System.out.println("~~~~~~~~~~~~~~~~~~~~5~~~~~~~~~~~~~~~~~~~~");
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        System.out.println("Максимальное число = " + max);
        System.out.println();


    }

    private static void printContain(String str, String subString) {
        if (str.contains(subString)) {
            System.out.println(str + " contains " + subString);
        } else {
            System.out.println(str + " does not contain " + subString);
        }
    }
}
