/*----------------------------------------------------------------------------------------------------------------------
	Aslında bir sınıf içerisindeki her metodun kendine özğü (unique) bir bir bilgisi olmalıdır. Bu unique bilgiye
	genel olarak "imza (signature)" diyebilir. İmza, metodun ismi ve parametrik yapı kombinasyonudur. Genel kural şudur:
	Bir sınıf içerisinde aynı imzaya sahip birden fazla metot bildirimi geçersizdir. Yani bir sınıf içerisindeki her metodun
	imzası farklı olmalıdır. Aksi durumda error oluşur. 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		
	}
}

class Sample {
	public static void foo() //imza: foo
	{
		
	}
	
	public static void foo(int a, int b) //imza: foo, int, int
	{
		
	}
	
	public static void foo(int a, double b, float c) //imza: foo, int, double, float
	{
		
	}
	
	public static void foo(int a) //imza: foo, int
	{
		
	}
	
	public static void foo(int a, double b) //imza: foo, int, double
	{
		
	}
	
	public static void foo(double b, int a) //imza: foo, double, int
	{
		
	}
	
	public static void foo(double a) //imza: foo, double
	{
		
	}
	
	public static void bar(int a, double b) //imza: bar, int, double
	{
		
	}
}

