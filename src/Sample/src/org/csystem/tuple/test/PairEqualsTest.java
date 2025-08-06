package org.csystem.tuple.test;

import org.csystem.tuple.Pair;
import org.csystem.util.console.Console;

public class PairEqualsTest {
    public static void run()
    {
        Pair<Integer, String> p1 = new Pair<>(67, "Zonguldak");
        Pair<Integer, String> p2 = new Pair<>(67, "Zonguldak");
        Pair<Integer, String> p3 = new Pair<>(34, "İstanbul");

        Console.writeLine(p1);
        Console.writeLine(p2);
        Console.writeLine(p3);

        Console.writeLine(p1.equals(p2));
        Console.writeLine(!p1.equals(p3));
    }

    public static void main(String[] args)
    {
        run();
    }
}
