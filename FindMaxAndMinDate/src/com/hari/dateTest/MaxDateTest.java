package com.hari.dateTest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class MaxDateTest {

	public static void main(String[] args) {
		
		Calendar  calendar0 =Calendar.getInstance();
		Date date0=calendar0.getTime();
		
		Calendar  calendar1 =Calendar.getInstance();
		calendar1.add(Calendar.YEAR, 9);
		Date date1=calendar1.getTime(); 
		
		Calendar  calendar2 =Calendar.getInstance();
		calendar2.add(Calendar.YEAR, -2);
		Date date2=calendar2.getTime();
		
		Calendar  calendar3 =Calendar.getInstance();
		calendar3.add(Calendar.YEAR, 2);
		Date date3=calendar3.getTime();
		
		Calendar  calendar4 =Calendar.getInstance();
		calendar4.add(Calendar.MONTH, 8);
		Date date4=calendar4.getTime();
		
		System.out.println("Date0: "+date0);
		System.out.println("Date1: "+date1);
		System.out.println("Date2: "+date2);
		System.out.println("Date3: "+date3);
		System.out.println("Date4: "+date4);
		
		List<Date> list = new ArrayList<Date>();
		list.add(date0);
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		
		Date maxDate=Collections.max(list);
		System.out.println();
		System.out.println("Max Date is: "+maxDate);
		
		Date minDate=Collections.min(list);
		System.out.println();
		System.out.println("Max Date is: "+minDate);
	}
}
