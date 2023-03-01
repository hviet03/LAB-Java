package BO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author win
 */
public class Date {
   
   public void getCompare(String date1, String date2){
         try {
            java.util.Date start = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH)
                    .parse(date1);
            java.util.Date end = new SimpleDateFormat("dd/mmm/yyyy", Locale.ENGLISH)
                    .parse(date2);

            

            if (date1.compareTo(date2) > 0) {
                System.out.println("Date 1 is after Date 2");
            } else if (start.compareTo(end) < 0) {
                System.out.println("Date 1 is before Date 2");
            } else if (start.compareTo(end) == 0) {
                System.out.println("Date 1 is equal to Date 2");
            } 

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
