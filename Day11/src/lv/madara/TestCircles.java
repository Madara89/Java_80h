package lv.madara;

import lv.madara.Figures.Circles;

public class TestCircles {
    //psvm - izveido main metodi, lai testētu
    public static void main(String[] args) {
        //testēsim savu Circles klasi:

        Circles c1 = new Circles(); //default konstruktors, instance
        System.out.println(c1.getRadius()); //izsaucam 1.konstruktora mainīgos
        System.out.println(c1.getColor());
        System.out.println(c1.toString());

        c1.setColor("Green"); //ar šo maina defaulta krāsu (no default red uz green)
        System.out.println(c1);

        Circles c2 = new Circles(42.2);//ieraksta vēlamo mainīgā vērtību iekavās
        System.out.println(c2.getRadius());
        c2.setRadius(20.02);//ar setter pārraksta atribūta vērtību
        System.out.println(c2.getRadius());

        System.out.println(c2.getArea());
        //lai tālāk formatētu skaitli:
        double formatC2 = c2.getArea(); //viens variants
        System.out.printf("%.2f",formatC2); //printf
        System.out.println();
        System.out.printf("%.2f",c2.getArea()); //otrs variants
        System.out.println();

        //mainīgo vērtības var noteikt arī šādi, nevis iekavā rakstot:
        double radius = 402.2;
        String color = "Pink";
        Circles c3 = new Circles(radius, color); //nav obligāti jāraksta vērtības iekavās, kā c2
        System.out.println(c3.toString());
        System.out.println(c3.getCircumference());
        System.out.printf("%.2f",c3.getCircumference());

    }
}
