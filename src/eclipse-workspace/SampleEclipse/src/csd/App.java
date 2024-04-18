/*----------------------------------------------------------------------------------------------------------------------
	switch deyimi:
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		DemoMenuApp.run();
	}
}

class DemoMenuApp {
	public static void printMenu()
	{
		System.out.println("1.Ekle");
		System.out.println("2.Sil");
		System.out.println("3.Güncelle");
		System.out.println("4.Listele");
		System.out.println("5.Çıkış");
		System.out.print("Seçenek:");
	}
	
	public static void printGoodbyeMessage()
	{
		System.out.println("-------------------------------------------");
		System.out.println("C ve Sistem Programcıları Derneği");
		System.out.println("Teşekkürler");
		System.out.println("-------------------------------------------");
	}
	
	public static void printInvalidOptionMessage()
	{
		System.out.println("-------------------------------------------");
		System.out.println("Geçersiz seçenek!...");
		System.out.println("-------------------------------------------");
	}
	
	public static void insert()
	{
		System.out.println("-------------------------------------------");
		System.out.println("Ekle seçildi");
		System.out.println("-------------------------------------------");
	}
	
	public static void delete()
	{
		System.out.println("-------------------------------------------");
		System.out.println("Sil seçildi");
		System.out.println("-------------------------------------------");
	}
	
	public static void update()
	{
		System.out.println("-------------------------------------------");
		System.out.println("Güncelle seçildi");
		System.out.println("-------------------------------------------");
	}
	
	public static void list()
	{
		System.out.println("-------------------------------------------");
		System.out.println("Listele seçildi");
		System.out.println("-------------------------------------------");
	}
	
	public static void invalidOption()
	{
		printInvalidOptionMessage();
	}
	
	public static void quit()
	{
		printGoodbyeMessage();
		System.exit(0);
	}
	
	public static void doOption(int option)
	{
		if (option == 1)
			insert();
		else if (option == 2)
			delete();
		else if (option == 3)
			update();
		else if (option == 4)
			list();
		else if (option == 5)
			quit();
		else
			invalidOption();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			printMenu();
			doOption(Integer.parseInt(kb.nextLine()));			
		}
	}
}
