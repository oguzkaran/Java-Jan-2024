package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class App {
    public static void main(String[] args)
    {
        ArrayList texts = new ArrayList();
        Random random = new Random();
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Bir sayı giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            texts.add(StringUtil.generateRandomTextTR(random, n));
        }

        int size = texts.size();

        for (Object o : texts) {
            String text = (String)o;

            System.out.println(text);
        }
    }
}