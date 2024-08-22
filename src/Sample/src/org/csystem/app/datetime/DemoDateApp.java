package org.csystem.app.datetime;

class DemoDateApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Gün, ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			DateUtil.printDateTR(day, month, year);
			
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