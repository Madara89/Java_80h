package com.company;

public class TestLogicalOperators {

    public static void main(String[] args) {

        int a = 10; // dažādiem mainīgajiem piešķir vērtības
        int b = 11;
        int c = 12;
        int d = 13;
        int e = 14;
        int f = 15;

        System.out.println("a > b "+ (a>b)); // pārbauda patiesumu true vai false
        System.out.println("c < d "+ (c<d));
        System.out.println("e > f "+ (e>f));

        System.out.println("----------------------");

        System.out.println("Check OR logical operator ||");
        System.out.println(a>b || c<d || e>f);
        System.out.println("-----------------------");
        System.out.println("Check AND logical operator &&");
        System.out.println(a>b && c<d && e>f);
        System.out.println("-----------------------");
        System.out.println("Check LOGICAL NOT operator !");
        boolean checkOperator = true;
        System.out.println(!checkOperator);
        System.out.println("-----------------------");
        System.out.println("Check NOT EQUEL operator !=");
        System.out.println(a!=b);

        if (a>b && c<d && e>f){
            System.out.println("Check if statement");
        }else{
            System.out.println("Give false value");
        }

    }
}
