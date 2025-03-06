package org.csystem.app;

import org.csystem.math.geometry.Point;
import org.csystem.util.console.Console;

import java.util.ArrayList;
import java.util.Random;

class App {
    public static void main(String[] args)
    {
        ArrayList  list = new ArrayList();
        Random r = new Random();

        while (true) {
            int x = r.nextInt(-10, 10);
            int y = r.nextInt(-10, 10);

            list.add(Point.createCartesian(x, y));

            if (x == 0 && y == 0)
                break;
        }

        Console.writeLine("Size:%d", list.size());
        int index = list.indexOf(Point.createCartesian(0, 0));

        Console.writeLine("Index:%d", index);
    }
}


