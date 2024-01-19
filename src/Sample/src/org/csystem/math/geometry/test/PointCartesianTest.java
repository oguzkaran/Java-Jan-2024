package org.csystem.math.geometry.test;

import org.csystem.math.geometry.Point;

import java.util.Random;
import java.util.Scanner;

public class PointCartesianTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            double x = random.nextDouble(-100, 100);
            double y = random.nextDouble(-100, 100);

            System.out.println("--------------------------------------------------");

            System.out.printf("Generated coordinates:(%f, %f)%n", x, y);

            Point p = Point.createCartesian(x, y);

            System.out.printf("Point:%s%n", p.toString());

            System.out.println("--------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
