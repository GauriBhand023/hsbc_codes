package day9;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class FormatDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        System.out.println(formatter.format(date));

//        String strDate = "01/01/2022";
//        try {
//            Date date2 = formatter.parse(strDate);
//            System.out.println(date2);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
//        System.out.println(calendar.get(calendar.DAY_OF_MONTH));
//
//
//        LocalDate localDate = LocalDate.now();
//        LocalTime localtime = LocalTime.now();

    }
}
