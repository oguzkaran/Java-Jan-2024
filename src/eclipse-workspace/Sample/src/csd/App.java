/*----------------------------------------------------------------------------------------------------------------------	
	Aşağıdaki örnekte değer verilmemiş bir yerel değişkenin kullanılmasından dolayı error oluşur  
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s;
		
		
	
		
		System.out.printf("s.x = %d, s.y = %b%n", s.x, s.y);
	} 
}

class Sample {
	public int x;
	public boolean y;
	
	//...
}
