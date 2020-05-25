package lv.madara.Shapefigure;

public class Rectangle extends Shape { //extends - subclass will take info from parent class

    private int length;
    private int width;

    public Rectangle(String color, int length, int width){
        super(color); //color ņem no parent class Shape
        this.length = length;
        this.width = width;
    }

    //automātiski izveido Override tieši getArea metodei
    //šis override pārraksta "Shape" klases getArea return vērtību uz vajadzīgo
    //aiz return ieliek rectangular area formulu, lai dabūtu vajadzīgo rezultātu:
    @Override
    public double getArea() {
        return length * width;
    }

    //metode toString:
    //override toString (šo info printēs pie Rectangle class
    @Override
    public String toString() {
        return "Rectangle length is " + length + ", width is " + width + ", color is "+super.toString()+".";
        //no parent class "Shape" pieliek klāt color ar super.toString
    }

}
