/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki demo örnekte add metodunun geri dönüş değeri getInt metodunun geri dönüş değeri yapılmıştır. Yani, getInt
	metodu add metodu çağrıldıktan sonra elde edilen değere geri dönmektedir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args) 
	{
		int result;
		
		result = Sample.getInt();
		
		System.out.println(result);						
	}
}

class Sample {
	public static int getInt()
	{
		System.out.println("İki tane tamsayı değeri girmeniz gerekiyor:");
		
		return Util.add();
	}
}

class Util {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		return a + b;
	}
}
