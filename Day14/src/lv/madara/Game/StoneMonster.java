package lv.madara.Game;

public class StoneMonster extends Monster{

    public StoneMonster(String name){
        super(name);
    }

    //pārraksta parent class metodi un izmaina return tekstu
    @Override
    public String attack() {
        return "Attack with stones";
    }
}
