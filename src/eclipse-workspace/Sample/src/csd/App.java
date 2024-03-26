/*----------------------------------------------------------------------------------------------------------------------
 	Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayılardan pozitif olanlarının ve negatif olanlarının ayrı 
 	ayrı sayılarını ve toplamlarını bulan programı yazınız. Programın mesajlarına ilişkin örnekler şunlardır:
 	
 	Girilen 3 tane pozitif sayının toplamı: 45
 	Girilen 4 tane negatif sayının toplamı: -56
 	
 	Girilen 3 tane pozitif sayının toplamı: 45
 	Hiç negatif sayı girmediniz
 	
 	Hiç pozitif sayı girmediniz
 	Girilen 4 tane negatif sayının toplamı: -56
 	
 	Hiç pozitif sayı girmediniz
 	Hiç negatif sayı girmediniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		PosNegCountTotalApp.run();				
	}
}

class PosNegCountTotalApp {
	public static void printPosStatus(int count, int sum)
	{
		if (count != 0)
			System.out.printf("Girilen %d tane pozitif sayının toplamı:%d%n", count, sum);
		else
			System.out.println("Hiç pozitif sayı girmediniz");
	}
	
	public static void printNegStatus(int count, int sum)
	{
		if (count != 0)
			System.out.printf("Girilen %d tane negatif sayının toplamı:%d%n", count, sum);
		else
			System.out.println("Hiç negatif sayı girmediniz");
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int posSum, negSum, posCount, negCount;
		int val;
		
		posSum = negSum = posCount = negCount = 0;
		
		System.out.println("Sayıları girmeye başlayınız:");
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0)
			if (val > 0) {
				posSum += val;
				++posCount;
			}
			else {
				negSum += val;
				++negCount;
			}		
		
		printPosStatus(posCount, posSum);
		printNegStatus(negCount, negSum);
	}
}
