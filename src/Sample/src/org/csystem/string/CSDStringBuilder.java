/**
 * Mutable class for some string operations
 * Last Update: 15th May 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.string;

import java.util.Arrays;

public class CSDStringBuilder implements CharSequence {
    private static final int DEFAULT_CAPACITY_IF_CURRENT_ZERO = 1;
    private static final int CAPACITY_INCREMENT_FACTOR = 2;
    private static final int DEFAULT_CAPACITY = 16;
    private char [] m_chars;
    private int m_index;

    private boolean checkCapacity(String str)
    {
        return m_index + str.length() <= m_chars.length;
    }

    private int calculateNewCapacity(char [] str)
    {
        int result = m_chars.length == 0 ? DEFAULT_CAPACITY_IF_CURRENT_ZERO : m_chars.length;

        while ((result = result * CAPACITY_INCREMENT_FACTOR) < m_index + str.length)
            ;

        return result;
    }

    private void enlargeCapacity(int newCapacity)
    {
        m_chars = Arrays.copyOf(m_chars, newCapacity);
    }

    public CSDStringBuilder()
    {
        this(DEFAULT_CAPACITY);
    }

    public CSDStringBuilder(int capacity)
    {
        m_chars = new char[capacity];
    }

    public CSDStringBuilder(String str)
    {
        m_chars = str.toCharArray();
        m_index += str.length();
    }

    public CSDStringBuilder append(String str)
    {
        return append(str.toCharArray());
    }

    public CSDStringBuilder append(char ch)
    {
        return append(String.valueOf(ch));
    }

    public CSDStringBuilder append(int a)
    {
        return append(String.valueOf(a));
    }

    public CSDStringBuilder append(long a)
    {
        return append(String.valueOf(a));
    }

    public CSDStringBuilder append(double a)
    {
        return append(String.valueOf(a));
    }

    public CSDStringBuilder append(char [] str)
    {
        if (!checkCapacity(String.valueOf(str)))
            enlargeCapacity(calculateNewCapacity(str));

        System.arraycopy(str, 0, m_chars, m_index, str.length);
        m_index += str.length;

        return this;
    }

    public int capacity()
    {
        return m_chars.length;
    }

    public char charAt(int index)
    {
        return m_chars[index];
    }

    public CSDStringBuilder deleteCharAt(int index)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public CSDStringBuilder delete(int start, int end)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public void ensureCapacity(int minCapacity)
    {
        if (minCapacity > m_chars.length)
            enlargeCapacity(Math.max(minCapacity, m_chars.length * CAPACITY_INCREMENT_FACTOR));
    }

    public int indexOf(String str)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public int indexOf(String str, int startIndex)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public CSDStringBuilder insert(int index, String str)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public CSDStringBuilder insert(int index, char ch)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public CSDStringBuilder insert(int index, int a)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public CSDStringBuilder insert(int index, long a)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public CSDStringBuilder insert(int index, double a)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public CSDStringBuilder insert(int index, char [] str)
    {
        throw new UnsupportedOperationException("TODO");
    }

    //...

    public CharSequence subSequence(int start, int end)
    {
        return String.valueOf(m_chars, start, end - start); //ankara
    }

    public int length()
    {
        return m_index;
    }

    public void trimToSize()
    {
        enlargeCapacity(m_index);
    }

    public boolean equals(Object other)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public String toString()
    {
        return String.valueOf(m_chars, 0, m_index);
    }

    //...
}
