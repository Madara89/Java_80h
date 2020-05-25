package lv.madara.learnconstant;

public class TestConst {
    final static String COLOR = "red"; //ārpus metodes uzrakstīts, bet tālāk varēs izmantot
    // raksta final static + type un variable name (type ir String, variable name ir COLOR)
    // ar sout+tab šo metodi izsauc main blokā
    // ar return šo metodi izsauc arī ārpus main bloka
    // konsole lejā printē tikai to, kas ir main metodē/blokā (printē ar sout+tab)

    public static void main(String[] args) {

        final int G = 9; // final nosaka, ka g vienmēr būs 9
        //G++; // final nevar piešķirt incerement funkciju. Sistēma neļauj

        int a = 9; // sākuma vērtība mainīgajam
        a++; // increment liek int pieskaitīt +1
        System.out.println(a); // (a = 10)

        final int SCREEN_SIZE = 1280; //konstantes raksta ar LIELO BURTU
        int result = a * SCREEN_SIZE; // 10 * 1280
        System.out.println(result);

        System.out.println(COLOR); //izsauc metodi no clases

        System.out.println(getNameColor()); //izsauc metodi, kas ir aiz main bloka

    }
    public static String getNameColor(){
        return COLOR; //return pasaka, kas būtu jāprintē/kāda vērtība - COLOR vērtība

    }


}
