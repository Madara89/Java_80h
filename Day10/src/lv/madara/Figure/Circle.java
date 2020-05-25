package lv.madara.Figure;

public class Circle {
        //neraksta psvm (neveido main metodi, bet savas)
        //no class tabulas izveido mainīgos un metodes:

        double radius; //tukši mainīgie (jeb atributes), bez vērtībām. Tikai datu tipu piešķir (double un String)
        String color;

        public double getRadius(){ //izveido metodi getRadius (jeb behaviours)
            return radius;
        }
        public double getArea(){ //izveido metodi getArea
            return radius * radius * 3.14;
        }

}
