/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki manuel ve basit bir test ile metotlar karşılaştırılmıştır. Henüz daha görmediğimizden herhangi bir test 
	aracı kullanılmamıştır. Kodlar durumu göstermek için yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilIsPrimeTest.run();	
	}
}

class NumberUtilIsPrimeTest {
	public static void run()
	{		
		System.out.println(NumberUtil.isPrime(6750161072220585911L));	
	}
}

class NumberUtil {
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;		
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;

		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;
	}
}