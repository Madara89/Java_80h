package lv.madara.Figures;

public class Circle { //izveido klasi Circle
    //klases atribūti:
    private double radius = 1.0; //private padara pieejamu tikai savas klases/pakotnes ietvaros.Piekļūst ar konstruktoru
    public String color = "red"; //public var piekļūt jebkurā klasē/pakotnē

    //izveido konstruktorus:
    //tāds pats nosaukums kā klasei;
    //vārds public, padara konstruktoru pieejamu citā klasē (TestCircle)
    //konstruktorā tukšs parametrs nozīmē default vērtību;
    //katram konstruktoram piešķir parametru;
    //"this" nosaka, kāda būs konstruktora mainīgā variable - default vērtība vai cita.

    public Circle(){ //tukšs konstruktors - default konstruktors
    }
    public Circle(double rad){ //iekavās raksta parametru
        this.radius = rad; //this pasaka, ka default radius būs cita vērtība, nevis default
    }
    public Circle(double rad, String col){
        this.radius = rad; //this pasaka, ka default radius būs cita vērtība
        this.color = col; //this pasaka, ka default color būs cita krāsa
    }

    //izveido get metodes, kas izsauc klases atribūtus/mainīgos:
    public double getRadius(){
        return radius; //izsauc definēto radius
    }
    public String getColor(){
        return color; //izsauc definēto krāso

    }

}
