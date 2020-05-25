package lv.madara.test;

public class TestString {
    public static void main(String[] args) {

        String stringOne = new String("New");
        String stringTwo = new String ("New");
        String str1 = "New";
        String str2 = "New";

        System.out.println(stringOne == stringTwo);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(stringOne.equals(stringTwo)); //ar .equals ir pareizi salīdzināt Stringus
        System.out.println(!str1.equals(str2));//! zīme nozīmē not equal, lai pie string dabūtu false



    }
}
