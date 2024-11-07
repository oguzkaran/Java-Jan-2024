package org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.numeric.NumberUtil.*;

public class NumberUtilGetDigitsTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        int n = kb.nextInt();

        for (int i = 0; i < n; ++i) {
            long val = r.nextLong();

            System.out.printf("%d -> ", val);
            print(getDigits(val));
            System.out.printf("%d -> ", val);
            print(getDigitsInTwos(val));
            System.out.printf("%d -> ", val);
            print(getDigitsInThrees(val));
            System.out.println("------------------------------------------------------------");
        }

        System.out.print("0 -> ");
        print(getDigits(0));
        System.out.print("0 -> ");
        print(getDigitsInTwos(0));
        System.out.print("0 -> ");
        print(getDigitsInThrees(0));

    }

    public static void main(String[] args)
    {
        run();
    }
}
