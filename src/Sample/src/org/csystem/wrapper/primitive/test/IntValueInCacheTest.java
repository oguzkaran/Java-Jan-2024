package org.csystem.wrapper.primitive.test;

import org.csystem.wrapper.primitive.IntValue;

public class IntValueInCacheTest {
    public static void run()
    {
        int value = -128;
        IntValue intValue1 = IntValue.of(value);
        IntValue intValue2 = IntValue.of(value);

        System.out.println(intValue1 == intValue2 ? "Aynı nesne" : "Farklı nesneler");
    }

    public static void main(String[] args)
    {
        run();
    }
}
