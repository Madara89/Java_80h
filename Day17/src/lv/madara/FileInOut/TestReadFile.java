package lv.madara.FileInOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestReadFile {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("Files\\readFile.txt");

            int i = 0;
            while ((i = fileInputStream.read())!= -1) {
                System.out.print((char)i);
            }
            fileInputStream.close();

        }catch (Exception e) {
            e.printStackTrace();
        }


    }



}
