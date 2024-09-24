package org.csystem.app;

import java.util.Random;

class App {
	public static void main(String [] args)
	{
		int [][][] a = new int[3][4][5];
		Random r = new Random();

		for (int i = 0; i < a.length; ++i)
			for (int j = 0; j < a[i].length; ++j)
				for (int k = 0; k < a[i][j].length; ++k)
					a[i][j][k] = r.nextInt(100);

		//...


		for (int [][] arrayOfArray : a)
			for (int [] array : arrayOfArray)
				for (int val : array)
					System.out.println(val);
	}
}
