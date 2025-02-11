package org.csystem.string.test;

import org.csystem.string.CSDStringBuilder;
import org.csystem.util.console.Console;

public class CSDStringBuilderInitialEnsureCapacityTest {
    public static void run()
    {
        CSDStringBuilder sb = new CSDStringBuilder(5);

        sb.append("ali");
        sb.ensureCapacity(4);
        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());
        sb.ensureCapacity(7);
        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());
        sb.ensureCapacity(21);
        Console.writeLine("Capacity:%d, Length:%d", sb.capacity(), sb.length());
    }

    public static void main(String[] args)
    {
        run();
    }
}
