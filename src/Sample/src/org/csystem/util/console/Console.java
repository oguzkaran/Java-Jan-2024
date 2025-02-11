/**
 * Utility class for console operations
 * Last Update: 4th February 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.console;

import java.util.Scanner;

public class Console {
    private Console()
    {
    }

    private static final Scanner KB = new Scanner(System.in);

    public static int readInt()
    {
        return readInt("");
    }

    public static int readInt(String prompt)
    {
        System.out.print(prompt);

        return Integer.parseInt(KB.nextLine());
    }

    public static long readLong(String prompt)
    {
        System.out.print(prompt);

        return Long.parseLong(KB.nextLine());
    }

    public static double readDouble(String prompt)
    {
        System.out.print(prompt);

        return Double.parseDouble(KB.nextLine());
    }

    public static String readString(String prompt)
    {
        System.out.print(prompt);

        return KB.nextLine();
    }

    public static void write(String fmt, Object...objects)
    {
        System.out.printf(fmt, objects);
    }

    public static void writeLine(String fmt, Object...objects)
    {
        write(fmt + '\n', objects);
    }

    public static void writeLine()
    {
        System.out.println();
    }

    public static void write(Object object)
    {
        System.out.print(object);
    }

    public static void writeLine(Object object)
    {
        System.out.println(object);
    }

    //...
}
