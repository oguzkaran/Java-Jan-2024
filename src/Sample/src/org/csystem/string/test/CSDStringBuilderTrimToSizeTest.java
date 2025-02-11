package org.csystem.string.test;

import org.csystem.string.CSDStringBuilder;
import org.csystem.util.console.Console;

public class CSDStringBuilderTrimToSizeTest {
    public static void run()
    {
        CSDStringBuilder sb = new CSDStringBuilder(5);

        sb.append("ali");

        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());
        sb.trimToSize();
        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());
    }

    public static void main(String[] args)
    {
        run();
    }
}
