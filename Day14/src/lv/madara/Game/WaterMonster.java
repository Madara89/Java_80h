package lv.madara.Game;

public class WaterMonster extends Monster{

    public WaterMonster(String name){
        super (name);
    }

    //pārraksta parent class metodi un izmaina return tekstu
    @Override
    public String attack() {
        return "Attack with water";
    }
}
