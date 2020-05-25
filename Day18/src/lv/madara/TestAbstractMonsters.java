package lv.madara;

import lv.madara.AbstractClass.BlueMonster;
import lv.madara.AbstractClass.GreenMonster;
import lv.madara.AbstractClass.Monsters;

public class TestAbstractMonsters {
    public static void main(String[] args) {

        Monsters monster1 = new GreenMonster("Green"); //uzreiz izvēlas kādu no monstriem
        System.out.println(monster1.attack()); //izmanto sout+tab, jo klasē pie name nav definēts sout+tab
        System.out.println(monster1.heal());

        Monsters monster2 = new BlueMonster("Blue");
        System.out.println(monster2.attack());
        System.out.println(monster2.heal());

        //interface skills testē izsaucot Greenmonster/Bluemonster klases, jo tajās implemented interface:
        //ja grib ar Monster klasi, tad vajag Monster klasē implements Skills (interface)
        GreenMonster monster3 = new GreenMonster("Greeny");
        monster3.jump(); //ja klasē bija definēts sout+tab, tad metodi var printēt vnk ar monster3.jump
        monster3.fireBall();

        BlueMonster monster4 = new BlueMonster("Baby blue");
        monster4.fireBall();
        monster4.jump();
    }
}
