package lv.madara.FileInOut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDateTime;

public class TestWrite {
    public static void main(String[] args) {

        //File2.txt ar kodu var ierakstīt tekstu:

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("File2.txt");
            LocalDateTime today = LocalDateTime.now(); //pievieno šodienas datumu
            String inputText = "Text to file. Date is: "+today; //šis teksts parādīsies File2.txt
            byte[] byteArray = inputText.getBytes();
            fileOutputStream.write(byteArray);
            fileOutputStream.close();

        } catch (Exception e) { //atstāj tikai Exception
            e.printStackTrace();
        }


    }
}
