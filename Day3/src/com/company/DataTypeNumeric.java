package com.company;

public class DataTypeNumeric {
    public static void main(String[] args) {

        //variable jeb mainīgo tipi (Integers):

        int intNumber = 200000000;
        long longNumber = 2005L; // burts L ir, lai sistēmai pateiktu, ka skaitliskā vērtība ir long
        byte byteNumber = 127; // byteNumber nevar būt lielāks par 127. IDE uzreiz ziņos.
        short shortNumber = 2000;
        double doubleNumber = 20.6;
        float floatNumber = 21.7777f; //jāpieliek burts f, savādāk sistēma lamājas. Maz izmanto

        /**
         * write Java program to print the area and perimeter of a rectangular
         * s = a*b (laukums/area)
         * p = a*2 + b*2 (perimetrs)
         */

        int a = 30;
        int b = 20;
        int s = a * b; // laukums s
        int p = a * 2 + b * 2; // perimetrs p
        System.out.println("Area is "+s);
        System.out.println("Perimeter is "+p);

        System.out.println("---------------------------");

        // tas pats uzdevums tikai ar double skaitļiem (decimālskaitļiem):
        double aDouble = 15.08; // variable nosaukumi nedrīkst atkārtoties kodā
        double bDouble = 22.07;
        double sDouble = aDouble * bDouble; // laukums s
        double pDouble = aDouble * 2.0 + bDouble * 2.0; //pie double arī reizinātājiem liek decimāldaļu
        System.out.println("Area is "+sDouble);
        System.out.println("Perimeter is "+pDouble);

        System.out.println("-----------------------------");

        // sistēma atļauj double funkcijai izmantot int tipa variables (jo double strādā arī ar pilniem sk.)
        // int tips savukārt NEVAR izmantot double variables: int result = aDouble+bDouble
        double result = a * b; // a un b ir int variables šajā kodā
        System.out.println(result);






    }
}
