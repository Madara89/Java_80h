package lv.madara;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {

        String text = "HelloWorld!123456789*&#$@%^()+_-/?!"; //String object
        Pattern pattern = Pattern.compile("[A-Za-z]+"); //Pattern klasi izsauc, izmanto .compile
        // + zīme atlasa visus alfabēta burtus, visu tekstu kā vienotu, nevis pa burtiem
        Matcher matcher = pattern.matcher(text); //Matcher klasi izsauc, ņem patter.matcher(String text)

        if(matcher.find()){
            System.out.println(matcher.group());
        }



    }
}
