/*----------------------------------------------------------------------------------------------------------------------
 	Aşağıdaki örnekte do-while döngü deyimi ile sıfır sayısı için 1 değerine geri dönülmüştür
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilcountDigitsTest.run();
	}
}

class NumberUtilcountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d sayısının basamak sayısı:%d%n", val, NumberUtil.countDigits(val));
			
			if (val == 0)
				return;
		}
		
		
	}
}

class NumberUtil {
	public static int countDigits(int val)
	{
		int count = 0;
		
		do {
			++count;
			val /= 10;
		} while (val != 0);		
		
		return count;
	}
}
