/**
 * Point class that represents a point in geometry
 * Last Update: 17th October 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.*;

public class Point {
	private double m_x;
	private double m_y;

	private static Point create(double a, double b)
	{
		Point p = new Point();

		p.m_x = a;
		p.m_y = b;

		return p;
	}

	private Point()
	{
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
	
	public double distance(Point other)
	{
		return distance(other.m_x, other.m_y);
	}
	
	public double distance(double x, double y)
	{
		return sqrt(pow(m_x - x, 2) + pow(m_y - y, 2));
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
		return "(%f, %f)".formatted(m_x, m_y);
	}
}