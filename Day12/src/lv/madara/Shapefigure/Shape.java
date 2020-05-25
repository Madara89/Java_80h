package lv.madara.Shapefigure;

public class Shape {

    private String color;

    //konstruktors:
    public Shape(String color){
        this.color = color;
    }

    //izveido metodi priekš getArea:
    public double getArea(){
        System.out.println("Shape unknown. Cannot compute area!");
        //šo printēs, ja nevarēs izrēķināt area
        return 0; //sākotnējā vērtība
    }

    //toString metode:
    @Override
    public String toString() {
        return color;
    }
}
