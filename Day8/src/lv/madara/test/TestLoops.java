package lv.madara.test;

import java.util.Scanner;

public class TestLoops {
    public static void main(String[] args) {

        int num = 0;
        while(num < 5){
            System.out.println("Check while");
            num++; //debug ļauj vieglāk saprast koda darbību
        }

        System.out.println("-------------------");
        //method will check user input while it is correct
        //user raksta inputus dažādus līdz noteiktam rezultātam (vajag obligāti open)
        //kad ievada input = open, sistēma paziņo correct

        //vispirms izveido scanner sistēmu:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type open");
        String userInput = scanner.nextLine();

        //tad izmanto while programmu, lai panāktu vajadzīgo rezultātu (open)
        while (!userInput.equals("open")){
            //obligāti jāliek logical operator ! (not equal to open)
            //kamēr user nebūs uzrakstījis open, sistēma prasīs to izdarīt
            System.out.println("You typed "+userInput+ " but need to type open");
            userInput = scanner.nextLine();
        }
        // kad user ieraksta vajadzīgo open, parādās "you typed correct":
        System.out.println("You typed correct: "+userInput);
    }





}
