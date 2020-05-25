package com.company;

public class IncrDecrOperator {
    public static void main(String[] args) {

        int num = 0; //mainīgajam piešķir vērtību 0 (tālāk kodā vērtība mainās)
        System.out.println(num); // izprintējas piešķirtā vērtība

        num++; // increment ++ palielina mainīgā vērtību par 1 (0+1=1)
        System.out.println(num); //tagad num vērtība ir 1.

        num--; // decrement -- samazina mainīgā vērtību par 1. (1-1=0)
        System.out.println(num); //mainīgā vērtība atkal ir 0

        double numDouble = 0.078; // decimālskaitlis
        numDouble++; // pieskaita +1 = 1.078
        System.out.println(numDouble);



    }
}
