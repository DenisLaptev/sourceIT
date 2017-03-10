package com.lap.sourceit.lesson2.homework2.tasks21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lenovo on 10.03.2017.
 */

public class Task6 {
    /*
    Из текста удалить все слова заданной длины,
    начинающиеся на согласную букву.
    */

    public static void main(String[] args) {


        String text0 = "aaa bb c, dddd, ee, f, gggg, " +
                "hh, i jjj. K lll mmmM, nnnnnn oooooooo, pp " +
                "QQ RRRR S TT U vvvv WW, X - Y - Z";

        String text = "aaa bb c, dddd, ee";
        System.out.println("initial text: ");
        System.out.println(text);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        /*char[] glasnyeLetters = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] soglasnyeLetters = {
                'b', 'c', 'd', 'f', 'g', 'h',
                'j', 'k', 'l', 'm', 'n', 'p',
                'q', 'r', 's', 't', 'v', 'w', 'x', 'z'
        };*/
        String soglasnyeLetters = "bcdfghjklmnpqrstvwxz";
        String endOfTheWord = ".,!?:-";

        String[] wordsArray;
        wordsArray = text.split("\\s");
        System.out.println("words array: ");
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        int numberOfLetters;

        //init scanner.
        Scanner in = new Scanner(System.in);

        //input number of letters in the word (substring).
        System.out.print("input number of letters in the word, which you want to delete: ");
        numberOfLetters = in.nextInt();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        List<String> newWordsArrayList = new ArrayList<String>();

        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() == numberOfLetters
                    && !endOfTheWord.contains(wordsArray[i].substring(wordsArray[i].length() - 1, wordsArray[i].length()))) {
                if (soglasnyeLetters.contains(wordsArray[i].substring(0, 1))) {
                    //System.out.println("flag");

                } else {
                    newWordsArrayList.add(wordsArray[i]);
                }
            } else {
                newWordsArrayList.add(wordsArray[i]);
            }

        }

        System.out.println("new words list: ");
        for (int i = 0; i < newWordsArrayList.size(); i++) {
            System.out.println(newWordsArrayList.get(i));
        }
    }
}