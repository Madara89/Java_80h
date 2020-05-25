package com.company;

public class DataTypeBool {
    public static void main(String[] args) {

        boolean varBoolTrue = true; // pastāv divi varianti - true or false
        boolean varBoolFalse = false;
        System.out.println(varBoolTrue);
        System.out.println(varBoolFalse);
        System.out.println("-----------------------");

        // loģiskie operatatori < > ==

        System.out.println(1>4);
        System.out.println(1<4);
        System.out.println(1==4);//equals to, vienāds ar..
        System.out.println(4==4);
        System.out.println('A'=='A'); // var salīdzināt ar characters, jo tiem ir skaitliska vērtība pēc tabulas

        System.out.println("---------Uzdevums-----------");
        /**
         * Write Java program to compare two numbers
         * Input data: first int is 688, second int is 33
         * Result: "Is number 688 greater than 33", "It is true"
         */

        int num1 = 688;
        int num2 = 33;
        boolean checkLessThan = num1 < num2; // boolean tikai true or false var būt (yes/no)
        boolean checkGreaterThan = num1 > num2;
        boolean checkEqualTo = num1 == num2;

        System.out.println("Is number "+num1+ " less than "+num2);
        System.out.println("It is "+checkLessThan);
        System.out.println("Is number "+num1+ " greater than "+num2);
        System.out.println("It is "+checkGreaterThan);
        System.out.println("Is number "+num1+ " equal to "+num2);
        System.out.println("It is "+checkEqualTo);




    }
}
