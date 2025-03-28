package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        Sample s2 = new Sample(10);
    }
}

class Sample {
    {
        Console.writeLine("non-static initializer");
    }

    public Sample()
    {
        Console.writeLine("I am a default ctor");
    }

    public Sample(int a)
    {
        this();
        Console.writeLine("I am a ctor with parameter type int");
    }
}