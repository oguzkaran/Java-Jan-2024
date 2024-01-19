package org.csystem.util.numeric.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.numeric.NumberUtil;

import java.util.Random;
import java.util.Scanner;

public class NumberUtilDigitsTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();
        Random random = new Random();

        for (int i = 0; i < count; ++i) {
            System.out.println("----------------------------------------------------");
            long value = random.nextLong();

            System.out.printf("%d -> ", value);
            ArrayUtil.print(NumberUtil.digits(value));
            System.out.println("----------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
