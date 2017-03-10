package com.lap.sourceit.lesson2.homework2.tasks21;

import java.util.Arrays;
import java.util.Comparator;

import static com.lap.sourceit.lesson2.homework2.tasks21.UtilsMethods.enterNStrings;
import static com.lap.sourceit.lesson2.homework2.tasks21.UtilsMethods.printArray;

/**
 * Created by Lenovo on 10.03.2017.
 */
public class Task5 {
    /*
    Ввести n строк с консоли.
    Упорядочить и вывести строки в порядке возрастания их длин,
    а также (второй приоритет) значений этих их длин.
    */


    public static void main(String[] args) {
        //defining variables.
        String[] arrayStrings;
        double averageLength;

        //Entering the array of Strings.
        arrayStrings = enterNStrings();

        //Printing unsorted array.
        System.out.println("~~~~~~~~~~~~unsorted array:~~~~~~~~~~~~~~~");
        printArray(arrayStrings);

        //Sorting the array using Comparator.
        Arrays.sort(arrayStrings, Task5.StringComparator);

        //Printing unsorted array.
        System.out.println("~~~~~~~~~~~~sorted array:~~~~~~~~~~~~~~~");
        printArray(arrayStrings);
    }


    public static Comparator<String> StringComparator
            = new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            int result = 0;

            int str1Length = o1.length();
            int str2Length = o2.length();
            if (str1Length != str2Length) {
                //ascending order
                result = str1Length - str2Length;

                /*
                //descending order
                result = str2Length-str1Length;
                */
            } else {
                //ascending order
                result = o1.compareTo(o2);

                /*
                //descending order
                result = o2.compareTo(o1);
                */
            }
            return result;
        }
    };
}
