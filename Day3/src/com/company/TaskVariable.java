package com.company;

public class TaskVariable {
    public static void main(String[] args) {

        /**
         * Write Java program to convert temperature from F to C.
         * input variable - kādu temp. jāpārveido;
         * how to convert - atrast formulu kā var pārveidot temp.
         * output result - konsole izprintē rezultātu.
         */
        int fTemp = 96; // F temp, kas jāpārveido
        int cTemp = (fTemp - 32) * 5 / 9; // izmanto formulu no google
        System.out.println(fTemp+ " F to C is "+cTemp);

        System.out.println("-------------------------");

        /**
         * Write Java program to convert 10000 minutes to days and years.
         * Use casting method (min to h, h to days, days to years
         */

        int getMin = 10000;
        int getHours = getMin / 60; // minūtes dala ar 60 jeb 1h
        int getDays = getHours / 24; // stundas dala ar 24 jeb 1 dienu
        int getYears = getDays / 365; // dienas dala ar 365 jeb 1 gadu
        System.out.println(getMin+ " minutes are "+getDays+ " days");
        System.out.println(getMin+ " minutes are "+getYears+ " years");

    }
}
