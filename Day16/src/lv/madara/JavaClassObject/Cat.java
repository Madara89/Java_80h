package lv.madara.JavaClassObject;

import lv.madara.JavaAbstraction.Animal;

public class Cat implements Animal { //implement Interface Animal

    //do similar like panda
    //add 1 more method - String sleep()

    public void animalSound(){
        System.out.println("Meowwwwwww");
    }
    public void run(){
        System.out.println("Go run!");
    }

    //izveido jaunu String metodi "sleep", izsauc ar return:
    public String sleep(){
        return "Sleeping";
        //kad testēs, šo izsauks ar sout+tab, jo te metodē nav sout+tab
    }



}
