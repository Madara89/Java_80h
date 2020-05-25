package lv.madara;

import lv.madara.Game.FireMonster;
import lv.madara.Game.Monster;
import lv.madara.Game.StoneMonster;
import lv.madara.Game.WaterMonster;

public class TestMonster { //testMonster clasei jābūt ĀRPUS game pakotnes, lai strādātu
    public static void main(String[] args) {

        Monster fireMonster = new FireMonster("Fire monster");
        Monster waterMonster = new WaterMonster("Water monster");
        Monster stoneMonster = new StoneMonster("Stone monster");
        Monster monster = new Monster("Monster");

        System.out.println(fireMonster.attack());
        System.out.println(waterMonster.attack());
        System.out.println(stoneMonster.attack());
        System.out.println(monster.attack());

        //visiem monster ir viena darbība - attack!
        //bet tiem ir dažādas stihijas - fire, water and stone.

    }
}
