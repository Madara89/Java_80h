package com.company;

public class Calculator {
    public static void main(String[] args) {

        /**
         * Need to build calculator with math operators, using if, else if statement.
         * + - / * % (math operators)
         * char operators = '+'; mainīgais kalkulatorā
         * double num1 = 20.0;
         * double num2 = 30.0;
         * double result = 0;
         */

        char mathOperator = 'H'; // math operator ir mainīgais
        double num1 = 20.0;
        double num2 = 30.0;
        double result = 0; // nav obligāti jāliek vērtība 0. Var vnk rakstīt double result;

        if (mathOperator == '+'){
            result = num1 + num2;
            System.out.println(result);
        }else if(mathOperator == '-'){
            result = num1 - num2;
            System.out.println(result);
        }else if(mathOperator == '/'){
            result = num1 / num2;
            System.out.println(result);
        }else if(mathOperator == '*'){
            result = num1 * num2;
            System.out.println(result);
        }else if(mathOperator == '%'){
            result = num1 % num2;
            System.out.println(result);
        }else{
            System.out.println("No such operator present"); // ja char mathOperator ir kas cits
        }
    }
}
