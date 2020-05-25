package lv.madara;

import lv.madara.Point.MovablePoint;
import lv.madara.Point.Point;

public class TestPoint {
    public static void main(String[] args) {

        MovablePoint point1 = new MovablePoint(10.2f,5.5f,12.6f, 7.5f);
        point1.move();
        System.out.println(point1.move()); //x saskaita ar xSpeed; y saskaita ar ySpeed



    }
}
