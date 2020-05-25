package lv.madara.StringFormat;

public class StringToPrimitiveType {
    public static void main(String[] args) {

        // String mainīgā pārveidošana par int tipu:

        String number = "123456";
        //string pārtaisa par int tipu
        int numberOfString = Integer.parseInt(number); //ievada Integer.parseInt
        int result = numberOfString + numberOfString; // te jau saskaita pārveidoto stringu
        System.out.println(numberOfString);
        System.out.println("Result is: "+ result);
        System.out.println(number + number); // ja String nepārveido par int, tad saskaitīšana nenotiek, tas ir teksts

        //string pārtaisa par double tipu:
        double numberDoubleFromString = Double.parseDouble(number);// Double.parseDouble
        System.out.println(numberDoubleFromString);
        System.out.printf("%.3f", numberDoubleFromString); //formatē ciparu,lai būtu 3 decimālcipari




    }
}
