/**
 * Utility class for string operations
 * Last Update: 3rd June 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.string;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public final class StringUtil {
	private StringUtil()
	{
	}

	private static final String LETTERS_EN;
	private static final String LETTERS_TR;
	private static final String CAPITAL_LETTERS_EN;
	private static final String CAPITAL_LETTERS_TR;
	private static final String ALL_LETTERS_EN;
	private static final String ALL_LETTERS_TR;

	static {
		LETTERS_EN = "abcdefghijklmnopqrstuvwxyz";
		LETTERS_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
		CAPITAL_LETTERS_EN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		CAPITAL_LETTERS_TR = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
		ALL_LETTERS_EN = LETTERS_EN + CAPITAL_LETTERS_EN;
		ALL_LETTERS_TR = LETTERS_TR + CAPITAL_LETTERS_TR;
	}

	public static String capitalize(String s)
	{
		return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}

	public static CharSequence changeCase(CharSequence charSequence)
	{
		StringBuilder sb = new StringBuilder(charSequence);

		for (int i = 0; i < charSequence.length(); ++i) {
			char c = charSequence.charAt(i);

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

	public static String generateRandomText(RandomGenerator randomGenerator, int count, CharSequence charSequence)
	{
		char [] c = new char[count];

		for (int i = 0; i < count; ++i)
			c[i] = charSequence.charAt(randomGenerator.nextInt(charSequence.length()));

		return String.valueOf(c);
	}

	public static String generateRandomTextEN(RandomGenerator randomGenerator, int count)
	{
		return generateRandomText(randomGenerator, count, ALL_LETTERS_EN);
	}

	public static String generateRandomTextTR(RandomGenerator randomGenerator, int count)
	{
		return generateRandomText(randomGenerator, count, ALL_LETTERS_TR);
	}

	public static String [] generateRandomTexts(RandomGenerator randomGenerator, int count, int origin, int bound, CharSequence charSequence)
	{
		String [] str = new String[count];

		for (int i = 0; i < count; ++i)
			str[i] = generateRandomText(randomGenerator, randomGenerator.nextInt(origin, bound), charSequence);

		return str;
	}

	public static String [] generateRandomTextsEN(RandomGenerator randomGenerator, int count, int origin, int bound)
	{
		return generateRandomTexts(randomGenerator, count, origin, bound, ALL_LETTERS_EN);
	}

	public static String [] generateRandomTextsTR(RandomGenerator randomGenerator, int count, int origin, int bound)
	{
		return generateRandomTexts(randomGenerator, count, origin, bound, ALL_LETTERS_TR);
	}

	public static boolean isPalindrome(CharSequence charSequence)
	{
		int left = 0;
		int right = charSequence.length() - 1;

		while (left < right) {
			char cLeft = charSequence.charAt(left);

			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}

			char cRight = charSequence.charAt(right);

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
		return isPangram(s.toLowerCase(), LETTERS_EN);
	}

	public static boolean isPangramTR(String s)
	{
		return isPangram(s.toLowerCase(), LETTERS_TR);
	}


	public static String join(ArrayList<String> texts, CharSequence delimiter)
	{
		StringBuilder sb = new StringBuilder();

		for (String s : texts)
			sb.append(s).append(delimiter);

		return sb.substring(0, sb.length() - delimiter.length());
	}

	public static String join(ArrayList<String> texts, char delimiter)
	{
		return join(texts, String.valueOf(delimiter));
	}

	public static String join(String [] s, CharSequence delimiter)
	{
		StringBuilder sb = new StringBuilder();

		for (String str : s)
			sb.append(str).append(delimiter);

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

	public static String [] split(String s, CharSequence delimiters)
	{
		return split(s, delimiters, true);
	}

	public static String [] split(String s, CharSequence delimiters, boolean removeEmptyEntries)
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
