package lv.madara;

import lv.madara.Graph.Circle;
import lv.madara.Graph.Point;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2,3,1); //testējam 2.konstruktoru
        System.out.println(circle1.getCenterX());

        Point point1 = new Point(3,20); //testējam 3.konstruktoru
        Circle circle2 = new Circle(point1,4);
        System.out.println(circle2.toString());

        System.out.println("Circle area is "+circle1.getArea()); //testējam getArea

        System.out.println(circle2.distance(circle1));


    }
}
