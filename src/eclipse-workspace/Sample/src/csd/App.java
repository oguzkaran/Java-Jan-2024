/*----------------------------------------------------------------------------------------------------------------------	 
	
-----------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		Complex z = new Complex();	
		
		System.out.print("Input a complex number:");
		z.real = kb.nextDouble();				
		z.imag= kb.nextDouble();		
		z.display();		
		z.inc(2); //Mantıksal ++z işlemi
		z.display();
		z.dec(2); //Mantıksal --z
		z.display();
	}
}

class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		Complex result = new Complex();
		
		result.real = re1 + re2;
		result.imag = im1 + im2;
		
		return result;
	}
	
	public static Complex subtract(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return add(re1, im1, -re2, -im2);		
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}	
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	public void inc(double val)
	{
		real += val;
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
	
	public Complex getConjugate()
	{
		Complex result = new Complex();
		
		result.real = real;
		result.imag = -imag;
		
		return result;
	}
	
	public double getNorm()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double getLength()
	{
		return getNorm();
	}	
	
	public void display()
	{
		System.out.printf("(%.2f, %.2f)%n", real, imag);
	}
}

