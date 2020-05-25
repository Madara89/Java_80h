package lv.madara;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex { //failed to test
    public static void main(String[] args) {

        String str = "abc291289LV";
        Pattern pattern = Pattern.compile("[abc]"); //izvēlas Pattern class, kas nāk no regex mapītes
        Matcher matcher = pattern.matcher(str);

        boolean checkMatch = matcher.matches();
        System.out.println(checkMatch);


    }
}
