/**
 * Point class that represents a point in geometry
 * Last Update: 15th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
	public double x;
	public double y;

	public Point()
	{		
	}

	public Point(double a)
	{
		x = a;		
	}
	
	public Point(double a, double b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(double a, double b)
	{
		return sqrt(pow(x - a, 2) + pow(y - b, 2));
	}	
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return "(%f, %f)".formatted(x, y);
	}
}