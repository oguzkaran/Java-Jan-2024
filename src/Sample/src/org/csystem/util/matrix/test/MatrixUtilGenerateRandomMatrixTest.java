package org.csystem.util.matrix.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

public class MatrixUtilGenerateRandomMatrixTest {
    public static void run()
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            int [][] m = MatrixUtil.generateRandomMatrix(random, random.nextInt(3, 5), random.nextInt(3, 5), 0, 100);

            ArrayUtil.print(2, m);
            System.out.println("-----------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
