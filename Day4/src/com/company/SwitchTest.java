package com.company;

public class SwitchTest {
    public static void main(String[] args) {

        char operator = '*'; // char operatoru vienmēr raksta pēdiņās'. Tas būs mainīgais
        double num1 = 10.0;
        double num2 = 3.0;
        double result; // te nav obligāti jāliek vērtība 0, bet to var arī darīt.

        switch (operator){ //switch norāda, ka mainīgais būs operator. Katrs case ir cits math op
            case '+': // pievērst uzmanību : nevis ;
                result = num1 + num2;
                System.out.println(result);
                break; // break norāda, ka šeit viss apstājas, ja funkcija switch izpildās
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break; // ja neraksta break, tad visi rezultāti izprintēsies
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println(result);
            default: // izpildās tad, ja neviens no case neizpildās (kā else pie if funkcijas)
                System.out.println("No such math operator present");


        }
    }
}
