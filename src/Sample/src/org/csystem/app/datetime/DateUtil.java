package org.csystem.app.datetime;

public class DateUtil {
	private static final int [] DAYS_OF_MONTHS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final String [] DAYS_OF_WEEK_TR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
	private static final String [] DAYS_OF_WEEK_EN = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private static final String [] MONTHS_TR = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
			"Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
	private static final String [] MONTHS_EN = {"", "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"};

	public static void printDateTR(int day, int month, int year)
	{
		if (!isValidDate(day, month, year)) {
			System.out.println("Geçersiz tarih!...");
			return;
		}

		System.out.println(getDateStrTR(day, month, year));
	}

	public static void printDateEN(int day, int month, int year)
	{
		if (!isValidDate(day, month, year)) {
			System.out.println("Invalid date!...");
			return;
		}

		System.out.println(getDateStrEN(day, month, year));
	}

	public static String getDateStrTR(int day, int month, int year)
	{
		return "%d %s %d %s".formatted(day, MONTHS_TR[month], year, DAYS_OF_WEEK_TR[getDayOfWeek(day, month, year)]);
	}

	public static String getDateStrEN(int day, int month, int year)
	{
		return "%d%s %s %d %s".formatted(day, getDaySuffix(day), MONTHS_EN[month], year,
				DAYS_OF_WEEK_EN[getDayOfWeek(day, month, year)]);
	}

	public static String getDaySuffix(int day)
	{
		return switch (day) {
			case 1, 21, 31 -> "st";
			case 2, 22 -> "nd";
			case 3, 23 -> "rd";
			default -> "th";
		};
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
			dayOfYear += DAYS_OF_MONTHS[m];

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
		return month == 2 && isLeapYear(year) ? 29 : DAYS_OF_MONTHS[month];
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
