package lv.madara;

import lv.madara.JavaEnums.Level;

public class TestEnum {
    public static void main(String[] args) {

        Level level = Level.LOW; //izsauc Level enumu = classname.low/medium/high
        System.out.println(level);
        Level level1 = Level.HIGH;
        System.out.println(level1);
        Level level2 = Level.MEDIUM;
        System.out.println(level2);

        Level consVar = Level.MEDIUM;

        switch(consVar){
            case LOW:
                System.out.println("Your level is "+Level.LOW);
                break;
            case MEDIUM:
                System.out.println("Your level is "+Level.MEDIUM);
                break;
            case HIGH:
                System.out.println("Your level is "+Level.HIGH);
                break;
            default:
                System.out.println("Cannot define level"); //default šajā gadījumā nepastāv, lieks
        }

        //for each:
        for(Level var : Level.values()){ //Level ir datu tips
            System.out.println(var);
        }

    }
}
