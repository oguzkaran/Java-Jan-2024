package org.csystem.app.random.lottery;

import java.util.Random;

public class NumericLottery {
    private final Random m_random;

    private boolean[] getFlags()
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
        int [] numbers = new int[6];
        int idx = 0;

        for (int i = 1; i < 50; ++i)
            if (flags[i])
                numbers[idx++] = i;

        return numbers;
    }
    
    public NumericLottery(Random random)
    {
        m_random = random;
    }

    public int [] getNumbers()
    {
        return getNumbers(getFlags());
    }

    public int [][] getNumbers(int count)
    {
        int [][] numbers = new int[count][];

        for (int i = 0; i < count; ++i)
            numbers[i] = getNumbers();

        return numbers;
    }
}
