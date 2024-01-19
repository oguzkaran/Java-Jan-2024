package org.csystem.app.datetime;

public class DateUtil {
	public static int [] daysOfMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static String [] dayOfWeeksTR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
	public static String [] dayOfWeeksEN = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	public static String [] monthsTR = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz",
			"Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

	public static String [] monthsEN = {"", "January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December"};

	public static void printDateTR(int day, int month, int year)
	{
		int dayOfYear = getDayOfYear(day, month, year);
		
		if (dayOfYear == -1) {
			System.out.println("Geçersiz tarih!...");
			return;
		}

		int dayOfWeek = getDayOfWeek(day, month, year);

		System.out.printf("%d %s %d %s tarihi yılın %d. günüdür%n", day, monthsTR[month], year,
				dayOfWeeksTR[dayOfWeek], dayOfYear);

		if (dayOfWeek == 0 || dayOfWeek == 6)
			System.out.printf("Bugün günlerden %s, kurs var tekrar yaptınız mı?%n", dayOfWeeksTR[dayOfWeek]);
		else
			System.out.printf("Bugün günlerden %s, kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız!...%n", dayOfWeeksTR[dayOfWeek]);
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		return getTotalDays(day, month, year) % 7;				
	}
	
	public static int getTotalDays(int day, int month, int year)
	{
		int totalDays = getDayOfYear(day, month, year);

		for (int y = 1900; y < year; ++y)
			totalDays += isLeapYear(y) ? 366 : 365;
		
		return totalDays;
	}

	public static int getDayOfYear(int day, int month, int year)
	{
		return isValidDate(day, month, year) ? getDayOfYearValue(day, month, year) : -1;
	}
	
	public static int getDayOfYearValue(int day, int month, int year)
	{
		int dayOfYear = day;

		for (int m = month - 1; m >= 1; --m)
			dayOfYear += daysOfMonths[m];

		return month > 2 && isLeapYear(year) ? dayOfYear + 1 : dayOfYear;
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

	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && 1900 <= year && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		return month == 2 && isLeapYear(year) ? 29 : daysOfMonths[month];
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
