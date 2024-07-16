/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı iki yazıdan birinci içerisinde ikincisinden kaç olduğuna geri dönen countString 
	isimli metodu StringUtil isimli bir sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilCountStringTest.run();
	}
}

class StringUtilCountStringTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			System.out.printf("Count:%d%n", StringUtil.countString(s1, s2));
		}
	}
}

class StringUtil {
	public static int countString(String s1, String s2)
	{
		//TODO
	}
}
