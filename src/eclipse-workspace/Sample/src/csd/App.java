/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir yazının pangram olup olmadığını test eden isPangramTR ve isPangramEN 
	isimli metotları yazınız ve aşağıdaki kod ile test ediniz.
	Açıklamalar:
		- İlgili dilin alfadbesindeki tüm karakterler kullanılarak oluşturulan ve içerisinde özel isim olmayan anlamlı 
		cümlelere "pangram" denir. 
		Örneğin tipik bir İnglizce pangram şudur:		
			The quick brown fox jumps over the lazy dog.
			
		Örneğin tipik bir Türkçe pangram şudur:
			Pijamalı hasta yağız şoföre çabucak güvendi.
		
		- Metotlar cümlenin anlamına ve özel isim içerip içermediğine bakmayacaktır
---------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilIsPangramTest.run();
	}
}

class StringUtilIsPangramTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		StringUtilIsPangramTRTest.run(kb);
		StringUtilIsPangramENTest.run(kb);
	}
}

class StringUtilIsPangramTRTest {
	public static void run(java.util.Scanner kb)
	{
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramTR(s) ? "Pangram" : "Pangram değil");			
		}
	}
}


class StringUtilIsPangramENTest {
	public static void run(java.util.Scanner kb)
	{		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not pangram");			
		}
	}
}

class StringUtil {
	public static boolean isPangramTR(String s)
	{
		//TODO
	}
	
	public static boolean isPangramEN(String s)
	{
		//TODO
	}
}
