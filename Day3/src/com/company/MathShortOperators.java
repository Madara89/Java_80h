package com.company;

public class MathShortOperators {
    public static void main(String[] args) {

        //+= -= *= /= %=

        int num = 4; // mainīgā vērtība ir 4
        num += 5; // šobrīd formula saka (4 += 5) = num vērtība tagad ir 9
        System.out.println(num);
        num -= 5;
        System.out.println(num); // formula saka (9 -= 5) = num vērtība ir atkal 4
        num *=5; // formula saka (4 *= 5) = num vērtība ir 20
        System.out.println(num);
        num /= 5; // formula saka (20 /= 5) num vērtība atkal 4
        System.out.println(num);
        num %= 5; // formula saka (4 %= 5) = num vērtība ir 4, jo 4/5 = 0 (paliek pāri 4). Modulus %
        System.out.println(num);

        System.out.println("-----------------");
        //tā pat ar decimālskaitļiem jeb double:
        double numDouble = 30.0; //numDouble sākotnējā vērtība ir 30.0
        numDouble += 30.8; //formula saka (30.0 += 30.8) = 60.8
        System.out.println(numDouble); // jaunā numDouble vērtība


    }
}
