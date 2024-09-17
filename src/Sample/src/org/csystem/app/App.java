package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Random r = new Random();
		Scanner kb = new Scanner(System.in);
		System.out.print("Matrisin satır ve sütun sayılarını giriniz:");
		int m = kb.nextInt();
		int n = kb.nextInt();

		int[][] a = new int[m][];

		for (int i = 0; i < m; ++i)
			for (int j = 0; j < n; ++j)
				a[i] = ArrayUtil.generateRandomArray(r, n, 0, 100);

		for (int [] array : a) {
			for (int val : array)
				System.out.printf("%02d ", val);

			System.out.println();
		}
	}
}


