package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		String text = "Bugün hava çok güzel, çok çok güzel";
		String s = "çok";

		System.out.println(text.lastIndexOf(s));
		System.out.println(text.lastIndexOf(s, 12));
		System.out.println(text.lastIndexOf(s, 27));
	}
}