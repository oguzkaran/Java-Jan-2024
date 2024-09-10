package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

public class StringUtilJoinTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Bir sayı giriniz:");
        String [] s = StringUtil.generateRandomTextsTR(random, kb.nextInt(), 5, 16);

        System.out.printf("(%s)", StringUtil.join(s, "--"));
    }

    public static void main(String[] args)
    {
        run();
    }
}
