package lv.madara.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /**
         * use scanner
         * user can input one of math operators (+ - / % *)
         * user can input first number
         * and second number
         * e.g. if user input "+" output will be "30 + 100 = 130"
         * user can input only numbers
         */

        Scanner scanner = new Scanner(System.in); //aktivizē scanner

        System.out.println("Enter first number:"); //uzdod pirmo jautājumu
        double num1 = scanner.nextDouble(); //nosaka kādu ciparu (int vai double) users ievadīs
        System.out.println("Enter second number:"); //uzdod otro jautājumu
        double num2 = scanner.nextDouble();
        scanner.nextLine();// šo rindu OBLIGĀTI vajag starp nextInt/Double un nextLine
        System.out.println("Input one math operator: + - / * % ");
        String userInput = scanner.nextLine();

        System.out.println(); // šis ir vnk, lai būtu atstarpe starp rindām (tukšs space)

        //System.out.println("Math operator is: "+userInput);
        //System.out.println("Num1 is: "+num1);
        //System.out.println("Num2 is: "+num2);

        double result = 0;
        switch (userInput){
            case "+": //izmanto "" jo userInput ir String tips ar "" nevis int vai char
                result = num1 + num2;
                System.out.println(num1+" + "+num2+ " = "+formatDouble(result));
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1+" - "+num2+ " = "+formatDouble(result));
                break;
            case "/":
                result = num1 / num2;
                System.out.println(num1+" / "+num2+ " = "+formatDouble(result));
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1+" * "+num2+ " = "+formatDouble(result));
                break;
            case "%":
                result = num1 % num2;
                System.out.println(num1+" % "+num2+ " = "+formatDouble(result));
                break;
            default:
                System.out.println("Please chose correct math operator");

        }

    }
    public static String formatDouble(double resultDouble){ //šo metodi liek kalkulatorā (format double)
        double result = resultDouble;
        String resultStr = String.format("%.3f",result);
        return resultStr;

        // parametrs ir (double resultDouble) = tips + variable
        // arguments ir (result) = variable
    }
}
