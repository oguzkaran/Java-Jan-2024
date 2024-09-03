package org.csystem.util.numeric.test;

import static org.csystem.util.numeric.NumberUtil.*;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

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
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
