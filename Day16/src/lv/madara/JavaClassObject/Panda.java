package lv.madara.JavaClassObject;

import lv.madara.JavaAbstraction.Animal;

public class Panda implements Animal { //ar keyword "implements" importē interface Animal
    // interface - metode bez bodija (īsumā)

    public void animalSound(){ //ieliek visas metodes no Animal interface
        System.out.println("Sleeeeeepyyyyyy");
        //main metodē nebūs jāraksta sout+tab, tikai panda.animalSound
        //šajā metodē jau ir nodefinēts print "Sleeeepyyy"
    }
    public void run(){
        System.out.println("Panda keep running!");
    }

    //testējam Test klasē
}
