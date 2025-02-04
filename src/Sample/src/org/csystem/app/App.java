package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        Console.writeLine(Util.mod(10, 3));
        Console.writeLine(Util.mod(-10, 3));
        Console.writeLine(Util.mod(11, 6));
        Console.writeLine(Util.mod(-11, 6));
    }
}

class Util {
    public static int mod(int a, int b)
    {
        int result = a % b;

        return result < 0 ? result + b : result;
    }
}