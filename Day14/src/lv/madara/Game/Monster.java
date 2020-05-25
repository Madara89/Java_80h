package lv.madara.Game;

public class Monster { //parent class

    private String name;

    //constructor
    public Monster(String name){
        this.name = name;
    }

    //method "attack" (behavior kas piemīt visiem monstriem)
    public String attack(){
        return "!# I don't know how to attack";
    }



}
