package date;

import java.util.Calendar;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date date = new Date();

        date = calendar.getTime();

        System.out.println("date: " + date);
        System.out.println("calendar.getFirstDayOfWeek: " + calendar.getFirstDayOfWeek());
        System.out.println("Calendar.DAY_OF_WEEK: " + Calendar.DAY_OF_WEEK);
        System.out.println("Calendar.DAY_OF_MONTH: " + Calendar.DAY_OF_MONTH);
        System.out.println("Calendar.DAY_OF_YEAR: " + Calendar.DAY_OF_YEAR);
        System.out.println("Calendar.HOUR: " + Calendar.HOUR);
        System.out.println("Calendar.MONTH: " + Calendar.MONTH);
        
    }
}
