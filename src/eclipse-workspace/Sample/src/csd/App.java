/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Hilesiz iki zarın atılması deneyinde zarların ikisinin de çift sayı gelmesi olasılığını yaklaşık
	olarak hesaplayan simülasyonu yazınız.
	
	Not: İleride daha iyisi yazılacaktır.
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		EvenDiceProbabilitySimulationApp.run();						
	}
}

class EvenDiceProbabilitySimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Input count:");
		int count = kb.nextInt();
		
		EvenDiceProbabilitySimulation simulation = new EvenDiceProbabilitySimulation();
		
		simulation.run(count);
		
		System.out.printf("Probability:%f%n", simulation.p);
	}
}

class EvenDiceProbabilitySimulation {
	public double p;
	
	public static boolean areEven(java.util.Random r)
	{
		return (r.nextInt(6) + 1) % 2 == 0 && (r.nextInt(6) + 1) % 2 == 0;
	}
	
	public void run(int count)
	{
		java.util.Random r = new java.util.Random();
		int n = 0;
		
		for (int i = 0; i < count; ++i)
			if (areEven(r))
				++n;
		
		p = (double)n / count;		
	}
}

