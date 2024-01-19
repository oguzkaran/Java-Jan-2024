/*--------------------------------------------------------
	FILE NAME	: ArrayUtil.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 7th January 2024

	Utility class for array operations

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    private ArrayUtil()
    {}

    private static void bubbleSortAscending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - 1 - i; ++k)
                if (a[k + 1] < a[k])
                    swap(a, k, k + 1);
    }

    private static void bubbleSortDescending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - 1 - i; ++k)
                if (a[k] < a[k + 1])
                    swap(a, k, k + 1);
    }

    private static void selectionSortAscending(int [] a)
    {
        int min, minIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            min = a[i];
            minIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (a[k] < min) {
                    min = a[k];
                    minIndex = k;
                }

            a[minIndex] = a[i];
            a[i] = min;
        }
    }

    private static void selectionSortDescending(int [] a)
    {
        int max, maxIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            max = a[i];
            maxIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (max < a[k]) {
                    max = a[k];
                    maxIndex = k;
                }

            a[maxIndex] = a[i];
            a[i] = max;
        }
    }

    public static void addBy(int [][] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            for (int k = 0; k < a[i].length; ++k)
                a[i][k] += val;
    }

    public static void bubbleSort(int [] a)
    {
        bubbleSort(a, false);
    }

    public static void bubbleSort(int [] a, boolean desc)
    {
        if (desc)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);
    }

    public static void fillRandomArray(Random random, int [] a, int origin, int bound)
    {
        fillRandomArray(random, a, a.length, origin, bound);
    }

    public static void fillRandomArray(Random random, int [] a, int count, int origin, int bound)
    {
        for (int i = 0; i < count; ++i)
            a[i] = random.nextInt(origin, bound);
    }

    public static void fillRandomArray(Random random, int [][] a, int origin, int bound)
    {
        for (int [] array : a)
            fillRandomArray(random, array, origin, bound);
    }

    public static int [] generateRandomArray(Random random, int count, int origin, int bound)
    {
        int [] a = new int[count];

        fillRandomArray(random, a, origin, bound);

        return a;
    }

    public static int [] generateRandomArray(int count, int origin, int bound)
    {
        return generateRandomArray(new Random(), count, origin, bound);
    }

    public static int [] histogramData(int [] a, int n)
    {
        int [] result = new int[n + 1];

        for (int val : a)
            ++result[val];

        return result;
    }

    public static boolean isEmpty(int [] a)
    {
        return a.length == 0;
    }

    public static int max(int [] a)
    {
        int result = a[0];

        for (int val : a)
            result = Math.max(val, result);

        return result;
    }

    public static int min(int [] a)
    {
        int result = a[0];

        for (int val : a)
            result = Math.min(val, result);

        return result;
    }

    public static void multiplyBy(int [][] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            for (int k = 0; k < a[i].length; ++k)
                a[i][k] *= val;
    }

    public static int partition(int [] a, int threshold)
    {
        int partitionIndex = 0;

        while (partitionIndex != a.length && a[partitionIndex] < threshold)
            ++partitionIndex;

        if (partitionIndex == a.length)
            return partitionIndex;

        for (int i = partitionIndex + 1; i < a.length; ++i)
            if (a[i] < threshold)
                swap(a, i, partitionIndex++);

        return partitionIndex;
    }

    public static void print(int [] a)
    {
        print(1, a);
    }

    public static void print(int n, int [] a)
    {
        print(n, a, a.length);
    }

    public static void print(int [] a, int count)
    {
        print(1, a, count);
    }

    public static void print(int n, int [] a, int count)
    {
        print(n, a, count, " ", "\n");
    }

    public static void print(int [] a, int count, String sep, String end)
    {
        print(1, a, count, sep, end);
    }

    public static void print(int n, int [] a, int count, String sep, String end)
    {
        String fmt = String.format("%%0%dd%%s", n);

        for (int i = 0; i < count; ++i)
            System.out.printf(fmt, a[i], sep);

        System.out.print(end);
    }

    public static void print(int [][] a)
    {
        print(1, a);
    }

    public static void print(int n, int [][] a)
    {
        for (int [] array : a)
            print(n, array);
    }

    public static void reverse(int [] a)
    {
        for (int i = 0; i < a.length / 2; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static void reverse(char [] a)
    {
        for (int i = 0; i < a.length / 2; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static int [] reversed(int [] a)
    {
        int [] result = new int[a.length];

        for (int i = a.length - 1; i >= 0; --i)
            result[result.length - 1 - i] = a[i];

        return result;
    }

    public static char [] reversed(char [] a)
    {
        char [] result = new char[a.length];

        for (int i = a.length - 1; i >= 0; --i)
            result[result.length - 1 - i] = a[i];

        return result;
    }

    public static void selectionSort(int [] a)
    {
        selectionSort(a, false);
    }

    public static void selectionSort(int [] a, boolean desc)
    {
        if (desc)
            selectionSortDescending(a);
        else
            selectionSortAscending(a);
    }

    public static void subtractBy(int [][] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            for (int k = 0; k < a[i].length; ++k)
                a[i][k] -= val;
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int val : a)
            total += val;

        return total;
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(char [] a, int i, int k)
    {
        char temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }
}
