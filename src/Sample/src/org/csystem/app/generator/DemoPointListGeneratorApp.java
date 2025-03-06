package org.csystem.app.generator;

import org.csystem.generator.random.point.RandomPointGenerator;
import org.csystem.util.console.Console;

import java.util.ArrayList;
import java.util.Random;

public class DemoPointListGeneratorApp {
    public static void run()
    {
        RandomPointGenerator generator = new RandomPointGenerator(new Random(), -1000, 1000);
        int count = Console.readInt("Input number of points:");

        ArrayList points = new ArrayList<>();

        generator.addPoints(points, count);

        for (Object o : points)
            Console.write("%s ", o);

        Console.writeLine();

        Console.writeLine(points);
    }

    public static void main(String[] args)
    {
        run();
    }
}