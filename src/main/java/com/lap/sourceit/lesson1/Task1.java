package com.lap.sourceit.lesson1;

/**
 * Created by Lenovo on 26.02.2017.
 */
public class Task1 {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~1~~~~~~~~~~~~~~");
        System.out.println("Population of countries");
        int peopleGrBrit = 64;
        int peopleFrance = 66;
        int peopleGermany = 80;
        int peopleHoland = 17;
        System.out.println("Great Britain: " + peopleGrBrit);
        System.out.println("France: " + peopleFrance);
        System.out.println("Germany: " + peopleGermany);
        System.out.println("Holand: " + peopleHoland);


        System.out.println("~~~~~~~~~~~~~~2~~~~~~~~~~~~~~");
        System.out.println("Planet-Sun distance");
        int Merc = 58;
        int Ven = 108;
        int Earth = 150;
        int Mars = 228;
        int Jup = 778;
        int Sat = 1429;
        int Ur = 2875;
        int Nept = 4497;
        int Plut = 5913;
        System.out.println("Merc - Sun distance: " + Merc);
        System.out.println("Ven - Sun distance: " + Ven);
        System.out.println("Earth - Sun distance: " + Earth);
        System.out.println("Mars - Sun distance: " + Mars);
        System.out.println("Jup - Sun distance: " + Jup);
        System.out.println("Sat - Sun distance: " + Sat);
        System.out.println("Ur - Sun distance: " + Ur);
        System.out.println("Nept - Sun distance: " + Nept);
        System.out.println("Plut - Sun distance: " + Plut);
        System.out.println();
        System.out.println();
        System.out.println("Merc - Earth distance: " + (Earth - Merc));
        System.out.println("Ven - Earth distance: " + (Earth - Ven));
        System.out.println("Earth - Earth distance: " + (Earth - Earth));
        System.out.println("Mars - Earth distance: " + (Mars - Earth));
        System.out.println("Jup - Earth distance: " + (Jup - Earth));
        System.out.println("Sat - Earth distance: " + (Sat - Earth));
        System.out.println("Ur - Earth distance: " + (Ur - Earth));
        System.out.println("Nept - Earth distance: " + (Nept - Earth));
        System.out.println("Plut - Earth distance: " + (Plut - Earth));


        System.out.println("~~~~~~~~~~~~~~3~~~~~~~~~~~~~~");
        System.out.println("Areas of countries");
        int areaUkr = 603549;
        int areaGrBrit = 244820;
        int areaFrance = 674685;
        int areaGermany = 357021;
        int areaHoland = 41526;
        System.out.println("Area of Ukraine: " + areaUkr + " sq.km = " + areaUkr * 1000_000 + " sq.m = " + (areaUkr * 0.621371 * 0.621371) + " sq.miles");
        System.out.println("Area of Great Britain: " + areaGrBrit + " sq.km = " + areaGrBrit * 1000_000 + " sq.m = " + (areaGrBrit * 0.621371 * 0.621371) + " sq.miles");
        System.out.println("Area of France: " + areaFrance + " sq.km = " + areaFrance * 1000_000 + " sq.m = " + (areaFrance * 0.621371 * 0.621371) + " sq.miles");
        System.out.println("Area of Germany: " + areaGermany + " sq.km = " + areaGermany * 1000_000 + " sq.m = " + (areaGermany * 0.621371 * 0.621371) + " sq.miles");
        System.out.println("Area of Holand: " + areaHoland + " sq.km = " + areaHoland * 1000_000 + " sq.m = " + (areaHoland * 0.621371 * 0.621371) + " sq.miles");


        System.out.println("~~~~~~~~~~~~~~4~~~~~~~~~~~~~~");
        System.out.println("Currency exchange");
        double amount = 5000;
        double UAHTOUSD = 27.09;
        double UAHTOEUR = 28.48;
        double UAHTORUB = 0.46;

        System.out.println("5000 UAH = " + amount / UAHTOUSD + " USD.");
        System.out.println("5000 UAH = " + amount / UAHTOEUR + " EUR.");
        System.out.println("5000 UAH = " + amount / UAHTORUB + " RUB.");

    }
}
