package org.csystem.app.lottery.numeric;

import java.util.random.RandomGenerator;

public class NumericLottery {
    private final RandomGenerator m_randomGenerator;

    private boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];

        for (int i = 0; i < 6; ++i) {
            int val;

            do
                val = m_randomGenerator.nextInt(1, 50);
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

    public NumericLottery(RandomGenerator randomGenerator)
    {
        if (randomGenerator == null)
            throw new IllegalArgumentException("Argument can not be null");

        m_randomGenerator = randomGenerator;
    }

    public int [] getNumbers()
    {
        return getNumbers(getFlags());
    }
}