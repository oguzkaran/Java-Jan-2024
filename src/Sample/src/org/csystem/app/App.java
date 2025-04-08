package org.csystem.app;

import org.csystem.util.console.Console;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        int a = Console.readInt("Input first number:", "Invalid number!");
        int b = Console.readInt("Input second number:", "Invalid number!");

        Console.writeLine(a * b);

    }
}

class Util {
    public static void doWork()
    {
        try {
            Scanner kb = new Scanner(System.in);

            System.out.print("Input a number:");
            double a = kb.nextInt();
            double result;
            result = MathUtil.log10(a);

            System.out.printf("log10(%f) = %f%n", a, result);
        }
        catch (NegativeException ex) {
            System.out.println("Negative value not allowed");;
            throw ex; //rethrow
        }

        System.out.println("doWork ends!...");
    }
}

class MathUtil {
    public static double log10(double a)
    {
        if (a < 0)
            throw new NegativeException();

        if (a == 0)
            throw new ZeroException();

        return Math.log10(a);
    }
}

class ZeroException extends RuntimeException {
    //...
}


class NegativeException extends RuntimeException {
    //...
}

