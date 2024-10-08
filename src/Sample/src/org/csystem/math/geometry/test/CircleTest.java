package org.csystem.math.geometry.test;

import org.csystem.math.geometry.Circle;

import java.util.Random;
import java.util.Scanner;

public class CircleTest {
    private static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Input count:");
        int count = kb.nextInt();

        while (count-- > 0) {
            System.out.println("----------------------------------------");
            double r = random.nextDouble(-10, 11);
            Circle c = new Circle(r);

            System.out.printf("Generated Value:%f%n", r);
            System.out.printf("Radius:%f, Area:%f, Circumference:%f%n", c.getRadius(), c.getArea(), c.getCircumference());
            r = random.nextDouble(-10, 11);
            c.setRadius(r);
            System.out.printf("Generated Value:%f%n", r);
            System.out.printf("Radius:%f, Area:%f, Circumference:%f%n", c.getRadius(), c.getArea(), c.getCircumference());
            System.out.println("----------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
