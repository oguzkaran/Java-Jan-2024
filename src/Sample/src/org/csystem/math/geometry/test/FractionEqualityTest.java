package org.csystem.math.geometry.test;

import org.csystem.math.Fraction;
import org.csystem.util.console.Console;


/**
 * Fraction test class
 * Last Update: 24th April 2025
 * @author Onur Meşe
 */
public class FractionEqualityTest {
    public static void run(){

        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(-10, 20);
        Fraction f3 = new Fraction(1, -4);
        Fraction f4 = new Fraction(3, 4);
        Fraction f5 = new Fraction(0, 10);
        Fraction f6 = new Fraction();
        Fraction f7 = new Fraction(2, 4);
        Fraction f8 = new Fraction(-120, -160);

        Console.writeLine(f1.equals(f3));
        Console.writeLine(f2.equals(f1));
        Console.writeLine(f4.equals(f8));
        Console.writeLine(f6.equals(f5));
        Console.writeLine(f7.equals(f3));

    }
    public static void main(String[] args)
    {
        run();
    }
}