package lv.madara.Graph;

public class Circle extends Point {

    //klases atribūti
    private Point center; //Point klase ir kā datu tips
    private double radius;

    //izveido vajadzīgos konstruktorus:
    //1.
    public Circle (){ //default konstruktors
        this.center = new Point();
        this.radius = 0;
    }
    //2.
    public Circle (int xCenter, int yCenter, double radius){
        this.center = new Point(xCenter, yCenter);
        this.radius = radius;
    }
    //3.
    public Circle (Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    //Getters and Setters:
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //getCenterX un getCenterY:
    public int getCenterX(){
        return center.getX();
    }
    public int getCenterY(){
        return center.getX();
    }

    //setCenterX un setCenterY:
    public void setCenterX(int x){ //ar void
        this.center.setX(x);
    }
    public void setCenterY(int y){ //ar void
        this.center.setY(y);
    }

    //masīvu metodes:
    public int[] getCenterXY(){
        int[] arrays = new int [2];
        arrays [0] = center.getX();
        arrays [1] = center.getY();
        return arrays;
    }

    //izveido setCenterXY:
    public void setCenterXY(int x, int y){
        this.center.setXY(x,y);
    }

    //getArea izveido:
    public double getArea(){
        return radius * radius * Math.PI;
    }

    //getCircumference - parametra formula:
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    //distance starp 2 apļiem:
    public double distance (Circle circle){
        return Math.sqrt(Math.pow((this.center.getX()-circle.getCenterX()),2) + Math.pow((this.center.getY()-circle.getCenterY()),2));
    }

    //toString metode:
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }
}
