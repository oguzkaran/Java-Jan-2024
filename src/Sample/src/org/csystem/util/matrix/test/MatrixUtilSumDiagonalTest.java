package org.csystem.util.matrix.test;

import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

public class MatrixUtilSumDiagonalTest {
    public static void run()
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);


        while (true) {
            System.out.print("Bir sayı giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            int [][] a = MatrixUtil.generateRandomSquareMatrix(random, n, 0, 100);

            MatrixUtil.print(a, 2);

            System.out.printf("Esas köşegen toplamı:%d%n", MatrixUtil.sumDiagonal(a));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
