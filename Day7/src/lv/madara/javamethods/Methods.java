package lv.madara.javamethods;

public class Methods {
    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 20;

        //use if-else formulu
        //return biggest number
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
        // return ar max formulu lielāko skaitli:
        System.out.println(Math.max(num1, num2));

        System.out.println(max(30,20)); //lai notestētu max metodi () raksta skaitļus
    }
    public static int max(int num1, int num2){ // int ir tips
        if (num1 > num2) {
            return num1;
                    } else {
            return num2;
        }

    }
}
