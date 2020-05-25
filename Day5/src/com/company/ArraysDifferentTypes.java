package com.company;

import java.util.Arrays;

public class ArraysDifferentTypes {
    public static void main(String[] args) {

        String [] arrayOfString = new String [2]; // gribu saglabāt 2 elementus
        arrayOfString [0] = "Madara";
        arrayOfString [1] = "Lapsiņa";
        //lai izprintētu abus string vienā līnijā:
        System.out.println(Arrays.toString(arrayOfString)); //izvēlas Arrays.toString un mainīgo

        long [] arrayOfLong = new long [2];
        arrayOfLong [0] = 234567890;
        arrayOfLong [1] = 345323467;
        System.out.println(Arrays.toString(arrayOfLong));

        double [] arrayOfDouble = new double [3];
        arrayOfDouble [0] = 23.45;
        arrayOfDouble [1] = 12.8;
        arrayOfDouble [2] = 55.98;
        System.out.println(Arrays.toString(arrayOfDouble));

        char [] arrayOfChar = new char [3];
        arrayOfChar [0] = 'M';
        arrayOfChar [1] = 'A';
        arrayOfChar [2] = 'D';
        System.out.println(Arrays.toString(arrayOfChar));

        boolean [] arrayOfBoo = {true,false};
        System.out.println(Arrays.toString(arrayOfBoo));

    }
}
