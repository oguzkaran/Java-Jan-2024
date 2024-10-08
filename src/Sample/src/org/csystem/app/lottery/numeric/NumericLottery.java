package org.csystem.app.lottery.numeric;

import java.util.Random;

public class NumericLottery {
    private Random m_random;

    private boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];

        for (int i = 0; i < 6; ++i) {
            int val;

            do
                val = m_random.nextInt(1, 50);
            while (flags[val]);

            flags[val] = true;
        }

        return flags;
    }

    private int [] getNumbers(boolean [] flags)
    {
        int [] a = new int[6];
        int idx = 0;

        for (int i = 1; i < flags.length; ++i)
            if (flags[i])
                a[idx++] = i;

        return a;
    }

    public NumericLottery(Random r)
    {
        m_random = r;
    }

    public int [] getNumbers()
    {
        return getNumbers(getFlags());
    }
}