package lv.madara;

import java.util.ArrayList;
import java.util.List;

public class TestForLoopsArrays {
    public static void main(String[] args) {

        // List class (will inherit data/implement from ArrayList class
        // diamond <> raksta datu tipu
        // līdzīgi kā ar inheritance, List implement ArrayList class

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println(programmingLanguages);


        // foreach:
        for(String programmingLanguage: programmingLanguages){ //jānorāda ar kādu datu tipu darbošos (String), ievada variable name (noun : plural)
            System.out.println(programmingLanguage); //variables are printed in column (not string)

        }
        // izmantojam for each
        // lai katram variable piešķirtu kārtas skaitli:
        int i = 1; // izveido mainīgo i, piešķir vērtību 1, jo saraksts sākas ar 1.
        for (String programmingLanguage: programmingLanguages) {
            System.out.println(i+": "+programmingLanguage); //i represents line number
            i++; // lai ietu numerācija pēc kārtas
        }

        // to pašu pārveidot uz for loop:
        int a = 1;
        for (int j = 0; j < programmingLanguages.size(); j++) { // fori funkcija
            System.out.println(a+": "+programmingLanguages.get(j));
            a++;
        }




    }
}
