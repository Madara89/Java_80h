package lv.madara;

import lv.madara.Shapefigure.Rectangle;
import lv.madara.Shapefigure.Shape;
import lv.madara.Shapefigure.Triangle;

public class TestShape {
    public static void main(String[] args) {

        //testē Rectangle klasi:
        Shape rectangle1 = new Rectangle("green", 2,5); //ieraksta mainīgos
        System.out.println(rectangle1.toString());
        System.out.println("Area of rectangle is "+rectangle1.getArea());

        //testē Triangle klasi:
        Shape triangle1 = new Triangle("blue",10,15); //ieraksta mainīgos
        System.out.println(triangle1.toString());
        System.out.println("Area of triangle is "+triangle1.getArea());
    }
}
