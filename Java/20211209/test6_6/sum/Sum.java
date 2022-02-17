package test6_6.sum;

import test6_6.person.Timeset;

public class Sum {
    public int resultTime(Timeset now, Timeset expect){
        int year = Math.abs(now.getYear() - expect.getYear());
        int month = Math.abs(now.getMonth() - expect.getMonth());
        int day = Math.abs(now.getDay() - expect.getDay());
        int hour = Math.abs(now.getHour() - expect.getHour());
        int minute = Math.abs(now.getMinute() - expect.getMinute());
        int second = Math.abs(now.getSecond() - expect.getSecond());
        int resutt[] = {year,month,day,hour,minute,second};
        int count = 0;
        int result = 0;
        for(int i=0; i<resutt.length; i++){
            if(resutt[i] == 0){
                count++;
                continue;
            }
            switch (count){
                case 0:
                    result += resutt[i]*365*24*60*60;
                    break;
                case 1:
                    result += resutt[i]*(365/12)*24*60*60;
                    break;
                case 2:
                    result += resutt[i]*24*60*60;
                    break;
                case 3:
                    result += resutt[i]*60*60;
                    break;
                case 4:
                    result += resutt[i]*60;
                    break;
                case 5:
                    result += resutt[i];
                    break;
            }

        }

        return result;
    }
}
