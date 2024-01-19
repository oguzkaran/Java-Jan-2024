/*--------------------------------------------------------
	FILE NAME	: MutablePoint.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 13th January 2024
	
	MutablePoint class that represents a 2-dimensional point
	
	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.math.geometry;

public class MutablePoint {
	private double m_x, m_y;

	private MutablePoint(double a, double b, boolean polar)
	{
		m_x = PointCommon.getXBy(polar, a, b);
		m_y = PointCommon.getYBy(polar, a, b);
	}

	public static MutablePoint createCartesian(double x, double y)
	{
		return new MutablePoint(x, y, false);
	}

	public static MutablePoint createPolar(double radius, double theta)
	{
		return new MutablePoint(radius, theta, true);
	}

	public double getX()
	{
		return m_x;
	}

	public void setX(double x)
	{
		m_x = x;
	}

	public double getY()
	{
		return m_y;
	}

	public void setY(double y)
	{
		m_y = y;
	}

	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(MutablePoint other)
	{
		return distance(other.m_x, other.m_y);
	}
	
	public double distance(double x, double y)
	{
		return PointCommon.distance(m_x, m_y, x, y);
	}
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		m_x += dx;
		m_y += dy;
	}
	
	public String toString()
	{
		return PointCommon.toString(m_x, m_y);
	}
}
