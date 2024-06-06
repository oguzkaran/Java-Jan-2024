/*----------------------------------------------------------------------------------------------------------------------	
	- Sınıf türünden bellekte ayrılan bir alana nesne (object) denir.
	
	- Nesneler heap alanında yaratılırlar. Java'da stack'de nesne yaratılamaz.
	
	- Java'da bir nesnenin kendisi tutulamaz, adresi tutulabilir. Bu adres de aynı türden bir referans (değişken) içerisinde
	tutulabilir.
	
	- Java'da nesne yaratılması new operatörü ile yapılır. new operatörünün kullanımına ilişkin genel biçimi şu şekildedir:
	
		new <sınıf ismi>([argümanlar]);
	
	Bu operatör özel amaçlı tek operandlı ve önek durumundadır. Operatör, yaratılmış olan nesnenin adresini üretir. Bir
	nesne ile referans için hangi uzunlukta yerler ayrılacağı ileride ele alınacaktır. Bu operatörün yan etkisi yokrur. 
	Aşağıdaki örnekte p, s, u ve t birer nesne DEĞİLDİR, ilgili türden nesnelerin adreslerini tutan referans değişkenlerdir.
	Örnekte *, **, *** ve **** ile belirtilen deyimlerde ilgili türden nesneler yaratılmış ve ilgili türden referans
	değişkenlere adresleri atanmıştır. Bu durumda bir referans değişkene bir adres atandığında o referans o nesneyi
	gösteriyor (reference to) duruma gelmiş olur. 
	
	- Bir nesne ilgili sınıf türünden bir örnektir. Buna İngilizce olarak "instance" terimi de kullanılır. Bu anlamda 
	nesne yaratma işlemi için de "create" fiili ile birlikte "instantiate" fiili de kullanılır.
	
	- Referans ve nesne kavramları birbirinden farklıdır. Referans bir nesneyi gösterir ya da adresi anlamında kullanılır.
	
	- Her new işlemi yeni bir nesne yaratmak demektir
	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		Person p; //p referans (değişken)
		Server s; //s referans (değişken)
		USBPort u; //u referans (değişken)
		TCP t; //t referans (değişken)
		
		p = new Person(); //*
		s = new Server(); //**
		u = new USBPort(); //***
		t = new TCP(); //****
		
	} 
}

class Person {
	//..
}

class Server {
	//...
}

class USBPort {
	//...
}

class TCP {
	//...
}
