package lv.madara.FileInOut;

import java.io.File;
import java.io.IOException;

public class TestFileInput {
    public static void main(String[] args) {

        File file = new File("java18.txt"); // select File class, insert pathname(String)
        try {
            if(file.createNewFile()){
                System.out.println("New file is created"); //if file with name java18 already exists
            }else{
                System.out.println("File is already created"); //if such file isn't, system will create it
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file);

    }

}
