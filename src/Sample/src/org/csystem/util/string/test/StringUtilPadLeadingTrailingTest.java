package org.csystem.util.string.test;

import java.util.Scanner;

import org.csystem.util.string.StringUtil;

public class StringUtilPadLeadingTrailingTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.print("Bir sayı giriniz:");
			int len = Integer.parseInt(kb.nextLine());
			
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", StringUtil.padLeading(s, len, 'x'));
			System.out.printf("(%s)%n", StringUtil.padLeading(s, len));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, len, 'x'));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, len));
		}
	}
	
	public static void main(String [] args)
	{
		run();
	}
}
