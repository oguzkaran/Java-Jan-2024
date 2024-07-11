/*----------------------------------------------------------------------------------------------------------------------	 
	Derleyici özdeş string literal'lar için aynı adresin verileceği kodu üretir. Yani özdeş string'lere ilişkin bir tane
	nesne yaratılmış olur. Zaten sınıf immutable olduğundan iki referansın aynı nesneyi göstermesi durumunda nesnenin
	içeriği değiştirelemezdir, bu da herhangi bir probleme yol açmaz. Bu durumda bellek efektif olarak kullanılmış olur.
	Aşağıdaki örnekte yine referans karşılaştırması yapılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{			
		String s1 = "ankara";
		String s2 = "Ankara";
		
		System.out.println(s1 == s2 ? "Aynı nesne" : "Farklı nesneler");		
	}
}

