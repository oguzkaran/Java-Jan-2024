package org.csystem.app;

import java.util.Random;

class App {
    public static void main(String[] args)
    {
        Color color1 = Color.randomColor(new Random());
        System.out.println("-----------------------");
        Color color2 = Color.randomColor(new Random());

        System.out.println(color1.toString());
        System.out.println(color2.toString());
    }
}

enum Color {
    RED(), GREEN(), BLUE(), WHITE, BLACK;
    private static final Color [] VALUES = values();
    Color()
    {
        System.out.println("I am a default ctor");
    }

    public static Color randomColor(Random random)
    {
        return VALUES[random.nextInt(VALUES.length)];
    }
}