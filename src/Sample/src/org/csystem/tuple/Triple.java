package org.csystem.tuple;

/**
 * Immutable class that represents triple tuple
 * Last Update: 8th Aug 2025
 * @author Java-Jan-2024 Group
 */
public class Triple<F, S, T> {
    public final F first;
    public final S second;
    public final T third;

    public static <F, S, T> Triple<F, S, T> of(F first, S second, T third)
    {
        return new Triple<>(first, second, third);
    }

    public Triple(F first, S second, T third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean equals(Object other)
    {
        return other instanceof Triple<?,?,?> t && first.equals(t.first) && second.equals(t.second) && third.equals(t.third);
    }

    public String toString()
    {
        return "(%s, %s, %s)".formatted(first, second, third);
    }

    //...
}
