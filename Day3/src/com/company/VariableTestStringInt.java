package com.company;

import java.sql.SQLOutput;

public class VariableTestStringInt {

    public static void main(String[] args) { //metodes bloks sākas te
        // šī ir main metode, to ieskauj cietās iekavas

        int num1 = 4; //variable num1 dod vērtību 4. To var jebkurā brīdī mainīt pēc vajadzības
        int num2 = 10; //variable num2 dod vērtību 10

	    int sum; //sum (+)
	    int mult; //mult (*)
	    int sub; //sub (-)
	    int div; //div (/)

	    sum = num1 + num2;
	    mult = num1 * num2;
	    sub = num1 - num2;
	    div = num1 / num2;

	    //printē rezultātus
		//pēdiņās maina matemātikas zīmi, lai izpildītos formula
		//pēdiņas izprintējas kā teksts
        System.out.println(sum+ " = "+num1+" + "+num2);
		System.out.println(mult+ " = "+num1+" * "+num2);
		System.out.println(sub+ " = "+num1+" - "+num2);
		System.out.println(div+ " = "+num1+" / "+num2);

		System.out.println("----------------------------");

		int var1 = 5; // int norāda uz pilnu skaitli, bez decimāldaļām
		int var2 = 2;
		System.out.println(var1/var2); //vajadzētu būt 2.5, bet dēļ int tipa rezultāts ir 2






    }
}
