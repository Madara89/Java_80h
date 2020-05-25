package lv.madara.taxes;

import java.util.Scanner;

public class TaxTest {
    public static void main(String[] args) {

        //progresīvais nodoklis, jo lielāki ienākumi, jo lielāki nodokļi
        // ex. 10000 * 0.1 (10%) = 1000
        // no 10001 - 20000 * 0.2 (20%) = ...
        // cik pelna jāievada un kalculators izrēķina, kāda būs nodokļu summa

        // lai format result būtu 0.00 (2 cipari aiz komata)
        // "please enter your monthly income"
        // tax rate 10, 20, 30, 35%
        // var izmantot if-else vai switch funkcija
        // sākam ar Scanner izveidošanu
        // par printēšanu "Your monthly income is..and your tax rate is..you have to pay taxes..
        // tātad rezultātā jābūt algas lielumam, nodokļu lielumam, cik jāmaksā
        // + vienu savu metodi izveidot (piem., formatē skaitļus vai ko citu)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your monthly income:");
        double num1 = scanner.nextDouble();
        System.out.println();

        double result = 0;
        if (num1 <= 1000) {
            result = num1 * 0.10;
            System.out.println("Your monthly income is " + formatDouble(num1) + " EUR and your tax rate is 10%. You have to pay " + formatDouble(result) + " EUR.");
        } else if (num1 <= 2000) {
            result = num1 * 0.20;
            System.out.println("Your monthly income is " + formatDouble(num1) + " EUR and your tax rate is 20%. You have to pay " + formatDouble(result) + " EUR.");
        } else if (num1 <= 3000) {
            result = num1 * 0.30;
            System.out.println("Your monthly income is " + formatDouble(num1) + " EUR and your tax rate is 30%. You have to pay " + formatDouble(result) + " EUR.");
        } else {
            result = num1 * 0.35;
            System.out.println("Your monthly income is " + formatDouble(num1) + " EUR and your tax rate is 35%. You have to pay " + formatDouble(result) + " EUR.");
        }
    }
    public static String formatDouble(double resultDouble) { //metode priekš double format
        double result = resultDouble;
        String resultStr = String.format("%.2f", result);
        return resultStr;
    }

}
