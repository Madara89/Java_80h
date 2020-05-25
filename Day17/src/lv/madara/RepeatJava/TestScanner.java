package lv.madara.RepeatJava;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner is Java class; ->(System.in)-user input

        //System.out.println(); --> System.out prints result
        //String userInput = scanner.nextLine(); //nextLine id for String data type
        //System.out.println(userInput);

        //use try-catch block to handle int user input
        //user should only input int
        //if string entered by user, notify him and show issue

        try{
            System.out.println("Please input number:");
            int var = scanner.nextInt();
            System.out.println("Your input is "+var);
        }catch(Exception e){
            System.out.println("Wrong input. Please enter number only! "+e);
        }finally{
            scanner.close(); //this is a very good practice. This closes scanner
        }

        //within try-catch block we can handle possible code issues, if user enters incorrect input













    }
}
