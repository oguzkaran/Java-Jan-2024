package org.csystem.primitive.wrapper.test;

import org.csystem.primitive.wrapper.IntValue;

public class IntValueOfCacheTest {
    public static void run()
    {
        IntValue iVal1 = IntValue.of(-128);
        IntValue iVal2 = IntValue.of(-128);
        IntValue iVal3 = IntValue.of(127);
        IntValue iVal4 = IntValue.of(127);
        IntValue iVal5 = IntValue.of(67);
        IntValue iVal6 = IntValue.of(67);
        IntValue iVal7 = IntValue.of(128);
        IntValue iVal8 = IntValue.of(128);

        System.out.println(iVal1 == iVal2 ? "Aynı nesne" : "Farklı nesneler");
        System.out.println(iVal3 == iVal4 ? "Aynı nesne" : "Farklı nesneler");
        System.out.println(iVal5 == iVal6 ? "Aynı nesne" : "Farklı nesneler");
        System.out.println(iVal7 == iVal8 ? "Aynı nesne" : "Farklı nesneler");
    }

    public static void main(String[] args)
    {
        run();
    }
}
