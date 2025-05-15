package org.csystem.app;

import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;

import java.util.random.RandomGenerator;

class App {
    public static void main(String[] args)
    {
        RandomGenerator randomGenerator = RandomGenerator.of("Xoshiro256PlusPlus");

        Console.writeLine(StringUtil.generateRandomTextTR(randomGenerator, 10));
    }
}
