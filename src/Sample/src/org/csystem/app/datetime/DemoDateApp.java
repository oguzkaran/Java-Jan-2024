/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağıdaki açıklamalara göre ilgili metotları yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
		- getDayOfYear metodu parametresi ile aldığı değerlere ilişkin tarihin yılın kaçıncı günü olduğu bilgisine geri
		dönecektir. Metot tarihin geçersiz olması durumunda -1 değerine geri dönecektir

		 - getDayOfWeek metodu parametresi ile aldığı değerlere ilişkin tarihin haftanın hangi gününe karşılık geldiği bilgisine
		 geri dönecektir. Geçersizlik durumu kontrol edilmeyecektir. Haftanın hangi gününe geldiği bilgisi şu şekilde
		 bulunabilir: 01.01.1900 ile ilgili tarih arasındaki gün sayısı hesaplanır ve 7 değerine modu alınır. Bu durumda
		 sıfır Pazar, 1 pazartesi, ..., 6 cumartesi'ye karşılık gelir

	Not: İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/

package org.csystem.app.datetime;

import java.util.Scanner;

public class DemoDateApp {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0 && month == 0 && year == 0)
				break;
			
			DateUtil.printDateTR(day, month, year);			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}

	public static void main(String[] args)
	{
		run();
	}
}
