package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

public class ArrayUtilPartitionTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Input count:");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            int [] a = generateRandomArray(r, count, 0, 100);

            print(a, 2);

            System.out.print("Input threshold:");
            int threshold = Integer.parseInt(kb.nextLine());

            System.out.printf("Threshold:%d%n", threshold);
            int partitionPoint = partition(a, threshold);

            print(a);
            System.out.printf("Partition Point:%d%n", partitionPoint);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
