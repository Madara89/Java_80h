package com.company;

public class DataTypeCast {
    public static void main(String[] args) {

        // implicit casting
        //maina vērtību no viena variable citam (no mazāka uz lielāku):

        byte byteVar = 45; // 8
        short shortVar = byteVar; // 16
        int intVar = shortVar; // 32
        long longVar = intVar; // 64
        float floatVar = longVar; // 32
        double doubleVar = floatVar; //64

        System.out.println(doubleVar);

        // explicit casting
        // maina vērtību variable no lielāka uz mazāku

        double doubleVarCast = 44.2d; //d nozīmē double, nav obligāti jāraksta klāt
        float floatVarCast = (float)doubleVarCast; // (float) ir casting - pārveidošana no double uz float
        long longVarCast = (long)floatVarCast; //64
        int intVarCast = (int)longVarCast; //32
        short shortVarCast = (short)intVarCast; //16
        byte byteVarCast = (byte)shortVarCast; //8

        System.out.println(byteVarCast);


    }
}
