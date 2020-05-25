package lv.madara.test;

public class RaimondaCode {
    public static void main(String[] args) {
        //User need input open gate or close gate
        // If user type open - Print  (Gate is open)
        // If user type close - Print (Gate is close)
        //Scanner scanner = new Scanner(System.in);
        // System.out.println("Input option to close or open gate (open/close)");
        //String userInput = scanner.nextLine();

        //String openGate = "exit";
        //System.out.println(openGate.equals("open"));

//        if(userInput.equals("open")){
//            System.out.println("Gate is open");
//        }else {
//            System.out.println("Gate is close");
//        }

        String userTestInput = "one";
        checkUserInput("close");
    }
    public static boolean checkUserInput(String userInput){
        if(userInput.equals("open")){
            return true;
        }else if(userInput.equals("close")){
            return false;
        }
        return false;
    }

    //Create method who will return boolean if string is open its return true
    // or close return false.
}
