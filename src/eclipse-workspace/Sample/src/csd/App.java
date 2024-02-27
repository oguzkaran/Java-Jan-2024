/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı double türden iki noktaya ilişkin koordinat bilgilerine göre iki nokta
	arasındaki Euclid uzaklığına geri dönen distance isimli meotdu PointUtil isimli sınıf içerisinde yazınız ve aşağıdaki
	kod ile test ediniz
	
	Euclid Uzaklığı fomulü: sqrt((x1 - x2) ^ 2 + (y1 - y2) ^ 2) 
	Açıklama: ^ üs anlamına gelmektedir 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args) 
	{
		PointUtilDistanceTest.run();
	}
}

class PointUtilDistanceTest {
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki noktanın koordinatlarını giriniz:");
		double x1 = kb.nextDouble();
		double y1 = kb.nextDouble();
		double x2 = kb.nextDouble();
		double y2 = kb.nextDouble();
		double d = PointUtil.distance(x1, y1, x2, y2);
		
		System.out.printf("distance(%f, %f, %f, %f) = %f%n", x1, y1, x2, y2, d);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class PointUtil {
	public static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}