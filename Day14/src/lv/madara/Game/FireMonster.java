package lv.madara.Game;

public class FireMonster extends Monster{

    public FireMonster(String name){
        super(name);
    }

    //pārraksta parent class metodi un izmaina return tekstu
    @Override
    public String attack() {
        return "Attack with fire";
    }
}
