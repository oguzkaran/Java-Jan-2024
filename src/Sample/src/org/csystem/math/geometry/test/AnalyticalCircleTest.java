package org.csystem.math.geometry.test;

import org.csystem.math.geometry.AnalyticalCircle;
import org.csystem.math.geometry.Circle;

import java.util.Random;
import java.util.Scanner;

public class AnalyticalCircleTest {
    private static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Input count:");
        int count = kb.nextInt();

        while (count-- > 0) {
            System.out.println("----------------------------------------");
            double r = random.nextDouble(-10, 11);
            double y = random.nextDouble(-100, 101);
            double x = random.nextDouble(-100, 101);
            AnalyticalCircle ac = new AnalyticalCircle(r, x, y);

            System.out.printf("Generated Values -> r = %f, x = %f, y = %f%n", r, x, y);
            System.out.printf("Radius:%f, Area:%f, Circumference:%f, Center:(%f, %f)%n", ac.getRadius(), ac.getArea(), ac.getCircumference(), ac.getX(), ac.getY());
            y = random.nextDouble(-100, 101);
            x = random.nextDouble(-100, 101);
            ac.setX(x);
            ac.setY(y);
            System.out.printf("Generated Values -> x = %f, y = %f%n", x, y);
            System.out.printf("Radius:%f, Area:%f, Circumference:%f, Center:(%f, %f)%n", ac.getRadius(), ac.getArea(), ac.getCircumference(), ac.getX(), ac.getY());
            System.out.println("----------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
