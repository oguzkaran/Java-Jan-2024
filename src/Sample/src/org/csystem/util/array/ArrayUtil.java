/**
 * Utility class for array operations
 * Last Update: 20th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.array;

public class ArrayUtil {
    public static void print(int [] a)
    {
        print(a, ' ', '\n');
    }

    public static void print(int [] a, char sep, char end)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d%c", a[i], sep);

        System.out.print(end);
    }

    //...
}
