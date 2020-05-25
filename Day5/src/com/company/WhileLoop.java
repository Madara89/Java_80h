package com.company;

public class WhileLoop {
    public static void main(String[] args) {

        int n = 5;
        int factorial = 1;
        int number = 1;

        while(number <= n){
            factorial = factorial + number;
            ++number;
            System.out.println(number);
        }
        System.out.println("-------------------");

        int i = 3; // i sākuma vērtība
        while (i<8){
            System.out.println(i); // bez ++i, konsolē izprintēs bezgala daudz 3niekus.
            ++i; // izprintē i no 3 līdz 7 (jo i = 3 un i < 8)
        }
        System.out.println("--------------------");

        int sum = 0;
        int upperBound = 10;
        int num = 1;

        while (num <= upperBound){
            sum = sum + num;
            ++num;
            System.out.println(num);
        }
        System.out.println("Sum of 1 to 10 range is: "+ sum);
    }
}
