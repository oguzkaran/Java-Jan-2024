/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanları toplamına geri dönen sum metodunu ArrayUtil
	sınıfı içerisinde yazınız. Metodunuzu rassal olarak üretilmiş diziler ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import static org.csystem.util.array.ArrayUtil.generateRandomArray;
import static org.csystem.util.array.ArrayUtil.print;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			System.out.print("Bir sayı giriniz:");
			int count = kb.nextInt();
			if (count <= 0)
				break;

			double [] a = generateRandomArray(random, count, 0., 100);

			print(a);
		}
	}
}
