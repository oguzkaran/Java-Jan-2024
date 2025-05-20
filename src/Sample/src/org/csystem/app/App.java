package org.csystem.app;

import org.csystem.util.console.Console;
import org.csystem.util.random.RandomGeneratorAlgorithm;

import java.util.random.RandomGenerator;

class App {
    public static void main(String[] args)
    {
        for (RandomGeneratorAlgorithm rga : RandomGeneratorAlgorithm.values()) {
            RandomGenerator rg = rga.create();

            Console.write("%02d ", rg.nextInt(1, 99));
        }

        Console.writeLine();
    }
}
