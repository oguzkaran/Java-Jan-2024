/**
 * Immutable Point class that represents a point in geometry
 * Last Update: 6th March 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.*;

public class Point {
	private final double m_x;
	private final double m_y;

	private static Point create(double a, double b)
	{
		return new Point(a, b);
	}

	private Point(double x, double y)
	{
		m_x = x;
		m_y = y;
	}

	public static Point createCartesian(double x, double y)
	{
		return create(x, y);
	}

	public static Point createPolar(double r, double theta)
	{
		return create(r * cos(theta), r * sin(theta));
	}

	public double getX()
	{
		return m_x;
	}

	public double getY()
	{
		return m_y;
	}

	public double euclideanDistance()
	{
		return euclideanDistance(0, 0);
	}
	
	public double euclideanDistance(Point other)
	{
		return euclideanDistance(other.m_x, other.m_y);
	}
	
	public double euclideanDistance(double x, double y)
	{
		return PointCommon.euclideanDistance(m_x, m_y, x, y);
	}	

	public boolean equals(Object other)
	{
		return other instanceof Point p && PointCommon.equals(m_x, m_y, p.m_x, p.m_y);
	}

	public String toString()
	{
		return PointCommon.toString(m_x, m_y);
	}
}