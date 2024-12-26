package org.csystem.app.generator;

import org.csystem.generator.object.ObjectArrayGenerator;
import org.csystem.math.Complex;
import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.Point;
import org.csystem.wrapper.primitive.IntValue;

import java.util.Scanner;

public class DemoObjectArrayGeneratorApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a number:");
        int count = kb.nextInt();
        ObjectArrayGenerator generator = new ObjectArrayGenerator();

        for (Object o : generator.createObjects(count)) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.printf("Dynamic type:%s%n", o.getClass().getName());

            if (o instanceof String s) {
                String upper = s.toUpperCase();

                System.out.printf("Text:%s, Upper:%s%n", s, upper);
            }
            else if (o instanceof Integer) {
                int val = (int)o;

                System.out.printf("%d * %d = %d%n", val, val, val * val);
            }
            else if (o instanceof Character) {
                char ch = (char)o;

                System.out.printf("ch = %c%n", ch);
            }
            else if (o instanceof Boolean) {
                boolean flag = (boolean)o;

                System.out.printf("flag = %b%n", flag);
            }
            else if (o instanceof Point p)
                System.out.printf("Distance to origin:%f%n", p.euclideanDistance());
            else if (o instanceof Circle c)
                System.out.printf("Radius:%f, Area:%f, Circumference:%f%n", c.getRadius(), c.getArea(), c.getCircumference());
            else if (o instanceof Complex c)
                System.out.printf("||%s|| = %f%n", c.toString(), c.getLength());

            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}