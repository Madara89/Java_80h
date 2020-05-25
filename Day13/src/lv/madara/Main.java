package lv.madara;

import lv.madara.Graph.Point;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(10,4); //iekavās piešķir vērtības
        Point point2 = new Point(7,3);
        Point point3 = new Point(1,6);
        Point point4 = new Point(14,4);
        Point point5 = new Point(); //default konstruktors izprintēs (0,0)

        System.out.println("Point1 is: "+point1.toString()); //pie print izmanto .toString
        System.out.println("Point2 is: "+point2.toString());
        System.out.println("Point3 is: "+point3.toString());
        System.out.println("Point4 is: "+point4.toString());
        System.out.println("Point5 is: "+point5.toString());//default konstruktors

        //ar setX izmaina X vērtību, bet y paliek tāds pats:
        point2.setX(100);
        System.out.println("Point2 is: "+point2.toString());

        //ar setXY izmaina abas (x,y) vērtības:
        point4.setXY(-2,-69);
        System.out.println("Point4 is: "+point4.toString());

        //testēt/izprintēt masīvu:
        System.out.println(point1.getXY()); //šādi masīvu nevar izprintēt!
        System.out.println(Arrays.toString(point1.getXY())); //printē ar Arrays.toString funkciju

        //skatāmies distances ar jaunu point6:
        Point point6 = new Point (5,4);
        double distanceABPoint = point6.distance(10,4);
        System.out.println("Distance from point A to B is "+distanceABPoint);

        Point point7 = new Point (10,4);
        System.out.println(point6.distance(point7));



    }
}
