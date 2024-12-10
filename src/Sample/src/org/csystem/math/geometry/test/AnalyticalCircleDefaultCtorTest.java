package org.csystem.math.geometry.test;

import org.csystem.math.geometry.AnalyticalCircle;

import java.util.Random;
import java.util.Scanner;

public class AnalyticalCircleDefaultCtorTest {
    private static void run()
    {
        AnalyticalCircle ac = new AnalyticalCircle();

        System.out.printf("Radius:%f, Area:%f, Circumference:%f, Center:(%f, %f)%n", ac.getRadius(), ac.getArea(), ac.getCircumference(), ac.getX(), ac.getY());
    }

    public static void main(String[] args)
    {
        run();
    }
}
