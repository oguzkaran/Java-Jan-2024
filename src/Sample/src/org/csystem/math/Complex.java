/**
 * Complex class that represents a complex number in math
 * Last Update: 6th March 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.math;

import static java.lang.Math.sqrt;

public class Complex {
	private static final double DELTA = 0.00001;
	private final double m_real;
	private final double m_imag;
	
	private static Complex add(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 + re2, im1 + im2);
	}
	
	private static Complex subtract(double re1, double im1, double re2, double im2)
	{
		return add(re1, im1, -re2, -im2);		
	}
	
	public Complex()
	{
		m_real = m_imag = 0;
	}
	
	public Complex(double real)
	{
		m_real = real;
		m_imag = 0;
	}
	
	public Complex(double real, double imag)
	{
		m_real = real;
		m_imag = imag;
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.m_real, z.m_imag);
	}
	
	public Complex add(Complex other)
	{
		return add(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	public Complex add(double val)
	{
		return add(m_real, m_imag, val, 0);
	}	
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.m_real, z.m_imag);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(m_real, m_imag, val, 0);
	}

	public Complex getConjugate()
	{				
		return new Complex(m_real, -m_imag);
	}
	
	public double getNorm()
	{
		return sqrt(m_real * m_real + m_imag * m_imag);
	}
	
	public double getLength()
	{
		return getNorm();
	}

	public boolean equals(Object other)
	{
		return other instanceof Complex z && Math.abs(m_real - z.m_real) < DELTA && Math.abs(m_imag - z.m_imag) < DELTA;
	}

	public String toString()
	{
		return "(%.2f, %.2f)".formatted(m_real, m_imag);
	}
}
