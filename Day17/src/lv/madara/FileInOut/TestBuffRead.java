package lv.madara.FileInOut;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestBuffRead {
    public static void main(String[] args) {

        BufferedReader buffReader = null;
        //datu tips ir bez vērtības/tukšs, vēl nav definēts
        //String str = "";
        //int var = 0;

        try {
            buffReader = new BufferedReader(new FileReader("C:\\Users\\lpm\\IdeaProjects\\Day17\\Files\\readFile.txt"));
            String readLines = buffReader.readLine();
            while(readLines != null){ //!= not equal to
                System.out.println(readLines);
                readLines = buffReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
