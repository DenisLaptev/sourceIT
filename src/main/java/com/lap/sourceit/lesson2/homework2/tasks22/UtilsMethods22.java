package com.lap.sourceit.lesson2.homework2.tasks22;

import java.util.Scanner;

/**
 * Created by Lenovo on 07.03.2017.
 */
public class UtilsMethods22 {
    //public void myMethod(int...numbers) {  }


    public static String enterText() {
        //init scanner and array of int numbers.
        Scanner in = new Scanner(System.in);
        String text;

        //input variables from console.
        System.out.print("Enter a text: ");
        text = in.next();

        return text;
    }


    public static String[] removeDelimiters(String[] wordsArray) {
        //убираем запятые и другие разделители.
        String[] newWordsArray = new String[wordsArray.length];
        String endOfTheWord = ".,!?:-";
        for (int i = 0; i < wordsArray.length; i++) {
            if (endOfTheWord.contains(wordsArray[i].substring(wordsArray[i].length() - 1, wordsArray[i].length()))) {
                newWordsArray[i] = wordsArray[i].substring(0, wordsArray[i].length() - 1);
            } else {
                newWordsArray[i] = wordsArray[i];
            }
        }
        return newWordsArray;
    }


}
