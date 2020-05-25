package lv.madara.test;

public class TestBreak {
    public static void main(String[] args) {

        String [] arrayName = {"Madara", "Juris", "Jānis"};
        String name = "Juris"; //tas ir [1] index

        for(int i =0; i < arrayName.length; i++){
            System.out.println(arrayName[i]); //lai izprintētu visus vārdus masīvā

            if(arrayName[i].equals(name)){
                break; // pie vārda Juris kods beigs printēt
            }
        }

    }
}

