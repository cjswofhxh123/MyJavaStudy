package com.kh.day09.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar openDate = Calendar.getInstance();
		Calendar closeDate = Calendar.getInstance();
		Exam_Calendar ex = new Exam_Calendar();
		openDate.clear();
		openDate.set(2023, 4, 15, 9, 0);
		openDate.clear();
		openDate.set(2023, 10, 26, 17, 50);
		closeDate.set(Calendar.HOUR_OF_DAY, 17);
		ex.printCalendar("현재", today);
		ex.printCalendar("개강일", openDate);
		ex.printCalendar("종강일", closeDate);
		}

//		new Exam_Calendar().printCalendar("현재", today);
//		new Exam_Calendar().printCalendar("개강일", openDate);
//		new Exam_Calendar().printCalendar("종강일", closeDate);
//		openDate.set(Calendar.HOUR_OF_DAY,9);
//		openDate.set(Calendar.MINUTE,0);
	// 현재 2022/12/7/수
	
	
	
	public void printCalendar(String title, Calendar cal) {
		int year= cal.get(Calendar.YEAR);
		int month =cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int dayOfweek=cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay=cal.get(Calendar.HOUR_OF_DAY);
		int ampm =cal.get(Calendar.AM_PM);
		int hour =cal.get(Calendar.HOUR);
		int minute =cal.get(Calendar.MINUTE);
		int second= cal.get(Calendar.SECOND);
		int millisecond=cal.get(Calendar.MILLISECOND);
		
		System.out.println(title + " ");
		System.out.print(year + "/" + month + "/" + day);
		
		System.out.println("/");

//		System.out.print(cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONDAY) + 1) + "/"// 일년
//				+ cal.get(Calendar.DAY_OF_MONTH));
//		System.out.print("/" + cal.get(Calendar.DAY_OF_WEEK));

		switch (dayOfweek) {
		case Calendar.SUNDAY: System.out.println("일요일");
			break;			
		case Calendar.MONDAY: System.out.println("월요일");			
			break;
		case Calendar.TUESDAY: System.out.println("화요일");			
			break;
		case Calendar.WEDNESDAY: System.out.println("수요일");			
			break;
		case Calendar.THURSDAY: System.out.println("목요일");			
			break;
		case Calendar.FRIDAY: System.out.println("금요일");			
			break;
		case Calendar.SATURDAY: System.out.println("토요일");			
			break;
		}
		System.out.print("(" +hourOfDay+ "시)");
		if(ampm ==Calendar.AM)System.out.println("오전");
		System.out.println("오후");
		System.out.println(hour + "시"+ minute + "분" + second +"초" + millisecond +"밀리초");
		System.out.println();
//		System.out.print("(" + cal.get(Calendar.HOUR_OF_DAY) + ") ");
//
//		System.out.print(cal.get(Calendar.HOUR) + "시");
//
//		System.out.print(cal.get(Calendar.MINUTE) + "분");
//
//		System.out.print(cal.get(Calendar.SECOND) + "초");
//
//		System.out.print(cal.get(Calendar.MILLISECOND) + "밀리초");
	}
}
