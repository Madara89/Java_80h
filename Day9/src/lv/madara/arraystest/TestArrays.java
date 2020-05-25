package lv.madara.arraystest;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {

        double[] arrDouble = new double[4]; // masīvs, kas sastāv no 4 index (elementiem)
        arrDouble[0] = 20.4; //katram index ir sava vērtība
        arrDouble [1] = 50.3;
        arrDouble[2] = 42.3;
        arrDouble [3] = 100.3;

        System.out.println(Arrays.toString(arrDouble)); //Arrays.toString izmanto, lai izprintētu
        System.out.println(arrDouble[0]); // izprintē konkrētu simbolu
        System.out.println("["+arrDouble[0]+"]"); // pievieno iekavas
        System.out.println(arrDouble.length); //masīva lielums

        double[] arrays = {20.4, 50.3, 42.3, 100.3}; //tas vnk saīsina kodu, kas ir augšā
        System.out.println(Arrays.toString(arrays));

        //masīva summu var saskaitīt tikai ar "for loop" palīdzību


    }
}
