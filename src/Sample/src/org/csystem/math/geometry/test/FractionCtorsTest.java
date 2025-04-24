package org.csystem.math.geometry.test;

import org.csystem.math.Fraction;
import org.csystem.util.console.Console;

import java.util.Random;

public class FractionCtorsTest {
    public static void run()
    {
        try {
            Random r = new Random();
            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction(3);
            Fraction f3 = new Fraction(3, 4);
            Fraction f4 = new Fraction(3, -4);
            Fraction f5 = new Fraction(-3, -4);
            Fraction f6 = new Fraction(120, 160);
            Fraction f7 = new Fraction(120, -160);
            Fraction f8 = new Fraction(-120, -160);

            Console.writeLine("f1 -> %s", f1);
            Console.writeLine("f2 -> %s", f2);
            Console.writeLine("f3 -> %s", f3);
            Console.writeLine("f4 -> %s", f4);
            Console.writeLine("f5 -> %s", f5);
            Console.writeLine("f6 -> %s", f6);
            Console.writeLine("f7 -> %s", f7);
            Console.writeLine("f8 -> %s", f8);

            int a = r.nextInt(3);

            Console.writeLine("a = %d", a);
            Fraction f9 = new Fraction(a, 0);
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
