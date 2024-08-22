package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

public class ArrayUtilSumTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Bir sayı giriniz:");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            int [] a = generateRandomArray(r, count, 0, 100);

            print(a, 2);
            System.out.printf("Total:%d%n", sum(a));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
