package org.csystem.app.lottery.numeric;

import java.util.Arrays;
import java.util.Random;

public class NumericLottery {
    public Random random;

    public NumericLottery(Random r)
    {
        random = r;
    }

    public int [] getNumbers()
    {
        int [] a = new int[6];

        for (int i = 0; i < 6; ++i) {
            boolean repeat;

            do {
                repeat = false;
                a[i] = random.nextInt(1, 50);

                for (int k = 0; k < i; ++k)
                    if (a[k] == a[i]) {
                        repeat = true;
                        break;
                    }
            } while (repeat);
        }

        Arrays.sort(a);

        return a;
    }
}
