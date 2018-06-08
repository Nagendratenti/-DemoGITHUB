package Javaexcercise;

import java.util.Calendar;

public class Calenderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getCalendarType());
		System.out.println(cal.getTimeZone());
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.get(Calendar.AM_PM));
		
	}

}
