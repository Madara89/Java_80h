package lv.madara.Shapefigure;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(String color, int base, int height){
        super (color);
        this.base = base;
        this.height = height;
    }

    //izveido Override getArea metodei
    //override pārraksta parent class "Shape" getArea vērtību
    //aiz return ieraksta triangle area formulu:
    @Override
    public double getArea() {
        return height * base / 2 ;
    }

    //toString metode:
    //pārraksta toString metodi. Pie Triangle, būs šāds teksts:
    @Override
    public String toString() {
        return "Triangle base is " + base + ", height is " + height + ", color is " + super.toString()+".";
        //pieliek klāt no parent class "Shape" color ar super.toString
    }
}
