package lv.madara;

public class TestArrays {
    public static void main(String[] args) {

        String[] stringArrays = new String[3]; //datu tips String[], variable stringArrays, new + define index amount
        stringArrays[0] = "One"; //add value to variables
        stringArrays[1] = "Two";
        stringArrays[2] = "Three";

        System.out.println(stringArrays.length); //masīva lielums, index daudzums
        System.out.println(stringArrays[0]); //print one variable value

        // print values (all) in one line using "for loop" method:
        for(int i = 0; i < stringArrays.length; i ++){ //just remember this coding for "for loop"
            System.out.print(stringArrays[i]+","); // print (without ln) = prints in one line
        }
        System.out.println();

        //for each (domāts tikai masīvam)
        for(String stringsArray : stringArrays){
            System.out.print(stringsArray+" ");
        }





    }
}
