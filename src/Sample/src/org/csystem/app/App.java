package org.csystem.app;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;

import java.util.Arrays;
import java.util.Random;

class App {
    public static void main(String[] args)
    {
        int [] a = ArrayUtil.generateRandomArray(new Random(), 10, 10, 20);

        for (int val : a)
            Console.write("%d ",val);

        Console.writeLine("\n///////////////////////////");

        int length = Console.readInt("Input length:");

        Arrays.stream(a).filter(v -> v > length).forEach(v -> Console.write("%d ", v));

        Console.writeLine();
    }
}
