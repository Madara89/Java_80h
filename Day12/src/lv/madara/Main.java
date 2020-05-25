package lv.madara;

public class Main {

    //ATKĀRTOJUMS PAR APGŪTO

    public static void main(String[] args) {

        int a = 10; //pariezi ir piešķirt vērtību šadi, pa vienam. Šis ir statement
        int b, c; //šis variants nav labs. Labāk tā nekodēt
        b = 2;
        c =6;
        int result = a + b;
        System.out.println(result);
        System.out.println(a+b);

        //operatoru "==" izmanto skaitļiem
        String str1 = "red";
        String str2 = "Red";
        System.out.println(str1.equals(str2)); //String izmanto .equals operatoru

        //create array with type String
        //values of arrays is "ON", "OFF", "STANDBY"

        String[] array = {"ON", "OFF", "STANDBY"}; //array masīvs
        String mode = array [0]; //vieta, kas nosaka, kādu vērtību switch meklēs

        switch(mode){ //switch ir pārredzamām vērtībām (piem. on, off, standby)
            case "ON":
                System.out.println("PC is on");
                break;
            case "OFF":
                System.out.println("PC is off");
                break;
            case "STANDBY":
                System.out.println("PC is in stand-by");
                break;
            default: //default šajā gadījumā nav īsti vajadzīgs, bet deafult tāpat raksta, ja sistēma nobrūk
                System.out.println("Error. No such PC mode");
        }






    }
}
