package lv.madara.javamethods;

public class ArraysAndMethods {
    public static void main(String[] args) {
        int[]arr = {3,4,60,70};
        //sum all values
        //using statement: for (int i = 0; i < arr.length;i++);

        int sum = 0;
        System.out.println(sum); // te izprintē 0, jo int sum ir definēta kā 0 (pagaidām)
        for (int i = 0; i < arr.length;i++){ // caur ciklu(loop) sum tiek iedota jauna vērtība
            sum = sum + arr[i];
        }
        System.out.println(sum);

        System.out.println("Sum of value array is "+arrayValueSum(arr));
    }
    public static int arrayValueSum(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

}
