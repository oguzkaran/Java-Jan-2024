package org.csystem.tuple;

/**
 * Immutable class that represents pair tuple
 * Last Update: 6th Aug 2025
 * @author Java-Jan-2024 Group
 */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public static <F, S> Pair<F, S> of(F first, S second)
    {
        return new Pair<>(first, second);
    }

    public Pair(F first, S second)
    {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object other)
    {
        return other instanceof Pair<?, ?> p && first.equals(p.first) && second.equals(p.second);
    }

    public String toString()
    {
        return "(%s, %s)".formatted(first, second);
    }
    //...
}
