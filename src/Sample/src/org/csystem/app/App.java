package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		String [] cities = {"ankara", "istanbul", "izmir", "zonguldak", "muğla"};

		for (int i = 0; i < cities.length; ++i)
			System.out.println(cities[i].toUpperCase());
	}
}

