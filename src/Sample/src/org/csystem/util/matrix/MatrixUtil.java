/*--------------------------------------------------------
	FILE NAME	: MatrixUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 7th January 2024

	Utility class for matrix operations

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.matrix;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class MatrixUtil {
    private MatrixUtil()
    {
    }

    public static int [][] add(int [][] a, int [][] b)
    {
        int row = a.length;
        int col = a[0].length;
        int [][] total = new int[row][col];

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                total[i][j] = a[i][j] + b[i][j];

        return total;
    }

    public static void addBy(int [][] a, int val)
    {
        ArrayUtil.addBy(a, val);
    }

    public static int [][] subtract(int [][] a, int [][] b)
    {
        int row = a.length;
        int col = a[0].length;
        int [][] total = new int[row][col];

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                total[i][j] = a[i][j] - b[i][j];

        return total;
    }

    public static void subtractBy(int [][] a, int val)
    {
        ArrayUtil.subtractBy(a, val);
    }

    public static void multiplyBy(int [][] a, int val)
    {
        ArrayUtil.multiplyBy(a, val);
    }

    public static int [][] generateRandomMatrix(Random random, int row, int col, int origin, int bound)
    {
        int [][] a = new int[row][col];

        ArrayUtil.fillRandomArray(random, a, origin, bound);

        return a;
    }

    public static int [][] generateRandomSquareMatrix(Random random, int n, int origin, int bound)
    {
        return generateRandomMatrix(random, n, n, origin, bound);
    }

    public static boolean isMatrix(int [][] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (a[0].length != a[i].length)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a.length == a[0].length;
    }

    public static int sumDiagonal(int [][] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i][i];

        return total;
    }

    public static int [][] transpose(int [][] a)
    {
        int [][] t = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j)
                t[j][i] = a[i][j];

        return t;
    }

    //...
}
