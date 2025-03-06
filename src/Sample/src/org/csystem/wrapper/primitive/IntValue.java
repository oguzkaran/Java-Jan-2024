/**
 * Immutable class that wraps an int value
 * Last Update: 6th March 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.wrapper.primitive;

public final class IntValue {
    private static final int CACHE_MIN = -128;
    private static final int CACHE_MAX = 127;
    private static final int INDEX_DIFFERENCE = 128;

    private static final IntValue [] CACHE = new IntValue[CACHE_MAX - CACHE_MIN + 1];
    private final int m_value;

    private IntValue(int value)
    {
        m_value = value;
    }

    public static IntValue of(int value)
    {
        if (value < CACHE_MIN || value > CACHE_MAX)
            return new IntValue(value);

        if (CACHE[value + INDEX_DIFFERENCE] == null)
            CACHE[value + INDEX_DIFFERENCE] = new IntValue(value);

        return CACHE[value + INDEX_DIFFERENCE];
    }

    public int getValue()
    {
        return m_value;
    }

    public boolean equals(Object other)
    {
        return other instanceof IntValue i && i.m_value == m_value;
    }

    public String toString()
    {
        return String.valueOf(m_value);
    }
}
