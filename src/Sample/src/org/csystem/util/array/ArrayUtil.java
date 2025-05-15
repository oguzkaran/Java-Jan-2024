/**
 * Utility class for array operations
 * Last Update: 15th May 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.array;


import java.util.random.RandomGenerator;

public final class ArrayUtil {
    private ArrayUtil()
    {
    }

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
            for (int k = 0; k < a.length -1 - i; ++k)
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

    public static double average(int [] a)
    {
        return sum(a) / (double)a.length;
    }

    public static void bubbleSort(int [] a)
    {
        bubbleSort(a, false);
    }

    public static void bubbleSort(int [] a, boolean descending)
    {
        if (descending)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);
    }

    public static void drawHistogram(int [] data, int n, char ch)
    {
        int maxValue = ArrayUtil.max(data);

        for (int grade : data) {
            int count = (int)Math.floor(grade * n / (double)maxValue);

            while (count-- > 0)
                System.out.print(ch);

            System.out.println();
        }
    }

    public static int [] generateRandomArray(RandomGenerator randomGenerator, int count, int origin, int bound)
    {
        int [] a = new int[count];

        for (int i = 0; i < count; ++i)
            a[i] = randomGenerator.nextInt(origin, bound);

        return a;
    }

    public static double [] generateRandomArray(RandomGenerator randomGenerator, int count, double origin, double bound)
    {
        double [] a = new double[count];

        for (int i = 0; i < count; ++i)
            a[i] = randomGenerator.nextDouble(origin, bound);

        return a;
    }

    public static boolean [] generateRandomArray(RandomGenerator randomGenerator, int count)
    {
        boolean [] a = new boolean[count];

        for (int i = 0; i < count; ++i)
            a[i] = randomGenerator.nextBoolean();

        return a;
    }

    public static int [] histogramData(int [] a, int n)
    {
        int [] data = new int[n + 1];

        for (int val : a)
            ++data[val];

        return data;
    }

    public static int max(int [] a)
    {
        return max(a, 0);
    }

    public static int max(int [] a, int startIndex)
    {
        int result = a[startIndex];

        for (int i = startIndex + 1; i < a.length; ++i)
            result = Math.max(result, a[i]);

        return result;
    }

    public static int max(int [][] a)
    {
        int result = Integer.MIN_VALUE;

        for (int [] array : a)
            result = Math.max(result, max(array));

        return result;
    }

    public static int min(int [] a)
    {
        return min(a, 0);
    }

    public static int min(int [] a, int startIndex)
    {
        int result = a[startIndex];

        for (int i = startIndex + 1; i < a.length; ++i)
            result = Math.min(result, a[i]);

        return result;
    }

    public static int min(int [][] a)
    {
        int result = Integer.MAX_VALUE;

        for (int [] array : a)
            result = Math.min(result, min(array));

        return result;
    }

    public static void multiplyBy(int [] a, int value)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] *= value;
    }

    public static void multiplyBy(int [][] a, int value)
    {
        for (int [] array : a)
            multiplyBy(array, value);
    }

    public static int partition(int [] a, int threshold)
    {
        int partitionPoint = 0;

        while (partitionPoint != a.length && a[partitionPoint] < threshold)
            ++partitionPoint;

        if (partitionPoint == a.length)
            return partitionPoint;

        for (int i = partitionPoint + 1; i < a.length; ++i)
            if (a[i] < threshold)
                swap(a, i, partitionPoint++);

        return partitionPoint;
    }

    public static int partitionByEven(int [] a)
    {
        int partitionPoint = 0;

        while (partitionPoint != a.length && a[partitionPoint] % 2 == 0)
            ++partitionPoint;

        if (partitionPoint == a.length)
            return partitionPoint;

        for (int i = partitionPoint + 1; i < a.length; ++i)
            if (a[i] % 2 == 0)
                swap(a, i, partitionPoint++);

        return partitionPoint;
    }

    public static void print(int [] a)
    {
        print(a, ' ', '\n');
    }

    public static void print(int [] a, char sep, char end)
    {
        print(a, 1, sep, end);
    }

    public static void print(int [] a, int n)
    {
        print(a, n, ' ', '\n');
    }

    public static void print(int [] a, int n, char sep, char end)
    {
        String fmt = String.format("%%0%dd%c", n, sep);

        for (int val : a)
            System.out.printf(fmt, val, sep);

        System.out.print(end);
    }

    public static void print(int [][] a)
    {
        print(a, 1);
    }

    public static void print(int [][] a, int n)
    {
        for (int [] array : a)
            print(array, n, ' ', '\n');
    }

    public static void print(double [] a)
    {
        print(a, '\n', '\n');
    }

    public static void print(double [] a, char sep, char end)
    {
        for (double val : a)
            System.out.printf("%f%c", val, sep);

        System.out.print(end);
    }

    public static void reverse(int [] a)
    {
        int left = 0, right = a.length - 1;

        while (left < right)
            swap(a, left++, right--);
    }

    public static void reverse(char [] a)
    {
        int left = 0, right = a.length - 1;

        while (left < right)
            swap(a, left++, right--);
    }

    public static void selectionSort(int [] a)
    {
        selectionSort(a, false);
    }

    public static void selectionSort(int [] a, boolean descending)
    {
        if (descending)
            selectionSortDescending(a);
        else
            selectionSortAscending(a);
    }
    public static long sum(int [] a)
    {
        long total = 0;

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

    //...
}
