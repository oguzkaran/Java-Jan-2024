package org.csystem.app;

import java.util.InputMismatchException;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        try {
            Util.doWork();
        }
        catch (InputMismatchException ignore) {
            System.out.println("Invalid numeric value");
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("finally in main");
        }

        System.out.println("main ends!...");
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
        finally {
            System.out.println("finally in doWork");
        }

        System.out.println("doWork ends!...");
    }
}

class MathUtil {
    public static double log10(double a)
    {
        if (a < 0)
            throw new NaNException("Value %f can not be negative".formatted(a));

        if (a == 0)
            throw new NegativeInfinityException("Value can not be zero");

        return Math.log10(a);
    }
}

class NegativeInfinityException extends MathException {
    public NegativeInfinityException()
    {
        this(null);
    }

    public NegativeInfinityException(String message)
    {
        super(message, MatExceptionStatus.NEGATIVE_INFINITY);
    }
}

class NaNException extends MathException {
    public NaNException()
    {
        this(null);
    }

    public NaNException(String message)
    {
        super(message, MatExceptionStatus.NAN);
    }
}


class MathException extends RuntimeException {
    private final MatExceptionStatus m_matExceptionStatus;

    public MathException(String message, MatExceptionStatus matExceptionStatus)
    {
        super(message);
        m_matExceptionStatus = matExceptionStatus;
    }

    public String getMessage()
    {
        return "Message:%s, Status:%s".formatted(super.getMessage(), m_matExceptionStatus);
    }

    public MatExceptionStatus getMatExceptionStatus()
    {
        return m_matExceptionStatus;
    }
}

enum MatExceptionStatus {
    NAN, NEGATIVE, ZERO, INFINITY, POSITIVE_INFINITY, NEGATIVE_INFINITY
}