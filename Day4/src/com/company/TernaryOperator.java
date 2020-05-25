package com.company;

public class TernaryOperator {
    public static void main(String[] args) {

        int time = 20;
        if(time<18){
            System.out.println("Good day");
        }else{
            System.out.println("Good night");
        }

        // if else kodu var arī saīsināti rakstīt ar String jeb Ternary
        // Ternary samazina kodu rindu skaitu
        // Ternary var aizvietot tikai, ja ir true vai false. Jeb if-else funkciju

        String result = (time<18)? "Good day" : "Good night"; // "True" : "False"
        System.out.println(result);
    }
}
