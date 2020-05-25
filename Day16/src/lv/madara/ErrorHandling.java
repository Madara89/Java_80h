package lv.madara;

public class ErrorHandling {
    public static void main(String[] args) {

        // create try-catch block:

        try {
            int var1 = 20;
            int var2 = 0;
            int result = var1 / var2;
            System.out.println(result);

        } catch (Exception e) { //Exception mainīgais parasti ir e
            System.out.println("Your code needs to be checked. "+e);
            //sarkanā paziņojuma vietā, būs šis paziņojums
            //+e izprintēs error paziņojumu (kas ir noticis, nepareizs)
        }

        System.out.println("After try, catch block");
        //lai atgrieztu sarkano error, aizkomentē try un catch ar //
    }
}
