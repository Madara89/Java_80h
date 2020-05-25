package com.company;

public class TestIf {
    public static void main(String[] args) {

        /**
         * create Java program to test temp.
         * If temp is higher than 80.1, print "Hot"
         * otherwise, print "Cold".
         */

        double temp = 80.5; // pati nosaku variable vērtību
        if (temp>80.1){
            System.out.println("Hot");
        }else{
            System.out.println("Cold");
        }

        /**
         * use if, else if, else
         * where temp is more than 80.1, print "Hot"
         * from 75 to 80 print "Just fine"
         * if less than 75, print "Cold"
         */

        double temperature = 75.0;
        if (temperature>=80.1){ // temp lielāka par 80.1
            System.out.println("Hot");
        }else if (temperature>=75.0){ //temp ir no 75-80
            System.out.println("Just fine");
        }else{
            System.out.println("Cold");// ja temp ir zem 75.0
        }


    }
}
