/*----------------------------------------------------------------------------------------------------------------------
	Bir Java programı genel olarak paketlerden (package), paketler sınıflardan (class), sınıflar da metotlardan (method)
	oluşur. Paket bildiriminin genel biçimi:
	
		package <isim>;
		
	Burada isim daha sonra ele alacağımız değişken isimlendirme kurallarına uygun bir isim olmalıdır. Paketler konusu
	çok detaylı bir konudur, ileride detaylı olarak ele alınacaktır. Biz ilgili konuya kadar yalnızca csd paketi içerisinde
	kodlama yapacağız. 
	
	Sınıf bildiriminin genel biçimi şu şekildedir:
	
	[bildirime ilişkin bazı anahtar sözcükler] class <isim> {
		//...
	}
	
	Burada isim değişken isimlendirme kurallarına uygun olmalıdır. Sınıf kavramı da oldukça geniş bir kavramdır. Sınıf bildiriminin
	detayları konular içerisinde ele alınacaktır. Sınıf kavramı Nesne Yönelimli Programlama Tekiniğinin de temel taşlarından
	biridir.  
	
	Java'da alt programlara metot denir. Metot bildirimi (method declaration) alt programın kodlarının yazılmasıdır. Bir 
	metot bildirildiğinde kodlarının çalıştırılabilmesi için çağrılması (call/invoke) gerekir. Metot bildiriminin genel
	biçimi şu şekildedir:
	
	[erişim belirleyici] [static] <geri dönüş değeri bilgisi> <isim>([parametre listesi])
	{
		//...
	}
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		System.out.println("Hello, World");
	}
}


class Sample {
	//...
}

class Mample {
	//...
}