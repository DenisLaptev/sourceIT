package com.lap.sourceit.lesson2.homework2.tasks22;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.lap.sourceit.lesson2.homework2.tasks22.UtilsMethods22.enterText;
import static com.lap.sourceit.lesson2.homework2.tasks22.UtilsMethods22.removeDelimiters;

/**
 * Created by Lenovo on 11.03.2017.
 */
public class Task1 {
    /*
    Ввести текст с консоли.
    Подсчитать количество предложений в тексте,
    вывести предложение с максимальным количеством слов
    и предложение, которое содержит слово с максимальным количеством букв.
    */

    public static void main(String[] args) {
        String text;
        //List<String> mySentencesList= new ArrayList<String>();
        String[] mySentences;
        String[] myWords;
        int numberOfSentences;
        int[] numberOfWordsInTheSentence;

        int maxLengthOfSentence = 0;
        int indexOfMaxLengthSentence = 0;

        String maxLengthWord;
        int maxLengthOfWord = 0;
        int indexOfMaxLengthWord = 0;
        int indexOfSentenceWithMaxLengthWord = 0;


        //Выводим текст с консоли.
        text = enterText();

        //Разбиваем текст на предложения.


        mySentences = text.split("\n|\\.(?!\\d)|(?<!\\d)\\.");
        for (int i = 0; i < mySentences.length; i++) {
            System.out.println(mySentences[i]);
        }


        System.out.println("--------------------Here are the sentences: ");
        for (int i = 0; i < mySentences.length; i++) {
            System.out.println(mySentences[i]);
        }


        //Считаем количество предложений в тексте и выводим на экран.
        numberOfSentences = mySentences.length;
        System.out.println("--------------------Number of sentences = " + numberOfSentences);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Считаем количество слов в каждом предложении.
        numberOfWordsInTheSentence = new int[numberOfSentences];
        for (int i = 0; i < mySentences.length; i++) {
            System.out.println(mySentences[i]);
            myWords = mySentences[i].split("\\s");
            myWords = removeDelimiters(myWords);
            numberOfWordsInTheSentence[i] = myWords.length;

            //Определяем, в каком предложении максимально длинное слово.
            for (int j = 0; j < myWords.length; j++) {
                if (maxLengthOfWord < myWords[j].length()) {
                    maxLengthWord = myWords[j];
                    maxLengthOfWord = myWords[j].length();
                    indexOfMaxLengthWord = j;
                    indexOfSentenceWithMaxLengthWord = i;
                }
            }
        }

        //Определяем, в каком предложении максимальное число слов
        //и выводим это предложение на экран.
        for (int i = 0; i < numberOfWordsInTheSentence.length; i++) {
            if (maxLengthOfSentence < numberOfWordsInTheSentence[i]) {
                maxLengthOfSentence = numberOfWordsInTheSentence[i];
                indexOfMaxLengthSentence = i;
            }
        }
        System.out.println("--------------------Предложение с максимальным числом слов: ");
        System.out.println(mySentences[indexOfMaxLengthSentence]);
        System.out.println("Число слов = " + numberOfWordsInTheSentence[indexOfMaxLengthSentence]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("--------------------Предложение с самым длинным словом: ");
        System.out.println(mySentences[indexOfSentenceWithMaxLengthWord]);
        System.out.println("Длина слова= " + maxLengthOfWord);
    }
}
