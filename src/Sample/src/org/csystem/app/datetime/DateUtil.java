package org.csystem.app.datetime;

public class DateUtil {
	public static int [] daysOfMoths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void printDateTR(int day, int month, int year)
	{
		if (!isValidDate(day, month, year)) {
			System.out.println("Geçersiz tarih!...");
			return;
		}
		
		switch (getDayOfWeek(day, month, year)) {
			case 0 -> System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);			
			case 1 -> System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);		
			case 2 -> System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);			
			case 3 -> System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);		
			case 4 -> System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);		
			case 5 -> System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);		
			case 6 -> System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);		
		}			
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays = getDayOfYear(day, month, year);
		
		for (int y = 1900; y < year; ++y) {
			totalDays += 365;
			if (isLeapYear(y))
				++totalDays;
		}
		
		return totalDays % 7;
	}
	
	
	public static int getDayOfYear(int day, int month, int year)
	{
		int dayOfYear = day;

		for (int m = month - 1; m >= 1; --m)
			dayOfYear += daysOfMoths[m];

		if (month > 2 && isLeapYear(year))
			++dayOfYear;
		
		return dayOfYear;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 &&  1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		return month == 2 && isLeapYear(year) ? 29 : daysOfMoths[month];
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
