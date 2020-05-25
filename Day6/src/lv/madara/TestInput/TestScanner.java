package lv.madara.TestInput;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {

        //kā veidot interaktīvo saraksti ar Scanner tipu:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your full name:");
        String userName = scanner.nextLine(); //String, jo vārds ir teksts
        System.out.println("Indicate your age:");
        int age = scanner.nextInt(); // int, jo age ir pilns cipars

        System.out.println("Your full name is: "+userName);
        System.out.println("Your age is: "+age);




    }
}
