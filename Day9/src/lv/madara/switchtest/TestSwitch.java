package lv.madara.switchtest;

public class TestSwitch {
    public static void main(String[] args) {

        String keyCase = "FRA"; // mainot keyCase vērtību, mainās rezultāts
        // char charCase = '1'; var mainīt tipus un variables un likt iekšā switch
        // jāņem vērā, ka char mainīgos liek '' pēdiņās (maina arī pie case no " uz ')
        // tas pats ar int skaitļiem - tiem nav nekādu pēdiņu

        switch(keyCase){ //mainīgais glabā vērtību, ko viens no case glabā
            case "LV":
                System.out.println("Chat in LV");
                break; //break norāda, ka pie pareizās vērtības apstājas
            case "ENG":
                System.out.println("Chat in ENG");
                break;
            case "FRA":
                System.out.println("Chat in FRA");
                break;
            default: //neviena case gadījumā izpildas cits
                System.out.println("Chat in whatever language");

        }
    }

}

