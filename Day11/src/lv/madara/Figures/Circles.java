package lv.madara.Figures;

public class Circles {
    //mainīgajam nosaka final/obligāto vērtību kā default
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "red";

    private double radius; //ulm tabulā "-" nozīmē private, "+" public atribūts
    private String color;


    //veido konstruktorus, kas private atribūtiem piešķir vērtības:
    public Circles(){
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }
    public Circles (double radius){ //ja grib tikai parametru radius mainīt
        this.radius = radius; //lai radiusu mainītu
        this.color = DEFAULT_COLOR; //lai color būtu default
    }
    public Circles(double radius,String color){ //ja grib abus parametrus mainīt
        this.radius = radius;
        this.color = color;
    }

    //automātiski izveidot getRadius, getColor ar "Getter":
    //labais taustiņš --> Generate-->Getter (izvēlas,ko vajag)--> OK

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    //labais taustiņš-->Generate-->Setter (izvēlas)-->OK:
    //setter ir metode ar parametru
    //setter ir ar void
    //maina vērtību mainīgajam
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Generate-->toString-->OK:
    @Override
    public String toString() {
        return "Circles[" + "radius = " + radius + ", color = " + color +"]";
    }

    //izveido metodes, lai dabūtu getArea un getCircumference:
    public double getArea(){ //jaunu var iegūt ar return (area iepriekš nav definēta)
        return radius * radius * 3.14;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }



}
