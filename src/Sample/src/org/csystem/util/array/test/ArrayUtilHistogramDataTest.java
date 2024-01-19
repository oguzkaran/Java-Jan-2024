package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtilHistogramDataTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();
        Random random = new Random();

        for (int i = 0; i < count; ++i) {
            System.out.println("----------------------------------------------------");
            int [] a = ArrayUtil.generateRandomArray(random, random.nextInt(10, 41), 0, 11);

            ArrayUtil.print(2, a);
            int [] data = ArrayUtil.histogramData(a, 10);

            ArrayUtil.print(data);
            System.out.println("----------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
