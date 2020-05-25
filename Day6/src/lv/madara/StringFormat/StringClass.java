package lv.madara.StringFormat;

public class StringClass {
    public static void main(String[] args) {

        String varString = "Hello,";
        String name = " Madara";
        String printGreeting = varString + name;

        System.out.println(varString+ " World");
        System.out.println(printGreeting);

        System.out.println("--------------");

        String stringLength = "LV-1021";
        // ar [0], [1].. var atsaukties stringā uz noteiktu simbolu
        int lastChar = stringLength.length()-1; // nodefinē pēdējo character stringā

        System.out.println(stringLength.length()); // kopējais string simbolu garums/daudzums
        System.out.println(stringLength.charAt(0)); //atrod pirmo character stringā
        System.out.println(stringLength.charAt(stringLength.length()-1)); //atrod pēdējo character
        System.out.println(stringLength.charAt(lastChar)); // atrod pēdējo char, izmantojot int lastChar

        String myName = "MaDaRa"; // definē stringu, dod tam vārdu
        System.out.println(myName.toUpperCase()); // stringu pārvērš LIELAJOS burtos
        System.out.println(myName.toLowerCase()); // stringu pārvērš MAZAJOS burtos



    }
}
