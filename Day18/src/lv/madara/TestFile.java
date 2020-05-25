package lv.madara;

import java.io.*;

public class TestFile {
    public static void main(String[] args) throws IOException { //shortcut try-catch, with throws

        File file = new File("filetest.txt"); //File is already existing Java class
        file.createNewFile(); //creates new file with name as above "filestest.txt
        System.out.println(file.canRead());
        System.out.println(file.canWrite()); //if in File-Properties click Read-Only, I won't be able to write anything

        //write smth in file: use outputStream

        FileOutputStream outputStream = new FileOutputStream(file);

        String text = "Good day to all!";
        byte[] bytes = text.getBytes(); //no String datu tipa, izveido byte datu tipu
        outputStream.write(bytes); //ievieto bytes failā
        outputStream.close(); //slēdz outputStream, lai var vēlāk darboties
        System.out.println("Your file is written!");

        //write accepts only int and bytes data type, tāpēc String ir jāpārveido par byte datu tipu
        //ja kods nestrādā, tad pie file properties jānoņem ķeksis no Read-Only

        readFile(file); //palaiž zemāk izveidoto "readFile" metodi te main metodē
    }

        //read file: use inputStream
        //create method to read from file:

    public static void readFile (File file) throws IOException { //izsauc metodi (File file) + throws
        FileInputStream inputStream = new FileInputStream(file); //izveido read ar fileinputstream
        int i;
        while ((i = inputStream.read()) != -1){ //-1 norāda uz pēdējo char rindiņā
            System.out.print((char)i); //ar char nolasa katru burtu; raksta print bez ln (viena rinda)
        }
        inputStream.close();
    }



}
