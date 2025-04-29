package org.csystem.math.geometry.test;

import org.csystem.math.Fraction;
import org.csystem.util.console.Console;

/**
 * Fraction test class
 * Last Update: 24th April 2025
 * @author Onur Meşe
 */
public class FractionArithmeticOperationsTest {
    public static void run()
    {
        try {
            Fraction f1 = new Fraction(1,2);
            Fraction f2 = new Fraction(1, -4);

            Console.writeLine(f1.add(f2).equals(new Fraction(1, 4)));
            Console.writeLine(f1.subtract(f2).equals(new Fraction(3, 4)));
            Console.writeLine(f1.multiply(f2).equals(new Fraction(1, -8)));
            Console.writeLine(f1.divide(f2).equals(new Fraction(-2)));
            Console.writeLine(f1.divide(new Fraction()));
        }
        catch (IllegalArgumentException ex) {
            Console.writeLine("Exception Message:%s", ex.getMessage());
        }
    }
    public static void main(String[] args)
    {
        run();
    }
}