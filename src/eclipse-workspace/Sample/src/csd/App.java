/*----------------------------------------------------------------------------------------------------------------------	 
	Bir metodun parametre değişkeni bir referans olabilir. Bu durumda metodun çağrılabilmesi için metoda aynı türden
	bir referansın argüman olarak geçilmesi gerekir. Bu durumda metodun perametresi olan referans ile argüman olarak
	geçilen referans aynı nesneyi gösterir duruma gelir. Anımsanacağı gibi argümanlardan parametre değişkenlerine 
	aktarım da bir atama işlemidir. Bu durumda metot çağrısı boyunca ilgili nesneye erişilebilir. Hatta metot nesnenin
	içeriğini de değiştirebilir.
-----------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
	public static void main(String [] args) 
	{	
		Date d = new Date();
		
		d.day = 11;
		d.month = 7;
		d.year = 1983;
		
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
