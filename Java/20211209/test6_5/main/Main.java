package test6_5.main;

import test6_5.calendar.CalendarToString;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        CalendarToString cd = new CalendarToString();

        Calendar now = Calendar.getInstance();

        cd.printCalendar("현재 ", now);

    }
}
