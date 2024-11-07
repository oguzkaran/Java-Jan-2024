package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.reverse;

public class ArrayUtilReverseCharArrayTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Bir yazı giriniz:");
            String text = kb.nextLine();

            if ("elma".equals(text))
                break;

            char [] chars = text.toCharArray();

            System.out.println(text);
            reverse(chars);
            for (char c : chars)
                System.out.printf("%c", c);

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
