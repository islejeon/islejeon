package org.isle.util;

import java.util.Calendar;

public class TimeUtil {
	public static java.sql.Date getDate(int year, int month, int date){
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, date);
		return new java.sql.Date(cal.getTimeInMillis());
		}

	}