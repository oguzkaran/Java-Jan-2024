/*--------------------------------------------------------
	FILE NAME	: Circle.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 6th January 2024

	Circle class that represents a circle

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.math.geometry;

public class Circle {
    private double m_radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public void setRadius(double radius)
    {
        m_radius = Math.abs(radius);
    }

    public double getRadius()
    {
        return m_radius;
    }

    public double getArea()
    {
        return Math.PI * m_radius * m_radius;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * m_radius;
    }

    public String toString()
    {
        return String.format("Radius:%f, Area:%f, Circumference:%f", m_radius, getArea(), getCircumference());
    }
}
