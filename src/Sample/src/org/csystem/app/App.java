package org.csystem.app;

import java.util.Random;

import static org.csystem.util.console.CommandLineArgsUtil.checkLengthEquals;

class App {
	public static void main(String [] args)
	{
		checkLengthEquals(3, args.length, "usage: java org.csystem.app.App <count> <origin> <bound>");

		Random random = new Random();
		int count = Integer.parseInt(args[0]);
		int origin = Integer.parseInt(args[1]);
		int bound = Integer.parseInt(args[2]);

		for (int i = 0; i < count; ++i)
			System.out.printf("%d ", random.nextInt(origin, bound));
	}
}

