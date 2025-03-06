/**
 * Mutable Point class that represents a point in geometry
 * Last Update: 6th March 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.*;

public class MutablePoint {
	private double m_x;
	private double m_y;

	private static MutablePoint create(double a, double b)
	{
		return new MutablePoint(a, b);
	}

	private MutablePoint(double x, double y)
	{
		m_x = x;
		m_y = y;
	}

	public static MutablePoint createCartesian(double x, double y)
	{
		return create(x, y);
	}

	public static MutablePoint createPolar(double r, double theta)
	{
		return create(r * cos(theta), r * sin(theta));
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

	public double euclideanDistance()
	{
		return euclideanDistance(0, 0);
	}
	
	public double euclideanDistance(MutablePoint other)
	{
		return euclideanDistance(other.m_x, other.m_y);
	}
	
	public double euclideanDistance(double x, double y)
	{
		return PointCommon.euclideanDistance(m_x, m_y, x, y);
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

	public boolean equals(Object other)
	{
		return other instanceof MutablePoint p && PointCommon.equals(m_x, m_y, p.m_x, p.m_y);
	}

	public String toString()
	{
		return PointCommon.toString(m_x, m_y);
	}
}