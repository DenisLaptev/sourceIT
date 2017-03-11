package com.lap.sourceit.lesson2.homework2.tasks21;

import static com.lap.sourceit.lesson2.homework2.tasks21.UtilsMethods21.averageLengthOfStringArray;
import static com.lap.sourceit.lesson2.homework2.tasks21.UtilsMethods21.enterNStrings;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class Task4 {
    /*
    Ввести n строк с консоли.
    Вывести на консоль те строки,
    длина которых меньше средней,
    также их длины.
    */

    public static void main(String[] args) {
        //defining variables.
        String[] arrayStrings;
        double averageLength;

        //Entering the array of Strings.
        arrayStrings = enterNStrings();

        //defining the average length of Strings.
        averageLength = averageLengthOfStringArray(arrayStrings);
        System.out.println("average length = " + averageLength);

        System.out.println("Strings with lengths < averageLength: ");
        //printing the Strings with lengths < averageLength.
        for (int i = 0; i < arrayStrings.length; i++) {
            if (arrayStrings[i].length() < averageLength) {
                System.out.println(arrayStrings[i] + "( " + arrayStrings[i].length() + " )");
            }
        }

    }
}
