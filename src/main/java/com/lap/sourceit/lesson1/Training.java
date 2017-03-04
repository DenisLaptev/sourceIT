package com.lap.sourceit.lesson1;

/**
 * Created by Lenovo on 26.02.2017.
 */
public class Training {
    public static void main(String[] args) {

        /*Базовый синтаксис*/

        System.out.println("Базовый синтаксис");

        int i;
        i = 5;
        System.out.println(i);

        int i1;
        i1 = 5;
        i1 += 2;
        System.out.println(i1);

        int i2;
        i2 = 5;
        i2 -= 4;
        System.out.println(i2);

        int i3;
        i3 = 5;
        i3 *= 6;
        System.out.println(i3);

        long l;
        l = 10L;
        l /= 2;
        System.out.println(l);

        long l1;
        long resultL1;
        l1 = 10L;
        resultL1 = l1 % 5;
        System.out.println(resultL1);

        float f;
        f = 100F;
        f /= 3;
        f += 6;
        System.out.println(f);

        double d;
        d = 1000_000;
        d -= 5;
        d *= 6;
        System.out.println(d);

        int i4;
        i4 = 10;
        i4 = i4 + 1;
        System.out.println(i4);

        i4 += 1;
        System.out.println(i4);

        i4++;
        System.out.println(i4);

        System.out.println("--------------------------------------------------------");

        /*Условные операции*/

        System.out.println("Условные операции");

        int i5;
        i5 = 23;
        if (i5 > 0) {
            System.out.println("positive");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");

        double d1;
        d1 = -23;
        if (d1 < 0) {
            System.out.println("negative");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");

        double d2;
        d2 = 5;
        if (d2 == 5) {
            System.out.println("it’s true");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");

        int i6;
        int i7;

        i6 = 60;
        i7 = 70;

        if (i6 > i7) {
            System.out.println("max(" + i6 + ", " + i7 + ")= " + i6);
        } else if (i7 > i6) {
            System.out.println("max(" + i6 + ", " + i7 + ")= " + i7);
        } else {
            System.out.println("Переменные (" + i6 + ", " + i7 + ") равны.");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");

        int i8;
        int i9;

        i8 = 60;
        i9 = 70;

        if (i8 < i9) {
            System.out.println("min(" + i8 + ", " + i9 + ")= " + i8);
        } else if (i9 < i8) {
            System.out.println("min(" + i8 + ", " + i9 + ")= " + i9);
        } else {
            System.out.println("Переменные (" + i8 + ", " + i9 + ") равны.");
        }


        System.out.println("~~~~~~~~~~~~~~~~~~");

        int i10;
        int i11;

        i10 = 60;
        i11 = 70;

        if (i10 < i11) {
            System.out.println("min(" + i10 + ", " + i11 + ")= " + i10);
            System.out.println("max(" + i10 + ", " + i11 + ")= " + i11);
        } else if (i11 < i10) {
            System.out.println("min(" + i10 + ", " + i11 + ")= " + i11);
            System.out.println("max(" + i10 + ", " + i11 + ")= " + i10);
        } else {
            System.out.println("Переменные (" + i10 + ", " + i11 + ") равны.");
        }


        System.out.println("~~~~~~~~~~~~~~~~~~");

        double doubleNum1;
        double doubleNum2;
        int doubleFlag = 0;

        doubleNum1 = 60;
        doubleNum2 = 70;

        if (doubleNum1 > 0) {
            System.out.println(doubleNum1);
            doubleFlag++;
        }
        if (doubleNum2 > 0) {
            System.out.println(doubleNum2);
            doubleFlag++;
        }
        if (doubleFlag == 0) {
            System.out.println("no positive numbers");
        }


        System.out.println("~~~~~~~~~~~~~~~~~~");

        double doubleNum3;
        double doubleNum4;
        int doubleFlag1 = 0;

        doubleNum3 = -60;
        doubleNum4 = 70;

        if (doubleNum3 < 0) {
            System.out.println(doubleNum3);
            doubleFlag1++;
        }
        if (doubleNum4 < 0) {
            System.out.println(doubleNum4);
            doubleFlag1++;
        }
        if (doubleFlag1 == 0) {
            System.out.println("no negative numbers");
        }


        System.out.println("~~~~~~~~~~~~~~~~~~");

        double doubleNum5;
        double doubleNum6;
        int doubleFlag2 = 0;

        doubleNum5 = -60;
        doubleNum6 = 70;

        System.out.println("positive numbers:");
        if (doubleNum5 > 0) {
            System.out.println(doubleNum5);
            doubleFlag2++;
        }
        if (doubleNum6 > 0) {
            System.out.println(doubleNum6);
            doubleFlag2++;
        }

        System.out.println("negative numbers:");
        if (doubleNum5 < 0) {
            System.out.println(doubleNum5);
            doubleFlag2++;
        }
        if (doubleNum6 < 0) {
            System.out.println(doubleNum6);
            doubleFlag2++;
        }
        if (doubleFlag2 == 0) {
            System.out.println("all numbers = 0");
        }


        System.out.println("~~~~~~~~~~~~~~~~~~");

        double doubleNum7;
        double doubleNum8;
        int doubleFlag3 = 0;

        doubleNum7 = -60;
        doubleNum8 = 70;

        System.out.println("nonzero numbers:");
        if (doubleNum7 != 0) {
            System.out.println(doubleNum7);
            doubleFlag3++;
        }
        if (doubleNum8 != 0) {
            System.out.println(doubleNum8);
            doubleFlag3++;
        }

        if (doubleFlag3 == 0) {
            System.out.println("all numbers = 0");
        }


    }
}
