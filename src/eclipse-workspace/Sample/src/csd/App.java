/*----------------------------------------------------------------------------------------------------------------------	 
	Bir metodun parametre değişkeni bir referans olabilir. Bu durumda metodun çağrılabilmesi için metoda aynı türden
	bir referansın argüman olarak geçilmesi gerekir. Bu durumda metodun perametresi olan referans ile argüman olarak
	geçilen referans aynı nesneyi gösterir duruma gelir. Anımsanacağı gibi argümanlardan parametre değişkenlerine 
	aktarım da bir atama işlemidir. Bu durumda metot çağrısı boyunca ilgili nesneye erişilebilir. Hatta metot nesnenin
	içeriğini de değiştirebilir. Örnekte DateUtil sınıfının change metodunun nesnenin içeriğini değiştirdiğine dikkat 
	ediniz. 
	
	Bir metodun geri dönüş değeri bir sınıf türünden olabilir. Bu durumda bir metot referansa (adrese) geri dçnmüş olur.
	Böyle bir metodun return deyimine ilişkin ifadesi de aynı türden bir referans olmalıdır. Örnekteki create metodunun
	bir nesne yaratıp o nesnenin adresine geri döndüğüne dikkat ediniz
-----------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
	public static void main(String [] args) 
	{	
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.x = 23.4;
		p1.y = 56.7;
		p2.x = 90;		
		
		p1.display();
		p2.display();
	}
}


class Point {
	public double x;
	public double y;
	
	public void display()
	{
		System.out.printf("(%f, %f)%n", x, y);
	}	
}
