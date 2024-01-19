/*--------------------------------------------------------
	FILE NAME	: IntValue.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 13th January 2024

	Wrapper class that use cache for values in [-128, 127]

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.primitive.wrapper;

public class IntValue {
    private static final int CACHE_MIN_VALUE = -128;
    private static final int CACHE_MAX_VALUE = 127;
    private static final IntValue [] CACHE = new IntValue[CACHE_MAX_VALUE - CACHE_MIN_VALUE + 1];
    private final int m_value;

    private IntValue(int value)
    {
        m_value = value;
    }

    public static final IntValue ZERO = of(0);
    public static final IntValue ONE = of(1);

    public static IntValue of(int value)
    {
        if (value < CACHE_MIN_VALUE || value > CACHE_MAX_VALUE)
            return new IntValue(value);

        if (CACHE[value - CACHE_MIN_VALUE] == null)
            CACHE[value - CACHE_MIN_VALUE] = new IntValue(value);

        return CACHE[value - CACHE_MIN_VALUE];
    }

    public int getValue()
    {
        return m_value;
    }

    public String toString()
    {
        return String.valueOf(m_value);
    }
}
