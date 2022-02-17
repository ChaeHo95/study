import java.util.Calendar;

public class CalendarEx {
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
		System.out.println(msg + year + "/" + month + "/" + day + "/");
		
		switch(dayOfWeek) {
		case Calendar.SUNDAY : System.out.println("일요일"); break;
		case Calendar.MONDAY : System.out.println("월요일"); break;
		case Calendar.TUESDAY : System.out.println("화요일"); break;
		case Calendar.WEDNESDAY : System.out.println("수요일"); break;
		case Calendar.THURSDAY : System.out.println("목요일"); break;
		case Calendar.FRIDAY : System.out.println("금요일"); break;
		case Calendar.SATURDAY : System.out.println("토요일"); break;
		}
		System.out.println("("+hourOfDay+")");
		if(ampm == Calendar.AM) {
			System.out.println("오전");
		}
		else {
			System.out.println("오후");
		}
		
		System.out.println(hour + "시" + minute + "분" + second + "초" + millisecond + "밀리초");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		printCalendar("현재 ", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2016, 11, 25); // 2016년 12월 25일. 12월을 표현하기 위해 ㅡmonth에 11로 설정
		
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트한 날 ", firstDate);
	}

}
