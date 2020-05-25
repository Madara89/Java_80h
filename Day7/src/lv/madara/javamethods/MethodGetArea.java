package lv.madara.javamethods;

public class MethodGetArea {
    public static void main(String[] args) { //lai izsauktu savu metodi, main metodē ieraksta tās nosaukumu
        System.out.println(getArea()); // izsauc/izprintē savu metodi main metodē ar sout+tab
        getAreaPrintToTerminal(); // ar sout nevar izprintēt, jo void to neļauj (jābūt ar result)
        double doubleValue = getArea();
        double getVolume = doubleValue * 20.0;
        System.out.println("Box volume: "+getVolume);
        System.out.println(getAreaCircle(39.0)); //ieraksta skaitli, radius pats parādās
        System.out.println(getAreaCircle(24.0));

    }
    // rakstam metodi ārpus main metodes
    public static double getArea(){//metodes nosaukumam jāpasaka, ko tā sarīs
        double num1 = 35.0;
        double num2 = 34.0;
        return num1 * num2;
    }
    public static void getAreaPrintToTerminal(){ // void nav return
        double num1 = 35.0;
        double num2 = 34.0;
        double result = 0.00;
        result = num1 * num2;
        System.out.println(result);
    }
    public static double getAreaCircle(double radius){
        return radius * radius * Math.PI;
    }

}
