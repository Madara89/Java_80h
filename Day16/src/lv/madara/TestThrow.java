package lv.madara;

public class TestThrow {
    public static void main(String[] args) {

        checkAge(19);
    }

    public static void checkAge(int age){ //ar public static var main metodē uzreiz izsaukt checkAge
        if(age < 21){
            throw new ArithmeticException("Your age is below 21."); //ar throw new iemet erroru
        }else{
            System.out.println("Your age is "+age);
        }
    }

}
