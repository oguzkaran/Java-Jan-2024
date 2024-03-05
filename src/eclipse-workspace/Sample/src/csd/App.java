/*----------------------------------------------------------------------------------------------------------------------
	Operatörler (Operators): Belirli bir işleme yol açan, işlem sonucunda bir değer üreten atomlardır. Bir operatör ile
	işleme giren ifadelere (expression) operand denir. Bir operatörün öğrenilmesi için aşağıdaki özelliklerin incelenmesi
	gerekir:
	- Operatörün sınıfları:
		1. İşlevine göre sınıflandırma
			- Aritmetik operatörler (arithmetic operators)
			- Karşılaştırma operatörleri (comparison operators)
			- Mantıksal operatörler (logical operatörs)
			- Bitsel operatörler (bitwise operators)
			- Özel amaçlı operatörler (special purpose operators)
		2. Operand sayısına göre sınıflandırma
			- Tek operandlı (unary)
			- İki operandlı (binary)
			- Üç operandlı (ternary)
		3. Operatörün konumuna göre sınıflandırma
			- Önek (prefix)
			- Araek (infix)
			- Sonek (postfix)
			
	- Operatörün ürettiği değer (product value): İşlem sonucunda üretilen değerdir.
	
	- Operatörün kısıtı (constraint): Operatörün kullanımına ilişkin bir takım zorunluluklardır.
	
	- Operatörün yan etkisi (side effect): Operatörün, operandının değerini değiştirip değiştirmediğidir.
	
	- Operatörün önceliği (precedence): Operatörün ifadede diğer operatörlere göre işlem sırasıdır. Örneğin
		 	x = y + z * t
		 işleminin yapılış sırası şöyledir:
		 	i1: z * t
		 	i2: y + i1
		 	i3: x = i2
		 Bir işlemi önceliklendirmek için Matematik'teki gibi önceliklendirme parantezi kullanılır. Örneğin:
		  	x = (y + z) * t
		 işleminin yapılış sırası şöyledir:
		 	i1: y + z
		 	i2: i1 * t
		 	i3: x = i2
		 Bazı operatörler aynı öncelik seviyesinde olabilirler. Bu durumda aynı öncelik seviyesine sahip operatörlerin
		 aynı ifadede bulunması durumunda işlemin hangi sırada yapılacağını belirleyen "associativity" denilen bir kavram
		 kullanılır. Bu anlamda "left associative" ve "right associative" kavramları sırasıyla "soldan sağa öncelik" ve 
		 "sağdan sola öncelik" anlamına gelir. Örneğin:
		 	x = y + z - t
		 işleminin yapılış sırası + ve - operatörleri aynı öncelik seviyesinde ve left associative olduklarından şöyledir:
		 	i1: y + z
		 	i2: i1 - t
		 	i3: x = i2
		 
		Anahtar Notlar: Java'da öncelik, her zaman işlem sırasını da belirlemez. Bu durumun detayları konu içerisinde
		ele alınacaktır.

	Biz de bir operatörü öğrenirken bu özellikleri inceleyeceğiz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String[] args) 
	{		
		int a;
		
		10 = a;
	}
}
