package org.csystem.app.datetime;

import java.util.Scanner;

class DemoDateApp {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Gün, ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			DateUtil.printDateTR(day, month, year);
			DateUtil.printDateEN(day, month, year);
			
			if (day == 0 && month == 0 && year == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}

	public static void main(String[] args)
	{
		run();
	}
} 