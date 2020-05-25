package lv.madara;

import lv.madara.JavaAbstraction.Animal;
import lv.madara.JavaClassObject.Cat;
import lv.madara.JavaClassObject.Panda;

public class TestInterface {
    public static void main(String[] args) {

        Panda panda = new Panda(); //izsauc Panda class un konstruktoru no Panda class
        panda.animalSound(); //izsauc Animal/Panda metodes ar .animalSound() un .run()
        panda.run();

        Animal panda1 = new Panda(); //izsauc Animal interface, izsauc konstruktoru no Panda class
        panda1.animalSound();
        panda1.run();

        System.out.println("-------------------");

        Cat cat = new Cat(); //izsauc Cat class
        cat.animalSound();
        cat.run();
        System.out.println(cat.sleep()); //ar sout+tab izsauc String metodi, jo bija return

        //var arī izveidot mainīgu cat stāvokli, mainot statusu:
        String catStatus = "Running"; //definē catStatus
        System.out.println("Cat is "+catStatus);
        catStatus = cat.sleep(); //maina catStatus
        System.out.println("Cat is "+catStatus);




    }
}
