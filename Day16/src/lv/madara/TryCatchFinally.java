package lv.madara;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            int[] arr = {4, 1234}; //masīvs ar 2 vērtībām (2 elementi/indexi)
            //System.out.println(arr[1]);
            System.out.println(arr[4]); //lamājas, jo 4.index neeksistē
        } catch (Exception e) {
            System.out.println("Wrong index value. "+e);
        }finally {
            System.out.println("Work when try-catch is finished.");
        }
    }
}
