/**
 * MutableComplex class that represents a complex number in math
 * Last Update: 31st October 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math;

import static java.lang.Math.sqrt;

public class MutableComplex {
	private static final double DELTA = 0.00001;
	private double m_real;
	private double m_imag;

	private static MutableComplex add(double re1, double im1, double re2, double im2)
	{
		return new MutableComplex(re1 + re2, im1 + im2);
	}

	private static MutableComplex subtract(double re1, double im1, double re2, double im2)
	{
		return add(re1, im1, -re2, -im2);
	}

	public MutableComplex()
	{
	}

	public MutableComplex(double real)
	{
		m_real = real;
	}

	public MutableComplex(double real, double imag)
	{
		m_real = real;
		m_imag = imag;
	}
	
	public static MutableComplex add(double val, MutableComplex z)
	{
		return add(val, 0, z.m_real, z.m_imag);
	}
	
	public MutableComplex add(MutableComplex other)
	{
		return add(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	public MutableComplex add(double val)
	{
		return add(m_real, m_imag, val, 0);
	}	
	
	public static MutableComplex subtract(double val, MutableComplex z)
	{
		return subtract(val, 0, z.m_real, z.m_imag);
	}
	
	public MutableComplex subtract(MutableComplex other)
	{
		return subtract(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	public MutableComplex subtract(double val)
	{
		return subtract(m_real, m_imag, val, 0);
	}
	
	public void inc(double val)
	{
		m_real += val;
	}
	
	public void inc()
	{
		inc(1);
	}
	
	public void dec(double val)
	{
		inc(-val);
	}
	
	public void dec()
	{
		dec(1);
	}
	
	public MutableComplex getConjugate()
	{				
		return new MutableComplex(m_real, -m_imag);
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
		return other instanceof MutableComplex z && Math.abs(m_real - z.m_real) < DELTA && Math.abs(m_imag - z.m_imag) < DELTA;
	}

	public String toString()
	{
		return "(%.2f, %.2f)".formatted(m_real, m_imag);
	}
}
