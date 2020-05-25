package com.company;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int [] arrayOfInts = new int [3];
        //[3] norāda masīva garumu.
        // katrai [] jeb array index ir sava vērtība. [] Sāk skaitīt ar 0 elementu.

        // assign values to each array index:
        arrayOfInts [0] = 20; // piešķir jebkādu vērtību
        arrayOfInts [1] = -23;
        arrayOfInts [2] = 90;
        System.out.println("Index 0 value is "+arrayOfInts[0]);
        System.out.println("Index 1 value is "+arrayOfInts[1]);
        System.out.println("Index 2 value is "+arrayOfInts[2]);

        System.out.println("------------------------------");

        int [] arrayOfValues = {2,3,10,50,200}; // ar {} apvieno visus indexus[] kopā
        System.out.println(arrayOfValues[0]); // tas būs 2, jo 0-tais index pēc kārtas
        System.out.println(arrayOfValues[3]); // tas būs 50
        System.out.println(arrayOfValues[1]); //tas būs 3
        System.out.println(arrayOfValues[3]+arrayOfValues[4]); //saskaita indexus

        // lai uzzinātu cik pavisam kopā masīvā ir indexu bez skaitīšanas:
        System.out.println(arrayOfValues.length);
        // .length automātiski saskaita masīva daudzumu = 5 elementi
        // rezultāts būs 5, lai gan skaitot arrays no 0 būtu 4

        // lai noteiktu PĒDĒJĀ indexa vērtību
        System.out.println(arrayOfValues[arrayOfValues.length-1]); // [5-1] = 4 index (tas ir 200)

        // lai izprintētu visas vērtības rindiņā
        System.out.println(Arrays.toString(arrayOfValues));

        // Kā var dabūt visu indexu kopējo summu?



    }
}
