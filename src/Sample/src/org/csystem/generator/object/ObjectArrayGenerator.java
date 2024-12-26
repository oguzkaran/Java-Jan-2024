package org.csystem.generator.object;

import org.csystem.math.Complex;
import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.Point;
import org.csystem.util.string.StringUtil;

import java.util.Random;

public class ObjectArrayGenerator {
    private final Random m_random = new Random();

    //StringEN, Integer, Character, Boolean, Point, Circle, Complex
    private Object createObject()
    {
        return switch (m_random.nextInt(7)) {
            case 0 -> StringUtil.generateRandomTextEN(m_random, m_random.nextInt(5, 11));
            case 1 -> m_random.nextInt(-128, 128);
            case 2 -> (char)((m_random.nextBoolean() ? 'A' : 'a') + m_random.nextInt(26));
            case 3 -> m_random.nextBoolean();
            case 4 -> Point.createCartesian(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 5 -> new Circle(m_random.nextDouble(-10, 10));
            default -> new Complex(m_random.nextDouble(-20, 20), m_random.nextDouble(-20, 20));
        };
    }

    public Object [] createObjects(int count)
    {
        Object [] objects = new Object[count];

        for (int i = 0; i < count; ++i)
            objects[i] = createObject();

        return objects;
    }
}
