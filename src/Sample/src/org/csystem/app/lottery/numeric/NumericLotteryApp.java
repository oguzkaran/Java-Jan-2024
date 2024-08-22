package org.csystem.app.lottery.numeric;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery numericLottery = new NumericLottery(new Random());

        while (true) {
            System.out.print("Kaç tane kupon oynamak istersiniz?");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0) {
                System.out.println("Lütfen pozitif bir sayı giriniz");
                continue;
            }

            while (n-- > 0)
                ArrayUtil.print(numericLottery.getNumbers(), 2);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
