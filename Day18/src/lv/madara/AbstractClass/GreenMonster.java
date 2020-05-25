package lv.madara.AbstractClass;

public class GreenMonster extends Monsters implements Skills{
    //Java saka priekšā, ka vajag mantot metodes un konstruktors
    //obligāti jāpaņem visas metodes no parent class

    //constructor:
    public GreenMonster(String name) {
        super(name); //
    }

    //methods:
    @Override
    public String attack() {
        return "Attack with fire weapon!"; //izveido foršu tekstu pie return
    }

    @Override
    public String heal() {
        return "Heal with your magic power!"; //izveido foršu tekstu pie return
    }

    //implement skills interface metodes:
    @Override
    public void fireBall() {
        System.out.println("Create fire ball"); //ar sout+tab ieraksta tekstu
    }

    @Override
    public void jump() {
        System.out.println("Now jump as high as you can!"); //ar sout+tab ieraksta tekstu
    }
}
