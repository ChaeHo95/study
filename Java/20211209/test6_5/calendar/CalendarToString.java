package test6_5.calendar;

import java.util.Calendar;

public class CalendarToString {
    public static void printCalendar(String msg, Calendar cal) {

    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH); //get()은 0~30까지의 정수 리턴
    int day = cal.get(Calendar.DAY_OF_MONTH);
    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    int hour = cal.get(Calendar.HOUR);
    int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
    int ampm = cal.get(Calendar.AM_PM);
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.SECOND);
    int millisecond = cal.get(Calendar.MILLISECOND);
    System.out.print(msg + year + "/" + month + "/" + day + "/");

    switch(dayOfWeek) {
        case Calendar.SUNDAY : System.out.print("일요일"); break;
        case Calendar.MONDAY : System.out.print("월요일"); break;
        case Calendar.TUESDAY : System.out.print("화요일"); break;
        case Calendar.WEDNESDAY : System.out.print("수요일"); break;
        case Calendar.THURSDAY : System.out.print("목요일"); break;
        case Calendar.FRIDAY : System.out.print("금요일"); break;
        case Calendar.SATURDAY : System.out.print("토요일"); break;
    }
    if(ampm == Calendar.AM) {
        System.out.print("/ 오전");
    }
    else {
        System.out.print("/ 오후");
    }

    System.out.println(hour+ "("+hourOfDay+")" + "시" + minute + "분" + second + "초" + millisecond + "밀리초");
    if(hourOfDay >= 4 && hourOfDay <= 12){
        System.out.println("Good Morning");
    }
    else if(hourOfDay >= 13 && hourOfDay <= 18){
        System.out.println("Good Afternoon");
    }
    else {
        System.out.println("Good Night");
    }
}

}
