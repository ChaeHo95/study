package test6_6.person;

import java.util.Calendar;

public class Timeset {

    private int year;
    private int month;
    private int day; int hour;
    private int minute;
    private int second;

    int time;
    String person;
    public Timeset(String person){
        this.person = person;
    }
    public int printnow(){
        Calendar cal = Calendar.getInstance();

        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH);
        this.day = cal.get(Calendar.DAY_OF_MONTH);
        this.hour = cal.get(Calendar.HOUR);
        this.minute = cal.get(Calendar.MINUTE);
        this.second = cal.get(Calendar.SECOND);

        return  cal.get(Calendar.SECOND);
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String getPerson(){
        return person;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public int gettime(){
        return time;
    }
}
