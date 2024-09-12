/**
 * Utility class for string operations
 * Last Update: 12th September 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.string;

import java.util.Random;

public class StringUtil {
	public static String capitalize(String s)
	{
		return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}

	public static String changeCase(String s)
	{
		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);

			sb.setCharAt(i, Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
		}

		return sb.toString();
	}


	public static int countString(String s1, String s2)
	{
		int count = 0;

		for (int i = 0; (i = s1.indexOf(s2, i)) != -1; ++i, ++count)
			;

		return count;
	}

	public static String generateRandomText(Random random, int count, String sourceText)
	{
		char [] c = new char[count];

		for (int i = 0; i < count; ++i)
			c[i] = sourceText.charAt(random.nextInt(sourceText.length()));

		return String.valueOf(c);
	}

	public static String generateRandomTextEN(Random random, int count)
	{
		return generateRandomText(random, count, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
	}

	public static String generateRandomTextTR(Random random, int count)
	{
		return generateRandomText(random, count, "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz");
	}

	public static String [] generateRandomTexts(Random random, int count, int origin, int bound, String sourceText)
	{
		String [] str = new String[count];

		for (int i = 0; i < count; ++i)
			str[i] = generateRandomText(random, random.nextInt(origin, bound), sourceText);

		return str;
	}

	public static String [] generateRandomTextsEN(Random random, int count, int origin, int bound)
	{
		return generateRandomTexts(random, count, origin, bound, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
	}

	public static String [] generateRandomTextsTR(Random random, int count, int origin, int bound)
	{
		return generateRandomTexts(random, count, origin, bound, "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz");
	}

	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			char cLeft = s.charAt(left);

			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}

			char cRight = s.charAt(right);

			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}

			if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight))
				return false;

			++left;
			--right;
		}

		return true;
	}


	public static boolean isPangram(String s, String alphabet)
	{
		for (int i = 0; i < alphabet.length(); ++i)
			if (s.indexOf(alphabet.charAt(i)) == -1)
				return false;

		return true;
	}


	public static boolean isPangramEN(String s)
	{
		return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuvwxyz");
	}

	public static boolean isPangramTR(String s)
	{
		return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
	}

	public static String join(String [] s, String delimiter)
	{
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length; ++i)
			sb.append(s[i]).append(delimiter);

		return sb.substring(0, sb.length() - delimiter.length());
	}

	public static String join(String [] s, char delimiter)
	{
		return join(s, String.valueOf(delimiter));
	}

	public static String padLeading(String s, int n, char ch)
	{
		int len = s.length();

		return len < n ? String.valueOf(ch).repeat(n - len) + s : s;
	}

	public static String padLeading(String s, int n)
	{
		return padLeading(s, n, ' ');
	}

	public static String padTrailing(String s, int n, char ch)
	{
		int len = s.length();

		return len < n ? s + String.valueOf(ch).repeat(n - len) : s;
	}

	public static String padTrailing(String s, int n)
	{
		return padTrailing(s, n, ' ');
	}

	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}

	public static String [] split(String s, String delimiters)
	{
		return split(s, delimiters, true);
	}

	public static String [] split(String s, String delimiters, boolean removeEmptyEntries)
	{
		StringBuilder pattern = new StringBuilder("[");

		for (int i = 0; i < delimiters.length(); ++i) {
			char c = delimiters.charAt(i);

			if (c == '[' || c == ']')
				pattern.append('\\');

			pattern.append(c);
		}

		pattern.append(']');

		if (removeEmptyEntries)
			pattern.append("+");

		return s.split(pattern.toString());
	}
}
