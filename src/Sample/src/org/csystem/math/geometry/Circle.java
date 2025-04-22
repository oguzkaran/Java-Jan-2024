/**
 * Circle class that represents a circle in geometry
 * Last Update: 22nd April 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.PI;

public class Circle {
    protected static final double DELTA = 0.000001;
    private double m_r;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public void setRadius(double radius)
    {
        if (radius < 0)
            throw new IllegalArgumentException("Radius can not be negative:%f".formatted(radius));

        m_r = radius;
    }

    public double getRadius()
    {
        return m_r;
    }

    public double getArea()
    {
        return PI * m_r * m_r;
    }

    public double getCircumference()
    {
        return 2 * PI * m_r;
    }

    public boolean equals(Object other)
    {
        return other instanceof Circle c &&Math.abs(m_r - c.m_r) < DELTA;
    }

    public String toString()
    {
        return "Radius = %f, Area = %f, Circumference = %f".formatted(m_r, getArea(), getCircumference());
    }
}
