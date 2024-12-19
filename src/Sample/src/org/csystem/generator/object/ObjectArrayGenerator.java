package org.csystem.generator.object;

import org.csystem.math.Complex;
import org.csystem.math.geometry.Circle;
import org.csystem.math.geometry.Point;
import org.csystem.util.string.StringUtil;
import org.csystem.wrapper.primitive.IntValue;

import java.util.Random;

public class ObjectArrayGenerator {
    private final Random m_random = new Random();

    //StringEN, IntValue, Point, Circle, Complex
    private Object createObject()
    {
        return switch (m_random.nextInt(5)) {
            case 0 -> StringUtil.generateRandomTextEN(m_random, m_random.nextInt(5, 11));
            case 1 -> IntValue.of(m_random.nextInt(-128, 128));
            case 2 -> Point.createCartesian(m_random.nextDouble(-100, 100), m_random.nextDouble(-100, 100));
            case 3 -> new Circle(m_random.nextDouble(-10, 10));
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
