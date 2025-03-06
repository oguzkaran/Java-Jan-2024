/**
 * AnalyticalCircle class that represents a circle in Cartesian System
 * Last Update: 6th March 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

public class AnalyticalCircle extends Circle {
    private static final double DELTA = 0.0000001;
    private final MutablePoint m_center;

    public AnalyticalCircle()
    {
        this(0, 0);
    }

    public AnalyticalCircle(double radius)
    {
        this(radius, 0, 0);
    }

    public AnalyticalCircle(double x, double y)
    {
        this(0, x, y);
    }

    public AnalyticalCircle(double radius, double x, double y)
    {
        super(radius);
        m_center = MutablePoint.createCartesian(x, y);
    }

    public double getX()
    {
        return m_center.getX();
    }

    public void setX(double x)
    {
        m_center.setX(x);
    }

    public double getY()
    {
        return m_center.getY();
    }

    public void setY(double y)
    {
        m_center.setY(y);
    }

    public void setCenter(double x, double y)
    {
        setX(x);
        setY(y);
    }

    public void offset(double dx, double dy)
    {
        m_center.offset(dx, dy);
    }

    public void offset(double dxy)
    {
        offset(dxy, dxy);
    }

    public boolean isTangent(AnalyticalCircle other)
    {
        return Math.abs(centersDistance(other) - getRadius() - other.getRadius()) < DELTA;
    }

    public double centersDistance(AnalyticalCircle other)
    {
        return m_center.euclideanDistance(other.m_center);
    }

    public boolean equals(Object other)
    {
        return other instanceof AnalyticalCircle ac && super.equals(other) && m_center.equals(ac.m_center);
    }

    public String toString()
    {
        return "%s, Center:%s".formatted(super.toString(), m_center);
    }
}
