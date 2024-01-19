package org.csystem.math.geometry.test;

import org.csystem.math.geometry.Circle;

import java.util.Random;
import java.util.Scanner;

public class CircleSetterTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();
        Circle c = new Circle();
        System.out.printf("Circle:%s%n", c.toString());

        for (int i = 0; i < count; ++i) {
            double radius = random.nextDouble(-10, 11);

            System.out.println("--------------------------------------------------");
            System.out.printf("Generated radius:%f%n", radius);
            c.setRadius(radius);
            System.out.printf("Circle:%s%n", c.toString());
            System.out.println("--------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
