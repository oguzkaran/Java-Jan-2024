package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

public class StringUtilChangeCaseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("%s%n", StringUtil.changeCase(s));
			
			if ("exit".equals(s))
				break;
		}
	}
}