package org.csystem.collection;

import java.util.Arrays;

public class CSDArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E [] m_elements;
    private int m_index;

    private void throwIllegalArgumentException(String message)
    {
        throw new IllegalArgumentException(message);
    }

    private void throwIndexOutOfBoundsException(String message)
    {
        throw new IndexOutOfBoundsException(message);
    }

    private void checkCapacity(int capacity)
    {
        if (capacity < 0)
            throwIllegalArgumentException(String.format("Capacity must be non-negative:%d", capacity));
    }

    private void checkIndex(int index)
    {
        if (index < 0 || index >= m_index)
            throwIndexOutOfBoundsException(String.format("Index out of bounds:%d", index));
    }

    private void changeCapacity(int capacity)
    {
        m_elements = Arrays.copyOf(m_elements, capacity);
    }

    private void increaseCapacityIfNecessary()
    {
        if (m_elements.length == m_index)
            changeCapacity(m_elements.length == 0 ? 1 : m_elements.length * 2);
    }

    public CSDArrayList()
    {
        m_elements = (E[])new Object[DEFAULT_CAPACITY];
    }

    public CSDArrayList(int initialCapacity)
    {
        checkCapacity(initialCapacity);
        m_elements = (E[])new Object[initialCapacity];
    }

    public boolean add(E element)
    {
        increaseCapacityIfNecessary();
        m_elements[m_index++] = element;

        return true;
    }

    public void add(int index, E element)
    {
        increaseCapacityIfNecessary();

        for (int i = m_index++; i > index; --i)
            m_elements[i] = m_elements[i - 1];

        m_elements[index] = element;
    }

    public int capacity()
    {
        return m_elements.length;
    }

    public void clear()
    {
        for (int i = 0; i < m_index; ++i)
            m_elements[i] = null;

        m_index = 0;
    }

    public void ensureCapacity(int minCapacity)
    {
        if (minCapacity > m_elements.length)
            changeCapacity(Math.max(minCapacity, m_elements.length * 2));
    }

    public E get(int index)
    {
        checkIndex(index);

        return m_elements[index];
    }

    public E remove(int index)
    {
        checkIndex(index);
        E oldElement = m_elements[index];

        for (int i = index; i < m_index - 1; ++i)
            m_elements[i] = m_elements[i + 1];

        m_elements[--m_index] = null;

        return oldElement;
    }

    public E set(int index, E element)
    {
        checkIndex(index);
        E oldElement = m_elements[index];

        m_elements[index] = element;

        return oldElement;
    }

    public int size()
    {
        return m_index;
    }

    public void trimToSize()
    {
        if (m_elements.length != m_index)
            changeCapacity(m_index);
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < m_index; ++i)
            sb.append(m_elements[i]).append(", ");

        return (m_index != 0 ? sb.substring(0, sb.length() - 2) : sb.toString()) + "]";
    }
}
