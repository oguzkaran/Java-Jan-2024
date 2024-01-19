package org.csystem.math.geometry.test;

import org.csystem.math.geometry.Point;

import java.util.Random;
import java.util.Scanner;

public class PointPolarTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            double radius = random.nextDouble(-10, 11);
            double theta = random.nextDouble(-2 * Math.PI, 2 * Math.PI);

            System.out.println("--------------------------------------------------");

            System.out.printf("Generated radius:%f%n", radius);
            System.out.printf("Generated theta:%f%n", theta);
            Point p = Point.createPolar(radius, theta);

            System.out.printf("Point:%s%n", p.toString());

            System.out.println("--------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
