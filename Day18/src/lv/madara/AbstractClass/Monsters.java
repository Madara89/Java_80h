package lv.madara.AbstractClass;

abstract public class Monsters { //pirms public class ieraksta "abstract". Public obligāti jāpaliek

    //abstract - without body, but can be attributes and constructors

    private String name;

    //create constructor:
    public Monsters(String name){
        this.name = name;
    }
    abstract public String attack();
    abstract public String heal();

}
