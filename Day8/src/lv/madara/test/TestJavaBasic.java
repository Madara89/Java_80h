package lv.madara.test;

import java.util.Scanner;

public class TestJavaBasic {
    public static void main(String[] args) {

        // if - (else if) - else funkcija:

        // user need input open gate or close gate
        // if user type open, print "Gate is open"
        // if user type close, print "Gate is closed"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input option to close or open gate");
        String userInput = scanner.nextLine();


        //String openGate = "exit"; //izveido stringu ar ziņojumu (open, exit, closed etc.)
        //System.out.println(openGate.equals("open")); // statement ir true vai false (boolean)

        if(userInput.equals("open")){ //lai Stringu salīdzinātu ar kko (nevis ==, bet .equals)
            System.out.println("Gate is open");
        }else{
            System.out.println("Gate is closed");
        }

    }



}
