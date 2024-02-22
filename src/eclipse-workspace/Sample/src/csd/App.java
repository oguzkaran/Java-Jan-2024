/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki demo örneği çalıştırıp yuvarlama hatasını gözlemleyiniz. Kodun detayları şu an için önemsizdir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

public class App {
	public static void main(String [] args)
	{	
		double a = 0.1, b = 0.2;
		double c;
		
		c = a + b;
		
		System.out.printf("c = %.20f%n", c);
		
		if (c == 0.3)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
	}
}
