package org.csystem.util.matrix.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.matrix.MatrixUtil.*;

public class MatrixUtilMultiplyByTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Satır sayısını giriniz:");
            int m = Integer.parseInt(kb.nextLine());

            System.out.print("Sütun sayısını giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (m <= 0 || n <= 0)
                break;

            System.out.print("Bir sayı giriniz:");
            int value = Integer.parseInt(kb.nextLine());

            int [][] a = generateRandomMatrix(r, m, n, 0, 100);


            print(a, 2);
            System.out.println();
            multiplyBy(a, value);
            print(a, 3);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
