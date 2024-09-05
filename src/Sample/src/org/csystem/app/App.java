package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		ChangeCaseTest.run();;
	}
}

class ChangeCaseTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);

		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();

			System.out.printf("%s%n", StringUtil.changeCase(s));

			if ("exit".equals(s))
				break;
		}
	}
}

class Util {
	public static String changeCase(String s)
	{
		//TODO
	}
}