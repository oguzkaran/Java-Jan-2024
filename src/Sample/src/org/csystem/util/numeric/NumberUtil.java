/**
 * Utility class for numeric operations
 * Last Update: 31st October 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.numeric;

public class NumberUtil {
	private NumberUtil()
	{
	}

	private static final String [] ONES_TR = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
	private static final String [] TENS_TR = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};

	private static String numToStr3DigitsTR(int val)
	{
		StringBuilder sb = new StringBuilder();

		int a = val / 100;
		int b = val / 10 % 10;
		int c = val % 10;

		if (a != 0) {
			if (a != 1)
				sb.append(ONES_TR[a]).append(" ");
			sb.append("yüz ");
		}

		if (b != 0)
			sb.append(TENS_TR[b]).append(" ");

		if (c != 0)
			sb.append(ONES_TR[c]).append(" ");

		return sb.substring(0, sb.length() - 1);
	}

	public static int countDigits(long a)
	{
		return a != 0 ? (int) Math.log10(Math.abs(a)) + 1 : 1;
	}

	public static long factorial(int n)
	{
		long result = 1;

		for (long i = 2; i <= n; ++i)
			result *= i;

		return result;
	}

	public static int fibonacciNumber(int n)
	{
		if (n <= 2)
			return n - 1;

		int prev1 = 1, prev2 = 0, result = prev1 + prev2;

		for (int i = 3; i < n; ++i) {
			prev2 = prev1;
			prev1 = result;
			result = prev1 + prev2;
		}

		return result;
	}

	public static int [] getDigits(long a)
	{
		int [] digits = new int[countDigits(a)];

		a = Math.abs(a);

		for (int i = digits.length - 1; i >= 0; digits[i--] = (int)(a % 10), a /= 10)
			;

		return digits;
	}

	public static int [] getDigitsInThrees(long a)
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public static int getDigitsPowSum(int a)
	{
		int result = 0;
		int n = countDigits(a);

		while (a != 0) {
			result += (int)Math.pow(a % 10, n);
			a /= 10;
		}

		return result;
	}

	public static boolean isArmstrong(int a)
	{
		return a >= 0 && getDigitsPowSum(a) == a;
	}

	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}

	public static boolean isOdd(int a)
	{
		return !isEven(a);
	}

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

	public static long nextClosestPrime(long a)
	{
		if (a < 2)
			return 2;

		while (!isPrime(++a))
			;

		return a;
	}

	public static int nextFibonacciNumber(int val)
	{
		if (val < 0)
			return 0;

		int prev1 = 1, prev2 = 0, next = prev1 + prev2;

		while (next <= val) {
			prev2 = prev1;
			prev1 = next;
			next = prev1 + prev2;
		}

		return next;
	}

	public static long nthPrime(int n)
	{
		long result = 2;
		int count = 0;

		for (long i = 2; count < n; ++i)
			if (isPrime(i)) {
				++count;
				result = i;
			}
		return result;
	}

	public static String numToStrTR(long a)
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public static int reverse(int val)
	{
		int result = 0;

		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}

		return result;
	}

	public static int sumDigits(int val)
	{
		int total = 0;

		while (val != 0) {
			total += val % 10;
			val /= 10;
		}

		return Math.abs(total);
	}
}
