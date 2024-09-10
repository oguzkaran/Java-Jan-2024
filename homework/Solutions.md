### Java ile Nesne Yönelimli Programlama Kursu
### Çalışma Soruları Çözümleri
### Eğitmen: Oğuz KARAN
### C ve Sistem Programcıları Derneği

#### Homework-001

>*Homework-001-1.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		DisplayRelationsApp.run();
	}
}

class DisplayRelationsApp {
	public static void displayRelations(int a, int b, int c)
	{
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int mid = a + b + c - max - min;

		if (min < mid)
			System.out.printf("%d < %d ", min, mid);
		else
			System.out.printf("%d = %d ", min, mid);

		if (mid < max)
			System.out.printf("< %d", max);
		else
			System.out.printf("= %d", max);

		System.out.println();
	}

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Üç tane sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();

		displayRelations(a, b, c);
	}
}
```

>*Homework-001-2.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		NumberUtilMidTest.run();
	}
}

class NumberUtilMidTest {

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Üç tane sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();

		System.out.printf("mid(%d, %d, %d) = %d%n", a, b, c, NumberUtil.mid(a, b, c));
	}
}


class NumberUtil {
	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;

		if (b <= a && a <= c || c <= a && a <= b)
			return a;

		return c;
	}
}
```

>*Homework-001-3.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		NumberUtilSignumTest.run();
	}
}

class NumberUtilSignumTest {

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();

		System.out.printf("sign(%d) = %d%n", a, NumberUtil.signum(a));
	}
}

class NumberUtil {
	public static int signum(int a)
	{
		if (a > 0)
			return 1;

		if (a == 0)
			return 0;

		return -1;
	}
}
```

>*Homework-001-3.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		NumberUtilSignumTest.run();
	}
}

class NumberUtilSignumTest {

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();

		System.out.printf("sign(%d) = %d%n", a, NumberUtil.signum(a));
	}
}

class NumberUtil {
	public static int signum(int a)
	{
		int result = -1;

		if (a > 0)
			result = 1;
		else if (a == 0)
			result = 0;

		return result;
	}
}
```

#### Homework-002

>*Homework-002-1.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		PrintDiamondApp.run();
	}
}

class PrintDiamondApp {
	public static void printAbove(int n)
	{
		for (int i = 0; i < n; ++i) {
			for (int k = 0; k < n - i; ++k)
				System.out.print(' ');

			for (int k = 0; k < 2 * i - 1; ++k)
				System.out.print('*');

			System.out.println();
		}
	}

	public static void printBelow(int n)
	{
		for (int i = 0; i < n; ++i) {
			for (int k = 0; k < i; ++k)
				System.out.print(' ');

			for (int k = 0; k < 2 * (n - i) - 1; ++k)
				System.out.print('*');

			System.out.println();
		}
	}

	public static void printDiamond(int n)
	{
		printAbove(n);
		printBelow(n);
	}

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();

		printDiamond(n);
	}
}
```

>*Homework-002-2.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		PrintDurationTest.run();
	}
}

class PrintDurationTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		while (true) {
			System.out.print("Toplam saniye değeri giriniz:");
			long totalSeconds = Long.parseLong(kb.nextLine());

			TimeUtil.printDuration(totalSeconds);

			if (totalSeconds <= 0)
				break;
		}
	}
}

class TimeUtil {
	public static void printDuration(long totalSeconds)
	{
		long hours = totalSeconds / 60 / 60;
		long minutes = totalSeconds / 60 % 60;
		long seconds = totalSeconds % 60;

		if (hours != 0)
			System.out.printf("%d saat ", hours);

		if (minutes != 0)
			System.out.printf("%d dakika ", minutes);

		if (seconds != 0)
			System.out.printf("%d saniye ", seconds);

		System.out.println();
	}
}
```

>*Homework-002-3.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		PrintPrimeFactorsApp.run();
	}
}

class PrintPrimeFactorsApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		while (true) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());

			if (a <= 0)
				break;

			NumberUtil.printPrimeFactors(a);
		}
	}
}

class NumberUtil {
	public static void printPrimeFactors(int a)
	{
		if (a == 0)
			return;

		a = Math.abs(a);

		int val = 2;

		while (a != 1) {
			if (a % val == 0) {
				System.out.printf("%d ", val);
				a /= val;
			}
			else
				++val;
		}

		System.out.println();
	}
}
```

>*Homework-002-4.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		BallFallApp.run();
	}
}

class BallFallApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		while (true) {
			System.out.print("Genişliği giriniz:");
			int width = Integer.parseInt(kb.nextLine());

			System.out.print("Yüksekliği giriniz:");
			int height = Integer.parseInt(kb.nextLine());

			if (width <= 0 || height <= 0)
				break;

			BallFall.play(width, height);
		}
	}
}

class BallFall {
	public static void writeSpace(int begin, int end)
	{
		for (int i = begin; i < end; ++i)
			System.out.print(' ');
	}

	public static void writeBall(int ballPosition, int end)
	{
		writeSpace(0, ballPosition);
		System.out.print('*');
		writeSpace(ballPosition + 1, end);
	}

	public static boolean updateRightFlagIfNecessary(boolean currentStatus, int balllPosition, int width)
	{
		if (balllPosition == 0)
			currentStatus = true;
		else if (balllPosition == width - 1)
			currentStatus = false;

		return currentStatus;
	}

	public static int updateBallPosition(int currentPosition, boolean right)
	{
		if (right)
			return currentPosition + 1;

		return currentPosition - 1;
	}

	public static void play(int width, int height)
	{
		boolean right = false;
		int ballPosition = 0;

		for (int i = 1; i <= height; ++i) {
			System.out.print('|');
			writeBall(ballPosition, width);

			if (width != 1) {
				right = updateRightFlagIfNecessary(right, ballPosition, width);
				ballPosition = updateBallPosition(ballPosition, right);
			}
			System.out.println('|');
		}
	}
}
```

>*Homework-002-5.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		PrintGoldbachApp.run();
	}
}

class PrintGoldbachApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		while (true) {
			System.out.print("2'den büyük çift bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());

			if (a <= 2)
				break;

			if (a % 2 != 0) {
				System.out.println("Hatalı giriş!...");
				continue;
			}

			NumberUtil.printGoldbach(a);
		}
	}
}

class NumberUtil {
	public static void printGoldbach(int a)
	{
		for (int x = a - 1; x >= 2; --x) {
			int y = a - x;

			if (isPrime(x) && isPrime(y) && x >= y)
				System.out.printf("%d + %d = %d == %d%n", x, y, x + y, a);
		}
	}

	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;

		if (a % 2 == 0)
			return a == 2;

		if (a % 3 == 0)
			return a == 3;

		if (a % 5 == 0)
			return a == 5;

		if (a % 7 == 0)
			return a == 7;

		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;

		return true;
	}
}
```

#### Homework-003

>*Homework-003-1. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		SatisfyConditionsApp.run();
	}
}

class SatisfyConditionsApp {
	public static boolean isCondition1Satisfied(int a, int b, int c)
	{
		return 100 * c + 10 * b + a > 100 * a + 10 * b + c;
	}

	public static boolean isCondition2Satisfied(int a, int b, int c)
	{
		return NumberUtil.isPrime(100 * a + 10 * b + c);
	}

	public static boolean isCondition3Satisfied(int a, int b, int c)
	{
		return NumberUtil.isPrime(100 * c + 10 * b + a);
	}


	public static boolean isCondition4Satisfied(int a, int b)
	{
		return NumberUtil.isPrime(10 * a + b);
	}

	public static boolean isCondition5Satisfied(int b, int c)
	{
		return NumberUtil.isPrime(10 * b + c);
	}

	public static boolean isCondition6Satisfied(int c, int b)
	{
		return NumberUtil.isPrime(10 * c + b);
	}

	public static boolean isCondition7Satisfied(int b, int a)
	{
		return NumberUtil.isPrime(10 * b + a);
	}

	public static boolean isAllSatisfied(int val)
	{
		int a = val / 100;
		int b = val / 10 % 10;
		int c = val % 10;

		return isCondition1Satisfied(a, b, c) && isCondition2Satisfied(a, b, c)
				&& isCondition3Satisfied(a, b, c) && isCondition4Satisfied(a, b)
				&& isCondition5Satisfied(b, c) && isCondition6Satisfied(c, b)
				&& isCondition7Satisfied(b, a);
	}

	public static void run()
	{
		for (int val = 100; val <= 999; ++val)
			if (isAllSatisfied(val))
				System.out.printf("%d ", val);

		System.out.println();
	}
}

class NumberUtil {
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;

		if (a % 2 == 0)
			return a == 2;

		if (a % 3 == 0)
			return a == 3;

		if (a % 5 == 0)
			return a == 5;

		if (a % 7 == 0)
			return a == 7;

		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;

		return true;
	}
}
```

>*Homework-003-2. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		IsPrimeXTest.run();
	}
}

class IsPrimeXTest {

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		long n = kb.nextLong();

		for (long i = 0; i <= n; ++i)
			if (NumberUtil.isPrimeX(i))
				System.out.println(i);

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isPrimeX(long a)
	{
		long sum = a;
		boolean result;

		while ((result = isPrime(sum)) && sum > 9)
			sum = sumDigits(sum);

		return result;
	}

	public static int sumDigits(long a)
	{
		int sum = 0;

		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}

		return Math.abs(sum);
	}

	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;

		if (a % 2 == 0)
			return a == 2;

		if (a % 3 == 0)
			return a == 3;

		if (a % 5 == 0)
			return a == 5;

		if (a % 7 == 0)
			return a == 7;

		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;

		return true;
	}
}
```

>*Homework-003-2. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		IsPrimeXTest.run();
	}
}

class IsPrimeXTest {

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		long n = kb.nextLong();

		for (long i = 0; i <= n; ++i)
			if (NumberUtil.isPrimeX(i))
				System.out.println(i);

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isPrimeX(long a)
	{
		boolean result;

		for (long sum = a; (result = isPrime(sum)) && sum > 9; sum = sumDigits(sum))
			;

		return result;
	}

	public static int sumDigits(long a)
	{
		int sum = 0;

		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}

		return Math.abs(sum);
	}

	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;

		if (a % 2 == 0)
			return a == 2;

		if (a % 3 == 0)
			return a == 3;

		if (a % 5 == 0)
			return a == 5;

		if (a % 7 == 0)
			return a == 7;

		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;

		return true;
	}
}
```

>*Homework-003-3. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		CalculateDigitalRootTest.run();
	}
}

class CalculateDigitalRootTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();

		for (int i = 0; i <= n; ++i)
			System.out.printf("%d sayısının basamaksal kökü: %d%n", i, NumberUtil.calculateDigitalRoot(i));

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int calculateDigitalRoot(int a)
	{
		int root = a;

		while ((root = sumDigits(root)) > 9)
			;

		return root;
	}

	public static int sumDigits(long a)
	{
		int sum = 0;

		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}

		return Math.abs(sum);
	}
}
```

>*Homework-003-3. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		CalculateDigitalRootTest.run();
	}
}

class CalculateDigitalRootTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();

		for (int i = 0; i <= n; ++i)
			System.out.printf("%d sayısının basamaksal kökü: %d%n", i, NumberUtil.calculateDigitalRoot(i));

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int calculateDigitalRoot(int a)
	{
		int root = Math.abs(a);

		while (root > 9)
			root = sumDigits(root);

		return root;
	}

	public static int sumDigits(long a)
	{
		int sum = 0;

		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}

		return Math.abs(sum);
	}
}
```

>*Homework-003-4. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		IsFactorianTest.run();
	}
}

class IsFactorianTest {
	public static void run()
	{
		for (int i = 1; i <= 100_000; ++i)
			if (NumberUtil.isFactorian(i))
				System.out.printf("%d ", i);

		System.out.println();
	}
}

class NumberUtil {
	public static boolean isFactorian(int n)
	{
		return n > 0 && sumFactorialDigits(n) == n;
	}

	public static int sumFactorialDigits(int n)
	{
		int sum = 0;

		while (n != 0) {
			sum += factorial(n % 10);
			n /= 10;
		}

		return sum;
	}

	public static int factorial(int n)
	{
		int result = 1;

		for (int i = 2; i <= n; ++i)
			result *= i;

		return result;
	}
}
```

>*Homework-003-5. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		IsSuperPrimeTest.run();
	}
}

class IsSuperPrimeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			long val = Long.parseLong(kb.nextLine());

			if (val == 0)
				break;

			if (!NumberUtil.isPrime(val))
				continue;

			if (NumberUtil.isSuperPrime(val))
				System.out.printf("%d sayısı süper asaldır%n", val);
			else
				System.out.printf("%d sayısı süper asal değildir%n", val);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isSuperPrime(long a)
	{
		return isPrime(a) && isPrime(indexOfPrime(a));
	}

	public static int indexOfPrime(long a)
	{
		int i = 1;
		long val = 2;

		for (;;) {
			if (val == a)
				return i;

			if (isPrime(val))
				++i;

			++val;
		}
	}

	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;

		if (a % 2 == 0)
			return a == 2;

		if (a % 3 == 0)
			return a == 3;

		if (a % 5 == 0)
			return a == 5;

		if (a % 7 == 0)
			return a == 7;

		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;

		return true;
	}
}
```

>*Homework-003-6. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		IsHardyRamanujanApp.run();
	}
}

class IsHardyRamanujanApp {
	public static void run()
	{
		for (int n = 1; n < 100_000; ++n)
			if (NumberUtil.isHardyRamanujan(n))
				System.out.printf("%d ", n);

		System.out.println();
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isHardyRamanujan(int n)
	{
		return n > 0 && getHardyRamanujanCount(n) == 2;
	}

	public static int getHardyRamanujanCount(int n)
	{
		int count = 0;

		EXIT_LOOP:
		for (int a = 1; a * a * a < n; ++a)
			for (int b = a + 1; a * a * a + b * b * b <= n; ++b)
				if (a * a * a + b * b * b == n) {
					if (++count == 2)
						break EXIT_LOOP;
					++a;
				}

		return count;
	}
}
```

>*Homework-003-7. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		IsDecimalHarshadTest.run();
	}
}

class IsDecimalHarshadTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();

		while (n-- > 0)
			if (NumberUtil.isDecimalHarshad(n + 1))
				System.out.println(n + 1);
	}
}

class NumberUtil {
	public static boolean isDecimalHarshad(int val)
	{
		return val > 0 && val % sumDigits(val) == 0;
	}

	public static int sumDigits(long a)
	{
		int sum = 0;

		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}

		return Math.abs(sum);
	}
}
```

>*Homework-003-8. sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihe kadar işlenmiş olan konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		PrintCollatzTest.run();
	}
}

class PrintCollatzTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n == 0)
				break;

			System.out.println("-----------------");
			NumberUtil.printCollatz(n);
			System.out.println("-----------------");
		}
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static void printCollatz(int n)
	{
		if (n <= 0) {
			System.out.println("Geçersiz sayı!...");
			return;
		}

		System.out.println(n);

		while (n != 1) {
			if (n % 2 == 0)
				n /= 2;
			else
				n = 3 * n + 1;

			System.out.println(n);
		}
	}
}
```

>*Homework-003-8.sorunun bir çözümü*
>
>**Not:** Çözümde koşul operatörü kullanılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		PrintCollatzTest.run();
	}
}

class PrintCollatzTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);

		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			if (n == 0)
				break;

			System.out.println("-----------------");
			NumberUtil.printCollatz(n);
			System.out.println("-----------------");
		}
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static void printCollatz(int n)
	{
		if (n <= 0) {
			System.out.println("Geçersiz sayı!...");
			return;
		}

		System.out.println(n);

		while (n != 1)
			System.out.println(n = (n % 2 == 0) ? (n / 2) : (3 * n + 1));
	}
}
```

#### Homework-005

>*Homework-005-1.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args)
	{
		System.out.println(Util.e());
	}
}

class Util {
	public static double e()
	{
		double result = 2;

		for (int i = 2; i <= 8; ++i)
			result += 1. / NumberUtil.factorial(i);

		return result;
	}
}

class NumberUtil {
	public static int factorial(int n)
	{
		int result = 1;

		for (int i = 2; i <= n; ++i)
			result *= i;

		return result;
	}
}
```

>*Homework-XXX-X.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java

```

>*Homework-XXX-X.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java

```

>*Homework-XXX-X.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java

```

#### Homework-XXX

>*Homework-XXX-X.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java

```

>*Homework-XXX-X.sorunun bir çözümü*
>
>**Not:** Çözüm çalışma sorusunun verildiği tarihte işlenmiş konulara göre yazılmıştır

```java

```