package com.company;

public class StringTestType {

    public static void main(String[] args) {

        int age = 30;
        String name = "Madara"; //String vienmēr raksta ar lielo burtu

        System.out.println(age+age); //iznākums būs summa 60
        System.out.println(age+ " "+age); //pēdiņas apvieno skaitļus, bet nesaskaita
        System.out.println(name+ "s age is "+age); // apvieno string ar int vērtībām
        System.out.println("age"); // pēdiņas skaitlim noņem vērtību, tas kļūst par String
        System.out.println(age+ " + "+age); // + šajā gadījumā ir teksts, nevis saskaitītājs

    }
}
