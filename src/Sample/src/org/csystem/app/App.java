package org.csystem.app;

import org.csystem.math.geometry.Point;

class App {
    public static void main(String[] args)
    {
        Point pc = Point.createCartesian(100, 100);
        Point pp = Point.createPolar(100, 100);

        System.out.println(pc.toString());
        System.out.println(pp.toString());
    }
}
