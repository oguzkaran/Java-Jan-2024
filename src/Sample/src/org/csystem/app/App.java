package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample [] samples;

		samples = new Sample[10];

		for (int i = 0; i < 10; ++i)
			samples[i] = new Sample(i);

		System.out.println("Dizi elemanları yazdırılıyor:");
		for (int i = 0; i < 10; ++i)
			System.out.printf("%d ", samples[i].x);

		System.out.println();
	}
}

class Sample {
	public int x;

	public Sample(int a)
	{
		x = a;
	}

	//...
}