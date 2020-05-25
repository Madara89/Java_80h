package lv.madara.Methods;

public class LearnMethods {
    public static void main(String[] args) {

        myFirstMethod(); //pēc tam, kad mana metode lejā ir izveidota, to aktivizē main blokā
        mySecondMethod(); // ar Ctrl+click uz metodes, norāda vietu, kur metode ir kodēta
        //paša veidotās metodas var aktivizēt tikai te main blokā
    }
    // savu metodi raksta ārpus main metodes:
    public static void myFirstMethod(){ //mana metode, šeit to nav iespējams palaist
        System.out.println("This is my first method");
    }
    public static void mySecondMethod(){
        myFirstMethod();
    }
}
