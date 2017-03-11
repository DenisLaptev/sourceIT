package com.lap.sourceit.lesson2.homework2.tasks21;

import static com.lap.sourceit.lesson2.homework2.tasks21.UtilsMethods21.enterNStrings;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class Task3 {
    /*
    Ввести n строк с консоли,
    найти самую короткую строку.
    Вывести эту строку и ее длину.
    */
    public static void main(String[] args) {
        //defining variables.
        String[] arrayStrings;
        String shortestString;

        //Entering the array of Strings.
        arrayStrings = enterNStrings();

        //defining the shortest String.
        shortestString = arrayStrings[0];
        for (int i = 0; i < arrayStrings.length; i++) {
            if (shortestString.length() > arrayStrings[i].length()) {
                shortestString = arrayStrings[i];
            }
        }

        //printing the shortest String.
        System.out.println("The shortest String: ");
        System.out.println(shortestString);
        System.out.println("The shortest String length = " + shortestString.length());

    }
}
