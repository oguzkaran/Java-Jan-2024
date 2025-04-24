package org.csystem.math.geometry.test;

import org.csystem.math.Fraction;
import org.csystem.util.console.Console;

import java.util.Random;

public class FractionSettersTest {
    public static void run()
    {
        try {
            Random r = new Random();
            Fraction f1 = new Fraction(12, 16);

            Console.writeLine("f1 -> %s", f1);

            f1.setNumerator(0);

            Console.writeLine("f1 -> %s", f1);

            f1.setNumerator(6);
            Console.writeLine("f1 -> %s", f1);
            f1.setDenominator(36);
            Console.writeLine("f1 -> %s", f1);

            int a = r.nextInt(3);

            Console.writeLine("a = %d", a);
            f1.setNumerator(a);
            f1.setDenominator(0);
        }
        catch (IllegalArgumentException ex) {
            Console.writeLine(ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
