package com.company;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 3; i < 7; ++i){
            //3 ir i sākuma vērtība. Printēs no 3 līdz 6:
            System.out.println("Index value is: "+i);
        }
        System.out.println("-----------------------");

        int [] arrays = {3,4,50};
        for (int i = 10; i >=5; i--){
            System.out.println("Index value is: "+i);
        }
        System.out.println("-----------------------");

        for (int i = 0; i < arrays.length; i++){
            System.out.println(arrays[i]);
        }
        System.out.print("["); //print bez ln izprintēs visu kodu vienā līnijā [3,4,50,]
        for (int i = 0; i < arrays.length; i++){
            System.out.print(arrays[i]+",");
        }
        System.out.println("]");
    }
}
