/*--------------------------------------------------------
	FILE NAME	: Complex.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 13th January 2024
	
	Complex class that represents a complex number
	
	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.math;

public class Complex {
	private double m_real, m_imag;
	
	private static Complex add(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 + re2, im1 + im2);
	}
	
	private static Complex subtract(double re1, double im1, double re2, double im2)
	{
		return add(re1, im1, -re2, -im2);
	}
	
	private static Complex multiply(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 * re2 - im1 * im2, re1 * im2 + re2 * im1);
	}
	
	public Complex()
	{
	}
	
	public Complex(double re)
	{
		m_real = re;
	}
	
	public Complex(double re, double im)
	{
		m_real = re;
		m_imag = im;
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.m_real, z.m_imag);
	}
	
	public Complex add(double val)
	{
		return add(m_real, m_imag, val, 0);
	}
	
	public Complex add(Complex other)
	{
		return add(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.m_real, z.m_imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(m_real, m_imag, val, 0);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	public static Complex multiply(double val, Complex z)
	{
		return multiply(val, 0, z.m_real, z.m_imag);
	}
	
	public Complex multiply(double val)
	{
		return multiply(m_real, m_imag, val, 0);
	}
	
	public Complex multiply(Complex other)
	{
		return multiply(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	public Complex conjugate()
	{
		return new Complex(m_real, -m_imag);
	}
	
	public Complex negate()
	{
		return new Complex(-m_real, -m_imag);
	}
	
	public void inc()
	{
		++m_real;
	}
	
	public void dec()
	{
		--m_real;
	}

	public String toString()
	{
		return String.format("%f + %f * i", m_real, m_imag);
	}
}


