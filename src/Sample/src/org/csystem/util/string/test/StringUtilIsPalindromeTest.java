package org.csystem.util.string.test;

import java.util.Scanner;

import org.csystem.util.string.StringUtil;

public class StringUtilIsPalindromeTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println(StringUtil.isPalindrome(s) ? "Palindrom" : "Palindrom değil");
		}
	}
	
	public static void main(String [] args)
	{
		run();
	}
}
