package lv.madara;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); //class LocalDate, add .now (date right now)
        System.out.println("Today is "+date);

        LocalTime time = LocalTime.now();
        System.out.println("Time is "+time); //at the exact time

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dateTimeFormat = LocalDateTime.now();

        //here I format date patterns (their format):
        DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter formatterDateTime1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterDateTime2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterDateTime3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter formatterDateTime4 = DateTimeFormatter.ofPattern("E,MMM dd yyyy");

        String formatDate = formatterDateTime.format(dateTimeFormat);
        String formatDate1 = formatterDateTime1.format(dateTimeFormat);
        String formatDate2 = formatterDateTime2.format(dateTimeFormat);
        String formatDate3 = formatterDateTime3.format(dateTimeFormat);
        String formatDate4 = formatterDateTime4.format(dateTimeFormat);

        System.out.println("Date format is "+formatDate);
        System.out.println("Date1 format is "+formatDate1);
        System.out.println("Date2 format is "+formatDate2);
        System.out.println("Date3 format is "+formatDate3);
        System.out.println("Date4 format is "+formatDate4);




    }
}
