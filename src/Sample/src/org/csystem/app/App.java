package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

class App {
	public static void main(String [] args)
	{
		int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [][] b = {{1, 2, 3}, {4, 5, 6, 3}, {7, 8, 9}};

		ArrayUtil.print(a);
		System.out.println("--------------------------------");
		ArrayUtil.print(b);
	}
}


