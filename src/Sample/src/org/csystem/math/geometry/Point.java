/*--------------------------------------------------------
	FILE NAME	: Point.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 13th January 2024
	
	Immutable Point class that represents a 2-dimensional
	point
	
	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.math.geometry;

public class Point {
	private final double m_x, m_y;

	private Point(double a, double b, boolean polar)
	{
		m_x = PointCommon.getXBy(polar, a, b);
		m_y = PointCommon.getYBy(polar, a, b);
	}

	public static Point createCartesian(double x, double y)
	{
		return new Point(x, y, false);
	}

	public static Point createPolar(double radius, double theta)
	{
		return new Point(radius, theta, true);
	}

	public double getX()
	{
		return m_x;
	}

	public double getY()
	{
		return m_y;
	}


	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.m_x, other.m_y);
	}
	
	public double distance(double x, double y)
	{
		return PointCommon.distance(m_x, m_y, x, y);
	}
	
	public String toString()
	{
		return PointCommon.toString(m_x, m_y);
	}
}
