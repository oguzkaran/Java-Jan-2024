package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

public class ArrayUtilHistogramDataTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Bir sayı giriniz:");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            int [] a = generateRandomArray(r, count, 0, 11);

            System.out.print("Dizi:");
            print(a, 2);
            int [] hist = histogramData(a, 10);
            System.out.print("Sayı dizisi:");
            print(hist, 2);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
