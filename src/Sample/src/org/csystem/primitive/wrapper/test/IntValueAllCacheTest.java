package org.csystem.primitive.wrapper.test;

import org.csystem.primitive.wrapper.IntValue;

public class IntValueAllCacheTest {
    public static void run()
    {
        for (int v = -128; v <= 127; ++v) {
            IntValue iVal1 = IntValue.of(v);
            IntValue iVal2 = IntValue.of(v);

            System.out.println(iVal1 == iVal2 ? "Aynı nesne" : "Farklı nesneler");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
