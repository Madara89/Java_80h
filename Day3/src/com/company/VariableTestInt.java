package com.company;

public class VariableTestInt {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 12;
        //int result = num1 + num2 (would be the easiest way)
        int result;
        result = num1 + num2; // šis paņēmiens ļauj mainīt math operators pēc vajadzības
        System.out.println(result);

        int var1; //kādam mainīgajam var piedēvēt cita mainīgā vērtību
        var1 = num1;
        System.out.println(var1);

        int var2;
        var2 = num2;
        System.out.println(var2);

    }
}
