package lv.madara;

import java.util.ArrayList;

public class TestWrapperType {
    public static void main(String[] args) {

        //wrapper class
        //primitīvo datu tipu pārveido par objektu

        Integer intNum;
        Double doubleNum;
        Character character;

        int number;
        double doubleNumber;
        char characterOne;

        ArrayList <Integer> arrayWithInt = new ArrayList<>(); //izveido Integer Arraylist
        arrayWithInt.add(244); //iedod mainīgajiem vērtības ar .add
        arrayWithInt.add(-90);
        arrayWithInt.add(1209);
        arrayWithInt.add(-30);
        arrayWithInt.add(664);
        arrayWithInt.add(12);

        System.out.println(arrayWithInt);
        System.out.println(arrayWithInt.size()); //6 elementi manā masīvā izveidoti (jeb length)

        System.out.println("---------------------------");
        // piemērs kā dabūt length masīvam
        int[] arrPrimitive = new int[3];
        int length = arrPrimitive.length;
        System.out.println(length);
        System.out.println("----------------------------");

        ArrayList <Integer> arrayWithInt2 = new ArrayList<>(); //izveido jaunu ArrayList variable
        arrayWithInt2.add(24);
        arrayWithInt2.add(555);
        arrayWithInt2.add(-32);
        arrayWithInt2.add(99);

        arrayWithInt.addAll(arrayWithInt2); //pirmajam Int masīvam pievieno visu Int2 masīvu

        System.out.println(arrayWithInt2);
        System.out.println(arrayWithInt);

        arrayWithInt.remove(4); // ar .remove izņem no masīva vajadzīgo indexu
        System.out.println(arrayWithInt);

        arrayWithInt.set(1, 590); // ar .set aizvieto norādīto indexu ar citu skaitli
        System.out.println(arrayWithInt);


    }
}
