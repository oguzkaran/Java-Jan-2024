/**
 * Point class that represents a complex number in math 
 * Last Update: 6th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

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
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
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