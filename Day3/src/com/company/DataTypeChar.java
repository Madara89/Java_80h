package com.company;

public class DataTypeChar {
    public static void main(String[] args) {

        //katram character ir sava skaitliskā vērtība. Skatīt tabulu
        //characters liek apastrofās '', nevis pēdiņās
        char charA = 'A'; // pēc tabulas A ir vērtība 65
        char charB = 'B'; // B vērtība ir 66
        char c = 'c'; // vērtība ir 99
        char d = 'd';
        char e = 101; // 101 ir e vērtība pēc tabulas

        System.out.println(charA); // izprintēs simbolu A (jo tikai VIENS simbols)
        System.out.println(charA + charB); // izprintēs 131 (A un B summu)
        System.out.println(charA + " " + charB + " " + c + " " + d); //izprintēs A B c d, jo ir pēdiņas ""
        System.out.println(e);
        System.out.println(charA + charB + c + d); //būs skaitliska vērtība, jo vairāki summējas kopā

        // izprintēt savu vārdu Madara
        // vērtības ņem no tabulas
        char m = 77; // drukāsies ar lielo burtu, jo to pateiks skaitlis 77
        char a = 97;
        char charD = 100; // rakstu charD, jo "char d" jau tika izmantots iepriekšējā piemērā
        char r = 114;
        System.out.println(m+""+a+""+d+""+a+""+r+""+a); //ja nebūtu "", tad burti summētos kopā

        // casting data types (from numbers to characters):
        int intNum = 200; // variable piešķir vērtību
        char charType = (char)intNum; //ar explicit casting, skaitli pārvērš to character
        System.out.println(charType);


    }
}
