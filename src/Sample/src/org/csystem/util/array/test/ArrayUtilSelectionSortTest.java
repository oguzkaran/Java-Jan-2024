package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

public class ArrayUtilSelectionSortTest {
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
            boolean descending = r.nextBoolean();
            System.out.printf("Dizi %s olarak sıralanıyor%n", descending ? "azalan sırada" : "artan sırada");
            selectionSort(a, descending);
            print(a, 2);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
