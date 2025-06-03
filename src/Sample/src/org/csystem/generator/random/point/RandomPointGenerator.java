package org.csystem.generator.random.point;

import org.csystem.math.geometry.Point;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class RandomPointGenerator {
    private final RandomGenerator m_randomGenerator;
    private final double m_origin, m_bound;

    private Point createRandomPoint()
    {
        return Point.createCartesian(m_randomGenerator.nextDouble(m_origin, m_bound), m_randomGenerator.nextDouble(m_origin, m_bound));
    }

    public RandomPointGenerator(RandomGenerator randomCardGenerator, double origin, double bound)
    {
        m_randomGenerator = randomCardGenerator;
        m_origin = origin;
        m_bound = bound;
    }


    public void addPoints(ArrayList<Point> points, int count)
    {
        for (int i = 0; i < count; i++)
            points.add(createRandomPoint());
    }

    public Point[] createPointArray(int count)
    {
        Point [] points = new Point[count];

        for (int i = 0; i < count; i++)
            points[i] = createRandomPoint();

        return points;
    }

}
