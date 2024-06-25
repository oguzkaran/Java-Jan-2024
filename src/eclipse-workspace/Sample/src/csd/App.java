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
		Date d = DateUtil.create(11, 7, 1983);
		
		DateUtil.display(d);
		DateUtil.change(d, 6, 9, 2021);
		DateUtil.display(d);
	}
}

class DateUtil {
	public static void change(Date date, int day, int month, int year)
	{
		//...
		date.day = day;
		date.month = month;
		date.year = year;
	}
	
	public static Date create(int day, int month, int year)
	{
		//...
		Date date = new Date();
		
		date.day = day;
		date.month = month;
		date.year = year;
		
		return date;
	}
	
	public static void display(Date date)
	{
		System.out.printf("%02d/%02d/%04d%n", date.day, date.month, date.year);
	}
}

class Date {
	public int day;
	public int month;
	public int year;
	
	//...
}
