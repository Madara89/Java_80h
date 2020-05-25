package lv.madara;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // ArrayList is a class
        // in diamond <> write data type (ex.String)

        ArrayList <String> animals = new ArrayList<>(); //masīvs ir gatavs. Similar to constructor
        animals.add("Tiger"); //ar .add savada variable nosaukumus
        animals.add("Lion");
        animals.add("Panther");

        System.out.println(animals); //visu izprintē vienā rindā
        System.out.println(animals.get(2));//dabū konkrētu animal ar .get un index ciparu [0], [1], [2]


        animals.add(0,"Elephant"); //ieliek jaunu index, sistēma nepārraksta, bet pievieno
        System.out.println(animals);
        animals.add(4,"Giraffe");
        System.out.println(animals);

        animals.set(1, "Panda"); // ja vajag Tiger vietā Panda, izmanto .set; sistēma pārraksta
        System.out.println(animals);



    }
}
