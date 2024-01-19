/*--------------------------------------------------------
	FILE NAME	: NumberUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 7th January 2024
	
	Utility class for numeric operations
	
	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.numeric;

public class NumberUtil {
	private NumberUtil()
	{
	}

	public static int [] digits(long val)
	{
		int [] result = new int[digitsCount(val)];
		val = Math.abs(val);

		for (int i = result.length - 1; i >= 0; result[i--] = (int)(val % 10), val /= 10)
			;

		return result;
	}

	public static int digitsCount(long val)
	{
		return val == 0 ? 1 : (int)Math.log10(Math.abs(val)) + 1;
	}

	public static int digitsCount(int val)
	{
		return digitsCount((long)val);
	}

	public static int digitsSum(int val)
	{
		int total = 0;
		
		while (val != 0) {
			total += val % 10;
			val /= 10;
		}
		
		return Math.abs(total);
	}

	public static int factorial(int n)
	{
		int result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;
		
		return result;
	}
	
	public static int getDigitsPowSum(int val)
	{
		int n = digitsCount(val);
		int result = 0;
		
		while (val != 0) {
			result += Math.pow(val % 10, n);
			val /= 10;
		}
		
		return result;
	}
	
	public static boolean isArmstrong(int val)
	{
		return val >= 0 && getDigitsPowSum(val) == val;
	}

	public static boolean isPrime(long val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;
	
		for (long i = 11; i * i <= val; i += 2)		
			if (val % i == 0)
				return false;
		
		return true;		
	}

	
	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;
		
		if (b <= a && a <= c || c <= a && a <= b)
			return a;
		
		return c;
	}
	
	public static long nextClosestPrime(long val)
	{		
		while (!isPrime(++val))
			;
		
		return val;		
	}

	public static int nextFibonacciNumber(int val)
	{
		if (val < 0)
			return 0;
		
		int prev1 = 1, prev2 = 0;
		
		while (true) {
			int next = prev1 + prev2;
			
			if (next > val)
				return next;
			
			prev2 = prev1;
			prev1 = next;
		}
	}

	public static int nthFibonacciNumber(int n)
	{
		if (n <= 2)
			return n - 1;
		
		int prev1 = 1, prev2 = 0, val = prev1 + prev2;
		
		for (int i = 3; i < n; ++i) {
			prev2 = prev1;
			prev1 = val;
			val = prev1 + prev2;
		}
		
		return val;
	}
	
	
	public static long nthPrime(int n)
	{
		long val = 2;
		int count = 0;
		
		while (true) {
			if (isPrime(val))
				++count;
			
			if (count == n)
				return val;
			
			++val;
		}
	}


	public static long previousClosestPrime(long val)
	{		
		while (!isPrime(--val))
			;
		
		return val;
	}

	
	public static int reversed(int val)
	{
		int result = 0;
		
		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}
		
		return result;
	}
}