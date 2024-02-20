/*----------------------------------------------------------------------------------------------------------------------
	Anahtar Notlar: Java'da 3 yerde atama işlemi yapılır: 
	1. Yalın atama işlemi
	2. Metodun geri dönüş değerinin geçici değişkene atanması
	3. Argümandan parametre değişkene aktarım
	
	Özel bazı durumlar dışında atama işlemine ilişkin kurallar tüm atama işlemleri için geçerlidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int x = kb.nextInt();
		int y = kb.nextInt();		
		int result;
		
		result = Util.add(x + 2, y * 2);
		
		System.out.println(result);
	}
}

class Util {
	public static int add(int a, int b)
	{
		return a + b;
	}
}