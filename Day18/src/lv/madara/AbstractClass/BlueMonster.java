package lv.madara.AbstractClass;

public class BlueMonster extends Monsters implements Skills{

    //obligāti pārmanto visas metodes un arī konstruktoru no parent class "Monsters":

    public BlueMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }

    @Override
    public String heal() {
        return "Heal with your blue wings!";
    }

    //implement skill interface methods:
    @Override
    public void fireBall() {
        System.out.println("Throw fire ball"); //ar sout+tab ieraksta tekstu
    }

    @Override
    public void jump() {
        System.out.println("Now jump jump jump");
    }
}
