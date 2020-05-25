package com.company;

public class IfElseStatement {
    public static void main(String[] args) {

        System.out.println(10>6); // sistēma šo atpazīst kā true vai false (loģiskie operatori)

        // if veido savu statement bloku ar {} iekavām. Ja tas izpildās, to izpilda konsole:
        if (10<6){
            System.out.println("I am in if block"); // neko neizprintē, jo if neizpildās, nav true
        }

        int clock = 22;
        if (20 >= clock){
            System.out.println("Go to sleep"); //neizpildās if funkcija, jo 20 nav lielāks par 22
        }else{
            System.out.println("You can read a book");
        }

        System.out.println("---------------------------");

        /**
         * Write a Java program called CheckPassFail.
         * It prints "Pass" if the int variable mark is more than or equal to 50,
         * and prints "Fail" otherwise.
         * The program shall always print "Done" before exiting
         */

        int mark = 60; //mark iedod jebkādu vērtību
        if (mark >= 50){
            System.out.println("Pass"); // ja izpildās if funkcija
        }else{
            System.out.println("Fail"); // ja neizpildās if funkcijai
        }
        System.out.println("Done"); // raksta ārpus if -else bloka, lai izpildās vienmēr


    }
}
