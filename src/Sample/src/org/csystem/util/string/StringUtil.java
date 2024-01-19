/*--------------------------------------------------------
	FILE NAME	: StringUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 13th January 2024
	
	Utility class for string operations
	
	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.string;

import java.util.Random;

public class StringUtil {
	private static final String LETTERS_EN = "abcdefghijklmnopqrstuvwxyz";
	private static final String LETTERS_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
	private static final String LETTERS_CAPITAL_EN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LETTERS_CAPITAL_TR = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
	private static final String LETTERS_ALL_EN = LETTERS_EN + LETTERS_CAPITAL_EN;
	private static final String LETTERS_ALL_TR = LETTERS_TR + LETTERS_CAPITAL_TR;

	private StringUtil()
	{
	}

	public static String capitalize(String s)
	{
		return s.isEmpty() ? "" : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}
	
	public static int countString(String s1, String s2)
	{
		int count = 0;
		int index = -1;

		while ((index = s1.indexOf(s2, index + 1)) != -1)
			++count;
		
		return count;
	}
	
	public static int countStringIgnoreCase(String s1, String s2)
	{
		return countString(s1.toLowerCase(), s2.toLowerCase());
	}
	
	public static String generateRandomTextEN(Random random, int count)
	{
		return generateRandomText(random, count, LETTERS_ALL_EN);
	}
	
	public static String generateRandomTextTR(Random random, int count)
	{
		return generateRandomText(random, count, LETTERS_ALL_TR);
	}
	
	public static String generateRandomText(Random random, int count, String sourceText)
	{
		StringBuilder sb = new StringBuilder(count);
		int len = sourceText.length();
		
		for (int i = 0; i < count; ++i)
			sb.append(sourceText.charAt(random.nextInt(len)));
		
		return sb.toString();
	}

	public static String [] generateRandomTextsEN(Random random, int count, int min, int bound)
	{
		return generateRandomTexts(random, count, min, bound, LETTERS_ALL_EN);
	}

	public static String [] generateRandomTextsTR(Random random, int count, int min, int bound)
	{
		return generateRandomTexts(random, count, min, bound, LETTERS_ALL_TR);
	}

	public static String [] generateRandomTexts(Random random, int count, int min, int bound, String sourceText)
	{
		String [] texts = new String[count];

		for (int i = 0; i < count; ++i)
			texts[i] = generateRandomText(random, random.nextInt(min, bound), sourceText);

		return texts;
	}
	
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			char cLeft = Character.toLowerCase(s.charAt(left));
			
			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}
			
			char cRight = Character.toLowerCase(s.charAt(right));
			
			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}
			
			if (cLeft != cRight)
				return false;
			
			++left;
			--right;
		}
		
		return true;
	}
	
	public static boolean isPangramEN(String s)
	{
		return isPangram(s.toLowerCase(), LETTERS_EN);
	}
	
	public static boolean isPangramTR(String s)
	{
		return isPangram(s.toLowerCase(), LETTERS_TR);
	}
	
	public static boolean isPangram(String s, String alphabet)
	{
		int len = alphabet.length();
		
		for (int i = 0; i < len; ++i)
			if (s.indexOf(alphabet.charAt(i)) == -1)
				return false;
		
		return true;
	}
	
	public static String padLeading(String s, int newLen, char ch)
	{
		int len = s.length();
		
		return newLen <= len ? s : String.valueOf(ch).repeat(newLen - s.length()) + s;
	}
	
	public static String padLeading(String s, int newLen)
	{
		return padLeading(s, newLen, ' ');
	}
	
	public static String padTrailing(String s, int newLen, char ch)
	{
		int len = s.length();
		
		return newLen <= len ? s : s + String.valueOf(ch).repeat(newLen - s.length());
	}
	
	public static String padTrailing(String s, int newLen)
	{
		return padTrailing(s, newLen, ' ');
	}

	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}	
}
