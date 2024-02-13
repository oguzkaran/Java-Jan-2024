/*----------------------------------------------------------------------------------------------------------------------
	Farklı faaliyet alanları içerisinde aynı isimde yerel değişken bildirimi geçerlidir 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {

	public static void main(String[] args) 
	{
		int a;
			
	}
}

class Sample {
	public static void foo()
	{
		int a;
	

		{
			int b;
			//..
		}
		
		int b;
		
		//...
	}
	
	public static void bar()
	{
		int a;
		
		//...
	}
}

