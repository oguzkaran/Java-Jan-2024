/*----------------------------------------------------------------------------------------------------------------------
	Sınıfı Çalışması: Aşağıda belirtilen metotları StrigUtil sınıfı içerisinde açıklamalara yazınız ve test ediniz.
	Açıklamalar:
	- Metotların prototipleri şunlardır:
		public static String trim(String s);
		public static String trimLeading(String s);
		public static String trimTrailing(String s);
	- Metotlar sırasıyla yazının başındaki ve sonundaki, yalnızca başındaki ve yalnızca sonundaki whitespace karakterleri
	atacaklardır.
	
	- Metotlar Java 11 öncesi için yazılacaktır. Yani stripXXX metotları kullanılmayacaktır
---------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", s.trim());
			System.out.printf("(%s)%n", s.strip());
			System.out.printf("(%s)%n", s.stripLeading());
			System.out.printf("(%s)%n", s.stripTrailing());
			
			if ("exit".equals(s))
				break;
		}
	}
}
