package org.csystem.util.matrix.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

public class MatrixUtilSumDiagonalTest {
    public static void run()
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            int [][] m = MatrixUtil.generateRandomSquareMatrix(random, random.nextInt(3, 5), 0, 100);

            ArrayUtil.print(2, m);
            System.out.printf("Total:%d%n", MatrixUtil.sumDiagonal(m));
            System.out.println("-----------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
