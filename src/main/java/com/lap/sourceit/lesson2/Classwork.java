package com.lap.sourceit.lesson2;

/**
 * Created by Lenovo on 04.03.2017.
 */
public class Classwork {


    public static void main(String[] args) {
        String mySentence;
        String[] myWords;

        mySentence = "В этом классе есть методы, которые позволяют сравнивать строки, осуществлять в них поиск и извлекать подстроки.";

        System.out.println(mySentence);

        myWords = mySentence.split("[ ]");
        for (int i = 0; i < myWords.length; i++) {
            if (myWords[i].endsWith(",") | myWords[i].endsWith(".")) {
                myWords[i] = myWords[i].substring(0, myWords[i].length() - 1);
                System.out.println(myWords[i]);
            }
        }

        for (int i = 0; i < myWords.length; i++) {
            String lett;
            if (myWords[i].length() == 1) {
                lett = " буква";
            } else {
                lett = " букв";
            }
            System.out.println(myWords[i] + "(" + myWords[i].length() + lett + ")");
        }

    }
}
