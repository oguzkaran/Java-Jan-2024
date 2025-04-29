package org.csystem.math.geometry.test;

import org.csystem.math.Fraction;
import org.csystem.util.console.Console;

/**
 * Fraction test class
 * Last Update: 24th April 2025
 * @author Onur Meşe
 */

public class FractionComparisonTest {
    public static void run()
    {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(-10, 20);
        Fraction f3 = new Fraction(1, -4);
        Fraction f4 = new Fraction(3, 4);
        Fraction f5 = new Fraction();
        Fraction f6 = new Fraction(2, 4);
        Fraction f7 = new Fraction(-120, -160);

        Console.writeLine(f1.compareTo(f3) > 0);
        Console.writeLine(f2.compareTo(f1) < 0);
        Console.writeLine(f4.compareTo(f7) == 0);
        Console.writeLine(f5.compareTo(f6) < 0);
        Console.writeLine(f6.compareTo(f3) > 0);
    }
    public static void main(String[] args)
    {
        run();
    }
}