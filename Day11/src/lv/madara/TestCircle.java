package lv.madara;

import lv.madara.Figures.Circle;

public class TestCircle {

    public static void main(String[] args) {
        //izsauc konstruktorus no mapītes Figures:
        //new izsauc konstruktoru
        Circle c1 = new Circle(); //neko neraksta, jo tāds konstruktors, būs default vērtība
        Circle c2 = new Circle(20.3); //cita vērtība piešķirta, nevis default
        Circle c3 = new Circle(15.4, "blue");

        System.out.println(c1.color);
        //System.out.println(c1.radius); sistēma neļauj piekļūt, jo tas ir private
        System.out.println(c1.getRadius());//ar get metodi var piekļūt radius mainīgajam, kas ir private
        System.out.println(c2.getRadius()); //20.3, jo izmainīts default
        System.out.println("Circle is "+c3.getColor()+ ". Circle radius is "+c3.getRadius()); //apvienot abas c3 vērtības


    }
}
