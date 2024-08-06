/**
 * Utility class for numeric operations
 * Last Update: 6th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.numeric;

public class NumberUtil {
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
	//...
}
