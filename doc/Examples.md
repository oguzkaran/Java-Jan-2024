### C ve Sistem Programcıları Derneği
### Java ile Nesne Yönelimli Programlama
### Eğitmen: Oğuz KARAN
#### Düzenleyenler: Bartu Çankaya, Eray Taşay

#### 23 Ocak 2024

##### Java Platformunun Temel Özellikleri:
>Arakodlu Çalışma Sistemi: C ve C++ gibi dillerde yazılan kodlardan elde edilen (nasıl elde edildiği bu aşamada önemli değildir) "çalışabilir dosya (executable file)" sisteme (genel olarak işletim sistemi, donanım vb.) özgüdür ve koda göre her sistem için ayrıca oluşturulmalıdır. Hatta sisteme özgü kodlar yazılmışsa diğer sistemler için bu dosya oluşturulamaz. Oysa Java programlama dili ile yazılan bir program "derlendiğinde (compilation)" oluşan dosyanın içerisinde hiç bir sistemin dili olmayan yapay bir arakod bulunur. Bu arakoda "byte code (BC)" denir. BC doğrudan çalıştırılamaz. Çalıştırılması için ayrı bir uygulama (program)  gerekir. Bu program, BC'yi yorumlayarak makine koduna yani sisteme özgü koda dönüştürerek programı çalıştırır. Bu dönüştürme işlemine JIT (Just In Time) compilation denir. Geliştirme ve çalıştırma anlamında 3 tane temel kavram karşımıza çıkar:
>
>- JVM (Java Virtual Machine): BC'yi makine koduna dönüştürür. JVM aslında BC'nin nasıl makine koduna dönüştürüleceğini tanımlayan soyut bir kavramdır.
>- JRE (Java Runtime Environment): Genel olarak Java ile yazılmış bir uygulamayı çalıştırmak (run) için gereken araçları ve uygulamaları içeren bir pakettir. Yani BC elde edildiğinde bu programın çalıştırılabilmesi için JRE'ye ihtiyaç vardır.
>- JDK (Java Development Kit): Geliştirme (development) araçlarını ve çalıştırma araçlarının bir çoğunu içeren pakettir. Buradaki çalıştırma araçları geliştirme aşamasında kullanılabilir.
>
>Ticari kullanımlarda özellikle Java 11 ile birlikte bazı değişiklikler yapılmıştır. Genel olarak şöyle söylenebilir:
Java'da geliştirme ortamı ücetsiz, çalıştırma araçları kullanılan araca göre ücretlendirilebilir.  Tamamen ücretsiz
olarak kullanılabilen "Open JRE" gibi çalıştırma araçları da mevcuttur.  Burada anlatılanlar geneldir. Ayrıca, belirli
bir noktadan sonra Java sürümleri için Long Term Support (LTS) kavramı da getirilmiştir. LTS sürümleri uzun süre 
desteklenen yani güncellemesi (hızlandırılması, hataların düzeltilmesi (bug fix) vb.) uzun süre yapılan sürümlerdir. 
Java'da Java 8, 11, 17 ve 21 sürümleri LTS sürümleridir. Bu kavramlar zamanla anlaşılacaktır.*
>
>Arakodlu çalışma sisteminin en önemli avantajı, gelişirilen uygulamaların genel olarak sistemden bağımsız olarak 
çalıştırılabilmesidir. Dolayısıyla kodun çalıştırılacağı sistemden bağımsız olarak ürün geliştirilebilir. Bu kavrama
"Write Once Run Anywhere (WORA)" denilmektedir. Şüphesiz bu durumun da istisnaları vardır.*
>
>Ayrıca unutulmamalıdır ki, arakodlu çalışma sistemi ufak da olsa bir performas kaybına yol açar. Ancak Java'nın hedeflediği
uygulamalar düşünüldüğünde bu kaybın pek de önemi yoktur. Bu kaybın önemli olduğu uygulamalar için zaten Java ile 
geliştirme yapılmaz.*
>
>Hızlı Uygulama Geliştirme Ortamı: Java hızlı uygulama geliştirme (rapid application development) ortamı sunar. Bu anlamda
hem öğrenmesi kolaydır hem de ürün daha çabuk elde edilir.*
>
>Geniş bir sınıf kütüphanesi: Java'da oldukça geniş bir sınıf kütüphanesi bulunur. Veritabanı işlemleri, web programlama,
dosya işlemleri gibi işlemler için hazır sınıflar bulunmaktadır.*
>
>Güvenli Çalışma Ortamı: Java'da yazılmış olan bir programın sisteme zarar verme olasılığı çok daha azdır. Yazılan bir 
program yüzünden yanlışlıkla makinede bir problem olma olasılığı oldukça düşüktür.*
 
#### 25 Ocak 2024

##### Programlama Dillerinin Sınıflandırılması

>Programlama dilleri çeşitli şekillerde sınıflandırılabilse de genel olarak 3 şekilde sınıflandırma eğilimi söz konusudur:
>1. Seviyelerine (level) göre sınıflandırma: Programlama dilinin seviyesi onun insan algısına yakınlığının ölçüsüdür. Yüksek seviyeli diller (high level languages) hem dil özellikleri, hem de uygulama geliştirme anlamında insan algısına yakınlıkları dolayısıyla daha kolay öğrenebilirler. Düşük seviyeli diller (low level languages) makineye daha yakın dillerdir. Olabilecek en düşük seviyeli dil makine dilidir.
>2. Kullanım alanlarına göre sınıflandırma: Dilin hangi alanlarda kullanılabileceğine göre sınıflandırmadır. Bazı diller birden fazla alanda kullanılabilirler. Bazı diller ise sadece bir alanda kullanılabilirler. Bu anlamda genel amaçlı diller, bilimsel ve mühendislik dilleri, veritabanı dilleri, yapay zeka dilleri, oyun ve animasyon dilleri vb. alanlar için diller söz konusu olabilmektedir.
>3. Programlama modeline göre sınıflandırma: Bir programı yazarken kullanılan genel model (paradigm) önemlidir. Bazı dillerde sınıf yoktur. Program çeşitli alt programların (function) bir araya getirilmesiyle yazılır. Bu modele "procedurel model" denir. Bazı dillerde sınıflar vardır ve programlar sınıflar kullanılarak yazılır. Başka bir çok kavramla birlikte sınıflar kullanılarak yazılan programlama modeline "nesne yönelimli model (object oriented model)" denir. Bazı dillerde programlar matematiksel formül yazıyormuş gibi yazılmaktadır. Bu tarz programlama modeline "fonksiyonel (functional)" model denir. Bazı diller birden fazla modeli desteklerler. Bu tarz dillere "multi paradigm languages" denilmektedir. Birden fazla modeli destekleyen diller, modellerin tüm özelliklerini desteklemeyebilir. 
>
>Bu durumda Java, bilimsel ve mühendislik uygulamalarında, web uygulamalarında, yapay zeka uygulamalarında, mobil programlamada vb. kullanılabilen genel amaçlı, yüksek seviyeli, nesne yönelimli programlama modeli ile uygulama geliştirilebilen ve özellikle Java 8 ile birlike fonksiyonel programlama modelini de belirli ölçüde destekleyen "multi paradigm" bir dildir.

**Anahtar Notlar:** Bir dilin bir çok alanda kullanılabilmesi, o dilin tüm alanlarında pratikte kullanılacağı anlamına gelmez. Bir alanda daha etkin kullanılabilen bir dil varsa o dil daha fazla tercih edilebilir.

**Anahtar Notlar:** Yukarıda anlatılan kavramların detayları vardır. Zaman içerisinde anlaşılacaktır.
 
#### 30 Ocak 2024
 
##### Temel Kavramlar

>Çevirici Programlar, Derleyiciler ve Yorumlayıcılar: Bir dilde yazılmış programı başka bir dile çeviren programlara çevirici programlar (translator) denir. Çevirici programlarda bir kaynak dil (source language) ve bir hedef dil (target/destination language) vardır. Kaynak dil yüksek seviyeli, hedef dil düşük seviyeli bir programlama diliyse bu durumda çevirici programa derleyici (compiler) denir. Örneğin Java programlama dilinden Kotlin programlama diline dönüştürme yapan program bir translator, Java programlama dilinden byte code'a dönüştürme yapan program ise bir compiler'dır. JVM'in byte code'u makine koduna çevirme faaliyeti de bir derleme işlemidir. Bu sebeple buna JIT compilation denir. Bazı dillerde yazılan programlar herhangi bir kod üretilmeden çalıştırılırlar. Bu tarz dillerde yazılmış programları herhangi bir kod üretmeden çalıştıran programlara "interpreter" denir. Bazı diller hem derleyici hem yorumlayıcı ile kullanılabilirler. Java pratikte derleyici ile kullanılan, Java 11 ile birlikte "java" programı yorumlayıcı olarak da java kodunu byte code üretilmeden çalıştırabilmektedir. Yorumlayıcı ile kullanılan diller derleyici ile kullanılan dillere göre daha yavaş olma eğilimindedir.

**Anahtar Notlar:** Bir uygulama tek bir java dosyasından oluşmak zorunda değildir. Hatta bir Java uygulaması yalnızca java kodlarından da oluşmak zorunda değildir. Bu durumda farklı java dosyaları ayrı derlenir. Hatta aynı dosyada bulunan sınıflar da ayrı derlenir. Bir ürün aslında tüm birimlerinin uygun şekilde derlenmesi ve ele alınmasıyla elde edilir. Bu işlem için genel olarak "build" terimi kullanılır. Build işlemi yalnızca derleme işlemi değildir. Yani bir uygulamanın ürün olarak elde edilmesi süreci "build" işlemidir. Burada anlatılanların da detayları zamanla ele alınacaktır.

>İşletim Sistemi (Operating System): Makinenin donanımını yöneten, bilgisayar ile kullanıcı arasında bir köprü oluşturan yazılımdır. Bir işletim sisteminin pek çok görevi vardır. Programları çalıştırmak, çeşitli cihazları ve aygıtları yönetmek, dosyaları ve dizinleri  (directory) organize etmek vb. görevler sayılabilir. İşletim sistemleri genel olarak iki gruba ayrılabilir: masaüstü işletim sistemleri (desktop operating systems), mobil işletim sistemleri (mobile operating systems). Şüphesiz başka çeşit işletim sistemleri de vardır. Popüler masaüstü işletim sistemleri Windows, Mac OS X, Unix ve Linux dağitımları gibi işletim sistemleridir. Popüler mobil işletim sistemleri Android ve IOS'dur.
>
>Açık kaynak kodlu yazılım, özgür yazılım ve mülkiyete sahip yazılım: Özgür yazılım (free software) ve açık kaynak kodlu (open source) yazılımlar arasında farklar olsa da genel olarak aşağıdaki ortak özelliklere sahiptirler:
>- Bedavadır. Kullanılabilmesi için herhangi bir lisans gerekmez.
>- Kaynak kodlar sahiplenilemez. Kaynak koda ekleme yapıldığında ya da bir kaynak kod kullanıldığında kodlar kapatılamaz. Onların da açılması gerekir.
>- Çoğaltılabilir, izin almadan kullanılabilir.
>
>Bunun tam tersi olarak mülkiyete sahip (propriatery) yazlımlardır. Bu yazılımlar para verilerek kullanılır ve izin almadan çoğaltılamaz.
>
>IDE (Integrated Development Environment): Derleyicler ve yorumlayıcılar komut satırından çalışan ve basit arayüzlere sahip programlardır. Aslında teorik olarak bir uygulamadaki tüm Java dosyaları ve diğer dosyalar basit bir editör programla yazılıp komut satırından derlenebilir. Ancak bu, uygulama büyüdükçe zahmetli olmaya başlar. Bu da programcıya zaman kaybettirir. Bu amaçla pratikte yazılım geliştirmeyi kolaylaştırmak için IDE denilen yazılımlar kullanılır. IDE'lerde örneğin bir takım yardımlar veren editörler, tasarım araçları, test araçları, debug araçları vb. programcının geliştirme sırasında kullandığı araçlar bulunur. Java ile uygulama geliştirmede iki tane IDE yoğun olarak kullanılmaktadır: Eclipse, IntelliJIDEA. Biz kursumuzda belirli bir zaman (yaklaşık kursun yarısına kadar) Eclipse, sonrasında IntelliJIDEA kullanacağız.
>
>JDK'nın kurulumu için işletim sistemine göre aşağıdaki link'den ilgili "installer" indirilebilir:
>
>[Java Downloads &#x2615;](https://www.oracle.com/tr/java/technologies/downloads/)
>
>Burada LTS olması açısından 17 veya 21 seçilebilir. Kursumuzda Java 17 özellikleri de konular içerisinde ele alınacağından en az Java 17 kurulumu önerilir. Java 17  öncesinde en az Java 11 olmalıdır. Kurulum aşamasından sonra java ve javac programları -version seçeneği ile çalıştırılarak versiyon kontrolü yapılabilir.
>
>Aşağıdaki programı çalıştırmak için JDK kurulu olan bir bilgisayarda aşağıdaki işlemlerin yapılması gerekir:
>1. Herhangi bir dizinde (directory) csd isimli bir dizin açılır. Buradaki csd isminin tamamı küçük-harf olacak
şekilde yazılacaktır.
>2. csd dizini içerisinde App.java isimli bir dosya açılır. Windows sisteminde uzantılar gizlenmişse görünür hale
getirip uzantının .java olarak değiştirilmesi gerekir. Buradaki dosya isminin aynen yazılması gerekir.
>3. Komut yorumlayıcı program (command promt/terminal/shell) ile csd directory'sinin bulunduğu dizine geçilir. Dizin
geçişi için cd komutu kullanılır.\
>Örneğin cd cd D:\Repositories\Java-Jan-2024\src\src-console
>4. Herhangi bir editör program ile App.java dosyasının içerisine aşağıdaki programı yazınız.
>5. Komut yorumlayıcı programda, csd'nin bulunduğu dizinde aşağıdaki komutları çalıştırarak derleme işlemi yapılır:
>
>`javac csd/App.java` -> Windows dışı sistemler için\
>`javac csd\App.java` -> Windows sistemi için
>
>Derleme işleminde herhangi bir hata (error) mesajı alınmazsa derleme işlemi başarılıdır ve App.class isminde byte code üretilir.
>
>6. Komut yorumlayıcı programda aşağıdaki biçimde byte code çalıştırılır:
>
>`java csd.App`

**Anahtar Notlar:** Yukarıdaki maddelerdeki bazı zorunluluklar ilerideki konularda anlaşılacaktır.

```java
package csd;

class App {
	public static void main(String [] args)
	{
		System.out.println("Hello, World");
	}
}
```

#### 1 Şubat 2024
 
>**Dil Kavramı:** İletişimde kullanılan sembollere dil denir. Dilin kurallarına gramer denir. Bir olgu en az şu iki özelliğe sahipse bir dildir:
>1. Sentaks (syntax): Dilin öğrelerinin doğru dizilimine denir. Örneğin "I am a student" cümlesinde dilin öğeleri doğru 
dizilmiştir. Cümle "am a student I"  biçiminde yasılsaydı sentaks olarak hatalı olurdu.
>2. Semantik (semantic): Doğru dizilmiş öğelerin anlamına denir. Öğeler doğru dizilse bile cümle anlamlı değilse yine
hatalıdır. 
>
>Doğal dillerde sentaks ve semantik dışında da kavramlar bulunur. Bilgisayar bilimlerinde kullanılan dillere  bilgisayar dilleri (computer languages) denir. Bir bilgisayar dili akış (flow) içeriyorsa programlama dili (programming language) denir. Her bilgisayar dili bir programlama dili değildir. Örneğin html, XML gibi bilgisayar dilleri akış içermediği için programlama dili değildir. Java bir programlama dilidir.
>
>Programlama dilleri zaman içerisinde birbirilerinden esinlenmiştir. Hatta bazı programlama kalıpları da bir takım dillerden alınarak kullanılmaktadır


>**Derleyicinin verdiği mesajlar:** Derleyiciler koda ilişkin bazı teşhiş mesajları (diagnostics) verebilirler.
>Derleyicilerin teşhis mesajları iki gruba ayrılır:
>1. Gerçek hatalar (errors): Sentaks veya semantik olarak geçersiz bir durumda derleyicinin verdiği mesajlardır. Bu
durumda BC üretilmez. Programcının hataya yol açan durumları düzeltmesi ve derleme işlemini yapması gerekir.
>2. Uyarılar (warnings): Programcının olası programlama hatalarına yönelik mesajlardır. Uyarı mesajları ara kodun
üretimini engellemez. Ancak programcı tarafından dikkate alınmalıdır. Özel bir durum yoksa uyarı mesajlarına yol
açan durumların ortadan kaldırılması gerekir. Bazı durumlarda programcının kullandığı bazı static kod analizi
araçları da derleyici dışında bazı uyarılar verebilirler. Şüphesiz bunlar da dikkate alınmalıdır ancak hepsinin
ortadan kaldırılması gerekmeyebilir. Pratikte bir ürünün nihayi (release) versiyonunda derleyicinin tüm uyarı
mesajlarının kaldıırlmış olması gerekir.
>3. Ölümcül hatalar (fatal errors): Derleme işleminin dahi tamamlanamadığı hatalardır. Örneğin derlenecek dosyanın 
bulunamamaı, diskte yer kalmaması, sistemsel problemler oluşması vb. Bu durumda programcının ölümcül hataya yol
açan durumu ortadan kaldırıp derleme işlemini yapması gerekir. Yani ölümcül hata durumunda programcının kodu
ile bir durum yoktur.
>
>Derleme işleminin başarıyla yapılması durumunda derleyiciler ya hiç bir mesaj vermezler ya da derleme işleminin başarılı olduğu da anlaşılan mesajlar verirler.
>
>Programın çalışma zamanında oluşan hatalı durumlara genel olarak "excaption" veya "run time error" denir. Exception
handling konusuna gelene kadar bir exception oluştuğunda program abnormal bir biçimde sonlanır olarak düşüneceğiz.*

>**Anahtar Notlar:** Bir program için, programcı açısından iki durum söz konusudur: 
>1. Derleme zamanı (compile time): Derleme işlemine ilişkin süreçtir.
>2. Çalışma zamanı (run time): Programın çalıştırlması sürecidir. 
>
>Şüphesiz derleme zamanı ve çalışma birbirleri ile ilişkildir. Sonuçta bir program derlenmeden zaten çalıştırılamaz.
Her ne kadar ilişkili de olsalar birbirlerinden farklı kavramlardır.*
 
>Atom (Token): Programlama dilinin bölünemeyen en küçük birimine denir. Java programlama dilinde atomlar şunlardır:
>1. Anahtar Sözcükler (keywords/reserved words): Derleyicinin bildiği, tanıdığı sözcüklerdir. Anahtar sözcükler tek başına değişken ismi olamazlar. Örneğin:
>
>		package, int, class
>2. Değişken atomlar (variables/identifiers): İsmini programcının belirlediği ve isimlendirmeye ilişkin kuralları
olan atomlardır. Örneğin:
>
>		csd, App, String 
>3. Sabitler (literals/constants): Program içerisine doğrudan yazılan değerlere denir. Örneğin:
>
>		10, 20
>4. Operatörler (operators): Belirli işleme yol açan ve işlem sonunda bir değer üreten atomlardır. Örneğin:
>
>		a + b ifadesinde `+` bir operatördür
>		++a ifadesinde `++` bir operatördür
>5. String'ler (strings/string literals): İki tane iki tırnak (double quote) içerisinde yazılan yazılara tırnaklarıyla
birlikte string ya da string literal denir. Örneğin:
>
>		"Hello, World"
>6. Ayraçlar (delimiters/punctuators): Yukarıdakiler dışında kalan atomlardır. Örneğin
>
>		{}, ()
>
>Derleme işlemi atomlarına ayırmakla (tokenizing) başlar.
>
>**Anahtar Notlar:** Klavyeden basıldığında boşluk hissi veren karakterlere boşluk karakterleri (whitespaces) denir. 
Klavyden basılaon tipik boşluk karakterleri şunlardır: 
>
>		SPACE, TAB, ENTER

>Java'da kod yazım kuralları genel olarak şu şekilde özetlenebillir:
>1. Atomlar arasında istenildiği kadar boşluk bırakılabilir
>2. Değişken atomlar ve anahtar sözcükler kendi aralarında bitişik yazılması dışındaki tüm atomlar bitişik yazılabilir

>Atomlar arasında istenildiği kadar boşluk bırakılabilir

```java
package csd;

class App 










{
	public static void main(
		
	
	
	
	String [] args)
	{
		System.out
		
		
		
		
		
		.														println("Hello World");
	}
}
```

>Atomlar bitişik yazılabilir

```java
package csd;class App{public static void main(String[]args){System.out.println("Hello, World");}}
```

>Değişken atomlar ve anahtar sözcükler bitişik yazılamazlar

```java
packagecsd;class App{public static void main(String[]args){System.out.println("Hello, World");}} //error
```

>Programlamada derleyicinin gözrmezden geldiği kod parçalarına yorum satırları (comment lines) denir. Java'da ikiçeşit yorum satırı yazılabilir. Yorum satırlarının okunabilirliği/algılanabilirliği olumsuz etkilememesi gerekir

```java
package csd;

class App {
	public static void main(String [] args) //Burası görmezden gelinecek
	{
		/*
		 	Burası da derleyici tarafından
			görmezden gelinecektir
		 */
		System.out.println("Hello, World");
	}
}
```

#### 6 Şubat 2024
 
>Bildirim (Declaration): Bir ismin derleyiciye tanıtılmasıdır.
Bir dilin kurallarının genel biçimlerini açıklamaya yönelik pek çok notasyon kullanılmaktadır. Biz burada "açısal 
parantez-köşeli parantez" tekniğini kullanacağız. Bu teknikte zorunlu olması gerekenler açıklamada açısal parantez
içerisine alınır. Seçenekli olması gerekenler ise köşeli parantez içerisine alınır. Herhangi bir paranteze alınmayanlar
aynı şekilde bulundurulması gerekenlerdir. Ayrıca*
>
>		//...
>"burada bir takım kodlar var ancak şu an bizi ilgilendirmiyor" anlamına gelecektir.
 
##### "Hello World" Programının Genel Açıklaması:

>Bir Java programı genel olarak paketlerden (package), paketler sınıflardan (class), sınıflar da metotlardan (method)
oluşur. Paket bildiriminin genel biçimi:
>	
>	`package <isim>;`
>
>Burada isim daha sonra ele alacağımız değişken isimlendirme kurallarına uygun bir isim olmalıdır. Paketler konusu çok detaylı bir konudur, ileride detaylı olarak ele alınacaktır. Biz ilgili konuya kadar yalnızca csd paketi içerisinde kodlama yapacağız.
>	
>Sınıf bildiriminin genel biçimi şu şekildedir:

	[bildirime ilişkin bazı anahtar sözcükler] class <isim> {
		//...
	}
>Burada isim değişken isimlendirme kurallarına uygun olmalıdır. Sınıf kavramı da oldukça geniş bir kavramdır. Sınıf bildiriminin
detayları konular içerisinde ele alınacaktır. Sınıf kavramı Nesne Yönelimli Programlama Tekiniğinin de temel taşlarından
biridir.*
>
>Java'da alt programlara metot denir. Metot bildirimi (method declaration) alt programın kodlarının yazılmasıdır. Bir 
metot bildirildiğinde kodlarının çalıştırılabilmesi için çağrılması (call/invoke) gerekir. Metot bildiriminin genel
biçimi şu şekildedir:*

	[erişim belirleyici] [static] <geri dönüş değeri bilgisi> <isim>([parametre listesi])
	{
		//...
	}

>Erişim belirleyici şunlar olabilir:
>
>		public 
>		no-modifier (hiç bir şey yazmamak)
>		protected 
>		private
>İlgili konuya gelene kadar tüm metotlarımızı `public` olarak bildireceğiz. Bir metot static veya non-static olabilir. static anahtar sözcüğü yazılmadığında metot non-static olur. İlgili konuya gelene kadar tüm metotlarımızı static olarak bildireceğiz. Bir metodun geri dönüş değeri (return value) olabilir ya da olmayabilir. Bir metodun geri dönüş değeri yoksa void anahtar sözcüğü yazılır. Metot ismi değişken isimlendirme kurallarına uygun bir isim olmalıdır. Bir metodun parametreleri olabilir ya da hiç olmayabilir. Metot bildiriminde `{ ile }` arasında kalan kod bölümüne metodun gövdesi (body) denir. Metodun ne iş yaptığı yani kodları buraya yazılır. Parametre kavramı ileride ele alınacaktır. static bir metodu  çağırmanın genel biçimi şu şekildedir:

	[paket ismi].[sınıf ismi].<metot ismi>([argümanlar]);
>Argüman kavramı ileride ele alınacaktır. Bir metot çağrıldığında akış metodun kodlarına dallanır. Çağrılan metodun kodları çalıştırılır. Metot çağrısı bittiğinde akış çağıran metoda (çağrılan noktaya) geri döner. Akış main metodundan başlar. Akışın başladığı main metoduna "entry point" denir. Özel bazı durumlar dışında main metodu bittiğinde program sonlanır. print ve println metotları aldıkları değerleri ekrana basmak için kullanılan standart metotlardır. Bu metotlar non-static metotlardır. Dolayısıyla çağrıdaki System bir paket değildir. println ekrana ilgili yazıyı bastıktan sonra imleci (cursor) bir sonraki satırın başına çeker. Yani bir sonraki yazma işlemi, bir sonraki satırın başından itibaren yapılır. print metodu ise imleci en son yazdığı karakterden sonrasına çeker. Bu durumda bir sonraki yazma işlemi buradan yapılır 
	
**Anahtar Notlar:** Aslında teknik olarak print ve println gibi metotlar ekrana yazma yapmazlar. Bu metotlar ismine standard output (stdout) denilen kabaca bir dosyaya yazma yaparlar. stdout dosyası ekrana yönlendirildiğinde biz çıktıları ekranda görürüz. Kursumuzda basitleştirmek için ekran terimini kullanacağız. Benzer şekilde klavyeden okuma yapan metotlar, okumayı aslında standard input (stdin) denilen bir dosyadan yaparlar. Dosya, klavyeye yönlendirildiğinde okuma klavyeden yapılmış olur. Kursumuzda basitleştirmek için klavye terimini de kullanacağız. Masaüstü işletim sistemlerinin hemen hepsinde stdout ekrana, stdin ise klavyaye yönlendirilmiştir. Ayrıca IDE'ler de stout'u genel olarak kendi console pencerelerine yönlendirirler. 

**Anahtar Notlar:** Java'nın standart (yani hazır olarak) sınıflarının ve metotlarının buluduğu kütüğhaneye genele olarak JavaSE (Java Standard Edition) denilmektedir.
 
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{
		System.out.println("Hello, World");
		csd.Sample.foo();
		csd.Mample.bar();
		System.out.println("Goodbye, World");
	}
}

class Sample {
	//...
	public static void foo()
	{
		System.out.println("foo");
	}
}

class Mample {
	//...
	public static void bar()
	{
		System.out.println("bar");
	}
}
```

>Çağıran metodun `caller` ait olduğu sınıf ile çağrılan metodun `callee` ait olduğu sınıf aynı paket içerisindeyse  çağrı sırasında paket ismi kullanılmasına gerek yoktur. Çağıran metot ile çağrılan metot aynı sınıf içerisindeyse ve paket ismi çağrıda kullanılmamışsa sınıf ismi de yazmaya gerek yoktur. Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{
		System.out.println("Hello, World");
		Sample.foo();
		Mample.bar();
		System.out.println("Goodbye, World");
	}
}

class Sample {
	//...
	public static void foo()
	{
		tar();
		System.out.println("foo");
		Mample.bar();
	}
	
	public static void tar()
	{
		System.out.println("tar");
	}
}

class Mample {
	//...
	public static void bar()
	{
		System.out.println("bar");
	}
}
```

#### 8 Şubat 2024
 
##### Sayı Sistemleri

>Biz 10'luk sistemi (decimal system) kullanmaktayız. 10'luk sistemde sayıları ifade etmek için 10 sembol vardır:
>
>		0
>		1
>		2
>		3
>		4
>		5
>		6
>		7
>		8
>		9
>10'luk sistemde sayının her bir basamağı 10'nun kuvvetleriyle çarpılıp toplanmaktadır. Örneğin:
>
>		123.25 = 3 * 10^0 + 2 * 10^1 + 1 * 10^2 + 2 * 10^-1 + 5 * 10^-2
>Halbuki bilgisayarlar 'lik sistemi (binary system) kullanmaktadır. 2'lik sistemde sayıları ifade etmek için 2 sembol kullanılmaktadır:
>
>		0 
>		1
>2'lik sistemde sayının her bir basamağına "bit (binary digit)" denilmektedir. 2'lik sistemde sayının her basamağı 2'nin kuvvetiyle çarpılarak sayı elde edilir. Bit en küçük bellek birimidir. 8 bite 1 byte denilmektedir. Genellikle bitler 4'erli gruplanarak yazılırlar. Örneğin:
>
>		1010 0010
>Burada 1 byte'lık bir bilgi vardır. Byte temel bellek birimidir.
>
>Byte da küçük bir birimdir. Kile diğer bilimlerde "1000 katı" anlamına gelmektedir. Ancak bilgisayarlar 2'lik sistemi kullandığj için 1000 katı iyi bir kat değildir. Bu nedenle genel olarak Kilo byte için 2'nin 102uncu kuvveti olan 1024 kat kullanılır. Yani 1KB (kısaca 1K) 1024 byte'tır. Mega diğer bilimlerde kilonun 1000 katıdır. Dolayısıyla milyan kat anlamına gelmektedir. Ancak bilgisayar bilimlerinde genel olarak mega kilonun 1024 katı olarak alınır. Bu durumda 1 MB = 1020  1024 (2^20) KB'dir. Giga ise meganın 1024 katıdır. Bu durumda 1 GB = 1024  1024  1024 byte'tır ( 2^30). Giga'dan sonra tera, tera'dan sonra peta, ondan sonra da exa gelmektedir.
>
>1 byte içerisinde yazılabilecek en küçük ve en büyük sayılar şöyledir:
>
>		0000 0000 ---> 0
>		1111 1111 ---> 255
>1 byte içerisinde 1 ve 0'ların bütün permütasyonları 256 tanedir. 2 byte içerisinde en büyük sayıyı yazacak olsak şöyle olurdu:
>
>		1111 1111 1111 1111 ---> 65535
>Biz burada ikilik sistemde tamsayıları ifade ettik. Ama bütün sayıları pozitif kabul ettik. Pekiyi negatif tamsayılar nasıl ifade edilmektedir?
>
>Bugün negatif sayıların ifade edilmesi için "ikiye tümleyeb (two's complement)" sistemi denilen bir sistem kullanılmaktadır. Bu sistemde pozitif ve negatif sayılar birbirlerinin ikiye tümleyenidirler. ikiye tümleyen bire tümleyene bir eklenerek bulunmaktadır. Bir sayının bire tümleyeni sayıdaki o'ların 1, 1'lerin 0 yapılmasıyla bulunur. Bu durumda ikiye tümleyen şöyle hesaplanır. örneğin aşağıdaki sayının ikiye tümleyenini bulmaya çalışalım:
>
>		0101 0110
>Sayının bire tümleyenine bir ekleyeceğiz:
>
>		1010 1001
>		0000 0001
>		---------
>		1010 1010
>
>Aslında ikiye tümleyeni bulmanın kolay bir yolu da vardır: Sayıda sağdan sola ilk 1 görene ilk 1 dahil olmak üzere aynısı yazılarak ilerlenir. Sonra 0'lar 1, 1'ler 0 yapılarak devam edilir. Örneğin:
>
>		0101 0110
>sayının ikiye tümleyenini tek hamlede bulalım:
>
>		1010 1010
>Negatif sayıları ifade edebilmek için kullanılan ikiye tümleme sisteminde en soldaki bit işaret bitidir. Bu bit 0 ise sayı pozitif, 1 ise negatiftir. Negatif ve pozitif sayılar birbirlerinin ikiye tümleyenidir. Örneğin bu sistemde +10 yazmak isteyelim. Bunu işaret 0 yaparak yazabiliriz:
>
>		0 000 1010	--->	+10
>
>Şimdi -10 yazmak isteyelim. Bunun için +10'un ikiye tümleyenini alalım:
>
>		1 111 0110	--->	-10
>Bu sistemde +n ile -n toplandığında 0 elde edilir:
>
>		  0 000 1010	--->	+10
>		  1 111 0110	--->	-10
>		  -----------------------
>		1 0 000 0000	--->	  0
>Bu sistemde tek bir sıfır vardır. O da tüm bitleri 0 olan sıfırdır. Bu sistemde 1 byte içerisinde yazılabilecek en büyük pozitif sayı şöyledir:
>
>		0 111 1111	--->	+127
>Şimdi bunun ikiye tümleyenini alalım:
>
>		1 000 0001	--->	-127
>Pekiyi en küçük negatif sayı nedir? Bu sistemde bir tane sıfır olduğuna göre 255 tane permütasyon eşit bölünemez. Demek ki ya pozitif sayılar ya negatif sayılar bir tane daha fazla olmak zorundadır. Bu sistemde ikiye tümleyeni olmayan iki sayı vardır:
>
>		0000 0000 
>		1000 0000
>Birincisi 0'dır. İkinci sayı -127'den bir eksik olan sayıdır. O halde bu sayının -128 kabul edilmesi daha uygundur.
>
>Demek ki bu sistemde n byte içerisinde yazılabilecek en büyük pozitif sayı ilk biti 0 olan diğer tüm birleri 1 olan sayıdır. En küçük negatif sayı ise ilk biti 1 olan diğer tüm bitleri 0 olan sayıdır. Örneğin bu sistemde iki byte ile yazabileceğimiz en büyük pozitif sayı şöyledir:
>
>		0111 1111 1111 1111	--->	+32767
>En küçük negatif sayı ise şöyledir:
>
>		1000 0000 0000 000	--->	-32768
>Bu sisteme ilişkin tipik sorular ve yanıtları şöyledir:
>
>SORU: Bu sistemde +n sayısını nasıl yazarsınız?\
>CEVAP: En soldaki bit 0 yapılıp n sayısı 2'lik sistemde yazılır.
>
>SORU: Bu sistemde -n nasıl yazarsınız?\
>CEVAP: Yazabiliyorsanız doğrudan yazın. Ancak doğrudan yazamıyorsanız önce +n değerini yazın ve ikiye tümleyenini alın. Örneğin bu sistemde -1 yazalım. Önce +1 yazalım:
>
>		0000 0001	--->	+1
>Şimdi bunun ikiye tümleyenini alalım:
>
>		1111 1111	---->	-1
>SORU: Bu sistemde bir sayının kaç olduğu bize sorulsa bunu nasıl yanıtlarız?\
>CEVAP: Eğer en soldaki bit 0 ise sayının değeri doğrudan hesplanır. Eğer en soldaki bit 1 ise bu sayının negatif olduğunu gösterir. Bu durumda sayının ikiye tümleyeni alınır. Pozitifinden hareketle negatifi bulunur.
>
>Örneğin 1110 1110 sayısı kaçtır? Burada işaret biti 1 olduğuna göre sayı negatiftir. Negatif ve pozitif sayılar birbirlerinin ikiye tümleyenidirler. O zaman bu sayının ikiye tümleyenini alıp pozitifinden faydalanarak sayıyı bulalım:
>
>		0001 0010	--->	+18
>o zaman bize sorulan sayı -18'dir.
>
>Bu sistemde örneğin 1 byte içerisinde yazılabilecek en büyük pozitif sayıya 1 toplayalım:
>
>		0111 1111	--->	+127
>		1000 0000	--->	-128
>Demek ki bu sistemde bir sayıyı üst limitten taşırırsak yüksek bir negatif sayıyla karşılaırız. Benzer şekilde alt limitten taşırırsak yüksek bir	pozitif sayı ile karşılaşırız
>
>Tamsayılar ikilik sistemde "işaretsiz (unsigned)" ya da "işaretli (signed)" sistemde yorumlanabilirler. İşaretsiz sistemde sayının en soldaki biti olarak yorumlanmaz. Sayı herzaman sıfır ya da pozitiftir. İşaretli sistemde ise sayının en solundaki bit işaret bitidir. Sayı ikiye tümleyen aritmetiğine göre yorumlanır.
>
>İşlemciler aslında genellikle işaretli ve işaretsiz ayırımını yapmazlar. Çünkü bu tür de aslında aynı biçimde işleme sokulmaktadır. Sonucun yorumu değişmektedir.
>
>Pekiyi noktalı sayılar ikilik sistemde nasıl ifade edilmektedir? İşte insanlar noktalı sayıları ifade etmek için iki format geliştirmişlerdir. Bunlardan birine "sabit noktalı formatlar (fixed point formats)" diğerine "kayan noktalı formatlar (floating point formats)" denilmektedir. Sabit noktalı formatlar eski devirlerde basit bir mantıkla tasarlanmıştır. Bu formatlar bugün hala kullanılıyor olsa da büyük ölçüde artık bunların çağı kapanmıştır. Bugün kayan noktali format denilen formatlar kullanılmaktadır.
>
>Sabit noktalı formatlarda noktalı sayı için n byte yer ayrılır. Noktanın yeri önceden bellidir. Örneğin sayı 4 byte ile ifade edilsin. Noktanın yeri de tam ortada olsun. Bu durumda syının tam kısmı 2 byte ile noktalı kısmı 2 byte ile ifade edilir. Ancak sayının noktalı kısmı 2'nin negatif kuvvetleriyle kodlanmaktadır. VBöylece iki sabit noktalı sayıyı paralel toplayıcılarla kolay bir biçimde toplayabiliriz: Örneğin bu sistemde 5.25 ile 6.25 sayılarını ifade edip toplayalım:
>
>		0000 0000 0000 0101 . 0100 0000 0000 0000	--->	5.25
>		0000 0000 0000 0110 . 0100 0000 0000 0000	--->	6.25
>		-----------------------------------------
>		0000 0000 0000 1011 . 1000 0000 0000 0000	--->	11.5
>Pekiyi bu yöntemin ne dezavantajı vardır? Yöntemin en önemli dezavantajı dinamik olmamasıdır.
>
>Sabit noktalı formatların dinamik olmaması nedeniyle kayan noktalşı formatlar geliştirilmiştir. Bu formatlarda noktanın yeri sabit değildir. Noktanın yeri format içerisinde ayrıca tutulmaktadır. Noktalı sayının noktası yokmuş gibi ifade edilmesi durumunda sayının bu haline "mantis (mantissa)" denilmektedir. İşte kayan formatlarda sayı için ayrılan alanın bir bölümünde mantis bir bölümünde de "noktanın yeri" tutulmaktadır. Noktanın yerini belirleyen kısma "üstel kısım (exponential part)" denilmektedir. Tabii bir de sayının başında işaret biti bulunur. Bu durumda kayan noktalı bir sayının format aşağıdakine benzerdir:
>
>		[işaret biti] [mantis] [noktanın yeri (exponential)]
>Bugün ağırlıklı kullanılan kayan noktalı format `IEEE 754` denilen formattır. Bu formatın üç farklı genişlikte biçimi vardır:
>
>		IEEE 754 - Short Real Format 	(4 byte)
>		IEEE 754 - Long Real Format 	(8 byte)
>		IEEE 754 - Extended Real Format (10 byte)
>Bugün Intel, ARM, MIPS, Alpha, Power PC gibi yaygın işlemciler donanımsal olarak bu formatı desteklemektedir. Aynı zamanda bu format yaygın olarak Reel Sayı Ünitesi olmayan mikro denetleyicilerdeki derleyiciler tarafından da kullanılmaktadır.
>
>Kayan noktalı formatların (örneğin IEEE 754 formatının) en ilginç ve problemli tarafı "yuvarlama hatası (rounding error)" denilen durumdur. Yuvarlama hatası	noktalı sayının tam olarak ifade edilemeyip onun yerine ona yakın bir sayının ifade edilmesiyle oluşan hatadır. Yuvarlama hatası sayıyı ilk kez depolarken de oluşabilir, aritmetik işlemlerin sonucunda da oluşabilir. Tabii noktalı sayıların bir bölümü bu formatta hiçbir yuvarlama hatasına maruz kalmadan ifade edilebilmektedir. Ancak bazı sayılarda bu hata oluşabilmektedir. Bu hatayı ortadan kaldırmanın yolu yoktur. Tabii sayı için daha fazla bir ayrılırsa yuvarlama hatasının etkisi de azalacaktır.
>	
>Yuvarlama hatalarından dolayı programlama dillerinde iki noktalı sayının tam eşitliğinin karşılaştırılması anlamlı değildir. Örneğin aşağıdaki işlemde	yuvarlama hatasından dolayı sayılar sanki eşit değişmiş gibi ele alınacaktır.
>
>		0.2 + 0.1 == 0.3 (false)
>Pekiyi yuvarlama hatasının önemli olduğu ve bunun istenmediği tarzda uygulamalarda (örneğin finansal uygulamalarda, bilimsel birtakım uygulamalarda) ne yapak gerekir? İşte bunun tek yolu noktalı sayıları kayan noktalı formatta tutmamak olabilir. Bazı programlama dillerinde noktalı sayıyı kayan noktalı formatta tutmayan böylece yuvarlama hatalarına maruz bırakmayan özel türler (örneğin C#'taki decimal) vardır. Ancak bu türler işlemciler tarafından desteklenmediği için yapay türlerdir. 

>Bilgisayar dünyasında çok kullanılan diğer bir sayı sistemi de 16'lık sistemdir. 16'lık sisteme İngilizce "hexadecimal system" denilmektedir. 16'lık sistemde sayıları ifade etmek için 16 sembol bulunmaktadır. İlk 10 sembol 10'luk sistemdeki sembollerden alınmıştır. Sonraki 6 sembol alfabetik karakterlerden alınmıştır:
>
>		0
>		1
>		2
>		3
>		4
>		5
>		6
>		7
>		8
>		9
>		A
>		B
>		C
>		D
>		E
>		F
>16'lık sistemdeki her bir basamağa `hex digit` denilmektedir. Örneğin:
>
>		1FC8
>Burada 4 hex digit'lik bir sayı vardır. 16'lık sistemdeki bir sayıyı 10'luk sisteme dönüştürmek için her hex digit 16'lık kuvvetleriyle çarpılıp toplanır. Ancak 16'lık sistemdeki sayı kullanım gereği bakımından aslında 10'lu sisteme pek dönüştürülmez. 16'lık sistemdeki her bir hex digit 4 bit ile ifade edilebilmektedir:
>
>		0	0000
>		1	0001
>		2	0010
>		3	0011
>		4	0100
>		5	0101
>		6	0110
>		7	0111
>		8	1000
>		9	1001
>		A	1010
>		B	1011
>		C	1100
>		D	1101
>		E	1110
>		F	1111
>16'lık sistemden 2'lik sisteme dönüştürme yapmak çok kolaydır. Tek yapılacak şey bir hex digit'e karşılık yandaki tablodaki 4 biti getirmektir. Örneğin:
>
>		1FC9  =  0001 1111 1100 1001
>		FA3D  =  1111 1010 0011 1101
>2'lik sistemdeki bir sayı da 16'lık sisteme çok kolay dönüştürülür. Tek yapılacak şey sayıyı dörderli gruplayıp ona karşı gelen hex digit'i yazmaktır. Örneğin:
>
>		1010 0001 1110 1000 0011 0101 = A1E835
>Bilgisayar dünyasında 162lık sistem aslında 2'lik sistemin yoğun bir gösterimi olarak kullanılmaktadır. Yani 2'lik sistem çok yer kapladığı için kişiler 2'lik sistem yerine 16'lık sistemi kullanırlar. Bu nedenle belleği, dosyayı gösteren programlar bunları 2'lik sistem yerine 16'lık sistemde gösterirler.
>
>1 byte 2 hex digit ile ifade edilmektedir. Örneğin:
>
>		1A 23 5C 78
>Burada 4 byte'lık bir bilgi vardır. Örneğin 2 byte içerisinde yazılabilecek en küçük negatif işaretli sayının hex karşılığı 8000 biçimindedir. Örneğin bir byte'lık işaretli sistemde yazılabilecek en büyük pozitif sayı 7F biçimindedir. İşareti tamsayı sisteminde 4 byte içerisinde -1 sayısı FFFFFFFF biçimindedir.

>Eskiden daha fazla kullanılıyor olsa da toplamda oldukça seyrek kullanılan diğer bir sayı sistemi de 8'lik sayı sistemidir. Bu sisteme İngilizce "octal system" denilmektedir. 8'lik sayı sistemindeki her bir basamağa "octal digit" denir. Octal digit sembolleri olarak 10'luk sistemin ilk 8 sembolü kullanılmaktadır:
>
>		0
>		1
>		2
>		3
>		4
>		5
>		6
>		7
>Her octal digit 3 bir ile ifade edilebilir:
>
>		0		000
>		1		001
>		2		010
>		3		011
>		4		100
>		5		101
>		6		110
>		7		111
>Bu durumda bir octal sayı 2'lik sisteme kolay bir biçimde dönüştürülebilir:
>
>		476		100 111 110
>		741		111	100	001
>Benzer biçimde 2'lik sistemdeki bir sayı da sağdan sola üçer bir gruplandırılarak 8'lik sisteme dönüştürülebilmektedir. Örneğin:
>
>		1011 1011	=  273
>		0111 1110	=  176
>8'lik sistem de 2'lik sistemin yoğun bir gösterimi olarak kullanılmaktadır. Ancak 8'i tam ortalayamadığı için kullanımı seyrektir.

>**Tür (Type):** Bir değişkenin içerisindeki değerin ne kadar uzunlukta tutulduğunu yani bellekte ne kadar ayrılacağını ve değerin hangi formatta tutulacağını belirtir. Java'da temel türler (primitive/built-in/predefined) şunlardır:
#### Java'da Temel Türler ####

| Tür ismi | Uzunluk (byte) | Sınır Değerler                               |
| -------- | -------------- | -------------------------------------------- |
| short    | 2              | [-32768, +32767]                             |
| int      | 4              | [-2147483648, +2147483647]                   |
| long     | 8              | [-9223372036854775808, +9223372036854775807] |
| byte     | 1              | [-128, +127]                                 |
| float    | 4              | [±3.6 * 10-38, ±3.6 * 10+38]                 |
| double   | 8              | [±1.6 * 10-308, ±1.6 * 10+308]               |
| char     | 2              | [0, 65535]                                   |
| boolean  | -              | true, false                                  |

>**Açıklamalar:**
>- Java'da temel tür isimlerinin her biri birer anahtar sözcüktür.
>- int, long, short ve byte türlerine tamsayı türleri (integer/integral types) denir.
>- Tamsayı türleri için işaretli sistemde 2'ye tümleme formatını kullanılar. ?Java'da işaretsiz tamsayı türü yoktur.
>- double ve float türlerine "gerçek sayı türleri (real types)" denir. Gerçek sayı türleri için `IEEE 754` formatı kullanılır. Bu sebeple türlere "floating point types" da denilmektedir. Bu türlerle yapılan işlemlerde `IEEE 754` standardının çalışma sistemi gereği yuvarlama hataları (rounding error) oluşabilir. Bu yuvarlama hatalarının problem olabileceği uygulamalarda (örneğin  parasal ve finansal uygulamalarda) bu türler kullanılmaz. Bu tip durumlarda hangi türlerin kullanılacağı ileride ele alınacaktır.
>- Programlamada kullanılan karakterler bir tabloda tutulurlar. Bu tabloya karakter tablosu denilmektedir. Programlamada pek çok karakter tablosu kullanılabilmektedir. Daha önceleri `ASCII` denilen ve 7 bit olarak tutulan ancak daha sonra 8 bit olarak ele alınan bir karakter tablosu vardır. Daha sonraları dünyada kullanılan pek çok karakterin de tutulabilmesi için `UNICODE` isimli bir karakter tablosu kullanılmaya başlanmıştır. `UNICODE` tablosunun ilk 128 karakteri `ASCII` ile aynıdır. `UNICODE` tablosunun da çeşitleri vardır. char türü içerisinde tutulan sayı ilgili tabloda sıra numarası olarak yorumlanır. Yani char türü içerisinde tutulan sayı aslında ilgili karakter tablosunda bir karakterin sıra numarasına karşılık gelir. Bu anlamda char türü `UNICODE` tablosunun 2 byte'ı ile uyumludur. Karakter tablolarına ilişkin detaylar ileride ele alıncaktır.
>- boolean türü mantıksal olarak doğru ve yanlış kavramlarını temsil eden bir türdür. boolean türünden bir değişken iki tane değer alabilir: true, false. Bu tür örneğin flag değişkenlerde kullanılabilir. boolean türünün uzunluğu `Java Language Specifcation` dokümanında belirtilmemiştir. Zaten iki tane değer aldığı için de uzunluğunun kaç olduğunun programcı açısından önemi yoktur.
>- Her ne kadar 8 tane tür olsa da programcı tamsayı kullanacağı zaman önce int türünü düşünür, int türünün senaryoya uygun olmadığı durumda (örneğin daha fazla değer tutulması gerekirse) diğer türler tercih edilmelidir. Benzer şekilde gerçek sayılar için de öncelikle double türü düşünülmeli, duruma göre float türü tercih edilmelidir. Diğer türler (char ve boolean) zaten özel amaçlı türlerdir. Bu anlamda int ve double türlerine "default types" da denilmektedir
>- Java'da boolean türü dışında kalan temel türlerin uzunlukları her sistemde aynıdır. boolean türünün aldığı iki tane değer olduğundan yani herhangi bir sınır söz konusu olmadığından programcı açısından uzunluğun da önemi yoktur.
>- `int` türüne "integer" demek yanlış bir tanım kullanmak demektir. integer kavramı tam sayılara verilen genel bir isimdir. int ise 4 byte'lık bir tamsayı türüdür. Ayrıca JavaSE'de Integer isimli önemli bir sınıf da bulunmaktadır.

>Aşağıdaki demo örneği çalıştırıp yuvarlama hatasını gözlemleyiniz. Kodun detayları şu an için önemsizdir

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		double a = 0.1, b = 0.2;
		double c;
		
		c = a + b;
		
		System.out.printf("c = %.20f%n", c);
		
		if (c == 0.3)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
	}
}
```

#### 13 Şubat 2024
 
**Anahtar Notlar:** Yazılar da aslında bilgisayar belleğinde 2'lik sistemde sayılar biçiminde tutulmaktadır. Bir yazıyı oluşturan elemanlara "karakter" denilmektedir. İşte bir yazıda her bir karakter 2'lik sistemde bir sayı ile ifade edilir. Böylece yazı  aslında ikilik sistemde bir sayı dizisi gibi tutulmaktadır. İşte bir karakter için hangi sayının karşı geldiğini belirten tablolara "karakter tabloları" denilmektedir. Karakter tablosundaki karakter şekillerine "glyph" denilmektedir. Her karaktere tabloda bir sıra numarası verilmiştir. Buna da "code point" denilmektedir. Dünyanın ilk standart karakter tablosu `ASCII` (American Standard Code Information Interchange) denilen tablodur. `ASCII` tablosu aslında 7 bit bir tablodur. Dolayısıyla tabloda 128 tane glyph için code point bulundurulmuştur. `ASCII` dışında `IBM EBCDIC` tablosunu geliştirmiştir. Wang firması `WISCII` tablosunu kullanmıştır. `ASCII` tablosu Amerikalılar tarafından yalnızca İngilizce karakterleri ifade etmek için oluşturulmuştur. Bilgisayarlar yaygınlaşmaya başladığında farklı karakterlere sahip olan Türkiye gibi, Yunanistan gibi, Almanya gibi ülkeler bu  `ASCII` tablosunu 8 bite çıkartıp elde edilen 128'lik yeni alanı kendi karakterlerini ifade etmek için kullanmışlardır. `ASCII` tablosunun ilk yarısı (yani [0, 128] numaraları karakterleri) standarttır. Ancak ikinci yarısı "code page" adı altında farklı ülkeler tarafından farklı yerleşimler yapılarak kullanılmaktadır. DOS zamanlarında Türkçe karakterler için OEM 857 denilen code page kullanılıyordu. Daha sonra Microsoft Windows sistemlerinde Türkçe karakterler için `1254 code page`'i düzenledi. ISO, bu code page'leri standart hale getirmiştir. Bugün Türkçe karakterler `ISO` tarafından `ASCII 8859-9` Code page'i ile düzenlenmiştir. `ASCII` tablosu ve onların code page'leri uzun süre kullanılmış ve hala kullanılmakta olsa da maalesef karışıklıklara yol açmaktadır. İşte son 20 yıldır artık karakterleri 2 byte içerisinde ifade ederek dünyanın bütün dillerinin ve ortak sembollerinin tek bir tabloya yerleştirilmesi ile ismine `UNICODE` denilen bir tablo oluşturulmuştur.

[Unicode Homepage &#x1F517;](https://www.unicode.org)

`UNICODE` tablo ISO tarafından 10646 ismiyle de bazı farklılıklarla standardize edilmiştir. `UNICODE` tablonun ilk 128 karakteri standart ASCII karakterleri, ikinci 128 karakteri `ISO 8859-9` code page'indeki karakterlerdir. Bir karakter tablosundaki code point'lerin ikilik sistemde ifade edilme biçimine "encoding" denilmektedir. ASCII code page'lerinde encoding doğrudan code point'in 1 byte'lık sayı karşılığıdır. Ancak `UNICODE` tablonun değişik encoding'leri kullanılmaktadır. `UNICODE` tablonun klasik encoding'i `UTF-16`'dır. Burada code point doğrudan 16 bit bir sayı biçiminde ifade edilir. `UTF-32` encoding'inde ise code point 32 bitlik bir sayı biçiminde ifade edilmektedir. Ancak `UNICODE` tablonun en yaygın kullanılan encoding'i `UTF-8` encoding'idir. `UTF-8` kodlamasında standart ASCII karakterler 1 byte ile, diğer karakterler 2 byte, 3 byte, 4 byte ve 5 byte ile kodlanabilmekedir. Türkçe karakterler `UTF-8` encoding'inde 2 byte yer kaplamaktadr. `UTF-8` encoding'i `UNICODE` bir yazının adeta sıkıştırılmış bir hali gibi düşünülebilir. Bugün pek çok programlama editörleri default durumda dosyayı `UNICODE UTF-8` encoding'ine göre saklamaktadır.
 
>Değişken, bellekte ayrılan bir bölge ile işlem yapılmasını sağlar yani o bölgeyi temsil eder. Bir değişken için bellekte yer ayrılma detayları ileride ele alınacaktır. Değişken bildiriminin genel biçimi şu şekildedir:

	<tür> <isim>;
>Java'da bir değişken kullanılmadan önce bildirilmelidir. Değişken ismi, değişken isimlendirme kurallarına uygun herhangi bir isim olabilir. Bir değişkene bildirim noktasında değer verilmesine "ilkdeğerleme (initialization)" denir. Bir değişkenin derleyici tarafından görülebildiği kod aralığına "faaliyet alanı (scope)" denir. Bir değişkenin bellekte kalma süresine yani yaratılmasıyla yok edilmesi arasında kalan süreye "ömür (storage duration)" denir. Ömür kavramı "adresler" konusuyla birlikte ileride ele alınacaktır.
>
>Java'da 3 çeşit değişken vardır:
>1. Yerel değişkenler (local variables)
>2. Parametre değişkenleri (paraameter  variables)
>3. Sınıf veri elemanları (member variables)
>
>Bir metot içerisinde `{ ile }` arasında kalan bölgeye parantezler ile birlikte "blok (block)" denir. Bu anlamda metodun gövdesi de bir bloktur. Bir metot içerisinde istenildiği kadar içiçe veya ayrık bloklar olabilir.

```java
package csd;

class App {

	public static void main(String[] args) 
	{
		
		int a = 10; //initialization
		double b;
		
		b = 10;
		
		//...
		
		a = 20;
		
		{
			//...
			
			{
				
			}
			{
				//...
				{
					
				}
			}
		}
		
		{
			//...
		}
			
	}
}
```

>Bir blok içerisinde bildirilen değişkenlere yerel değişkenler (local variables) denir. Eğer yerel değişkenler aynı türdense bu durumda bildirim virgül ile ayrılarak yapılabilir. Yerel bir değişkenin faaliyet alanı `scope` bildirildiği yerden bildirildiği bloğun sonuna kadardır

```java
package csd;

class App {

	public static void main(String[] args) 
	{
		int a, x = 10, y;
		
		//...
			
	}
}

class Sample {
	public static void foo()
	{
		a = 10; //error
		int b;
		
		{
			int c;
			//...
			
			c = 34;
			
			b = 23;
		}
		
		b = 34;
		c = 10; //error
	}
}
```

>Aynı faaliyet alanı içerisinde aynı isimde yerel değişken bildirimi yapılamaz.

```java
package csd;

class Sample {
	public static void foo()
	{
		int a;
		double a; //error
		
		{
			float a; //error
			
			//...
		}
	}
}
```

>Farklı faaliyet alanları içerisinde aynı isimde yerel değişken bildirimi geçerlidir

```java
package csd;

class App {

	public static void main(String[] args) 
	{
		int a;
		
		//...
	}
}

class Sample {
	public static void foo()
	{
		int a;
	

		{
			int b;
			//..
		}
		
		int b;
		
		//...
	}
	
	public static void bar()
	{
		int a;
		
		//...
	}
}
```

>`System.out.println`, `System.out.print` metotları aldıkları değişkenin değerini akrana basarlar

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		int a = 10;
		double b = 3.4;
		
		System.out.println(a);
		System.out.println(b);
	}
}
```

>Java'da değer verilmemiş bir değişken kullanılamaz. Yerel değişkenlere otomatik olarak değer verilmez. Yerel bir değişkenin kullanılması için faaliyet alanı içerisinde en az bir kez programcı tarafından değer verilmiş olması gerekir

```java
package csd;

class App {

	public static void main(String[] args) 
	{
		int a; 
		int b;
		
		b = a; //error
			
		System.out.println(a); //error
	}
}
```

**Anahtar Notlar:** Programlamada artık kullanılması önerilmeyen bir kavrama  **deprecated** denir. Deprecated olmanın çeşitli gerekçeleri olabilir. Programcı deprecated olan bir şeyi özel bir durum yoksa kullanmamalıdır. Deprecated olmanın gerekçeleri ve yerine kullanılacak şeyler dokümante edilir.
 
>Değişken isimlendirme kuralları (Buradaki kurallar tüm değişken atomlar için geçerlidir):
>- Değişken isimleri bir rakam karakteri ile başlatılamaz. Uygun bir karakter ile başlatılıp istenildiği kadar rakam karakteri kullanılabilir.
>- Değişken isimlerinde alfabetik karakter kullanılabilir.
>- Değişken isimlerinde `_` (underscore) karakteri kullanılabilir. Değişken ismi alttire karakteri ile de başlatılabilir. Java 8 ile brilikte `_` karakterinin tek başına değişken ismi olması deprecated olmuştur, Java 9 ile birlikte `_` karakterinin tek başına kullanımı error olarak değerlendirilir.
>- Anahtar sözcükler tek başına değişken ismi olamazlar.
>
>**Anahtar Notlar:** Java'ya daha sonraya eklenen bazı sözcükler kullanım yerine anahtar sözcük ya da değişken gibi ele alınırlar. Aslında bu tip sözcükler JLS'de anahar sözcükler listesinde bulunmaz. Bu tip sözcüklere programlamada `contextual keywords` denilmektedir.
>- Değişken isimleri bir boşluk (whitespace) karakteri içeremez.
>- Değişken isimleri byük-küçük harf duyarlıdır (case sensitive). Aslında Java case sensitive bir dildir. Örneğin anahtar sözcüklerin tamamı küçük harf olarak yazılmalıdır.
>- Değişken isimleri `UNICODE` alfabetik karakterler içerebilir. Örneğin değişken isimlerinde Türkçe karakterler kullanılabilir.
>
>**Anahtar Notlar:** Her ne kadar değişken isimlerinde `UNICODE` alfabetik karakterler kullanılabilse de programcı İnglizce alfabedeki karakteri tercih etmelidir. Hatta programcı bir değişken ismi herhangi bir dile özgü de yazmamalıdır. Değişken isimlerinde İnglizce kelimeler tercih edilmeldir.
>- Değişken isimlerinde `$` karakteri kullanılabilir. Değişken ismi `$` karakteri ile başlatılabilir, `$` karakteri tek başına değişken ismi olabilir. Derleyiciler bazı durumlarda arakoda veya arakod içerisinde isimler verirler. Derleyiciler bu tip isimleri verirken `$` karakterini de kullanırlar. Java programcısı da hiç bir zaman `$` karakterini değişken isimlerinde kullanmaz. Bu durumda programcının belirlediği isimler ile derleyicinin belirlediği isimlerin çakışma olaslığı olmaz. Zaten `$` karakteribin değişken isimlendirmede kullanılabilmesinin nedeni yani varlık sebebi budur. JLS'de de `$` karakteri bu şekilde açıklanmış ve programcı tarafından kullanılması önerilmemiştir
>- Değişken isimlerinin okunabilirlik/algılanabilirlik açısından "kolay telaffuz edilebilir, anlamlı ve yeterince uzunlukta" olması önerilir. Bu genel bir programlama `convention`'ı olarak düşünülmelidir. Değişken isimlendirmede bazı teknikler de kullanılabilmektedir. Genel olarak kullanılan programlama diline göre bir ya da birden fazla teknik kullanılabilmektedir.
>- JLS'de değişken isimlerinin maksimum karakter sayısı ile ilgili herhangi bir söylenmemiştir. Şüphesiz bir sınıfı olur. Ancak bu sınır oldukça fazla olma eğiliminde olduğundan isimlendirmede bir sorun oluşturmaz.
 
#### 15 Şubat 2024
 
>Java'da klavyeden okuma yapmak (aslında stdin'den okuma yapmak) için pek çok sınıf ve metot bulunmaktadır. Biz kursumuzda ağırlıklı olarak `Scanner` isimli bir sınıfın `nextXXX` metotlarını kullanacağız. Belirli konulara gelene kadar bu kullanımlar birer kalıp biçiminde düşünülmelidir. Kullanılan kalıpların detayları ileride anlaşılacaktır. Kullanılan kalıplarda IDE'nin static kod analizi ya da derleyici bir takım uyarılar (warnings) verebilecektir. Aksi belirtilmediği sürece bu uyarılar dikkate alınmayacaktır.
>
>Bu kalıplarda ilgili türden giriş yapılmadığı durumlarda exception oluşur.
 
>Aşağıdaki klavyeden `int` türden değer okuma kalıbında değerler aralarında en az bir tane whitespace karakter olacak şekilde girilir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		System.out.println(total);		
	}
}
```

>Aşağıdaki klavyeden `int` türden değer okuma kalıbında değerler ENTER karakteri ile ayrılacak şekilde girilmelidir. Diğer whitespace karakterlerin kullanımı exception oluşturur

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine()); 
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());
		int total;
		
		total = a + b;
		System.out.println(total);		
	}
}
```

>Aşağıdaki klavyeden `double` türden değer okuma kalıbında değerler aralarında en az bir tane whitespace karakter olacak şekilde girilir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double total;
		
		total = a + b;
		System.out.println(total);		
	}
}
```

>Aşağıdaki klavyeden `double` türden değer okuma kalıbında değerler ENTER karakteri ile ayrılacak şekilde girilmelidir. Diğer whitespace karakterlerin kullanımı exception oluşturur

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		double a = Double.parseDouble(kb.nextLine()); 
		
		System.out.print("İkinci sayıyı giriniz:");
		double b = Double.parseDouble(kb.nextLine());
		double total;
		
		total = a + b;
		System.out.println(total);		
	}
}
```

>Aşağıdaki klavyeden `long` türden değer okuma kalıbında değerler aralarında en az bir tane whitespace karakter olacak şekilde girilir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		long a = kb.nextLong();
		long b = kb.nextLong();
		long total;
		
		total = a + b;
		System.out.println(total);		
	}
}
```

>Aşağıdaki klavyeden `long` türden değer okuma kalıbında değerler ENTER karakteri ile ayrılacak şekilde girilmelidir. Diğer whitespace karakterlerin kullanımı exception oluşturur

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		long a = Long.parseLong(kb.nextLine()); 
		
		System.out.print("İkinci sayıyı giriniz:");
		long b = Long.parseLong(kb.nextLine());
		long total;
		
		total = a + b;
		System.out.println(total);		
	}
}
```

>İfade (expression): Sabitlerden, operatörlerden ve değişkenlerden oluşan herhangi bir kombinasyona ifade denir.Bir ifade yalnızca sabitlerden ve operatörlerden oluşuyorsa bu ifadeye "sabit ifadesi (constant expression)" denir. Bir değişken veya sabit tek başına ifadedir. Ancak bir operatör tek başına bir ifade olamaz. Her ifadenin bir türü vardır. Bunun bir tane istisnası vardır, ileride ele alınacaktır
 
>Bir metodun geri dönüş değeri bilgisi yerine bir tür ismi yazılırsa, bu metodun geri dönüş değeri (return value)" vardır denir. Tersinde bir metodun geri dönüş değeri varsa geri dönüş değeri bilgisi yerine bir tür yazılır. Bir metodun geri dönüş değeri varsa, o metodun çağrısı bittiğinde çağrılan noktaya bir değer ile geri döner. Bir metodun geri dönüş değeri yoksa geri dönüş değeri bilgisi yerine void anahtar sözcüğü yazılır. Metodun geri dönüş değeri yoksa sonlandığında çağrılan noktaya yalnızca geri döner, bir değer aktarılmaz. Bir metodun geri dönüş değeri metot içerisinde `return` deyimi ile oluşturulur. `return` deyiminin genel biçimi şu şekildedir:

	return [ifade];
>Görüldüğü gibi `return` deyimi tek başına veya bir ifade ile kullanılabilir. Bu kullanımların detayları bölüm içerisinde anlaşılacaktır. `return` deyimi nasıl kullanılırsa kullanılsın, akış `return` deyimine geldiğinde metot sonlanır. Yani `return` deyiminin birinci görevi metodu sonlandırmaktır. `return` deyimi ifade ile kullanılmışsa ifadenin değeri çağrılan noktaya aktarılır. Buna geri dönüş değeri denmesinin nedeni budur

>Aşağıdaki demo örnekte add metodu çağrıldığında kullanıcıdan iki değer istenmiş ve o değerlerin toplamına geri dönülmüştür. main metodu içerisinde ise add metodu çağrılmış, geri dönüş değeri 3 ile çarpılıp sonuç result değişkenine atanmıştır

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		int result;
		
		result = Util.add() * 2;
		
		System.out.println(result);						
	}
}

class Util {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		return total;		
	}
}
```

>Geri dönüş değeri olan bir metot içerisinde `return` deyiminin tek başına kullanımı geçersizdir

```java
package csd;

class Util {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		return;	//error	
	}
}
```

>Geri dönüş değeri olan bir metot içerisinde akışın her noktasında metodun `return` edebilmesi gerekir. Yani derleyici açısından, metodun geri dönüş değeri varsa metot içerisinde metodun bir değer döndüremeyeceği bir durum oluşmamalıdır
 
>Aşağıdaki demo örnekte geri dönüş değeri olan add metodunda bir değer döndürülmediği için error oluşur

```java
package csd;

class Util {
	public static int add() //error
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;	
			
	}
}
```

>Aşağıdaki demo örnekte geri dönüş değeri olan add metodunda `total > 10` koşulu gerçeklenmediğinde metot bir değere dönemeyeceğinden dolayı error oluşur

```java
package csd;

class Util {
	public static int add() //error
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int total;
		
		total = a + b;
		
		if (total > 10)
			return total;	
		
	}
}
```

>Aşağıdaki demoörnekte return deyimine ilişkin ifadenin değeri a ile b'nin değerlerinin toplamından elde edilmiştir. Bu tarz ifadelerde okunabilirliğin/algılanabilirliğin olumsuz etkilenmemesine dikkat edilmelidir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		int result;
		
		result = Util.add() * 2;
		
		System.out.println(result);						
	}
}

class Util {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		return a + b;
	}
}
```

>Aşağıdaki demo örnekte add metodunun geri dönüş değeri getInt metodunun geri dönüş değeri yapılmıştır. Yani, getInt metodu add metodu çağrıldıktan sonra elde edilen değere geri dönmektedir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		int result;
		
		result = Sample.getInt();
		
		System.out.println(result);						
	}
}

class Sample {
	public static int getInt()
	{
		System.out.println("İki tane tamsayı değeri girmeniz gerekiyor:");
		
		return Util.add();
	}
}

class Util {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		return a + b;
	}
}
```

>Metot çağrısı için derleyici geçici değişken `temporary variable` yaratan ve işleme sokulan bir kod üretir. Geçici değişkenin türü çağrılan metodun geri dönüş değeri türü ile aynıdır. Aşağıdaki demo örnekte `***` ile belirtilen deyimi için üretilen yaklaşık kod şu şekildedir:
>
>		int temp = Util.add();
>	
>		result = temp  2;
>Bu durumda geri dönüş değeri olan bir metot çağrısı geçici değişkene yapılan bir atama işlemidir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		int result;
		
		result = Util.add() * 2; //***
		
		System.out.println(result);						
	}
}

class Util {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		return a + b;
	}
}
```

>Geri dönüş değeri olan bir metot geri dönüş değeri yokmuş gibi yani geri dönüş değeri işleme sokulmadan çağrılabilir. Şüphesiz metodun da buna uygun olması gerekir. Aşağıdaki demo örnekte add metodu toplam değerini ekrana bastığı için ve add metodunu çağıran kod da yalnızca ekrana basmı kısmı ile ilgilendiği için metodu doğrudan çağırmaktadır. Demo örnekteki add metodu toplam değerini ekrana basmasaydı, yani sadece geri döndürseydi, doğrudan çağrılmasının  algoritmik açıdan etkisi olur muydu?

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		Util.add();
	}
}

class Util {
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;
		
		System.out.println(total);
		
		return total;
	}
}
```

#### 20 Şubat 2024
 
>Bir metodun geri dönüş değeri yoksa geri dönüş değeri bilgisi yerine `void` anahtar sözcüğü yazılır. Geri dönüş değeri olmayan metotlara "void method" da denilmektedir. `void` bir metot sonlandığında çağrılan noktaya bir değer ile dönmez. Bu durumda `void` metot içerisinde `return` deyimi bir ifade ile kullanılamaz. İstenirse metodu sonlandırmak için tek başına kullanılabilir.
>
>Bu anlamda `void` metotlarda `return` deyimi zorunlu değildir. `void` bir metot geri dönüş değeri varmış gibi çağrılamaz. Yani geri dönüş değeri varmış gibi işleme sokulamaz
 
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		Util.printTotal();
	}
}

class Util {
	public static void printTotal()
	{
		int total = add();
		
		System.out.println(total);
	}	
	
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;		
		
		return total;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;


class Util {
	public static void printTotal()
	{
		int total = add();
		
		System.out.println(total);
		
		return total; //error
	}	
	
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;		
		
		return total;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		Util.printTotal();
	}
}

class Util {
	public static void printTotal()
	{
		int total = add();
		
		if (total <= 0)
			return;		
		
		System.out.println(total);		
	}	
	
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;		
		
		return total;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		int result = Util.printTotal() * 2; //error
		
				
	}
}

class Util {
	public static void printTotal()
	{
		int total = add();
		
		if (total <= 0)
			return;		
		
		System.out.println(total);		
	}	
	
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;		
		
		return total;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		int result = Util.printTotal() * 2; //error
				
	}
}

class Util {
	public static void printTotal()
	{
		int total = add();		
	
		System.out.println(total);		
	}	
	
	public static int add()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();		
		int total = a + b;		
		
		return total;
	}
}
```

**Anahtar Notlar:** `void` bir metot çağrısı da bir ifadedir. Ancak bu ifadenin türü yoktur. void bir metot çağrısına ilişkin ifadelere `void expressions` denilmektedir
 
**Anahtar Notlar:** Bir metodun geri dönüş değeri o metodun bir çıktısıdır (output).
 
**Anahtar Notlar:** Java'da bir metot bir tane değere geri dönebilir
 
>Metodun gövdesinde önce parantez içerisinde bildirilen değişkenlere metot parametre değişkenleri denir. Metot parametre değişkenleri virgül ile ayrılır. Değişkenler aynı türden olsa bile tür bilgisi her biri için yazılmalıdır. Metot parametre değişkenleri faaliyet alanı olarak metodun başında bildirilen yerel değişkenler gibidir. Yani ilgili metot boyunca görülebilirdir. Metot çağrısında metoda geçilen ifadelere argüman (argument) denir. Bu anlamda metodun parametre değişkenleri aslında metodun girdileridir (input). Bir metodun kaç tane parametresi varsa o kadar sayıda argüman ile çağrılmalıdır. Parametre değişkenleri değerlerini metot çağrısında, ilgili parametreye geçilen ifadenin değeri olarak alırlar. Yani metot çağrısında argümana ilişkin ifade önce hesaplanır ve değeri parametre değişkenine aktarılır. Bu anlamda argümanlardan parametrelere aktarım da bir atama işlemidir
 
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int x = kb.nextInt();
		int y = kb.nextInt();		
		int result;
		
		result = Util.add(x, y);
		
		System.out.println(result);
	}
}

class Util {
	public static int add(int a, int b)
	{
		return a + b;
	}
}
```

>Aşağıdaki örnekte b değişkeni tür bilgisi yazılmadığından error oluşur

```java
package csd;

class Util {
	public static int add(int a, b) //error
	{
		return a + b;
	}
}
```

>Aşağıdaki örnekte 2 parametreli add metodu 3 tane argüman ile çağrıldığından error oluşur

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int x = kb.nextInt();
		int y = kb.nextInt();		
		int result;
		
		result = Util.add(x, y, 10); //error
		
		System.out.println(result);
	}
}

class Util {
	public static int add(int a, int b)
	{
		return a + b;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int x = kb.nextInt();
		int y = kb.nextInt();		
		int result;
		
		result = Util.add(x + 2, y * 2);
		
		System.out.println(result);
	}
}

class Util {
	public static int add(int a, int b)
	{
		return a + b;
	}
}
```

>**Anahtar Notlar:** Java'da 3 yerde atama işlemi yapılır: 
>1. Yalın atama işlemi
>2. Metodun geri dönüş değerinin geçici değişkene atanması
>3. Argümandan parametre değişkene aktarım
>	
>Özel bazı durumlar dışında atama işlemine ilişkin kurallar tüm atama işlemleri için geçerlidir
 
#### 22 Şubat 2024

>Metotlar ne işe yarar? Ya da başka bir deyişle bir problemin çözümünde neden metotlar yazalım?
>
>Aşağıda metot yazılmasına ilişkin durumlar genel olarak ele alınmıştır:
>- Bir işi çok fazla yerde yapmak kod tekrarına yol açar. Yazılım geliştirmede temel prensip olarak "zorunlu olmadıkça kod tekrarı yapılmamalıdır (do not repeat yourself)" biçimindedir. Bu durumda programcı bir metot yazarak ilgili yerlerde o metodu çağırır.
>- Bir problemin çözümü metot çağırma yerine her yerde kodun yazılması biçiminde "implemente" edilmişse, bu durumda programcı problemin çözümünde bir değişiklik yapmak isterse veya bir hata olduğunu görüp düzeltmek isterse her yerde bu değişiklikleri yapmak zorundadır. Bu da çoğu zaman zor olacaktır.
>- Bir problemin çözümü metot çağırma yerine her yerde kodun yazılması biçiminde "implemente" edilmişse, bu durumda kodun okunabilirliği/algılanabilirliği azalabilir. Yani metot çağırarak kodun okunabilirliği/algılanabilirliği artırılmış olur.
>- Metot yazıldığında başka projelere taşınarak da kullanılabilir (code reusability).
>- Metodu çağıran programcı metodun nasıl yazıldığına ilişkin detayları bilmek zorunda değildir. Çünkü metodun çağrıldığı noktada metodun nasıl yazıldığının önemi yoktur. Ne yaptığı önemlidir.
>- Bir kod parçasının metot olarak yazılması onun bağımsız olarak test edilip doğrulanması veya varsa hataların
düzeltilmesi açısından da önemlidir.
>
>**Anahtar Notlar:** Kurs içerisinde ele alacağımız Nesne Yönelimli Programlama Tekniği'ne (Object Oriented Programming Paradigm) ilişkin kavramlar ile kodun parçalara ayrılması metotlar dışında daha yüksek seviyede de yapılabilecektir.

>`System.out.printf` metodu ile formatlı yazdırma yapılabilir. printf metodunun birinci parametresine geçien argüman bir yazı (string literal vb.) olmalıdır. Bu metot birinci parametresi ile birlikte değişken sayıda argüman alabilecek şekilde tasarlanmıştır. Değişken sayıda argüman alan metotların (vararg methods) bildiriminin nasıl yapıldığı bu bölümde ele alınmayacaktır. printf metodunun birinci parametresine ilişkin yazının içerisinde `%` karakteri ile birlikte özel bazı karakterler kullanılabilmektedir. Bu özel karakterlere format karakterleri (format specifiers) denir. Bir format karakterinin yazı içerisinde `%` karakteri ile birlikte kullanılmasına ise yer tutucu (place holder) denir. Bir format karakteri özel bazıları dışında bir türe karşılık gelir ve o yer tutucu yerine printf'e geçilen argümanların değerleri yerleştirilerek yazı formatlanır. Format karakterlerinin bazıları şunlardır:
>- d: Tamsayı türleri için kullanılır. Sayının değerinin decimal olarak formatlanmasını sağlar.
>- x veya X: Tamsayı türleri için kullanılır. Sayının değerinin hexadecimal olarak formatlanmasını sağlar.
>- h veya H: Tamsayı türleri için kullanılır. Sayının değerinin hexadecimal olarak formatlanmasını sağlar.
>- o: Tamsayı türleri için kullanılır. Sayının değerinin octal olarak formatlanmasını sağlar.
>- f: Gerçek sayı türleri kullanılır.  
>- c: char türü için kullanılır.
>- b: boolean türü için kullanılır.
>- n: İmleci (cursor) bir sonraki satırın başına çekmek için kullanılır.
>- %: % karakterinin karşılığıdır. 
>	
>Bu format karakterleri dışında da format karakterleri vardır. Kurs boyunca konular içerisinde ele alınacaktır. Format karakterlerine ilişkin detaylar yine ileride ele alınacaktır.
>
>**Anahtar Notlar:** `printf` metodu gibi kullanılan ancak printf'den daha fazla karşımıza bazı metotlar için printf metodunun formatlama detaylarının öğrenilmesi önemlidir

>d, x, X, h, H ve o format karakterleri

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int x = kb.nextInt();
		int y = kb.nextInt();		
		
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		System.out.printf("%x + %x = %x%n", x, y, x + y);
		System.out.printf("%X + %X = %X%n", x, y, x + y);
		System.out.printf("%h + %h = %h%n", x, y, x + y);
		System.out.printf("%H + %H = %H%n", x, y, x + y);
		System.out.printf("%o + %o = %o%n", x, y, x + y);
	}
}
```

>Tamsayıya ilişkin format karakterlerinde `%` ile format karakteri arasında yazılan sayı hizalamak (alignment) için kullanılabilir. Bu sayının pozitif olması gerekir. `%` ile format karakteri arasında yalnızca pozitif bir sayı sayı yazıldığında formatlanan sayının basamak sayısı `%` ile format karakteri arasındaki sayıdan küçükse soluna verilen sayı kadar space karakteri eklenir. Eğer `%` ile format karakteri arasında verilen sayıdan önce sıfır sayısı yazılırsa space yerine sıfır değeri ile formatlama yapılır. Tamsayılara ilişkin format karakterlerinin başka detaylı kullanımları da vardır.
>
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Tarih bilgisini gün ay yıl olarak giriniz:");
		int day = kb.nextInt();
		int month = kb.nextInt();		
		int year = kb.nextInt();
		
		System.out.printf("%02d/%02d/%04d%n", day, month, year);
		System.out.printf("%2d/%2d/%4d%n", day, month, year);		
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		System.out.printf("a = %d%na = %08X%n", a, a);
				
	}
}
```

>`%` karakterinin `%` olarak formatlanabilmesi için yine `%` karakteri ile kullanılması gerekir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int ratio = kb.nextInt();
		
		System.out.printf("Oran:%%%d%n", ratio);		
	}
}
```

>f format karakteri

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		double ratio = kb.nextDouble();
		
		System.out.printf("Oran:%%%f%n", ratio);		
	}
}
```

>f format karakteri için % ile f arasında . ve pozitif bir sayı yazıldığında formatlanacak gerçek sayının noktadan sonraki kısmının kaç basamak olarak gösterileceği belirlenir. Gerçek sayının geri kalan basamakları bilimsel yuvarlanarak formatlanır

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		double ratio = kb.nextDouble();
		
		System.out.printf("Oran:%%%.2f%n", ratio);		
	}
}
```

>c format karakteri

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		char c;
		
		c = 68;
		
		System.out.printf("c = %c%n", c);
	}
}
```

>printf metodunda geçilen argümanların türleri ile uyumsuz format karakteri kullanılması durumunda genel olarak exception oluşur

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int day = kb.nextInt();
		
		System.out.printf("a = %f%n", day);			
	}
}
```

>Tam sayılarla bölme işleminde elde edilen sonucun noktadan sonraki kısmı atılır. Yani tamsayılarla bölme işleminde sonuç yine tamsayı çıkar 
>
>Tam sayılarla bölme işleminde paydanın değeri sıfır ise exception oluşur.
>	
>Aşağıdaki demo örneği çeşitli değerlerle çalıştırıp sonuçları gözlemleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c;
		
		c = a / b;
		
		System.out.printf("c = %d%n", c);		
	}
}
```

>`IEEE 754` formatında bazı özel değerler bulunur. Bu değerler Matematiksel olarak bazı kavramları temsil ederler. Örneğin `Infinity` ve `-Infinity` sırasıyla Matemetikteki "artı sonsuz" ve "eksi sonsuz" değerlerine karşılık gelir. `NaN` değeri de Matematikteki belirsizliği (indeterminate) temsil eden değerdir. Bu durumda gerçek sayılarda bölme işleminde paydanın sıfır olması durumunda da işlem yapılabilmektedir. Aşağıdaki demo örneği çeşitli değerler ile çalıştırıp sonuçları gözlemleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c;
		
		c = a / b;
		
		System.out.printf("c = %f%n", c);		
	}
}
```

#### 27 Şubat 2024
 
>Neden standart metotları kullanmalıyız? Standart olarak var olan bir metodu programcı yazmalı mıdır?
>
>Java'da standart olarak (yani JavaSE'de bulunan) metotlatın kullanılmasının bazı önemli avantajları şunlardır:
>- Okunabilir/algılanabilir kodlar yazılır	
>- Testleri yapılmıştır ve yeterince etkin olarak yazılmıştır. Hatta zamanla duruma göre daha etkin hale getirilecek şekilde yazılabilmektedir.
>- Taşınabilirdir. Yani standart metotların çağrıldığı kodlar herhangi bir üçüncü parti koda ya da kütüphaneye ihtiyaç duymadan derlenebilir.
>- Programcının bir uygulama geliştirirken yalnıca uygulamaya ilişkin domain'e odaklanmasını sağlar. 	 
>- Bazı metotları yazmak için başka detay konuların da bilinmesi gerekir.
>
>Bu durumda bir Java programcısının çözmesi gereken bir problem için, JavaSE'de problemin çözümüne ilişkin metotlar varsa onları kullanması gerekir, yoksakullandığı bazı iyi kütüphanelerin içerisinde varsa onu kullanması gerekir. Burada da yoksa bu durumda programcı o metodu yazmalıdır. Ancak bu durum programcının kullandığı bir metodu standart olsun ya da olmasın nasıl yazıldığını gözardı etmesi anlamına gelmemelidir. Programcı programlama yaşamı boyunca hepsini olmasa da hazır olarak kullandığı metotların nasıl yazıldığını (implementation) öğrenmesi gerekir.
 
**Anahtar Notlar:** Bir metodun ne iş yaptığına ilişkin detaylar nasıl öğrenilecektir? Bunun için tipik olarak metot için bir dokümantasyon oluşuturur. JavaSE içerisinde bulunan standart metotların (ait olduğu sınıfların da) dokümantasyonu [Oracle Docs &#x1F517;](https://docs.oracle.com) sitesinde çeşitli sayfalarda yayınlanmaktadır. Ancak yine de ilgili dokümantasyon tüm detayıyla öğretemeyebilir. Genel olarak Java dokümanları `javadoc` konu hakkında fikir vermek için yazılır. Duruma göre programcı başka kaynaklardan öğrenmek zorunda kalabilir.
 
>`java.lang` paketi içerisinde bulunan Math sınıfının Matematiksel işlemlere yönelik çeşitli metotları vardır. Bu metotların bazıları pek yerde kullanılır. Bazıları ise Matematiksel işlemlerde kullanılır. Burada çok kullanılan bazıları ele alınacaktır. Java programcısı Matematiksel işlemler gerektiğinde önce bu sınıfa bakmalı varsa bu sınıfın elemanlarını kullanmalıdır.
	
**Anahtar Notlar:** java.lang paketi içerisinde bulunan sınıf isimleri doğrudan kullanılabilir. Konunun detayları ileride ele alınacaktır.
 
>`Math` sınıfının `sqrt` metodu parametresi ile aldığı double türden değerin kareköküne geri döner. `sqrt` metoduna negatif bir argüman geçildiğinde `NaN` değerine geri döner

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		
		System.out.printf("sqrt(%f) = %f%n", a, Math.sqrt(a));
	}
}
```

>`Math` sınıfının `pow` metodu kuvvet almak için kullanılır

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Tabanı ve üssü giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		System.out.printf("pow(%f, %f) = %f%n", a, b, Math.pow(a, b));
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `double` türden iki noktaya ilişkin koordinat bilgilerine göre iki nokta arasındaki Euclid uzaklığına geri dönen `distance` isimli metodu `PointUtil` isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>	
>Euclid Uzaklığı fomulü:
>
>$$\sqrt{(x1 - x2) ^ 2 + (y1 - y2) ^ 2}$$

```java
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
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `double` türden iki noktaya ilişkin koordinat bilgilerine göre iki nokta arasındaki Euclid uzaklığına geri dönen `distance` isimli metodu `PointUtil` isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>	
>Euclid Uzaklığı fomulü:
>
>$$\sqrt{(x1 - x2) ^ 2 + (y1 - y2) ^ 2}$$

```java
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
```

#### 29 Şubat 2024
 
>`Math` sınıfının logaritma fonksiyonuna ilişkin metotları şunlardır:
>
>		log, log10, log1p

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		
		System.out.printf("log(%f) = %f%n", a, Math.log(a));
		System.out.printf("log10(%f) = %f%n", a, Math.log10(a));
		System.out.printf("log1p(%f + 1) = %f%n", a, Math.log1p(a));
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		
		System.out.printf("log(%f, %f) = %f%n", a, b, MathUtil.log(a, b));
	}
}

class MathUtil {
	public static double log(double a, double b)
	{
		return Math.log(b) / Math.log(a);
	}
}
```

>`Math` sınıfının `PI` ve `E` elemanları

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}
}
```

>`Math` sınıfının trigonometrik işlem yapan metotları radyan (radians) ölçü birimiyle çalışırlar

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Derece bilgisini giriniz:");
		double a = kb.nextDouble();
		
		System.out.printf("sin(%f) = %f%n", a, Math.sin(Math.toRadians(a)));
	}
}
```

>`Math` sınıfının `abs` metotları

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		System.out.printf("|%d| = %d%n", a, Math.abs(a));
	}
}
```

>`Math` sınıfının `min` ve `max` metotları

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("min(%d, %d) = %d%n", a, b, Math.min(a, b));
		System.out.printf("max(%d, %d) = %d%n", a, b, Math.max(a, b));
	}
}
```

>`Math` sınıfının `min` ve `max` metotları ile 3 tane sayının en küçüğünün ve en büyüğünün bulunması

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Üç sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		System.out.printf("min(%d, %d, %d) = %d%n", a, b, c, Math.min(Math.min(a, b), c));
		System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, Math.max(Math.max(a, b), c));
	}
}
```

>`Math` sınıfının tamsayı değerine yuvarlayan önemli bazı metotları

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();
		
		System.out.printf("round(%f) = %d%n", a, Math.round(a));
		System.out.printf("round(%f) = %f%n", a, Math.rint(a));
		System.out.printf("ceil(%f) = %f%n", a, Math.ceil(a));
		System.out.printf("floor(%f) = %f%n", a, Math.floor(a));
	}
}
```

#### 5 Mart 2024
 
>Sabitler (Literals): Program içerisinde doğrudan yazılan bir değere sabit (literal/constant) denir.
>
>**Anahtar Notlar:** Anımsanacağı gibi iki tırnak içerisindeki yazılara `string literal` denir.
>	
>Sabitlerin de türleri vardır. Sabitlerin türleri derleme aşamasında yani derleyici tarafından tespit edilir.
>	
>**Anahtar Notlar:** Derleyicinin bir ifadenin türünü tespit etmesine genel `type inference/deduction` denilmektedir.
>	
>Sabitlerin türleri aşağıdaki kurallara göre belirlenir:
>- Sayı nokta içermiyorsa, sonuna herhangi bir ek almamışsa ve int türü sınırları içerisinde kalıyorsa `int` türden bir sabittir. Sayı, nokta içermiyorsa fakat int türü sınırları dışındaysa error oluşur.
>
>Örnekler:
> 
>		100, 2000000000 vb.
>- Sayı nokta içermiyorsa ve sonuna L (küçük veya büyük harf olarak) son ekini almışsa `long` türdendir. L sonekini almış bir sabit long türü sınırları dışındaysa error oluşur.
>
>Örneğin:
>
>		10L, 4000000000L vb.	
>**Anahtar Notlar:** Küçük harf L soneki 1(bir) sayısına özellikle bazı yazı türlerinde benzediği okunabililik açısından
kullanılması tavsiye edilmez.
>- Java'da `byte` ve `short` türden sabit yoktur
>- Sayı nokta içeriyorsa ve sonuna herhangi bir ek almamışsa `double` türdendir.
>
>Örneğin:
>
>		3.4, 6.6 vb.
>- Sayı nokta içersin ya da içermesin sonuna D (küçük veya büyük) ekini alıyorsa double türdendir.
>
>Örneğin:
>
>		4.5D, 5D, 5.6d vb.
>- Sayı nokta içersin ya da içermesin sonuna F (küçük veya büyük) ekini alıyorsa float türdendir.
>
>Örneğin:
>
>		3.4F, 7f, 6.8F vb.
>
>**Anahtar Notlar:** Nokta içeren ve noktadan sonraki kısmın tamamı sıfır olmayan bir sabitin (yani double türden sabitin) sonuna F (küçük veya büyük) eki getirildiğinde, sayının değeri float türü ile temsil edilemiyorsa en yakın değere
yuvarlanır (rounding error). 
>
>- `boolean` türden iki tane sabit vardır: `true`, `false`.	
>- Tek tırnak içerisinde yazılan karaterlere ilişkin sembollere tırnaklarıyla beraber karakter sabitleri `character literals` denir. Karakter sabitleri `char` türdendir. Tek tırnak içerisinde özel bazı durumlar dışında tek bir karakter yazılır. Aksi durumda error oluşur. Bir karakter sabiti ilgili karakterin karakter tablosundaki sıra numarasına karşılık gelir. Aslında biz char türden sabit yazarak o sabite ilişkin karakterin sıra numarasını elde etmiş oluruz. Bu sıra numarasını `char` türden bir değişken içerisinde saklayarak mantıksal olarak o karakteri tutmuş oluruz. Bazı karakterler klavyedeki tuş kombinasyonları ile doğrudan yazılamazlar. Bazı karakterler ise doğrudan ekrana basılamazlar `non-printable`. Bu tarz karakterler doğrudan tek tırnak içerisinde karakter sabiti olarak yazılamazlar. Bu karakterler ters bölü `\` karateri ile birlikte özel bir karakter kullanılarak tek tırnak içerisinde yani karakter sabiti olarak yazılırlar. Ters bölü ile yazılan karakterlere `escape sequence` karakterler denir. Java'da desteklenen escape sequence karakterler şunlardır:

|       |                          |
| ----- | ------------------------ |
| '\n'  | Line Feed (LF)           |
| '\r'  | Carriage Return (CR)     |
| '\t'  | Tabular (horizontal tab) |
| '\f'  | Form feed                |
| '\b'  | backspace                |
| '\\'' | single quote             |
| '\\"' | double quote (optional)  |
| '\\'  | back slash               |
| '\0'  | null karakter            |

>Escape sequence karakterler string literal içerisinde kendi anlamlarındadır.

>`Line Feed` karakter sabiti

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		char c;
		
		c = '\n';
		
		System.out.print("Hello, World");
		System.out.print(c);
		System.out.println("Goodbye, World");
	}
}
```

>`Carriage Return` karakter sabiti
>
>**_Dikkat:_** Aşağıdaki örneği işletim sisteminizin "komut yorumlayıcı" programı ile çalıştırınız. Kullandığınız IDE'nin console penceresi farklı yorumlayabilir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		char c;
		
		c = '\r';
		
		System.out.print("Hello, World");
		System.out.print(c);
		System.out.println("Hi");
	}
}
```

>Tek tırnak karakter sabiti ters bölü ile yazılır yani bu karakter sabiti de bir `escape sequence` karakterdir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		char c;
		
		c = '\'';
		
		System.out.println(c);
	}
}
```

>İki tırnak karakter sabiti iki şekilde yazılabilir

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		char c1, c2;
		
		c1 = '\"';
		c2 = '"';
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
```

>Ters bölü karakter sabiti de escape sequence karakter olarak yazılır

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		char c;
		
		c = '\\';	
		
		System.out.println(c);		
	}
}
```

>Aşağıdaki örnekte `LF` karakteri string literal içerisinde kullanılmıştır

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.println("Hello\nWorld");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz. Örnekte `tab` ve `LF` karaktersabitlerinin yazı içerisinde kullanıldığına dikkat ediniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.println("C:\test\names.txt");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz. Örnekte ters bölü karakteri için `escape sequence` kullanıldığına dikkat ediniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.println("C:\\test\\names.txt");
	}
}
```

>String literal içerisinde ters bölü ile birlikte `escape sequence` olarak desteklenmeyen bir karakter kullanımı error oluşturur

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.println("C:\virtual\names.txt"); //error
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.println("\\\\test\\names.txt");
	}
}
```

>Tek tırnak karakteri string literal içerisinde doğrudan ya da `escape sequence` olarak kullanılabilir. İki kullanım tamamen aynı anlamdadır. İki tırnak karakteri string literal içerisinde ancak `escape sequence` olarak kullanılabilir

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.println("'zonguldak'");
		System.out.println("\'zonguldak\'");
		System.out.println("\"zonguldak\"");
	}
}
```

>String literal içerisinde ters bölü ile birlikte `escape sequence` olarak desteklenmeyen bir karakter kullanımı error oluşturur

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.println("C:\virtual\names.txt"); //error
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.println("`zonguldak`");
	}
}
```

**Anahtar Notlar:** Java 12 ile birlikte ismine "text block" denilen bir string sabiti yazma yöntemi de eklenmiştir. Text block'lar ileride ele alınacaktır
 
>Sayının noktadan sonraki kısmı yani ondalık kısmının tamamı sıfırsa noktadan sonra sıfır yazılmayabilir. Benzer şekilde sayının noktadan önceki kısmı yani tam kısmının tamamı sıfırsa noktadan önce sıfır yazılmayabilir. Yani `1.0` sabiti ile `1.` sabiti birebir aynıdır, benzer şekilde `0.1` sabiti ile `.1` sabiti birebir aynıdır

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.println(1.);
		System.out.println(1.0);
		System.out.println(0.1);
		System.out.println(.1);
	}
}
```

>Sabitlerin bilimsel/üstel gösterilişi. Bu şekilde yazılan sabitler `double` türdendir

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.printf("%.0f%n", 6.02E23);
	}
}
```

>Sabitlerin bilimsel/üstel gösterilişi. Bu şekilde yazılan sabitler `double` türdendir

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		System.out.printf("%.0f%n", 6.02e23);
	}
}
```

>Java 7 ile birlikte sabitlerin basamakları arasında `_` (alttire) karakteri kullanılabilir duruma gelmiştir. Alttire karakteri yalnızca basamaklar arasında istenildiği kadar kullanılabilir. Bu kullanım duruma göre okunabilirliği artırır

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		int a = 1_111_237_809;
		double b = 345_789.987_789;
		
		System.out.printf("a = %d, b = %f%n", a, b);	
	}
}
```

>Tamsayı sabitleri decimal dışında, hexadecimal, octal ve Java 7 ile birlikte binary olarak gösterilebilmektedir. Sabitin başında bir ek yoksa decimal, `0x` (x küçük veya büyük olabilir) varsa hexadecimal, sıfır varsa octal ve `0b` (b küçük veya büyük olabilir) binary olarak ele alınır. Şüphesiz sayının basamakları sayı sistemine uygun olmalıdır. Aksi durumda error oluşur. Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		int a = 10;
		int b = 0xA;
		int c = 012;
		int d = 0b1010; //Since Java 7
		
		System.out.printf("a = %d, b = %d, c = %d, d = %d%n", a, b, c, d);
	}
}
```

>Sayı sistemi ile gösterilişte de alttire karakteri konabilir. Alttire karakteri basamakların arasına gelebileceğinden sabitin önekinden önce veya sonra kullanılması error oluşuturur. Bunun bir tek istisna durumu `octal` sabitin öneki olan sıfır'dan sonra alttire karakteri konabilir
 
>Aşağıdaki örnekte sabitin octal olarak yazıldığına dikkat ediniz

```java
package csd;

class App {
	public static void main(String[] args) 
	{		
		int a = 012;
		
		
		System.out.printf("a = %d%n", a);
	}
}
```

#### 7 Mart 2024
 
>Operatörler (Operators): Belirli bir işleme yol açan, işlem sonucunda bir değer üreten atomlardır. Bir operatör ile işleme giren ifadelere (expression) `operand` denir. Bir operatörün öğrenilmesi için aşağıdaki özelliklerin incelenmesi gerekir:
>	
>- Operatörün sınıfları:
>	1. İşlevine göre sınıflandırma
>		- Aritmetik operatörler (arithmetic operators)
>		- Karşılaştırma operatörleri (comparison operators)
>		- Mantıksal operatörler (logical operatörs)
>		- Bitsel operatörler (bitwise operators)
>		- Özel amaçlı operatörler (special purpose operators)
>	2. Operand sayısına göre sınıflandırma
>		- Tek operandlı (unary)
>		- İki operandlı (binary)
>		- Üç operandlı (ternary)
>	3. Operatörün konumuna göre sınıflandırma
>		- Önek (prefix)
>		- Araek (infix)
>		- Sonek (postfix)
>		
>- Operatörün ürettiği değer (product value): İşlem sonucunda elde edilen değerdir.
>- Operatörün kısıtı (constraint): Operatörün kullanımına ilişkin bir takım zorunluluklardır.
>- Operatörün yan etkisi (side effect): Operatörün, operandının değerini değiştirip değiştirmediğidir.
>- Operatörün önceliği (precedence): Operatörün ifadede diğer operatörlere göre işlem sırasıdır.
>
>Örneğin
>
>		x = y + z * t
>işleminin yapılış sırası şöyledir:
>
>		i1: z * t
>		i2: y + i1
>		i3: x = i2
>
>Bir işlemi önceliklendirmek için Matematik'teki gibi önceliklendirme parantezi kullanılır.
>
>Örneğin:
>
>		x = (y + z) * t
>işleminin yapılış sırası şöyledir:
>	
>		i1: y + z
>		i2: i1 * t
>		i3: x = i2
>Bazı operatörler aynı öncelik seviyesinde olabilirler. Bu durumda aynı öncelik seviyesine sahip operatörlerin aynı ifadede bulunması durumunda işlemin hangi sırada yapılacağını belirleyen "associativity" denilen bir kavram kullanılır. Bu anlamda `left associative` ve `right associative` kavramları sırasıyla `soldan sağa öncelik` ve `sağdan sola öncelik` anlamına gelir.
>
>Örneğin:
>
>		x = y + z - t
>işleminin yapılış sırası `+` ve `-` operatörleri aynı öncelik seviyesinde ve `left associative` olduklarından şöyledir:
>
>		i1: y + z
>		i2: i1 - t
>		i3: x = i2
>**Anahtar Notlar:** Java'da öncelik kavramı, her zaman işlem sırasını da belirlemez. Bu durumun detayları konu içerisinde
ele alınacaktır.
>
>Biz de bir operatörü öğrenirken o operatör için bu özellikleri inceleyeceğiz

>Aritmetik 4 işlem operatörleri `+`, `-`, ``, `/` iki operandlı ve araek durumundadır. Operatörler işlemin sonucuna ilişkin değeri üretirler. Bu operatörlerin yan etkisi yoktur. `` ve `/` operatörleri, `+` ve `-` operatörlerinden yüksek önceliklidir. Aritmetik 4 işlem operatörleri soldan sağa önceliklidir. İlgili operatöre ilişkin geçerli işlemler kısıt olarak	düşünülebilir

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);	
	}
}
```

>Mod operatörü `%` aslında bir çeşit bölme işlemi yapar. Bu sebeple öellikler ürettiği değer dışında bölme operatörü ile aynıduır. Bu operatör birinci operandının ikinci operandına bölümünden elde edilen kalan değerini verir. Bu operatörün ikinci operandının işaretinin önemi yoktur. Yani ikinci operandı negatif bile olsa pozitif değeri ile işlem yapılır. Bu operatörün birinci operandı negatif ise işlem şu şekilde yapılır:
>
>Birinci operandın pozitif olduğu değere göre kalan değerinin ters işaretlisi alınır. Yani bu operaörün ürettiği değerin işareti birinci operandının işareti ile aynıdır. Yani sonuç olarak bu operatör negatif operandlar için Matematik'teki mod alma işlemi ile aynı değildir. Bazı programlama dillerinde gerçek sayılar için mod operatörü kullanılamaz. Ancak Java'da böyle bir kısıt yoktur. Pratikte bu operatörler daha daha çok tamsayılarla kullanılır.
>
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("%d %% %d = %d%n", a, b, a % b);	
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı int türden 3 basamaklı bir sayının basamakları toplamına geri dönen `sumOf3Digits` metodunu `NumberUtil` isimli sınıf içerisinde aşağıdaki açıklamalara göre yazınız ve test ediniz.
>
>**_Açıklamalar_**:
>- Metot sayının 3 basamaklı olup olmadığı kontrolünü yapmayacaktır
>- Metot negatif sayılar için de pozitif toplam değerine geri dönecektir.

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		NumberUtilSumOf3DigitsTest.run();	
	}
}

class NumberUtilSumOf3DigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		System.out.printf("%d sayısının basamakları toplamı:%d%n", a, NumberUtil.sumOf3Digits(a));
	}
}

class NumberUtil {
	public static int sumOf3Digits(int val)
	{
		int a = val / 100;
		int b = val / 10 % 10;
		int c = val % 10; 
		
		return Math.abs(a + b + c);
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı int türden 3 basamaklı bir sayının basamakları toplamına geri dönen `sumOf3Digits` metodunu `NumberUtil` isimli sınıf içerisinde aşağıdaki açıklamalara göre yazınız ve test ediniz.
>
>**_Açıklamalar_**:
>- Metot sayının 3 basamaklı olup olmadığı kontrolünü yapmayacaktır
>- Metot negatif sayılar için de pozitif toplam değerine geri dönecektir

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		NumberUtilSumOf3DigitsTest.run();	
	}
}

class NumberUtilSumOf3DigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		System.out.printf("%d sayısının basamakları toplamı:%d%n", a, NumberUtil.sumOf3Digits(a));
	}
}

class NumberUtil {
	public static int sumOf3Digits(int val)
	{
		int a = val / 100;
		int b = val % 100 / 10;
		int c = val % 10; 
		
		return Math.abs(a + b + c);
	}
}
```

>İşaret `-` aritmetik operatörü tek operandlı ve önek durumundadır. Bu operatör operandına ilişkin ifadenin ters işeretlisini üretir. Operatörün yan etkisi yoktur. Operatör ikinci seviyede ve dolayısıyla sağdan sola önceliklidir. Operatör eksi işareti alınabilen her tür için kullanılabilir. İşaret `+` operatörü yine aynı özelliklere sahip ancak ifadenin değerini üreten bir operatördür. Bu anlamda `+` operatörü kullanmakla kullanmamak arasında fark yoktur. Bütünlük açısında dile eklenmiştir. Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		int x;
		
		x = -a;
		
		System.out.printf("x = %d%n", x);
		
		x = +a;
		
		System.out.printf("x = %d%n", x);
	}
}
```

**Anahtar Notlar:** Okunabilirlik/algılanabilirlik açısından özel bazı operatörler dışında iki operandlı (binary) operatörlerin operandları ile aralarından bir tane space karakteri bulundurulur. Örneğin `a + b` işleminde operandlar ile operatör arasında birer boşluk yazılır. Ancak nokta operatörü için özellikle bitişik yazılması önerilir. Tek operandlı operatörler için de operatörün operandına bitişik olarak yazılması tavsiye edilir.
 
>`++` ve `--` operaörü tek operandlı hem önek hem de sonek kullanılabilen bir aritmetik operatördür. Operatörün operandının bir değişken olması zorunludur. Yani sabit ifadesi olamaz. Operatörün ürettiği değer önek ve son ek kullanıma göre değişiklik gösterir. Operatörün yan etkisi vardır, operandı olan değişkenin değerini bir artırır/azaltır. Operatör önek kullanımda artırılmış/azaltılmış değeri, sonek kullanımda ise artırılmamış/azaltılmamış değeri üretir. Yani işleme giren değer önek ve sonek durumunda farklıdır.
 
>`++` operatörü

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		
		++a; //a = a + 1;
		
		System.out.printf("a = %d%n", a);
	}
}
```

>`++` operatörü

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		
		a++; //a = a + 1;
		
		System.out.printf("a = %d%n", a);
	}
}
```

>`++` operatörünün önek kullanımı

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b;
		
		b = ++a;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}
```

>`++` operatörünün sonek kullanımı

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b;
		
		b = a++;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}
```

>`++` operatörü

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		
		++a; //a = a + 1;
		
		System.out.printf("a = %d%n", a);
	}
}
```

>`--` operatörü

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		
		a--; //a = a - 1;
		
		System.out.printf("a = %d%n", a);
	}
}
```

>`--` operatörünün önek kullanımı

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b;
		
		b = --a;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}
```

>`--` operatörünün sonek kullanımı

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b;
		
		b = a--;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b;
		
		b = a-- + a;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b;
		
		b = a + a--;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b;
		
		b = a++ + a--;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 2;
		int b;
		
		b = a++ + a * --a; // 2 + 3 * 2
		
		System.out.printf("a = %d, b = %d%n", a, b);
	}
}
```

>Java derleyicisi soldan sağa ve yukarıdan aşağıya anlamlı en uzun ifadeyi alacak şekilde atomalarına ayırma (tokenizing) işlemini yapar. Bu kurala genel olarak `maximal/maximum munch` kuralı denir.
>
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 3;
		int b = 4;
		int c;
		
		c = a+++b; //a++ + b
		
		System.out.printf("a = %d%n", a); //a = 4
		System.out.printf("b = %d%n", b); //b = 4
		System.out.printf("c = %d%n", c); //c = 7
	}
}
```

#### 12 Mart 2024
 
>Aşağıdaki örnekte maximal munch kuralı gereği error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 3;
		int b = 4;
		int c;
		
		c = a++++b; //error
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 3;
		int b = 4;
		int c;
		
		c = a+++-b; // c = a++ + -b;
		
		System.out.printf("a = %d%n", a); //a = 4
		System.out.printf("b = %d%n", b); //b = 4
		System.out.printf("c = %d%n", c); //c = -1
	}
}
```

>Aşağıdaki örnekte maximal munch kuralı gereği error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 3;
		int b = 4;
		int c;
		
		c = a+++++b; // error
		
		System.out.printf("a = %d%n", a); //a = 4
		System.out.printf("b = %d%n", b); //b = 4
		System.out.printf("c = %d%n", c); //c = -1
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 3;
		int b = 4;
		int c;
		
		c = a+++ + +b;
		
		System.out.printf("a = %d%n", a); //a = 4
		System.out.printf("b = %d%n", b); //b = 4
		System.out.printf("c = %d%n", c); //c = 7
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a;
		
		a = - - - - - - - - - - - - - - - - - - - 2;
		
		System.out.printf("a = %d%n", a);
	}
}
```

>Temel karşılaştırma operatörleri 6 tanedir:
>
>		<
>		>
>		<=
>		>=
>		==
>		!=
>Bu operatörler iki operandlı, araek durumundadır. Operatörlerin yan etkisi yoktur. Bu operatörlerin ürettiği değer `boolean` türdendir. Karşılaştırma işlemi doğru ise `true`, yanlış ise `false` değerini üretir.
>
>`<`, `>`, `<=`, `>=` operatörleri klasik operatörlerdir. `==` operatörü operandlarına ilişkin ifadelerin değerleri eşitse true, değilse false değerini üretir. `!=` operatörü operandlarına ilişkin ifadelerin değerleri eşit değilse true, eşitse false değerini üretir.
 
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		System.out.printf("%d < %d = %b%n", a, b, a < b);
		System.out.printf("%d >= %d = %b%n", a, b, a >= b);
		System.out.printf("%d > %d = %b%n", a, b, a > b);
		System.out.printf("%d <= %d = %b%n", a, b, a <= b);
		System.out.printf("%d == %d = %b%n", a, b, a == b);
		System.out.printf("%d != %d = %b%n", a, b, a != b);
	}
}
```

>Java'da metot çağırma işlemi metot çağırma operatörü (method call operator) ile yapılır. Bu operatör özel amaçlı iki veya tek operandlı ve araek durumunda bir operatördür. Operatör, operatör öncelik tablosunun `birinci` seviyesindedir. Operatör ilgili metodu çağırır ve eğer metodun geri dönüş değeri varsa geri dönüş değerini üretir. Geri dönüş değeri olmayan bir metot çağrısı için bu operatöre ilişkin ifadenin türü void'dur. Bu anlamda void aslında bir tür olmamasına rağmen, dilin Matematiksel bütünlüğü adına bir tür gibi kullanılabilmektedir. Bu anlamda bir değer üretmeyebilen tek operatör metot çağırma operatörüdür. Eğer, void bir metot çağrılırsa bu operatör değer üretmez
>
>Mantıksal operatörler şunlardır: AND `&&`, OR `||`, NOT `!`. Bu operatörler Mantık'taki ilgili operatörleri temsil eder. Bu operatörlerin operandları `boolean` türden olmalıdır. Aksi durumda error oluşur. Operatörlerin ürettiği değer de `boolean` türdendir. Bu operatörlerin yan etkileri yoktur.
>
>Anımsanacağı gibi `&&` ve `||` operatörlerinin doğruluk tablolaları (truth table) şu şekildedir:
	
| a   | b   | &&  | \|\| |
|-----|-----|-----|------|
| T   | T   | T   | T    |
| T   | F   | F   | T    |
| F   | T   | F   | T    |
| F   | F   | F   | F    |

>Bu doğruluk tablosundan kısaca şu sonuçlar çıkartılabilir:
>- `&&` işlemi için: Her ikisi birden doğru ise doğru sonuç verir. Ya da başka bir deyişle en az biri yanlışsa yanlış sonuç verir.
>- `||` işlemi için: Her ikisi yanlış ise yanlış sonuç verir. Ya da başka bir deyişle en az biri doğruysa doğru sonuç verir. 
>
>Bu operatörler doğru sonuca yani Matematiksel olarak elde edilen sonuca en kısa yoldan ulaşmaya çalışırlar. Bu sebeple bu operatörlerin bulunduğu ifadeler hesaplanmaya en soldan başlar. `&&` ve `||` operatörlerinde birinci operand hesaplandığında elde edilen sonuç, ikinci operand hesaplansa da değişmeyecekse ikinci operand hesaplanmaz. Buna kısa devra davranışı `short circuit behavior` denir. Bu durumda `&&` operatörü için birinci operanda ilişkin ifadenin değeri false ise ikinci operanda ilişkin ifade yapılmaz, `||` operatörü için birinci operanda ilişkin ifadenin değeri `true` ise ikinci operanda ilişkin ifade yapılmaz.    
>
>Bu operatörler yine doğru sonuca en kısa yoldan ulaşmak için klasik operatör önceliği kuralına işlemi yaparken uymazlar. Yani bu operatörlere ilişkin bir ifade, operatör önceliği ne olursa olsun en soldan başlanarak hesaplanır. Ancak elde edilen sonuç operatör önceliğine uyularak yapılan işlem sırası ile elde edilen sonuç ile aynıdır. Yani bu operatörler yine kısa devre davranışını da kullanarak doğru sonuca en kısa yoldan ulaşırlar

>`&&` operatörüne ilişkin demo örneği inceleyiniz:\
Ekran Çıktısı:\
foo\
bar\
false

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = Sample.foo() && Sample.bar();
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
}
```

>`||` operatörüne ilişkin demo örneği inceleyiniz\
Ekran Çıktısı:\
bar\
foo\
true

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = Sample.bar() || Sample.foo();
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
}
```

>Aşağıdaki demo örnekte `kısa devre` oluşur\
Ekran Çıktısı:\
foo\
true

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = Sample.foo() || Sample.bar();
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
}
```

>Aşağıdaki demo örnekte `kısa devre` oluşur\
Ekran Çıktısı:\
bar\
false

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = Sample.bar() && Sample.foo();
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz\
Ekran Çıktısı:\
foo\
true

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = Sample.foo() || Sample.bar() && Sample.tar();
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz\
Ekran Çıktısı:\
bar\
tar\
false

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = Sample.bar() && Sample.foo() || Sample.tar();
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

>Aşağıdaki demo örnekte `||` operatörüne öncelik verilmiştir\
Ekran Çıktısı:\
foo\
tar\
false

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = (Sample.foo() || Sample.bar()) && Sample.tar();
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

>Aşağıdaki demo örnekte önceliklendirme parantezinin olması ile olması arasında bir fark yoktur.\
Ekran Çıktısı:\
foo\
true

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = Sample.foo() || (Sample.bar() && Sample.tar());
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = Sample.bar() || Sample.foo() && Sample.tar() || Sample.foo() && Sample.bar();
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

#### 14 Mart 2024
 
>Bitwise AND `&` ve bitwise OR `|` operatörleri tamsayılar ile bitsel işlemler yaparlar. Bu operatörler özel olarak boolean türü ile kullanıldıklarında (yani operandları boolen türden olduğunda) kısa devre davranışı olmayan AND ve OR işlemleri olarak düşünülmeldir. Yani bu operatörler boolean türü ile kullanıldıklarında, işlem sırası yine `&&` ve `||` operatörleri ile aynıdır ancak kısa devre davranışı olmaz.
	
**Anahtar Notlar:** Java'da tamsayılar ile bitsel işlemler yapan bir grup operatör vardır. Bunlara "bitwise operators"	denilmektedir. Bitsel operatörlerin detayları ve kullanım alanları "Java ile Uygulama Geliştirme 1" ve "Android Programlama" kurslarında ele alınacaktır
 
>Aşağıdaki demo örnekte tüm metotların çağrıldığına dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean result;
		
		result = Sample.foo() | Sample.bar() & Sample.tar();
		
		System.out.printf("result:%b%n", result);
	}
}

class Sample {
	public static boolean foo()
	{
		System.out.println("foo");
		
		return true;
	}
	
	public static boolean bar()
	{
		System.out.println("bar");
		
		return false;
	}
	
	public static boolean tar()
	{
		System.out.println("tar");
		
		return false;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10; //0b00000000000000000000000000001010 <-> 0x0000000A
		int b = 11; //0b00000000000000000000000000001011 <-> 0x0000000B
		int c;
		
		c = a & b;
		
		System.out.printf("a = %d, a = %08X%n", a, a);
		System.out.printf("b = %d, b = %08X%n", b, b);		
		System.out.printf("c = %d, c = %08X%n", c, c);
		System.out.println("-----------------------------------");
		
		c = a | b;
		
		System.out.printf("a = %d, a = %08X%n", a, a);
		System.out.printf("b = %d, b = %08X%n", b, b);		
		System.out.printf("c = %d, c = %08X%n", c, c);
		System.out.println("-----------------------------------");
	}
}
```

>Logical NOT `!` operatörü tek operandlı ve önek durumundadır. Operatörün yan etkisi yoktur. Logical NOT işleminin doğruluk tablosu şu şekildedir:
	
|	a	|	!a	|
|-------|-------|
|	T	|	F	|
|	F	|	T	|
	
>Bu operatör operandına ilişkin ifadenin mantıksal değilini (yani ifade true ise false, ifade false ise true değerini) üretir
 
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean flag = false;
		
		flag = !flag;
		
		System.out.printf("flag = %b%n", flag);
	}
}
```

>Atama operatörü (assignment operator) özel amaçlı, iki operandlı ve araek durumundadır. Operatörün birinci operandı bir değişken olmalıdır. Operatörün yan etkisi vardır. Operatör sağdan sola önceliklidir (right associative). Operatörün ürettiği değer atanan değerdir

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a, b, c;
		
		a = b = c = 10;
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```

>Aşağıdaki demo örnekte ikinci atama operatörünün birinci operandı değişken olmadığından error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a, b = 20, c;
		
		(a = b) = c = 10; //error
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```

>Aşağıdaki demo örnekte üçüncü atama operatörünün birinci operandı değişken olmadığından error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a, b = 20, c;
		
		a = (b = c) = 10;
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```

>Aşağıdaki demo örnek geçerlidir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a, b, c;
		
		a = b = (c = 10);
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```

>Aşağıdaki demo örnek geçerlidir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a, b, c;
		
		a = (b = c = 10);
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}
```

>Java'da bir grup işlemli atama operatörü (compound/augmented assignment operators) vardır. Bu operatörler iki operandlı ve araek durumundadır.Bu operatörlerin genel biçimi şu şekildedir:

		<ifade1> <op>= <ifade2>
>işleminin yaklaşık karşılığı

		<ifade1> = <ifade1> <op> <ifade2>
>biçimindedir. Burada ifade1'in değişken olması zorunludur. Bu operatör kullanılabildiği durumlarda kesinlikle açık işlemine göre tercih edilmelidir. Örneğin programcı
>
>		x = x + 2;	
>ifadesi yerine
>
>		x += 2;
>yazmalıdır. Operatörlerin ürettiği değer yine atanan değerdir. Aslında bu operatörler hem okunabililiği/algılanabilirliği artırır hem de ifadelerin daha basit (yalın) olarak yazılabilmesi sağlar.
>
>**Anahtar Notlar:** Aslında işlemli atama operatörlerinin genel biçimi tam olarak yukarıda anlatıldığı gibi değildir.
İleride tam karşılığı ele alınacaktır.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b = 20;
		
		a += b;
		
		System.out.printf("a = %d, b = %d%n", a, b);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 2;
		int b = 3;
		
		a *= b + 2; //a = a * (b + 2);
		
		System.out.printf("a = %d, b = %d%n", a, b);
	}
}
```

>Noktalı virgül `;` Java'da sonlandırıcı `terminator` karakter olarak kullanılır. Java'da başka terminator karakter yoktur. Noktalı virgül genel olarak ifadeleri sonlandırmak ve bazı deyimleri de sonlandırmak için kullanılır
 
>Java'da etkisiz ifadeler genel olarak geçersizdir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b = 20;
		
		a + b; //error
	}
}
```

>Derleyici akışın hiç bir zaman o noktaya gelemeyeceği kodlar için genel olarak error oluşturur `unreachable code`

```java
package csd;

class Sample {
	public static int add(int a, int b)
	{
		return a + b;
		
		System.out.println("Unreachable code"); //error
	}
}
```

>Aşağıdaki demo örneği inceleyiniz\
	a = a++;\
	i1: a++\
	i2: a = i1\
	Not: Hiç güzel bir örnek değildir*

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 2;
		
		a = a++;
		
		System.out.printf("a = %d%n", a); //a = 2
	}
}
```

>Aşağıdaki demo örneği inceleyiniz\
	a = ++a;\
	i1: ++a\
	i2: a = i1\
	Not: Hiç güzel bir örnek değildir*

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 2;
		
		a = ++a;
		
		System.out.printf("a = %d%n", a); //a = 2
	}
}
```

#### 19 Mart 2024
 
>**_Deyimler (Statements):_** Programın çalıştırılan parçalarına denir. Bir program deyimlerin çalıştırılmasıyla çalışır.
>
>**Java'da deyimler şunlardır:**
>- Basit deyimler (simple statements): Bir ifadenin sonuna noktalı virgül konmasıyla oluşan deyimdir.
>
>Örneğin:
>
>		System.out.println("Merhaba");
>ya da
>
>		x = y + z;
>Basit bir deyim çalıştırıldığında deyime ilişkin ifade hesaplanır.
>- Bileşik deyimler (compound statements): { ve } arasında kalan yani bir blok içerisinde yazılan deyimlerdir. Bileşik deyim çalıştırıldığında blok içerisindeki deyimler yukarıdan aşağıya çalıştırılır.  Bu anlamda metodun gövdesi de aslında bileşik olarak düşünülebilir.
>- Bildirim deyimleri (declaration statements): Bir değişkenin bildirildiği deyimdir. Bildirim deyimi çalıştırıldığında bellekte yer ayrılır.
>
>Örneğin:
>
>		int a; 
>ya da 
>
>		int x = 20;
>- Kontrol deyimleri (control statements): Akışa yön veren deyimlerdir. Her kontrol deyiminin kendine özgü çalıştırılma biçimi vardır. Java'da önemli bazı kontrol deyimleri şunlardır:
>	- `return` deyimi
>	- `if` deyimi
>	- döngü deyimleri (`for`, `while`, `do-while`, `for-each`)
>	- `break` deyimi
>	- `continue` deyimi
>	- `switch` deyimi/ifadesi
>- Boş deyim (null/empty statement): Noktalı virgülün tek başına kullanılması durumunda oluşan deyimdir. Boş deyim çalıştırıldığında hiç bir şey yapılmaz.

>if deyimi: Neredeyse tüm programlama dillerinde bulunan ve koşula bağlı olarak akışın yönlemesini sağlayan bir kontrol deyimidir. if deyiminin genel biçimi şu şekildedir:

		if (<koşul ifadesi>)
			<deyim>
		[
		else 
			<deyim>
		]
>if deyiminde koşul ifadesinin (condition expression) `boolean` türden olması zorunludur. Aksi durumda error oluşur.
>
>if deyiminde koşul ifadesinin değeri `true` ise if deyiminin doğru kısmına ilişkin deyim çalıştırılır, `false` ise if deyiminde else kısmı varsa `else` kısmına ilişkin (yani yanlış kısmına ilişkin deyim) çalıştırılır.
>
>Bu anlamda `if` deyiminin `else` kısmı olmak zorunda değildir. if deyiminin else kısmı yoksa ve koşul ifadesinin değeri false ise, akış if deyiminden sonraki deyimden devam eder.
 
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		
		if (a % 2 == 0)
			a /= 2;
		else
			a *= 2;
		
		System.out.printf("a = %d%n", a);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte if deyiminin doğru kısmında ve else kısmında bileşik deyim kullanılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		
		if (a % 2 == 0) {
			System.out.println("Çift sayı girdiniz");
			a /= 2;
		}
		else {
			System.out.println("Tek sayı girdiniz");
			a *= 2;
		}
		
		System.out.printf("a = %d%n", a);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

**Anahtar Notlar:** if deyiminde (ve döngü deyimlerinde) basit deyimin kullanılabildiği yerde bazı programcılar yine bileşik deyim kullanmayı tercih ederler. Diğer bir deyişle hiç bir zaman basit deyim kullanmazlar. Bazı programcılar ise basit deyimininn kullanılabildiği yerlerde bileşik deyim kullanmazlar. Bu yaklaşımların her ikisi de normal ve doğru yaklaşımlardır. Bir programcı yada bir yazılım geliştirme ekibi bu yaklaşımlardan herhangi birisini tercih edebilir. Ancak bu tip durumlarda kötü yaklaşım bazen birini, bazen diğerini kullanmaktır.
 
>Aşağıdaki demo örnekte if deyiminin else kısmı yoktur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		
		if (a % 2 == 0)
			a /= 2;
		
		System.out.printf("a = %d%n", a);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte if deyiminde yanlışlıkla noktalı virgül konmasından dolayı `**` ile belirtilen deyim if deyiminden sonraki deyim olduğundan error oluşmaz. Burada derleyici açısında if deyiminin doğru kısmında boş deyim kullanılmıştır. O da herhangi bir error'a yol açmaz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		
		if (a % 2 == 0);
			a /= 2; //**
		
		System.out.printf("a = %d%n", a);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte else'in ait olduğu bir if deyimi olmadığından error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (a % 2 == 0);
			a /= 2;
		else //error
			a *= 2;
		
		System.out.printf("a = %d%n", a);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte `*` ile belirtilen if deyiminin else kısmında bir if deyimi vardır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (a > 0) //*
			System.out.printf("Pozitif sayı girdiniz:%d%n", a);
		else 
			if (a == 0)
				System.out.println("Sıfır giriniz");
			else
				System.out.printf("Negatif sayı girdiniz:%d%n", a);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Yukarıdaki demo örnek aşağıdaki gibi daha okunabilir şekilde yazılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (a > 0)
			System.out.printf("Pozitif sayı girdiniz:%d%n", a);
		else if (a == 0)
			System.out.println("Sıfır giriniz");
		else
			System.out.printf("Negatif sayı girdiniz:%d%n", a);
	
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Yukarıdaki örnek aşağıdaki gibi yazılsaydı, örneğin senaryosu gereği doğru çalışacaktı. Ancak, koşullar ayrık (discrete) olduğundan else biçiminde yazılması hem gereksiz kontrolleri engeller, hem de daha okunabilir/algılanabilir yazılmış olur. Aşağıdaki kodu okuyan programcı koşulların ayrık olmadığını izlenimine kapılır. Bu durumda aslında ayrık koşullar iin else if kullanmak ayrık olmayan koşullara ilişkin if deyimlerinin okunabilirliğini/algılanabilirliğini artırır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (a > 0)
			System.out.printf("Pozitif sayı girdiniz:%d%n", a);
		if (a == 0)
			System.out.println("Sıfır giriniz");
		if (a < 0)
			System.out.printf("Negatif sayı girdiniz:%d%n", a);
	
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte koşullar ayrık olmadığından, ayrı if deyimleri yazılması uygundur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (a > 6)
			System.out.printf("%d > 6%n", a);
		if (a > 10)
			System.out.printf("%d > 10%n", a);
		if (a > 22)
			System.out.printf("%d > 22%n", a);
	
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>`boolean` türden ifadelerin değerlerinin koşul ifadesinde karşılaştırılmasının `==` veya `!=` operatörleri ile yapılması tavsiye edilmez

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		Util.printValueStatus(a % 2 == 0);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class Util {
	public static void printValueStatus(boolean status)
	{
		if (status) //if (status == true) 
			System.out.println("Çift");
		else
			System.out.println("Tek");
	}
}
```

>`boolean` türden ifadelerin değerlerinin koşul ifadesinde karşılaştırılmasının `==` veya `!=` operatörleri ile yapılması tavsiye edilmez

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		Util.printValueStatus(a % 2 == 0);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class Util {
	public static void printValueStatus(boolean status)
	{
		if (!status) //if (status == false) 
			System.out.println("Tek");
		else
			System.out.println("Çift");
	}
}
```

>Pratikte geri dönüş değeri boolean olan metotlarla çok fazla karşılaşırız. Bu metotlar tipik olarak bir işlemin sonucuna ilişkin doğruluğu veya yanlışlığı test etmek için kullanılır. Örneğin, bir kişinin bilgilerine göre kişinin evli olup olmadığını test etmek için kullanılan bir metot tipik olarak boolean türden geri dönüş değere sahip olacak şekilde yazılır. Ya da örneğin bir dosyanın belirtilen yol ifadesine ilişkin yerde olup olmadığını test eden bir metot yine boolean türden geri dönüş değere sahip olacak şekilde yazılır. Bu tarz metotlara pratikte "predicate methods" da denilmektedir. Predicate bir metot, eğer bir isme ilişkinse genelliklen is (bazen has, can vb) ile başlatılır. Örneğin bir kişinin evli olup olmadığını test eden bir metodun ismi isMarried olarak seçilebilir. Predicate bir metot bir fiile ilişkinse bu durumda İngilizce özneye göre belirlenir. Örneğin yol ifadesindeki dosyanın varlığını test eden metodun ismi exists olarak seçilebilir.

>Aşağıdaki `isEven` metodunda akış return true deyimine geldiğinde zaten sonlanacağından else anahtar sözcüğünün yazılmasıyla yazılmaması arasında bir fark yoktur. Böylesi durumlarda else yazılmaması önerilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (NumberUtil.isEven(a))
			System.out.printf("Çift sayı:%d%n", a);
		else
			System.out.printf("Tek sayı:%d%n", a);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class NumberUtil {
	public static boolean isEven(int a)
	{
		if (a % 2 == 0)
			return true;
		else 
			return false;
	}
}
```

>Yukarıdaki metot aşağıdaki gibi daha okunabilir/algılanabilir olarak yazılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (NumberUtil.isEven(a))
			System.out.printf("Çift sayı:%d%n", a);
		else
			System.out.printf("Tek sayı:%d%n", a);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isEven(int a)
	{
		if (a % 2 == 0)
			return true;
		
		return false;
	}
}
```

>Yukarıdaki metot en okunabilir/algılanabilir olarak aşağıdaki gibi yazılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (NumberUtil.isEven(a))
			System.out.printf("Çift sayı:%d%n", a);
		else
			System.out.printf("Tek sayı:%d%n", a);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}
}
```

#### 21 Mart 2024
 
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (!NumberUtil.isEven(a))
			a *= 2;
		
		System.out.printf("a = %d%n", a);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (NumberUtil.isOdd(a))
			a *= 2;
		
		System.out.printf("a = %d%n", a);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}
	
	public static boolean isOdd(int a)
	{
		return !isEven(a);
	}
}
```

>Aşağıdaki demo örnekte else içteki if deyimine ait olur. Buna `dangling else` denir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (a > 0)
			if (a % 2 == 0)
				System.out.println("Çift sayı girdiniz");			
		else
			System.out.println("Negatif sayı girdiniz");	
				
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Yukarıdaki `dangling else` durumu bileşik deyim kullanılarak da çözülebilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (a > 0)  {
			if (a % 2 == 0)
				System.out.println("Çift sayı girdiniz");
		}
		else
			System.out.println("Negatif sayı girdiniz");
				
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte `dangling else` durumu yoktur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (a > 0) 
			if (a % 2 == 0)
				System.out.println("Çift sayı girdiniz");		
			else 
				System.out.println("Tek sayı girdiniz");
		else
			System.out.println("Negatif sayı girdiniz");		
				
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>**Sınıf Çalışması:** Katsayıları klavyeden girilen ikinci dereceden denklemin köklerini bulan ve ekrana basan programı yazınız.
>
>**_Not:_** Örnek şu ana gördüklerimiz kullanılarak, daha genel yazılmaya çalışılmıştır. İleride daha iyisi yazılacaktır
>
>**_Not:_** Formül için `~/doc/images/ikinci-dereceden-denklem.jpg` dosyasından yararlanabilirsiniz.
>
>İkinci dereceden (quadratic) denklem:
>
>$$ax^2 + bx + c = 0$$
>
>delta ($\Delta$) (discriminant) hesabı:
>
>$$\Delta = b^2 - 4ac$$
>
>Köklerın hesaplanması:
>
>1. if $\Delta > 0$
>
>$$x_1 = \frac{-b + \sqrt{\Delta}}{2a}$$
>
>$$x_2 = \frac{-b - \sqrt{\Delta}}{2a}$$
>
>2.	if $\Delta = 0$
>
>$$x_1 = x_2 = \frac{-b}{2a}$$
>
>3.	if $\Delta < 0$
>
>		Gerçek kök yok!

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		QuadraticEquationSolverApp.run();
	}
}

class QuadraticEquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input coefficients:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		EquationSolver.findQuadraticRoots(a, b, c);
	}
}

class EquationSolver {
	public static double calculateDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void doForDoubleRoots(double delta, double a, double b)
	{
		double sqrtDelta = Math.sqrt(delta);
		double x1, x2;
		
		x1 = (-b + sqrtDelta) / (2 * a);
		x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f, x2 = %f%n", x1, x2);		
	}
	
	public static void doForSameRoot(double a, double b)
	{
		double x = -b / (2 * a);
		
		System.out.printf("x1 = x2 = %f%n", x);
	}
	
	public static void findQuadraticRoots(double a, double b, double c)
	{
		double delta = calculateDelta(a, b, c);
		
		if (delta > 0)
			doForDoubleRoots(delta, a, b);
		else if (delta == 0)
			doForSameRoot(a, b);
		else
			System.out.println("No real root!...");
	}
}
```

>**Sınıf Çalışması:** Katsayıları klavyeden girilen ikinci dereceden denklemin köklerini bulan ve ekrana basan programı yazınız.
>
>**_Not:_** Örnek şu ana gördüklerimiz kullanılarak, daha genel yazılmaya çalışılmıştır. İleride daha iyisi yazılacaktır
>
>**_Not:_** Formül için `~/doc/images/ikinci-dereceden-denklem.jpg` dosyasından yararlanabilirsiniz.
>
>İkinci dereceden (quadratic) denklem:
>
>$$ax^2 + bx + c = 0$$
>
>delta ($\Delta$) (discriminant) hesabı:
>
>$$\Delta = b^2 - 4ac$$
>
>Köklerın hesaplanması:
>
>1. if $\Delta > 0$
>
>$$x_1 = \frac{-b + \sqrt{\Delta}}{2a}$$
>
>$$x_2 = \frac{-b - \sqrt{\Delta}}{2a}$$
>
>2.	if $\Delta = 0$
>
>$$x_1 = x_2 = \frac{-b}{2a}$$
>
>3.	if $\Delta < 0$
>
>		Gerçek kök yok!

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		QuadraticEquationSolverApp.run();
	}
}

class QuadraticEquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input coefficients:");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		EquationSolver.findQuadraticRoots(a, b, c);
	}
}

class EquationSolver {
	public static double calculateDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void doForRoots(double delta, double a, double b)
	{
		double sqrtDelta = Math.sqrt(delta);
		double x1, x2;
		
		x1 = (-b + sqrtDelta) / (2 * a);
		x2 = (-b - sqrtDelta) / (2 * a);
		
		System.out.printf("x1 = %f, x2 = %f%n", x1, x2);		
	}

	
	public static void findQuadraticRoots(double a, double b, double c)
	{
		double delta = calculateDelta(a, b, c);
		
		if (delta >= 0)
			doForRoots(delta, a, b);
		else
			System.out.println("No real root!...");
	}
}
```

##### Döngü Deyimleri
>Bir işin yinelemeli (iterative) bir biçimde yapılmasını sağlayan kontrol deyimlerinde döngü deyimleri (loop statements) denir. Java'da döngü deyimleri genel olarak 3 gruba ayrılır:
>1. `while` döngü deyimi
>	- Kontrolün `başta` yapıldığı while döngü deyimi (`while` döngüsü)
>	- Kontrolün `sonda` yapıldığı while döngü deyimi (`do-while` döngüsü)
>2. `for` döngü deyimi
>3. `for-each` (enhanced for loop) döngü deyimi
>
>**Anahtar Notlar:** while döngüsü dendiğinde genel olarak "kontrolün başta yapıldığı while döngü deyimi" anlaşılır. Burada da while döngüsü dendiğinde bu şekilde anlaşılmalıdır. "Kontrolün sonda yapıldığı while döngü deyimi" için "do-while döngüsü" terimi kullanılacaktır.
>
>Kontrolün başta yapıldığı while döngü deyiminin (while döngüsü) genel biçimi şu şekildedir:

```
while (<boolean türden ifade>)
	<deyim>
```

>while döngüsü koşul ifadesi doğru sürece yinelenen döngü deyimidir. Akış while döngü deyimine geldiğinde de koşul kontrol edilir, eğer yanlış ise döngüye girilmez. Koşul ifadesinin boolean türden olmamasın durumunda error oluşur.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		i = 0;
		
		while (i < n) {
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.printf("%nDöngü sonrası i = %d%n", i);
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}
```

>while döngü deyiminde yanlışlıkla noktalı virgül kullanılması (yani yanlışlıkla boş deyim kullanılması) durumu

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		i = 0;
		
		while (i < n); {
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.printf("%nDöngü sonrası i = %d%n", i);
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}
```

>while döngü deyimi ile `n-kez` dönen döngü deyimi de oluşturulabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		i = 0;
		
		while (i < n) {
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.printf("%nDöngü sonrası i = %d%n", i);
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}
```

>while döngü deyimi ile `n-kez` dönen döngü deyimi de oluşturulabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		i = n - 1;
		
		while (i >= 0) {
			System.out.printf("%d ", i);
			--i;
		}
		
		System.out.printf("%nDöngü sonrası i = %d%n", i);
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}
```

>Aşağıdaki döngü deyimi bazı programcılar tarafından kullanılan "n-kez dönen" döngü kalıbıdır. Bu kalıbı programcı kullanmak istemese de gördüğünde tanımalıdır. Bu döngü deyiminde n değerinin, döngüden sonra artık eski değerinde olmadığına dikkat ediniz.
>
>Örneği çeşitli değerlerle çalıştırıp sonuçları gözlemleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
	
		while (n-- > 0)
			System.out.printf("%d ", n);
		
		System.out.println();		
		System.out.printf("Döngü sonrası n:%d%n", n);
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren `countDigits` metodunu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilCountDigitsTest.run();
	}
}

class NumberUtilCountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		System.out.printf("%d sayısının basamak sayısı:%d%n", val, NumberUtil.countDigits(val));
	}
}

class NumberUtil {
	public static int countDigits(int val)
	{
		if (val == 0)
			return 1;
		
		int count = 0;
		
		while (val != 0) {
			++count;
			val /= 10;			
		}
		
		return count;
	}
}
```

#### 26 Mart 2024
 
>**Sınıf Çalışması:** Parametresi ile aldığı int türden bir sayının basamakları toplamına geri dönen `sumDigits` isimli metodu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>
>**_Açıklama:_** Sayı negatif ise basamakları toplamı pozitif olarak elde edilecektir.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilSumDigitsTest.run();
	}
}

class NumberUtilSumDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int val = kb.nextInt();
		
		System.out.printf("%d sayısının basamakları toplamı:%d%n", val, NumberUtil.sumDigits(val));		
	}
}

class NumberUtil {
	public static int sumDigits(int val)
	{
		int total = 0;
		
		while (val != 0) {
			total += val % 10;
			val /= 10;
		}
		
		return Math.abs(total);
	}
}
```

>while döngüsünün koşul ifadesinde bir değişkene bir metodun geri dönüş değeri atanıp, atanan değer kontrol edilebilir. Bu tarz koşul ifadeleri okunabilirliği/algılanabilirliği olumsuz etkilemedikten sonra yazılabilir. Aşağıdaki örnekte klavyeden sıfır girilene kadar alınan sayıların toplamı bulunmuştur. Örnekte atama işleminin önceliklendirildiğine dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Sayıları girmeye başlayınız:");
		int total = 0;		
		int val;
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0)
			total += val;
		
		System.out.printf("Toplam:%d%n", total);
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}
```

>**Sınıf Çalışması:** Klavyeden sıfır girilene kadar alınan sayılardan pozitif olanlarının ve negatif olanlarının ayrı ayrı sayılarını ve toplamlarını bulan programı yazınız. Programın mesajlarına ilişkin örnekler şunlardır:
>	
>		Girilen 3 tane pozitif sayının toplamı: 45
>		Girilen 4 tane negatif sayının toplamı: -56
>
>		Girilen 3 tane pozitif sayının toplamı: 45
>		Hiç negatif sayı girmediniz
>
>		Hiç pozitif sayı girmediniz
>		Girilen 4 tane negatif sayının toplamı: -56
>
>		Hiç pozitif sayı girmediniz
>		Hiç negatif sayı girmediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		PosNegCountTotalApp.run();				
	}
}

class PosNegCountTotalApp {
	public static void printPosStatus(int count, int sum)
	{
		if (count != 0)
			System.out.printf("Girilen %d tane pozitif sayının toplamı:%d%n", count, sum);
		else
			System.out.println("Hiç pozitif sayı girmediniz");
	}
	
	public static void printNegStatus(int count, int sum)
	{
		if (count != 0)
			System.out.printf("Girilen %d tane negatif sayının toplamı:%d%n", count, sum);
		else
			System.out.println("Hiç negatif sayı girmediniz");
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int posSum, negSum, posCount, negCount;
		int val;
		
		posSum = negSum = posCount = negCount = 0;
		
		System.out.println("Sayıları girmeye başlayınız:");
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0)
			if (val > 0) {
				posSum += val;
				++posCount;
			}
			else {
				negSum += val;
				++negCount;
			}		
		
		printPosStatus(posCount, posSum);
		printNegStatus(negCount, negSum);
	}
}
```

>**_Sonsuz Döngü (Infinite Loop):_** Koşul ifadesinden dolayı sonlanmayan döngü deyimlerine denir. Bu durumda while döngü deyimi ile sonsuz döngü şu kalıp ile oluşturulabilir:

		while (true)
			<deyim>
>Bu while döngüsünde, deyim içerisinde döngüden çıkışa yol açacak bir deyim varsa sonsuz döngü sonlanmış olur. Örneğin return deyimi sonsuz döngü içerisinde kullanıldığında metodu sonlandırdığından, döngüden de çıkılmış olur. Bu durumda hiç sonlanmadan dönen döngü bir sonsuz döngüdür ancak her sonsuz döngü belirli durumlarda sonlanabilir

>**Sınıf Çalışması:** Parametresi ile aldığı int türden bir sayının tersine geri dönen reverse isimli metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>
>Örnek:
>
>		 123	->	3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
>		-123	->	-3 * 10 - 2 = -32 -> -32 * 10 - 1 = -321

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilReversedTest.run();
	}
}

class NumberUtilReversedTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d sayısının tersi:%d%n", val, NumberUtil.reverse(val));
			
			if (val == 0)
				return;
		}
	}
}

class NumberUtil {
	public static int reverse(int val)
	{
		int result = 0;
		
		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}
		
		return result;
	}
}
```

>Kontrolün sonda yapıldığı while döngü deyimi (do-while döngüsü): `do-while` döngü deyiminin genel biçimi şu şekildedir:

		do
			<deyim>
		while (<koşul ifadesi>);
>Akış `do-while` döngüsüne geldiğinde koşul kontrol edilmez. Bu durumda `do-while` döngüsüne en az bir kez girileceği garanti altındadır. Yani döngünün ilk adımı kesinlikle yapılacaktır. İlk adımdan sonra koşul kontrol edilecek ve duruma göre döngü devam edecek veya sonlanacaktır. `do-while` döngüsü while döngüsü kadar sık kullanılmaz. Algoritmaya göre okunabilirliği artırmak amaçlı tercih edilir. Bu döngü deyimi dikkatli kullanılmazsa okunabilirliği azaltabilir. Çünkü bir Java programcısı `do-while` döngü deyimi gördüğünde algoritmada ilk adımın kesinlikle yapılması gerektiği biçiminde kodu algılar. Bu döngü deyiminde noktalı virgülün deyimi sonlandırmak için gerektiğine dikkat ediniz
 
>Aşağıdaki örnekte `do-while` döngü deyimi ile sıfır sayısı için 1 değerine geri dönülmüştür. Ayrıca kontrol yapılması gerekmemektedir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilcountDigitsTest.run();
	}
}

class NumberUtilcountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d sayısının basamak sayısı:%d%n", val, NumberUtil.countDigits(val));
			
			if (val == 0)
				return;
		}
	}
}

class NumberUtil {
	public static int countDigits(int val)
	{
		int count = 0;
		
		do {
			++count;
			val /= 10;
		} while (val != 0);
		
		return count;
	}
}
```

>Aşağıdaki örnekte val değişkenin scope'u `do-while` döngüsünün deyimi olduğundan koşul ifadesinde kullanılamaz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		do {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d * %d = %d%n", val, val, val * val);
		} while (val != 0); //error
	}
}
```

>Yukarıdaki örnek aşağıdaki gibi yapılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int val;
		
		do {
			System.out.print("Bir sayı giriniz:");
			val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d * %d = %d%n", val, val, val * val);
		} while (val != 0);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilcountDigitsTest.run();
	}
}

class NumberUtilcountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int val;
		
		do {
			System.out.print("Bir sayı giriniz:");
			val = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d sayısının basamak sayısı:%d%n", val, NumberUtil.countDigits(val));			
		} while (val != 0);
	}
}

class NumberUtil {
	public static int countDigits(int val)
	{
		int count = 0;
		
		do {
			++count;
			val /= 10;
		} while (val != 0);		
		
		return count;
	}
}
```

#### 28 Mart 2024
 
>**_for döngü deyimi:_** for döngü deyimi diğer döngü deyimlerini de neredeyse kapsayan bir döngü deyimidir. for döngüsü pratikte genel olarak iterative bir biçimde karşımıza çıksa da, aslında bu iteratiflik for döngü deyiminin çalışma biçiminden dolayı yapılabilmektedir. Bu sebeple Java programcısının for döngü deyiminin çalışma sistematiğini iyi bilmesi tavsiye edilir. for döngüsünün genel biçimi şu şekildedir:

		for ([1.kısım]; [2.kısım]; [3.kısım])
			<deyim>
>1. kısım:	Akış for döngü deyimine geldiğinde yapılır. Bir daha yapılmaz
>2. kısım:	Koşul ifadesidir, boolean türden olmak zorundadır, akış for döngü deyimine geldiğinde 1.kısım yapıldıktan sonra da koşul kontrol edilir yani duruma döngüye hiç girilmeyebilir.  
>3. kısım:	Döngünün bir adımı tamamlandığında, bir sonraki adım için koşulu kontrol etmeden önce yapılır.
>
>Genel biçimden de anlaşıldığı gibi kısımlar boş bırakılabilir. Kısımların boş bırakılması durumları ayrıca ele alınacaktır
>
>**Anahtar Notlar:** for döngüsünde iteratif olarak bir değişkene döngü değişkeni `loop variable` da denir. 
>
>for döngü deyiminin `1.kısmında` değişken bildirimi ve initialization yapılabilir. Bu şekilde bildirilen döngü değişkeninin faaliyet alanı döngü boyuncadır. Döngüden sonra erişilemez. Bu değişken bir yerel değişken de olduğundan aynı faaliyet alanı içerisinde aynı isimde başka bir yerel yerel değişken bildirimi geçersizdir. Programcı döngü değişkeninin döngüden sonraki değerini kullanmayacaksa, birinci kısımda bildirmelidir. Bu durumda 1.kısımda bildirilmeyen bir döngü değişkeninin döngüden sonraki değerinin program içerisinde kullanıldığı algısı oluşur. Bu da okunabilirliği artırır.
>
>Anımsanacağı gibi Java'da virgül operatörü yoktur. Ancak for döngü deyiminin birinci ve üçüncü kısmında belirli koşullar altında virgül atomu kullanılabilir. İkinci kısımda kullanılamaz. Birinci ve üçüncü kısımlarda virgül atomu genel olarak birden fazla ifadeyi ayırmak için kullanılır. Birinci kısımda kullanılacaksa ve değişken bildirimi yapılacaksa başka bir ifade yazılamaz, bildirilen değişkenlerin türleri aynı olmalıdır. Üçüncü kısımda birden fazla ifade yazılabilir.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		for (i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.println();			
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		for (i = 0; i < n; i++)
			System.out.printf("%d ", i);
		
		System.out.println();			
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		for (i = n - 1; i >= 0; --i)
			System.out.printf("%d ", i);
		
		System.out.println();			
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.println();			
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		for (int i = 0; i < n; ++i) //error
			System.out.printf("%d ", i);
		
		//...
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		for (i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.printf("i = %d%n", i);
		
		System.out.println();			
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>for döngüsünde yanlışlıkla noktalı virgül kullanılması durumu

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i;
		
		for (i = 0; i < n; ++i);
			System.out.printf("%d ", i);
		
		System.out.printf("i = %d%n", i);
		
		System.out.println();			
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki örnekte döngü değişkeni döngü içerisinde bildirildiğinden yanlışlıkla noktalı virgül kullanılması durumunda error oluşur.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();		
		
		for (int i = 0; i < n; ++i);
			System.out.printf("%d ", i); //error
		
		System.out.println();			
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte i'nin döngüden sonraki değeri kullanılmadığından döngü içerisinde bildirimi uygundur. Anımsancağı gibi farklı faaliyet alanları içerisinde aynı isimde yerel değişken bildirimleri geçerlidir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();		
		
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.println();
			
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.println();
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte birinci ve üçüncü kısımda virgül atomu kullanılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int n = kb.nextInt();		
		int m = kb.nextInt();
		
		for (int i = 0, k = m - 1; i < n && k >= 0; ++i, --k)
			System.out.printf("(%d, %d)%n", i, k);
	
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int n = kb.nextInt();		
		int m = kb.nextInt();
		
		for (int i = 0, long k = m - 1; i < n && k >= 0; ++i, --k) //error
			System.out.printf("(%d, %d)%n", i, k);
	
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int n = kb.nextInt();		
		long m = kb.nextLong();
		int i;
		long k;		
		
		for (i = 0, k = m - 1; i < n && k >= 0; ++i, --k)
			System.out.printf("(%d, %d)%n", i, k);
	
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int n = kb.nextInt();
		int i = 0;		
		
		for (System.out.println("Birinci kısım:"); i < n; System.out.println("Üçüncü kısım"), ++i)
			System.out.println("Deyim");
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte klavyeden sıfır girilene kadar alınan sayıların toplamı  bulunmaktadır. `for` döngüsünde boş deyim kullanıldığına dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int total = 0;
		int val;
		
		for (System.out.println("Sayıları girmeye başlayınız:"), System.out.println("Bir sayı giriniz"); 
				(val = Integer.parseInt(kb.nextLine())) != 0; total += val, System.out.println("Bir sayı giriniz:"))
			;
		
		System.out.printf("Toplam:%d%n", total);
		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden a ve b değeri için a'nın b-inci kuvvetini döndüren `pow` isimli metodu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- `Math` sınıfının `pow` metodu kullanılmayacaktır
>- b'nin negatif değerleri için metot 1 değerine geri dönecektir

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		NumberUtilPowTest.run();		
	}
}

class NumberUtilPowTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.println("a ve b'yi giriniz:");
			int a = kb.nextInt();
			int b = kb.nextInt();
			System.out.printf("pow(%d, %d) = %d%n", a, b, NumberUtil.pow(a, b));
			
			if (a == 0 && b == 0)
				return;
		}
		
	}
}

class NumberUtil {
	public static int pow(int a, int b)
	{
		int result = 1;
		
		for (int i = 0; i < b; ++i)
			result *= a;
		
		return result;	
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden a ve b değeri için a'nın b-inci kuvvetini döndüren `pow` isimli metodu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- `Math` sınıfının `pow` metodu kullanılmayacaktır
>- b'nin negatif değerleri için metot 1 değerine geri dönecektir

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		NumberUtilPowTest.run();		
	}
}

class NumberUtilPowTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.println("a ve b'yi giriniz:");
			int a = kb.nextInt();
			int b = kb.nextInt();
			System.out.printf("pow(%d, %d) = %d%n", a, b, NumberUtil.pow(a, b));
			
			if (a == 0 && b == 0)
				return;
		}	
	}
}

class NumberUtil {
	public static int pow(int a, int b)
	{
		int result = 1;
		
		while (b-- > 0)
			result *= a;
		
		return result;	
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden bir sayının Armstrong sayısı olup olmadığını test eden `isArmstrong` metodunu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- Metot sayı Armstrong sayısı ise `true`, değilse `false` değerine geri dönecektir
>- Negatif olmayan bir sayının basamak sayısı n ise her bir basamağının n-inci kuvvetleri toplamı kendisine eşitse o sayı bir Armstrong sayısıdır.
>
>Örneğin:
> 
>		1 * 1  * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153 
>olduğundan 153 bir Armstrong sayısıdır.
>- Kuvvet işlemi için bir önceki örnekte yazılan `pow` metodu kullanılacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		NumberUtilIsArmstrongTest.run();		
	}
}

class NumberUtilIsArmstrongTest {
	public static void run()
	{
		for (int n = -1; n <= 9_999_999; ++n)
			if (NumberUtil.isArmstrong(n))
				System.out.println(n);
	}
}

class NumberUtil {
	public static boolean isArmstrong(int a)
	{
		return a >= 0 && getDigitsPowSum(a) == a;
	}
	
	public static int getDigitsPowSum(int a)
	{
		int result = 0;
		int n = countDigits(a);
		
		while (a != 0) {
			result += pow(a % 10, n);
			a /= 10;
		}
		
		return result;
	}
	
	public static int countDigits(int a)
	{
		int count = 0;
		
		do {
			++count;
			a /= 10;
		} while (a != 0);		
		
		return count;			
	}
	
	public static int pow(int a, int b)
	{
		int result = 1;
		
		while (b-- > 0)
			result *= a;
		
		return result;	
	}
}
```

#### 4 Nisan 2024
 
>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden n değerinin faktoriyel değerine geri dönen `factorial` isimli metodu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- Faktoriyel işlemi aşağıdaki şekilde betimlenebilir:
>
>		0! = 1
>		1! = 1
>		2! = 1 * 2
>		
>		...
>		n! = 1 * 2 * ... * (n - 1) * n
>- Metot negatif sayılar için 1 değerine geri dönecektir.
>- Faktoriyel fonksiyonu Matematik'te bilindik en çabuk büyüyen fonksiyondur. Bu sebeple belli bir n değerinden sonra hemen taşma olacaktır. Metot bunu kontrol etmeyecektir. Yani bu durum metodu çağıran programcının sorumluluğuna bırakılacaktır.
>- Metot recursion kullanılarak çözülmeyecektir

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		NumberUtilFactorialTest.run();					
	}
}

class NumberUtilFactorialTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		for (int i = 0; i <= n; ++i)
			System.out.printf("%d! = %d%n", i, NumberUtil.factorial(i));
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

>`for` döngü deyiminin `birinci` kısmının boş bırakılması durumunda akış for döngü deyimine geldiğinde doğrudan koşul kontrolü yapılacaktır. Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		int i = 0;
		
		for (; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.println();
	}
}
```

>`for` döngü deyiminin `üçüncü` kısmının boş bırakılması durumunda döngünün bir adımı tamamlandığında bir sonraki adım için doğrudan koşul kontrolü yapılır. Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		for (int i = 0; i < n; ) {
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.println();
	}
}
```

>`for` döngü deyiminin `birinci ve üçüncü` kısmı boş bırakıldığında `while` döngüsü ile eşdeğer bir döngü yazılmış olur. Şüphesiz bu durumda while döngüsü daha okunabilirdir. Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();		
		int i = 0;
		
		for (; i < n; ) { //while (i < n)
			System.out.printf("%d ", i);
			++i;
		}
		
		System.out.println();
	}
}
```

>`for` döngü deyiminin `ikinci` kısmı boş bırakıldığında koşul hep sağlanır anlamındadır. Yani `true` yazmakla eşdeğerdir. Bu durumda `sonsuz döngü` oluşur. Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		for (int i = 0; ; ++i)
			System.out.println(i);
	}
}
```

>`for` döngü deyimi ile sonsuz döngü oluşturmak için ikinci kısmın boş bırakılması yeterli olsa da programcılar okunabilirlik açısından her üç bölümü de boş bırakmayı bir kalıp olarak tercih ederler

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		for (;;) { //while (true)
			//...
		}
			
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		for (int i = 0; i < n; i += 2)
			System.out.printf("%d ", i);
		
		System.out.println();			
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `long` türden bir sayının asal olup olmadığını test eden `isPrime` isimli metodu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz
>
>(Yavaş versiyon)

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilIsPrimeTest.run();	
	}
}

class NumberUtilIsPrimeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		for (int i = 0; i <= n; ++i)
			if (NumberUtil.isPrime(i))
				System.out.println(i);		
		
		System.out.println(NumberUtil.isPrime(1_000_003));
	}
}


class NumberUtil {
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;		
		
		for (long i = 2; i <= a / 2; ++i)
			if (a % i == 0)
				return false;
		
		return true;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `long` türden bir sayının asal olup olmadığını test eden `isPrime` isimli metodu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz
>	
>**_Kural:_** Bir sayı, karekökünden küçük olan hiç bir asal sayıya tam olarak bölünemiyorsa asaldır.
>
>(Hızlı versiyon)

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilIsPrimeTest.run();	
	}
}

class NumberUtilIsPrimeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		for (int i = 0; i <= n; ++i)
			if (NumberUtil.isPrime(i))
				System.out.println(i);		
		
		System.out.println(NumberUtil.isPrime(1_000_003));
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

>Aşağıdaki manuel ve basit bir test ile metotlar karşılaştırılmıştır. Henüz daha görmediğimizden herhangi bir test aracı kullanılmamıştır. Kodlar durumu göstermek için yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilIsPrimeTest.run();	
	}
}

class NumberUtilIsPrimeTest {
	public static void run()
	{		
		System.out.println(NumberUtil.isPrime(1_000_003));
		System.out.println(NumberUtil.isPrimeSlow(1_000_003));
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
		
		int count = 0;
				
		for (long i = 11; i * i <= a; i += 2) {
			++count;
			if (a % i == 0)
				return false;
		}
		
		System.out.printf("isPrime -> count:%d%n", count);
		
		return true;
	}
	
	public static boolean isPrimeSlow(long a)
	{
		if (a <= 1)
			return false;	
		
		int count = 0;
		
		for (long i = 2; i <= a / 2; ++i) {
			++count;
			if (a % i == 0)
				return false;
		}
		
		System.out.printf("isPrimeSlow -> count:%d%n", count);
		
		return true;
	}
}
```

>Aşağıdaki çok büyük asal sayıları test için kullanabilirsiniz:
>
>		6750161072220585911
>		1603318868174368979
>		6584583408148485263
>		6245098347044246839
>		6285871677077738093
>		5697859706174583067
>		710584055392819667
>		4935060337471977161
>		3728803592870153407
>		4331452335614730577
>		1386437196678024971
>		1677990107453991593
>		4765603950744460867
>		4498306523077899307
>		4434895834573449257

#### 16 Nisan 2024
 
>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden n değeri için n-inci asal sayıyı döndüren `nthPrime` metodunu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- `isPrime` metodunun `hızlı` versiyonu kullanılacaktır.
>- n değerinin pozitif olup olmadığı metot içerisinde kontrol edilmeyecektir.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilNthPrimeTest.run();			
	}
}

class NumberUtilNthPrimeTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				return; 
			
			System.out.printf("%d. asal sayı:%d%n", n, NumberUtil.nthPrime(n));
			
		}
	}
}

class NumberUtil {
	public static long nthPrime(int n)
	{
		long result = 2;
		int count = 0;
		
		for (long i = 2; count < n; ++i)
			if (isPrime(i)) {
				++count;
				result = i;
			}
		
		return result;		
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

>**Sınıf Çalışması:** Parametresi ile aldığı `long` türden bir sayıdan büyük ilk asal sayıyı döndüren `nextClosestPrime` metodunu yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- `isPrime` metodunun `hızlı` versiyonu kullanılacaktır.
>- Metot taşma durumlarını kontrol etmeyecektir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilNextClosestPrimeTest.run();			
	}
}

class NumberUtilNextClosestPrimeTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			long a = Long.parseLong(kb.nextLine());
			
			System.out.printf("%d sayısından büyük ilk asal sayı:%d%n", a, NumberUtil.nextClosestPrime(a));
			
			if (a == 0)
				return;
			
		}
	}
}

class NumberUtil {
	public static long nextClosestPrime(long a)
	{
		if (a < 2)
			return 2;
		
		while (!isPrime(++a))
			;
		
		return a;		
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

>**Sınıf Çalışması:** Parametresi ile aldığı `long` türden bir sayıdan büyük ilk asal sayıyı döndüren `nextClosestPrime` metodunu yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- `isPrime` metodunun `hızlı` versiyonu kullanılacaktır.
>- Metot taşma durumlarını kontrol etmeyecektir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilNextClosestPrimeTest.run();			
	}
}

class NumberUtilNextClosestPrimeTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			long a = Long.parseLong(kb.nextLine());
			
			System.out.printf("%d sayısından büyük ilk asal sayı:%d%n", a, NumberUtil.nextClosestPrime(a));
			
			if (a == 0)
				return;
		}
	}
}

class NumberUtil {
	public static long nextClosestPrime(long a)
	{
		if (a < 2)
			return 2;
		
		long i = a + 1;
		
		for (; !isPrime(i); ++i)
			;
		
		return i;				
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

>Bir döngünün deyimi başka bir döngü deyimi ise bu durumda içiçe döngü yazılmış olur. İçiçe döngüler tipik olarak içiçe iki döngü, içiçe 3 döngü biçiminde karşımıza çıkar. İçiçe 3'den fazla döngü çok özel durumlar dışında karşımıza çıkmaz. Bazı durumlarda programcı döngü içerisinde çağırdığı bir metot da döngüye girdiğinden dolayı olarak içiçe döngü yazmış olur.
 
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);	
		
		System.out.print("İki sayı giriniz:");
		int m = kb.nextInt();
		int n = kb.nextInt();
		
		for (int i = 0; i < m; ++i)
			for (int k = n - 1; k >= 0; --k)
				System.out.printf("(%d, %d)%n", i, k);	
	}
}
```

>Aşağıdaki demo örnekte programcı `doWork` metodunu döngü içerisinde çağırdığından dolaylı olarak içiçe döngü yazmış olur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);	
		
		System.out.print("İki sayı giriniz:");
		int m = kb.nextInt();
		int n = kb.nextInt();
		
		for (int i = 0; i < m; ++i)
			Sample.doWork(i, n);	
	}
}

class Sample {
	public static void doWork(int i, int n)
	{
		for (int k = n - 1; k >= 0; --k)
			System.out.printf("(%d, %d)%n", i, k);
	}
}
```

>Aşağıdaki demo örnekte 3 basamaklı Armstrong sayıları içiçe döngü kullanılarak bulunmuştur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		for (int a = 1; a <= 9; ++a)
			for (int b = 0; b <= 9; ++b)
				for (int c = 0; c <= 9; ++c)
					if (100 * a + 10 * b + c == a * a * a + b * b * b + c * c * c)
						System.out.printf("%d%d%d%n", a, b, c);
	}
}
```

>**_break deyimi:_** `break` deyimi döngü deyimlerinde ve switch deyiminde kullanılabilen bir kontrol deyimidir. break deyimi döngüde kullanıldığında döngüyü sonlandırır. break deyiminin genel biçimi şu şekildedir:

		break [etiket (label) ismi];
>break deyiminin etiketsiz kullanımda akış ilgili döngüden sonrasından devam eder. Yani döngü sonlanmış olur. break deyiminin döngü deyimi ve switch deyimi dışında kullanımı error oluşturur.  break deyimi hangi döngü deyimi içerisinde kullanılmışsa o döngü deyimini sonlandırır. break deyimi algoritmaya göre her durumda kullanılabileceği gibi tipik olarak sonsuz döngü içerisinde de kullanılabilir
 
>**Sınıf Çalışması:** Parametresi ile aldığı `long` türden bir sayıdan büyük ilk asal sayıyı döndüren `nextClosestPrime`
metodunu yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- `isPrime` metodunun `hızlı` versiyonu kullanılacaktır.
>- Metot taşma durumlarını kontrol etmeyecektir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		NumberUtilNextClosestPrimeTest.run();			
	}
}

class NumberUtilNextClosestPrimeTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			long a = Long.parseLong(kb.nextLine());
			
			if (a == 0)
				break;
			
			System.out.printf("%d sayısından büyük ilk asal sayı:%d%n", a, NumberUtil.nextClosestPrime(a));					
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static long nextClosestPrime(long a)
	{
		if (a < 2)
			return 2;
		
		while (!isPrime(++a))
			;
		
		return a;		
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

>Aşağıdaki demo örnekte içteki döngüde bir koşul sağlandığında dıştaki döngü de sonlandırılmıştır. Bunun bayrak (flag) değişken kullanılarak yapıldığına dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean exitFlag = false;
		
		for (int i = 0; i < 20; ++i) {
			for (int k = 40; k >= 0; --k) {
				System.out.printf("(%d, %d)%n", i, k);
				if ((i + k) % 6 == 0) {
					exitFlag = true;
					break;
				}
			}
			
			if (exitFlag)
				break;
		}
				
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>break deyiminin `etiketli` (labeled break) yazılan etiket isminin bildirilmiş olduğu döngü deyimi sonlandırılır. Etiket bildiriminin genel biçimi şu şekildedir:

		<etiket ismi>:
>Etiket ismi değişken isimlendirme kurallarına uygun herhangi bir isim olabilir ancak bir convention olarak isimlendirmede tamamen büyük harfler kullanılır ve birden fazla kelime için alttire karakteri kullanılır. Etiket isimleri tipik olarak döngü deyimlerinde ve switch deyiminde bildirilebilir
 
>Aşağıdaki demo örnekte içteki döngüde bir koşul sağlandığında dıştaki döngü de sonlandırılmıştır. Bunun `etiketli break deyimi` kullanılarak yapıldığına dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		EXIT_LOOP:
		for (int i = 0; i < 20; ++i)
			for (int k = 40; k >= 0; --k) {
				System.out.printf("(%d, %d)%n", i, k);
				if ((i + k) % 6 == 0) 
					break EXIT_LOOP;
			}
				
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden pozitif bir n değeri için n-inci Fibonacci sayısını döndüren `fibonacciNumber` isimli metodu yazınız ve aşağıdaki kod ile test ediniz.
>	
>**Açıklamalar:**
>- 0 1 1 2 3 5 8 13 21 ... serisinin sayılarına Fibonacci sayıları denir
>- Metot pozitif olmayan n değeri için kontrol yapmayacaktır
>- Metot recursive yazılmayacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		NumberUtilFibonacciNumberTest.run();
	}
}

class NumberUtilFibonacciNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				break;
			
			System.out.printf("%d. Fibonacci sayısı:%d%n", n, NumberUtil.fibonacciNumber(n));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int fibonacciNumber(int n)
	{
		if (n <= 2)
			return n - 1;
		
		int prev1 = 1, prev2 = 0, result = prev1 + prev2;
		
		for (int i = 3; i < n; ++i) {
			prev2 = prev1;
			prev1 = result;
			result = prev1 + prev2;
		}
		
		return result;		
	}
}
```

#### 18 Nisan 2024
 
>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden sayıdan büyük ilk Fibonacci sayısını döndüren `nextFibonacciNumber` isimli metodu `NumberUtil` sınıfı içerisinde yazınız ve test ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		NumberUtilNextFibonacciNumberTest.run();
	}
}

class NumberUtilNextFibonacciNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			System.out.printf("%d sayısından büyük ilk Fibonacci sayısı:%d%n", n, NumberUtil.nextFibonacciNumber(n));
			
			if (n == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int nextFibonacciNumber(int val)
	{
		if (val < 0)
			return 0;
		
		int prev1 = 1, prev2 = 0, next;
		
		while (true) {
			next = prev1 + prev2;
			if (next > val)
				break;
			prev2 = prev1;
			prev1 = next;
		}
		
		return next;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı int türden sayıdan büyük ilk Fibonacci sayısını döndüren `nextFibonacciNumber` isimli metodu `NumberUtil` sınıfı içerisinde yazınız ve test ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		NumberUtilNextFibonacciNumberTest.run();
	}
}

class NumberUtilNextFibonacciNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());

			System.out.printf("%d sayısından büyük ilk Fibonacci sayısı:%d%n", n, NumberUtil.nextFibonacciNumber(n));
			
			if (n == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int nextFibonacciNumber(int val)
	{		
		if (val < 0)
			return 0;
		
		int prev1 = 1, prev2 = 0, next = prev1 + prev2;
		
		while (next <= val) {						
			prev2 = prev1;
			prev1 = next;
			next = prev1 + prev2;
		}
		
		return next;
	}
}
```

>**_continue deyimi:_** Bu deyim döngünün kendisini değil, o anki adımını sonlandırır. continue deyimi yalnızca döngü deyimlerinde kullanılabilir. Akış continue deyimine geldiğinde döngünün adımı sonlandırılır yani bir sonraki adım için gerekenler yapılır. break deyimi kadar çok kullanılmasa da bazı durumlarda okunabilirliği artırmak için tercih edilebilir
 
>Aşağıdaki demo örneği inceleyiniz. Şüphesiz örnek `continue` deyimi kullanılmadan da yapılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		for (int i = a; i <= b; ++i) {
			if (i % 2 != 0)
				continue;
			
			System.out.printf("%d ", i);
		}
		
		System.out.println();		
	}
}
```

>Aşağıdaki demo örneği inceleyiniz
>
>Not: İleride daha iyisi yazılacaktır

```java
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
	
	public static void doOption(int option)
	{
		if (option == 1)
			insert();
		else if (option == 2)
			delete();
		else if (option == 3)
			update();
		else
			list();
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			printMenu();
			int option = Integer.parseInt(kb.nextLine());
			
			if (option < 1 || option > 5) {
				printInvalidOptionMessage();
				continue;
			}
			
			if (option == 5)
				break;
			
			doOption(option);
		}
		
		printGoodbyeMessage();
		
	}
}
```

>**Anahtar Notlar:** Bir programı herhangi bir metot içerisinde sonlandırmak için `System.exit` isimli bir metot çağrılabilir. Bu metot parametre olarak int türden bir çıkış kodu (exit code) bilgisini alır. Çıkış kodunun şu aşamada önemi yoktur.

>Aşağıdaki demo örneği inceleyiniz
>
>Not: İleride daha iyisi yazılacaktır

```java
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
```

>**_switch deyimi:_** `switch` deyimi sonlu ve sabit sayıda seçenek için okunabilirliği artırmak amaçlı kullanılan bir kontrol deyimidir. `switch` deyimi belirli koşullar altında if deyimi yerine kullanılabilir. Yani bu anlamda belirli koşullar altında if deyimi gibi çalışır. `switch` deyimine `Java 12` ile birlikte (ilerleyen bazı sürümlerde de) eklentiler yapılmıştır. Hatta bu anlamda `switch expression` da dile eklenmiştir. switch expression ve `switch` deyimine ilişkin eklentiler ileride ele alınacaktır.
>	
>`switch` deyiminin genel biçimi şu şekildedir:

		switch (<ifade>) {	
			case <sabit ifadesi-1>:
				<deyim>
			case <sabit ifadesi-2>:
				<deyim>
			...
			
			[
			default:
				<deyim>
			]
		}
>`switch` parantezi içerisindeki ifadenin tam sayı türünden (int, long, short, byte) VEYA char türden VEYA String türünden VEYA enum class türünden olması zorunludur. Bunlar dışında bir türden olması durumunda error oluşur. Bir case bölümüne ilişkin ifadenin ilgili türden sabit ifadesi olması zorunludur. switch deyiminde default anahtar sözcüğü ile default bölümü (default case) olabilir. default bölümü sentaks olarak zorunlu değildir. switch deyimi aslında if deyiminin özel bir hali olarak düşünülebilir. Yukarıdaki genel biçime ilişkin if deyimi şu şekilde yazılabilir:

		if (<ifade> == <sabit ifadesi-1>)
			<deyim>
		else if (<ifade> == <sabit ifadesi-2>
			<deyim>
		...
		[
		else
			<deyim>
		]	
>Dikkat edilirse else kısmı aslında default kısım anlamındadır. switch deyiminin genel biçiminin, if deyimi karşılığı yaklaşık olarak yazılmıştır.
>
>**Anahtar Notlar:** Dikkat edilirse `switch` deyiminde eşitlik karşılaştırması yapılmaktadır. String türü için eşitlik karşılaştırması `==` operatörü ile yapılmaz. Bu durum ileride anlaşılacaktır 
>
>**Anahtar Notlar:** `String` ve `enum class` kavramları ileride ele alınacaktır
>
>`switch` deyiminde "aşağı düşme (fall through)" özelliği vardır. Bir case bölümünde (veya default case'de) yazılan deyimlerin sonunda bir sonraki bölüme geçişi engelleyen bir deyim yazılmamışsa bu özellikten dolayı ilgili bölüm de çalıştırılır. Buna aşağı düşme denir. Aşağı düşme çeşitli deyimlerle engellenebilir. Tipik olarak break deyimi switch deyimini sonlandırmak için kullanıldığından aşağı düşme engellenmiş olur. Aşağı düşme algoritmaya göre return deyimi, continue deyimi ve sonsuz döngü gibi deyimlerle de engellenebilir. Ancak en çok break deyimi kullanılır.
>
>switch deyiminde aynı değere sahip case bölümünden birden fazla yazılması geçersizdir.
 
>Aşağıdaki demo örnekte `break` deyiminin kullanıldığına dikkat ediniz. Neden kullanıldığı ileride ele alınacaktır.
>
>Örnekteki switch deyiminin if deyimi karşılığı şu şekildedir:
>
>		if (plate == 34)
>			System.out.println("İstanbul");
>		else if (plate == 35)
>			System.out.println("İzmir");
>		else if (plate == 6)
>			System.out.println("Ankara");
>		else if (plate == 67)
>			System.out.println("Zonguldak");
>		else
>			System.out.println("Geçersiz plaka değeri!...");

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Plaka numarasını giriniz:");
		int plate = kb.nextInt();
		
		switch (plate) {
		case 34:
			System.out.println("İstanbul");
			break;
		case 35:
			System.out.println("İzmir");
			break;
		case 6:
			System.out.println("Ankara");
			break;
		case 67:
			System.out.println("Zonguldak");
			break;
		default:
			System.out.println("Geçersiz plaka değeri!...");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>switch deyiminde default case yoksa bu durumda hiç bir case bölümü için koşul sağlanmadığında akış switch deyiminden sonraki deyimden devam eder.
>
>Örnekteki switch deyiminin if deyimi karşılığı şu şekildedir:
>
>		if (plate == 34)
>			System.out.println("İstanbul");
>		else if (plate == 35)
>			System.out.println("İzmir");
>		else if (plate == 6)
>			System.out.println("Ankara");
>		else if (plate == 67)
>			System.out.println("Zonguldak");

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Plaka numarasını giriniz:");
		int plate = kb.nextInt();
		
		switch (plate) {
		case 34:
			System.out.println("İstanbul");
			break;
		case 35:
			System.out.println("İzmir");
			break;
		case 6:
			System.out.println("Ankara");
			break;
		case 67:
			System.out.println("Zonguldak");
			break;		
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>switch deyiminde default case istenilen yere yazılabilir. Nereye yazılırsa yazılsın yine default case'dir. Şüphesiz okunabilirlik/algılanabilirlik açısından tüm case bölümlerinden sonra yazılması tavsiye edilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Plaka numarasını giriniz:");
		int plate = kb.nextInt();
		
		switch (plate) {
		default:
			System.out.println("Geçersiz plaka değeri!...");
			break;
		case 34:
			System.out.println("İstanbul");
			break;
		case 35:
			System.out.println("İzmir");
			break;
		case 6:
			System.out.println("Ankara");
			break;
		case 67:
			System.out.println("Zonguldak");
			break;		
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki örnekte plate `double` türden olduğundan error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Plaka numarasını giriniz:");
		double plate = kb.nextDouble();
		
		switch (plate) {
		case 34:
			System.out.println("İstanbul");
			break;
		case 35:
			System.out.println("İzmir");
			break;
		case 6:
			System.out.println("Ankara");
			break;
		case 67:
			System.out.println("Zonguldak");
			break;		
		default:
			System.out.println("Geçersiz plaka değeri!...");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki örnekte case bölümüne ilişkin ifade sabit ifadesi olmadığından error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Plaka numarasını giriniz:");
		int plate = kb.nextInt();
		
		int val = 34;
		
		switch (plate) {
		case val: //error
			System.out.println("İstanbul");
			break;
		case 35:
			System.out.println("İzmir");
			break;
		case 6:
			System.out.println("Ankara");
			break;
		case 67:
			System.out.println("Zonguldak");
			break;		
		default:
			System.out.println("Geçersiz plaka değeri!...");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte switch deyiminin aşağı düşme özelliğinden yararlanılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();	
	
		switch (code) {
		case 212:			
		case 216:
			System.out.println("İstanbul");
			break;
		case 232:
			System.out.println("İzmir");
			break;
		case 312:
			System.out.println("Ankara");
			break;
		case 372:
			System.out.println("Zonguldak");
			break;		
		default:
			System.out.println("Geçersiz telefon kodu!...");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte `switch` deyiminin aşağı düşme özelliğinden yararlanılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();	
	
		switch (code) {
		case 212:
			System.out.print("Avrupa ");			
		case 216:
			System.out.println("İstanbul");
			break;
		case 232:
			System.out.println("İzmir");
			break;
		case 312:
			System.out.println("Ankara");
			break;
		case 372:
			System.out.println("Zonguldak");
			break;	
		default:
			System.out.println("Geçersiz telefon kodu!...");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

#### 25 Nisan 2024
 
>**Anahtar Notlar:** Derleyiciler, programa ilişkin algoritmayı değiştirmeden, algoritmanın en iyi biçiminde çalışmasını sağlayan kodu üretmesine `compiler optimization` denir. Bu anlamda derleyiciler programcının yazdığı algoritmayı düzeltmez. Optimizasyon genel olarak ikiye ayrılır: speed optimization, size optimization. Speed optimization, algoritmaya ilişkin üretilen kodun hızlı çalışması için, size optimization ise üretilen kodun daha az yer kaplaması için yapılır. Derleyicinin pek çok durum için optimizasyon yaklaşımı vardır. 
>	 
>Derleyiciler sabit ifadelerinin değerlerini arakoda, hesaplayıp yazarlar. Yani sabit ifadelerinin değerleri çalışma zamanında hesaplanmaz. Buna `constant folding optimization` denir.

>Aşağıdaki demo örnekte derleyici `constant folding` yaptığından aynı değere sahip birden fazla case bölümü tespit ettiğinden error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();	
	
		switch (code) {
		case 212: //error
		case 216:
			System.out.println("İstanbul");
			break;
		case 211 + 1: //error
			System.out.println("İstanbul");
			break;
		case 232:
			System.out.println("İzmir");
			break;
		case 312:
			System.out.println("Ankara");
			break;
		case 372:
			System.out.println("Zonguldak");
			break;	
		default:
			System.out.println("Geçersiz telefon kodu!...");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

**Anahtar Notlar:** `switch` deyiminde case bölümlerinin (dolayısıyla default bölümün) çok uzun deyimlerle doldurulmaması tavsiye edilir. Tipik olarak `switch` deyimine bakıldığında case bölümleri kolaylıkla okunabilir olmalıdır. Bu anlamda case bölümlerinin uzun kodlar olması durumunda ilgili bölümler için metotlar yazılıp çağrılması tavsiye edilir. Ayrıca çok fazla sabit değeri olması durumunda `switch` deyimi okunabilirliği/algılanabilirliği olumsuz etkileyebilir. Hatta böyle bir durumda if deyimi bile okunabilirliği/algılanabilirliği olumsuz etkileyebilir. Bu tip durumlarda izlenebilecek yöntemler zamanla anlaşılacaktır
 
>Aşağıdaki demo örneği inceleyiniz
>
>Not: İleride daha iyisi yazılacaktır

```java
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
		switch (option) {
		case 1:
			insert();
			break;
		case 2: 
			delete();
			break;
		case 3:
			update();
			break;
		case 4:
			list();
			break;
		case 5:
			quit();
			break;
		default:
			invalidOption();			
		}		
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
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden bir yıl bilgisinin artık yıl olup olmadığını test eden `isLeapYear`	isimli metodu yazınız ve aşağıdaki kod ile test ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		DateUtilIsLeapYearTest.run();
	}
}

class DateUtilIsLeapYearTest {	
	public static void run()
	{
		for (int y = 1994; y <= 2104; ++y)
			if (DateUtil.isLeapYear(y))
				System.out.println(y);
	}
}

class DateUtil {
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden gün, ay ve yıl bilgilerine ilişkin tarihin geçerli bir tarih olup olmadığını test eden `isValidDate` isimli metodu yazınız ve aşağıdaki kod ile test ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		DateUtilIsValidDateTest.run();
	}
}

class DateUtilIsValidDateTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Gün, ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (DateUtil.isValidDate(day, month, year))
				System.out.printf("%02d/%02d/%04d tarihi geçerlidir%n", day, month, year);
			else 
				System.out.println("Geçersiz tarih!...");
			
			if (day == 0 && month == 0 && year == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class DateUtil {
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 &&  1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden gün, ay ve yıl bilgilerine ilişkin tarihin yılın kaçıncı günü olduğunu döndüren `getDayOfYear` isimli metodu yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:** Metot tarihin geçerli olup olmadığını kontrol etmeyecektir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		DateUtilGetDayOfYearTest.run();
	}
}

class DateUtilGetDayOfYearTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Gün, ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (DateUtil.isValidDate(day, month, year))
				System.out.printf("%02d/%02d/%04d tarihi yılın %d. günüdür%n", day, month, year, DateUtil.getDayOfYear(day, month, year));
			else 
				System.out.println("Geçersiz tarih!...");
			
			if (day == 0 && month == 0 && year == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class DateUtil {
	public static int getDayOfYear(int day, int month, int year)
	{
		int dayOfYear = day;
		
		switch (month - 1) {
		case 11:
			dayOfYear += 30;
		case 10:
			dayOfYear += 31;
		case 9:
			dayOfYear += 30;
		case 8:
			dayOfYear += 31;
		case 7:
			dayOfYear += 31;
		case 6:
			dayOfYear += 30;
		case 5:
			dayOfYear += 31;
		case 4:
			dayOfYear += 30;
		case 3:
			dayOfYear += 31;
		case 2:
			dayOfYear += 28;
			if (isLeapYear(year))
				++dayOfYear;
		case 1:
			dayOfYear += 31;
		}
		
		
		return dayOfYear;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 &&  1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden gün, ay ve yıl bilgilerine ilişkin tarihin haftanın hangi günü olduğu bilgisine geri dönen `getDayOfWeek` isimli metodu ve uygulamayı aşağıdaki açıklamalara göre yazınız
>	
>**Açıklamalar:**
>- getDayOfWeek metodu tarih geçerlilik kontrolü yapmayacaktır.
>- getDayOfWeek metodu haftanın hangi günü olduğuna ilişkin bilgiyi şu algoritmaya göre bulacaktır: `01.01.1900` tarihi ile ilgili tarih (dahil) arasındaki gün sayısı hesaplanıp 7 ile bölümünden elde edilen kalan alındığında 0 Pazar, 1 Pazartesi, ..., 6 Cumartesi anlamına gelir.
>- Program klavyeden gün ay ve yıl bilgisini isteyecek ve eğer tarih geçerli ise aşağıdaki formatta tarihi yazdırıcaktır:
>
>		25/04/2024 Perşembe
>- Tarih geçersiz ise Geçersiz tarih yazdıracaktır. Klavyeden gün ay ve yıl bilgilerinin 3'ü birden sıfır girildiğinde program sonlandırılacaktır. 
>
>Not: İleride daha iyisi yazılacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		DemoDateApp.run();	
	}
}

class DemoDateApp {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Gün, ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			DateUtil.printDateTR(day, month, year);
			
			if (day == 0 && month == 0 && year == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
} 

class DateUtil {
	public static void printDateTR(int day, int month, int year)
	{
		if (!isValidDate(day, month, year)) {
			System.out.println("Geçersiz tarih!...");
			return;
		}
		
		switch (getDayOfWeek(day, month, year)) {
		case 0:
			System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);
			break;
		case 1:
			System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);
			break;
		case 2:
			System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);
			break;
		case 3:
			System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);
			break;
		case 4:
			System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);
			break;
		case 5:
			System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);
			break;
		case 6:
			System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);
			break;
		}
			
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays = getDayOfYear(day, month, year);
		
		for (int y = 1900; y < year; ++y) {
			totalDays += 365;
			if (isLeapYear(y))
				++totalDays;
		}
		
		return totalDays % 7;
	}
	
	
	public static int getDayOfYear(int day, int month, int year)
	{
		int dayOfYear = day;
		
		switch (month - 1) {
		case 11:
			dayOfYear += 30;
		case 10:
			dayOfYear += 31;
		case 9:
			dayOfYear += 30;
		case 8:
			dayOfYear += 31;
		case 7:
			dayOfYear += 31;
		case 6:
			dayOfYear += 30;
		case 5:
			dayOfYear += 31;
		case 4:
			dayOfYear += 30;
		case 3:
			dayOfYear += 31;
		case 2:
			dayOfYear += 28;
			if (isLeapYear(year))
				++dayOfYear;
		case 1:
			dayOfYear += 31;
		}
		
		
		return dayOfYear;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 &&  1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
```

#### 30 Nisan 2024
 
>`switch expression` Java'ya 12 sürümü ile birlikte "preview" olarak eklenmiştir. Java 14 ile birlikte "release" durumuna gelmiştir. Java programcısı açısından switch expression pratikte Java 17 ile kullanılabilir durumdadır. Anımsanacağı gibi uygulama geliştirmede Java 8, 11, 17 ve 21 sürümleri LTS olduklarından kullanılmaktadır. "switch expression" adından da anlaşılacağı gibi, bir ifade olduğundan bir değer üretebilir. Yani bu anlamda switch expression hem bir deyim gibi hem de bir ifade gibi kullanılabilmektedir. Hatta switch expression eklenmesi ile birlikte klasik switch deyimi de "yield" anahtar sözcüğü ile birlikte bir ifade olarak kullanılabilir duruma gelmiştir. yield anahtar sözcüğü ileride detaylı olarak ele alınacaktır.
>	
>**Anahtar Notlar:** Programlamada hem deyim hem de ifade olarak kullanılan sentaktik elemanlara "ifadesel deyim" `expression statement` da denilmektedir.
>	
>`switch expression`'ın genel biçimi şu şekildedir:

		switch (<ifade>) {
			case <si>[, <si>, ...] -> <deyim veya ifade> 
			case <si>[, <si>, ...] -> <deyim veya ifade>
			...
			[default -> <deyim veya ifade>]
		}
>`switch expression`'ın parentezi içerisindeki ifadeye ilişkin kurallar switch deyimi ile aynıdır. case bölümlerine ilişkin ifadelerin de yine switch deyiminde olduğu gibi sabit ifadesi (si) olması gerekir.
>
>`switch expression`'da aşağı düşme (fall through) özelliği yoktur. switch expression'da bir case bölümüne istenildiği sayıda sabit ifadesi virgül ile ayrılacak şekilde yazılabilir. Bu durumda aslında "OR" işlemi ya da işlemleri yapılmaktadır.
>
>`switch expression`, bir expression olarak kullanıldığında yani değeri bir işleme sokulduğunda default case'i kesinlikle bulunmalıdır. Aksi durumda error oluşur.
>
>`switch expression`'da bir case bölümüne (ya da default bölüme) birden fazla deyim yazılacaksa bu durumda bileşik deyim olarak yazılmalıdır. Bu durumda switch expression'ın ürettiği değer kullanılacaksa yield anahtar sözcüğü ile ilgili değer yazılmalıdır. Bileşik deyim kullanılmadığında yield anahtar sözcüğü kullanımı error oluşturur. yield anahtar sözcüğü switch expression'ı da sonlandırır. yield anahtar sözcüğü kullanılarak switch deyimi de bir expression olarak kullanılabilir duruma gelmiştir.

>Aşağıdaki örnekte `switch expression` kullanılmıştır. Aşağı düşme özelliği olmadığından break gibi bir deyimin kullanılmadığına dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Plaka numarasını giriniz:");
		int plate = kb.nextInt();
		
		switch (plate) {
			case 34-> System.out.println("İstanbul");			
			case 35 -> System.out.println("İzmir");		
			case 6 -> System.out.println("Ankara");		
			case 67 -> System.out.println("Zonguldak");			
			default ->System.out.println("Geçersiz plaka değeri!...");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();
		
		switch (code) {
			case 212, 216 -> System.out.println("İstanbul");			
			case 232 -> System.out.println("İzmir");		
			case 312 -> System.out.println("Ankara");		
			case 372 -> System.out.println("Zonguldak");			
			default ->System.out.println("Geçersiz telefon kodu!...");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();		
		int plate = switch (code) {
			case 212, 216 -> 34;			
			case 232 -> 35;		
			case 372 -> 67;
			default -> -1;
		};
		
		if (plate != -1)
			System.out.printf("Plaka:%d%n", plate);
		else
			System.out.println("Geçersiz giriş!...");		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();		
		
		Util.doWorkForPlate(switch (code) {
			case 212, 216 -> 34;			
			case 232 -> 35;		
			case 372 -> 67;
			default -> -1;
		});
		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Util {
	public static void doWorkForPlate(int plate)
	{
		if (plate != -1)
			System.out.printf("Plaka:%d%n", plate);
		else
			System.out.println("Geçersiz giriş!...");		
		
	}
}
```

>Aşağıdaki demo örnekte `switch` bir expression olarak kullanıldığından `default case` zorunludur

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();		
		
		Util.doWorkForPlate(switch (code) { //error
			case 212, 216 -> 34;			
			case 232 -> 35;		
			case 372 -> 67;
			//default -> -1;
		});
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class Util {
	public static void doWorkForPlate(int plate)
	{
		if (plate != -1)
			System.out.printf("Plaka:%d%n", plate);
		else
			System.out.println("Geçersiz giriş!...");		
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();
		
		switch (code) {
			case 212, 216 -> {++code; System.out.println("İstanbul");}		
			case 232 -> System.out.println("İzmir");		
			case 312 -> System.out.println("Ankara");		
			case 372 -> System.out.println("Zonguldak");			
			default ->System.out.println("Geçersiz telefon kodu!...");
		}
		
		System.out.printf("Kod:%d%n", code);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();		
		int plate = switch (code) {
			case 212, 216 ->  {System.out.println("İstanbul"); yield 34;}			
			case 232 -> 35;		
			case 372 -> 67;
			default -> -1;
		};
		
		if (plate != -1)
			System.out.printf("Plaka:%d%n", plate);
		else
			System.out.println("Geçersiz giriş!...");		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örnekte switch statement bir expression olarak kullanılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();	
		
		int plate = switch (code) {
			case 212:
			case 216:
				System.out.println("İstanbul"); 
				yield 34;			
			case 232: yield 35;		
			case 372: yield 67;
			default: yield -1;
		};
		
		if (plate != -1)
			System.out.printf("Plaka:%d%n", plate);
		else
			System.out.println("Geçersiz giriş!...");		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Ne zaman switch expression ne zaman switch statement kullanılmalıdır? Programcı buna nasıl karar verecektir? Bu sorunun genel bir cevabı şu şekilde verilebilir: "Gerekmedikçe switch statement kullanılmamalıdır". switch statment tipik olarak iki durumda gerekir:
>- Java 11 ve öncesi ile geliştirilen bir projede zaten switch expression kullanılamaz. Bu durumda switch statement kullanılır.
>- Aşağı düşme özelliğinin gerektiği bir durumda switch statement tercih edilir.

>Aşağıdaki demo örneği inceleyiniz
>
>Not: İleride daha iyisi yazılacaktır

```java
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
		switch (option) {
			case 1 ->insert();			
			case 2 -> delete();		
			case 3 -> update();			
			case 4 -> list();
			case 5 -> quit();			
			default -> invalidOption();			
		}		
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
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden gün, ay ve yıl bilgilerine ilişkin tarihin haftanın hangi günü olduğu bilgisine geri dönen `getDayOfWeek` isimli metodu ve uygulamayı aşağıdaki açıklamalara göre yazınız
>
>**Açıklamalar:**
>- getDayOfWeek metodu tarih geçerlilik kontrolü yapmayacaktır.
>- getDayOfWeek metodu haftanın hangi günü olduğuna ilişkin bilgiyi şu algoritmaya göre bulacaktır: 01.01.1900 tarihi ile ilgili tarih (dahil) arasındaki gün sayısı hesaplanıp 7 ile bölümünden elde edilen kalan alındığında 0 Pazar, 1 Pazartesi, ..., 6 Cumartesi anlamına gelir.
>- Program klavyeden gün ay ve yıl bilgisini isteyecek ve eğer tarih geçerli ise aşağıdaki formatta 
tarihi yazdırıcaktır:
>
>		25/04/2024 Perşembe
>- Tarih geçersiz ise Geçersiz tarih yazdıracaktır. Klavyeden gün ay ve yıl bilgilerinin 3'ü birden sıfır girildiğinde program sonlandırılacaktır. 
>
>Not: İleride daha iyisi yazılacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		DemoDateApp.run();	
	}
}

class DemoDateApp {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Gün, ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			DateUtil.printDateTR(day, month, year);
			
			if (day == 0 && month == 0 && year == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
} 

class DateUtil {
	public static void printDateTR(int day, int month, int year)
	{
		if (!isValidDate(day, month, year)) {
			System.out.println("Geçersiz tarih!...");
			return;
		}
		
		switch (getDayOfWeek(day, month, year)) {
			case 0 -> System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);			
			case 1 -> System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);		
			case 2 -> System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);			
			case 3 -> System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);		
			case 4 -> System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);		
			case 5 -> System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);		
			case 6 -> System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);		
		}			
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays = getDayOfYear(day, month, year);
		
		for (int y = 1900; y < year; ++y) {
			totalDays += 365;
			if (isLeapYear(y))
				++totalDays;
		}
		
		return totalDays % 7;
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		int dayOfYear = day;
		
		switch (month - 1) {
		case 11:
			dayOfYear += 30;
		case 10:
			dayOfYear += 31;
		case 9:
			dayOfYear += 30;
		case 8:
			dayOfYear += 31;
		case 7:
			dayOfYear += 31;
		case 6:
			dayOfYear += 30;
		case 5:
			dayOfYear += 31;
		case 4:
			dayOfYear += 30;
		case 3:
			dayOfYear += 31;
		case 2:
			dayOfYear += 28;
			if (isLeapYear(year))
				++dayOfYear;
		case 1:
			dayOfYear += 31;
		}
		
		return dayOfYear;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 &&  1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		return switch (month) {
			case 4, 6, 9, 11 -> 30;
			case 2 -> {if (isLeapYear(year)) yield 29; yield 28;}
			default -> 31;		
		};	
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
```

#### 2 Mayıs 2024

##### Farklı Türlerin Birbirine Atanması/Tür Dönüşümleri (Type Conversions)

>Java'da farklı türlerin birbirine atanabilmesine (dönüşebilmesine) yönelik kurallar belirlenmiştir. `T1` ve `T2` birer tür ismi olmak üzere
>
>		T1 a;
>		T2 b;
>			
>		...
>			
>		a = b; //**
>kodları için `**` ile belirtilen ifadede T2 türünden T1 türüne doğrudan dönüşüm/atama (implicit conversion) denir.
>
>Bu ifadede `T2` türüne `kaynak` tür (source type), `T1` türüne ise `hedef` tür (destination/target type) denir. Java'da derleyici açısından hangi türün hangi türe doğrudan atanabileceği belirlidir. Bu anlamda atanamayan türler de ileride göreceğimiz tür dönüştürme operatörü (type cast operator) ile genel olarak dönüştürülebilmektedir. Tür dönüştürme operatörü ile yapılan dönüşüme ise explicit conversion denir. Bu bölümde temel türler arasındaki tür dönüştürme kuralları ele alınacaktır. Diğer türler arasındaki dönüşümler kurs boyunca konular içerisinde ele alınacaktır.
>
>Temel türler arasındaki doğrudan dönüşümlerde genel kural şu şekildedir: "Genel olarak bilgi/veri kaybına yol açmayacak dönüşümler doğrudan yapılabilir".
>
>Derleyici kaynak türe ilişkin değerin `hedef` türün sınırları içerisinde olup olmadığına bakmaz, ki çoğu zamanda bakamaz. Örneğin değer klavyeden okunsa zaten derleme zamanında hiç bir şekilde bilinemez. Bu durumda derleyici kaynak türden `hedef` türe doğrudan atamanın geçerli olup olmadığına göre kodu derler. Doğrudan dönüşüme ilişkin ayrıntılar ayrıca ele alınacaktır.
>	
>**Anahtar Notlar:** Uzunluk (size) olarak küçük türden uzunluk olarak büyük türe yapılan dönüşümlere Java Language Specification'da (JLS) `widening` conversion, uzunluk olarak büyük türden uzunluk olarak küçük türe yapılan dönüşümlere `narrowing` conversion, her ikisinin birden olduğu dönüşümlere ise `widening and narrowing` conversion denilmektedir. Buradaki terimler, dönüşümün geçerli ya da geçersiz olmasından bağımsızdır. Anlatım bu şekilde kullanılmıştır. Biz burada bu terimleri her zaman kullanmayarak konuyu daha anlaşılır hale getirmeye çalışacağız.
>
>**Anahtar Notlar:** Anımsanacağı gibi Java'da 3 yerde atama işlemi yapılmaktadır:
>1. Yalın atama işlemi (Atama operatörü ile yapılan atama işlemi).
>2. Metot çağrısında argümanlardan parametrelere aktarım.
>3. Metodun geri dönüş değerinin geçici değişkene atanması.
>
>Tür dönüştürme kuralları istisna bir kaç kural dışında tüm atama durumlarında geçerlidir. İstisna kurallar ayrıca ele alınacaktır.

>Aşağıdaki demo örnekte derleyici a değişkenin içerisindeki değeri derleme zamanında bilemeyeceğinden ve dönüşümün	geçerli olması durumunda bilgi kaybı olabileceğinden error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		long a = Long.parseLong(kb.nextLine());
		int b;
		
		b = a; //error
		
	}
}
```

>Aşağıdaki demo örnekte `int` türü sınırları içerisindeki bir değer `long` türü sınırları içerisinde de olduğundan bilgi kaybı oluşmaz, kod derlenir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		long b;
		
		b = a;
		
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
	}
}
```

##### Temel türler arasındaki doğrudan dönüşüme (implicit conversion) ilişkin ayrıntılar
 
>Küçük tamsayı türünden büyük tamsayı türüne doğrudan atama geçerlidir. Bu dönüşümde kaynak türe ilişkin değer pozitif ise sayının yüksek anlamlı byte'larına ilişkin bit'leri sıfır ile beslenir, değer negatif ise işaretin kaybedilmemesi için yüksek anlamlı byte'lara ilişkin bit'ler 1 ile beslenir.
>	
>Aşağıdaki demo örneği çeşitli değerler girerek çalıştırıp sonuçları gözlemleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) { 
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			long b;
			
			b = a;
			
			System.out.printf("a = %d%n", a);
			System.out.printf("a = %08X%n", a);
			System.out.printf("b = %d%n", b);
			System.out.printf("b = %016X%n", b);
			
			if (a == 0)
				break;
		}
	}
}
```

>Büyük tamsayı türünden küçük tamsayı türüne doğrudan dönüşüm geçersizdir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		short b;
		
		b = a; //error	
		
	}
}
```

>Anımsanacağı gibi Java'da `byte` ve `short` türden sabit yoktur. Ancak istisna bir kural olarak "int türden bir sabit eğer hedef türün sınırları içerisindeyse short veya byte türüne doğrudan atanabilir. Aksi durumda error oluşur"

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int x = 10;
		short a;
		byte b;
		
		a = 10;
		b = -124;
		a = 70000; //error
		b = -129; //error
		a = x; //error
		
	}
}
```

>Yukarıdaki istisna kural char türü için de geçerlidir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int x = 10;
		char c;
		
		c = 10;
		c = -10; //error
		c = x; //error	
		
	}
}
```

>Yukarıdaki istisna kurallar metot çağrısında argümanlardan parametrelere aktarımda geçersiz, metotların geri dönüş değerinin geçici değişkene yapılan atama işlemlerinde geçerlidir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample.foo(10); //error
		Sample.bar(10); //error
		Sample.tar(10); //error	
	}
}

class Sample {
	public static void foo(short a)
	{
		//...
	}
	
	public static void bar(byte a)
	{
		//...
	}
	
	public static void tar(char a)
	{
		//...
	}
}

class Mample {
	public static short foo()
	{
		return 10;
	}
	
	public static byte bar()
	{
		return 10;
	}
	
	public static char tar()
	{
		return 10;
	}
}
```

>Herhangi bir gerçek sayı türünden, bir tamsayı türüne doğrudan dönüşüm geçersizdir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		float a = 12;
		long b;
		
		b = a; //error
	}
}
```

>Herhangi bir tamsayı türünden herhangi bir gerçek sayı türüne doğrudan atama geçerlidir. Aşağıdaki örnekte long türünün uzunluğu float türünden büyük olmasına karşın atama işlemi yapılabilir. Çünkü tamsayıların tutuluş formatı ile gerçek sayıların tutuluş formatı farklıdır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		long a = 12;
		float b;
		
		b = a;
	}
}
```

>`float` türünden `double` türüne doğrudan atama geçerlidir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		float a = Float.parseFloat(kb.nextLine());
		double b;
		
		b = a; 
		
		System.out.printf("a = %.20f%n", a);
		System.out.printf("b = %.20f%n", b);
	}
}
```

>`double` türünden `float` türüne doğrudan atama geçersizdir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		double a = Double.parseDouble(kb.nextLine());
		float b;
		
		b = a; //error
	}
}
```

>Aşağıdaki örnekte `double` türünden `float` türüne atama yapıldığından error oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		float a;
		
		a = 0.3; //error
	}
}
```

>Yukarıdaki atama istenirse `float` türden sabit yazılarak yani sonuna F (küçük veya büyük) soneki konularak yapılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		float a;
		
		a = 0.3F;
		
		System.out.printf("a = %.20f%n", a);
	}
}
```

>Hiç bir türden `char` türüne doğrudan dönüşüm yapılamaz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		byte a;
		
		a = 10;
		
		char b;
		
		b = a; //error
	}
}
```

>`char` türünden `short` türüne doğrudan dönüşüm geçersizdir. Çünkü `char` türü sınırları içerisinde `short` türü sınırları dışında kalan değerler de vardır. Bu durumun `int` türden sınırlar içerisindeki sabit olma istisnası unutulmamalıdır. Benzer şekilde `short` türünden de `char` türüne doğrudan atama geçersizdir: Çünkü negatif değerler `char` türü sınırları dışındadır.

>`char` türünden kendisinden uzunluk olarak büyük olan türlere doğrudan dönüşüm geçerlidir

>Hiç bir türden `boolean` türüne, `boolean` türünden hiç bir türe doğrudan dönüşüm yapılamaz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a;
		
		a = 0;
		boolean b;
		
		b = a; //error
		
		boolean x = true;
		int y;
		
		y = x; //error
	}
}
```

>Geçerli doğrudan dönüşümlere ilişkin özet bilgi şu şekildedir:
>
>		byte	-> short, int, long, float, double
>		short	-> int, long, float, double
>		int	-> long, float, double
>		long	-> float, double
>		float	-> double
>		char	-> int, long, float, double
 
#### 7 Mayıs 2024
 
>İşlem öncesi otomatik tür dönüşümü: İki operandlı bir operatör için aşağı seviyede farklı türlerle işlem yapılamaz.
>
>Örneğin, int ve long türden iki değerin toplamı aşağı seviyede yapılamaz. İşte derleyiciler iki operandlı bir operatörün farklı türler ile işlem yaptığını gördüğünde ilgili işlemi ortak bir tür üzerinden yapmak için gereken kodları üretir. Bu işlemi duruma göre birini diğerine dönüştürerek ya da her ikisini ortak bir türe dönüştürürek yapar. Dönüştürme işlemini yukarıda anlatılan implicit conversion kurallarına uygun olarak yapar. Derleyicinin dönüştürme amaçlı ürettiği kodlara işlem öncesi otomatik tür dönüşümü denir. İşlem öncesi otomatik tür dönüşümü yapılamıyorsa error oluşur. Java'da işlem öncesi otomatik tür dönüşümü kuralları bellidir ve implicit conversion kurallarına uygundur.
>
>**Anahtar Notlar:** Bir değişkenin türü yaşamı (storage duration) boyunca değişmez. Bir değişkene ilişkin ifadenin türünün
başka bir türe dönüşümü aslında o ifadenin değerinin hedef tür ile temsil edilmesi demektir. 
>	
>İşlem öncesi otomatik tür dönüşümü kurallarına ilişkin ayrıntılar şunlardır.

>short, byte ve char türleri kendi aralarında işleme sokulduklarında (türlerin her ikisi de aynı olabilir) önce operandlara ilişkin değerler int türüne dönüştürülür. Bu işleme "integral/integer promotion" denir. İlgili işlemin sonucu yine int türünden çıkar

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		short a, b, c;
		
		a = 10;
		b = 20;
		c = a + b; //error
		
		
	}
}
```

>short, byte ve char türleri kendi aralarında işleme sokulduklarında (türlerin her ikisi de aynı olabilir) önce operandlara ilişkin değerler int türüne dönüştürülür. Bu işleme "integral/integer promotion" denir. İlgili işlemin sonucu yine int türünden çıkar

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		short a;
		byte b;
		short c;
		
		a = 10; b = 20;
		c = a + b; //error 
		
	
	}
}
```

>short, byte ve char türleri kendi aralarında işleme sokulduklarında (türlerin her ikisi de aynı olabilir) önce operandlara ilişkin değerler int türüne dönüştürülür. Bu işleme "integral/integer promotion" denir. İlgili işlemin sonucu yine int türünden çıkar

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		char a;
		short b;
		short c;
		
		a = 'A'; b = 32;
		c = a + b; //error 
		
	
	}
}
```

**Anahtar Notlar:** Modern sistemlerde iki operandlı tamsayı işlemleri ilgili sistemdeki int ve üstü tamsayı türleri ile yapılabilmektedir. Bu anlamda, 32 bit sistemlerde tamsayılar için iki operandlı işlemler genel olarak minimum 32 bit veya daha üstü (64 bit, 128 bit ...) gibi türler ile yapılabilir. 64 bit sistemlerde tamsayılar için iki	operandlı işlemler genel olarak minimum 32 bit veya daha üstü (64 bit, 128 bit ...) gibi türler ile yapılabilir. Burada söylenenlerin oldukça fazla detayı vardır. Bir fikir vermek amaçlı yazılmıştır.
 
>Bölme işleminde operandlardan ikisi de tamsayı türlerindense, işlemin sonucu tamsayı olarak çıkar. Bölme işleminde elde edilen değerin noktadan sonraki kısmı atılır.

**Anahtar Notlar:** Bu kuralın bir problem olmadığını programcı için bazı algoritmalarda kullanılabilir olduğunu anımsayınız. Sayıyı basamaklara ayıran örneklerimizi inceleyiniz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 java.util.Scanner kb = new java.util.Scanner(System.in);
		 
		 System.out.print("İki sayı giriniz:");
		 int a = kb.nextInt();
		 int b = kb.nextInt();
		 double c;
		 
		 c = a / b;
		 
		 System.out.printf("c = %.20f%n", c);
		 
	}
}
```

>Büyük tamsayı türü ile küçük tamsayı türü işleme sokulduğunda küçük tamsayı türüne ilişkimn değer büyük tamsayı türüne dönüştürülür ve sonuç büyük tamsayı türünden çıkar. Integral promotion bu kuralın dışındadır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 int a = 10;
		 long b = 20;
		 long c;
		 
		 c = a + b;
		 
		 System.out.printf("c = %d%n", c);
		 
	}
}
```

>Büyük tamsayı türü ile küçük tamsayı türü işleme sokulduğunda küçük tamsayı türüne ilişkimn değer büyük tamsayı türüne dönüştürülür ve sonuç büyük tamsayı türünden çıkar. Integral promotion bu kuralın dışındadır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 short a = 10;
		 long b = 20;
		 long c;
		 
		 c = a + b;
		 
		 System.out.printf("c = %d%n", c);
		 
	}
}
```

>char türü ile kendisinden uzunluk olarak büyük olan türler işleme sokulduğunda char türüne ilişkin değer ilgili türe dönüştürülür ve sonuç büyük tür türünden çıkar

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 char a = 'A';
		 double b = 20;
		 double c;
		 
		 c = a + b;
		 
		 System.out.printf("c = %f%n", c); 
	}
}
```

>Bir tamsayı ile bir gerçek sayı işleme sokulduğunda tamsayı türüne ilişkin değer ilgili gerçek sayı türüne dönüştürülür ve sonuç ilgili gerçek sayı türünden çıkar

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 long a = 10;
		 float b = 20;
		 float c;
		 
		 c = a + b;
		 
		 System.out.printf("c = %f%n", c); 
	}
}
```

>`float` ve `double` türleri işleme sokulduğunda float türüne ilişkin değer double türüne dönüştürülür ve sonuç `double` türden çıkar

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 double a = 10;
		 float b = 20;
		 double c;
		 
		 c = a + b;
		 
		 System.out.printf("c = %f%n", c); 
	}
}
```

>`boolean` türü hiç bir tür ile işleme sokulamaz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 boolean b = true;
		 int a = 10;
		 int c;
		 
		 c = a + b; //error
		 
	}
}
```

>Peki, derleyici işlem öncesi otomatik tür dönüşümüne ilişkin kodları nasıl üretir? Derleyici bu işlemi geçici değişken (temporary variable) yaratarak yapar. Yani geçici değişken yaratan kodu üretir.
>
>Aşağıdaki demo örnekte derleyici `**` ile belirtilen işlem için yaklaşık olarak aşağıdaki kodları üretir:
>	
>		{
>			long temp = a;
>			
>			c = temp + b;
>		} 
>
>**Anahtar Notlar:** Bir işlem için yaratılan ve o işlem sonucunda yok edilen değişkenlere geçici değişken dendiğini anımsayınız

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		long b = 20;
		long c;
		
		c = a + b; //**
		
		System.out.printf("c = %d%n", c);
	}
}
```

>Aşağıdaki demo örnekte derleyici `**` ile belirtilen işlem için yaklaşık olarak aşağıdaki kodları üretir:
>	
>		{
>			int temp1 = a;
>			int temp2 = b;
>			
>			c = temp1 + temp2;
>		}

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		short a = 10;
		short b = 20;
		int c;
		
		c = a + b; //**
		
		System.out.printf("c = %d%n", c);
	}
}
```

>**_Tür Dönüştürme Operatörü (Type Casting Operator):_** Bu operatör özel amaçlı, tek operandlı ve önek durumundadır.
>
>Operatörün kullanımına ilişkin genel biçim şu şekildedir:

		(<tür ismi>)<ifade>
>Operatör operandına ilişkin değeri belirtilen türe dönüştürür. Operatörün yan etkisi yoktur. Operatörün ürettiği değer operandına ilişkin değerin, belirtilen türe dönüştürüldüğündeki elde edilen değerdir. Operatör tür dönüştürme işlemini yine geçici değişken yaratarak yapar. Bu operatör ile yapılan dönüşümlere "explicit conversion" ya da "type casting" denilmektedir. Genel olarak `implicit` olarak yapılamayan dönüşümler, explicit olarak yapılabilmektedir. Dilin bütünlüğü olarak `implicit` olarak yapılabilen dönüşümler, bu operatör kullanılarak da yapılabilmektedir. Java'da `implicit` olarak yapılamayan ancak explicit olarak yapılabilen dönüşümlerde değerlerin nasıl elde edileceği yani genel olarak söylemek gerekirse bilgi kaybının nasıl olacağı da belirlidir. Burada bunlar ele alınacaktır.

**Anahtar Notlar:** Bir dönüşüm `implicit` olarak yapılamıyor ancak `explicit` olarak yapılabiliyorsa "ortada bir problem oluşabilir ve derleyici bunu yanlışlıkla programcının yapmasını istemediği için `explicit` yapılması gerekir" anlamı çıkmalıdır. Yani aslında zorunlu olarak `explicit` yapılan dönüşüm için derleyiciye programcı "ben durumun farkındayım bana izin ver, sonuçlarına katlanacağım :)" mesajı vermektedir. `Explicit` olarak bile yapılamayan dönüşümler zaten anlamsız olduklarından geçersizdir.
 
>Aşağıdaki demo örnekte bölme işlemi double türü ile yapılacağından sonuç double türden çıkar

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 java.util.Scanner kb = new java.util.Scanner(System.in);
		 
		 System.out.print("İki sayı giriniz:");
		 int a = kb.nextInt();
		 int b = kb.nextInt();
		 double c;
		 
		 c = (double)a / b;
		 
		 System.out.printf("c = %f%n", c); 
	}
}
```

>Explciit conversion'a ilişkin ayrıntılar şunlardır:
 
>Büyük tamsayı türünden küçük tamsayı türüne yapılan explicit dönüşümde değerin yüksek anlamlı byte'ları atılır. Bu durumda sayı hedef türün sınırları içerisinde kalıyorsa bilgi kaybı oluşmaz, kalmıyorsa oluşur. Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 java.util.Scanner kb = new java.util.Scanner(System.in);
		 
		 while (true) {
			 System.out.print("Bir sayı giriniz:");
			 long a = Long.parseLong(kb.nextLine());
			 int b;
			 
			 b = (int)a;
			 
			 System.out.printf("a = %d, b = %d%n", a, b);
			 System.out.printf("a = %016X, b = %08X%n", a, b);

			 
			 if (a == 0)
				 break;
		 }
		  
	}
}
```

>Büyük tamsayı türünden `char` türüne yapılan explicit dönüşümde sayının yüksek anlamlı byte değeri atılır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 java.util.Scanner kb = new java.util.Scanner(System.in);
		 
		 while (true) {
			 System.out.print("Bir sayı giriniz:");
			 int a = Integer.parseInt(kb.nextLine());
			 char b;
			 
			 b = (char)a;
			 
			 System.out.printf("a = %d, b = %d%n", a, (int)b);
			 System.out.printf("a = %08X, b = %04X%n", a, (int)b);
 
			 if (a == 0)
				 break;
		 }
		  
	}
}
```

>`short` türünden `char` türüne yapılan explicit dönüşümde sayının bit kalıbı değişmez. Sayının yorumlanışı değişir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		 java.util.Scanner kb = new java.util.Scanner(System.in);
		 
		 while (true) {
			 System.out.print("Bir sayı giriniz:");
			 short a = Short.parseShort(kb.nextLine());
			 char b;
			 
			 b = (char)a;
			 
			 System.out.printf("a = %d, b = %d%n", a, (int)b);
			 System.out.printf("a = %04X, b = %04X%n", a, (int)b);
 
			 if (a == 0)
				 break;
		 }
		  
	}
}
```

>`char` türünden `short` türüne yapılan explicit dönüşümde sayının bit kalıbı değişmez. Sayının yorumlanışı değişir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		char a = '\uFFE5';
		short b;
		
		b = (short)a;
		
		System.out.printf("a = %d, a = %c, b = %d%n", (int)a, a, b);
		System.out.printf("a = %04X, b = %04X%n", (int)a, b);
	}
}
```

#### 9 Mayıs 2024
 
>`byte` türünden `char` türüne explicit dönüşüm iki adımda gerçekleşir. Birinci adımda byte türüne ilişkin değer int türüne yükseltilir. İkinci adımda elde edilen değerin yüksek anlamlı iki byte'ı atılır. Aşağıdaki demo örneği çeşitli değerler ile çalıştırıp sonuçları gözlemleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			byte a = Byte.parseByte(kb.nextLine());
			char b;
			
			b = (char)a;
			
			System.out.printf("a = %02X%n", a);
			System.out.printf("a = %08X%n", (int)a);
			System.out.printf("b = %04X%n", (int)b);
			
			if (a == 0)
				break;
		}
	}
}
```

>`char` türünden `byte` türüne yapılan explicit dönüşümde değerin yüksek anlamlı byte'ı atılır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		char a = '\uFFE9';
		byte b;
		
		b = (byte)a;
		
		System.out.printf("b = %02X%n", b);
	}
}
```

>`double` türünden `float` türüne yapılan explicit dönüşümde sayı `float` türünden temsil edilebilen en yakın sayıya yuvarlanır. Bu durumda gerçek sayıların tutuluş formatına ilişkin yuvarlama hatası (rounding error) oluşabileceğini anımsayınız

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			double a = Double.parseDouble(kb.nextLine());
			float b;
			
			b = (float)a;
			
			System.out.printf("a = %.20f%n", a);
			System.out.printf("b = %.20f%n", b);
			
			if (a == 0)
				break;
			
		}
	}
}
```

>`boolean` türünden herhangi bir türe explicit dönüşüm geçersizdir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean a = true;
		int b;
		
		b = (int)a; //error
		
	}
}
```

>Herhangi bir türden `boolean` türüne explicit dönüşüm geçersizdir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 0;
		boolean b;
		
		b = (boolean)a; //error
	}
}
```

>**Anahtar Notlar:** `int` türünün en büyük değerine programlamada `Integer.MAX_VALUE`, en küçük değerine ise `Integer.MIN_VALUE` ifadeleri ile erişiebilir. Detaylar ileride ele alınacaktır
>
>Gerçek sayı türünden tamsayı ve char türüne yapılan explicit dönüşüm şu şekilde gerçekleşir:
>- Sayının noktadan sonraki kısmı atılır
>	- Elde edilen değer hedef türün sınırları içerisinde kalıyorsa doğrudan dönüştürülür
>	- Elde edilen değer hedef türün sınırları içerisinde kalmıyorsa
>		- Hedef tür int, short, byte, char türlerinde biriyse
>			- Değer int türü sınırları içerisindeyse tamsayılar arasındaki dönüşüm kuralları uygulanır
>			- Değer int türü sınırları dışındaysa sayının pozitif ya da negatif olması durumuna göre int türünün en büyük ya da en küçük değeri alınır ve bu değer ile tamsayılar arasındaki dönüşüm kuralları uygulanır
>		- Hedef tür long türüyse 
>			- Değer long türü sınırları içerisindeyse doğrudan alınır
>			- Değer long türü sınırları içerisinde değilse sayınının pozitif ya da negatif olması duruma göre long türünün en büyük ya da en küçük değeri alınır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		double a = 10.45;
		byte b;
		
		b = (byte)a;
		
		System.out.printf("b = %d%n", b);
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		double a = 128.45;
		byte b;
		
		b = (byte)a;
		
		System.out.printf("b = %02X%n", b);
		System.out.printf("128 = %08X%n", 128);
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		double a = -129.45;
		byte b;
		
		b = (byte)a;
		
		System.out.printf("b = %02X%n", b);
		System.out.printf("-129 = %08X%n", -129);
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		double a = 5_000_000_000.45;
		byte b;
		
		b = (byte)a;
		
		System.out.printf("b = %02X%n", b);
		System.out.printf("5_000_000_000 = %016X%n", 5_000_000_000L);
		System.out.printf("Integer.MAX_VALUE = %08X%n", Integer.MAX_VALUE);
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		double a = -4_000_000_001.45;
		byte b;
		
		b = (byte)a;
		
		System.out.printf("b = %02X%n", b);
		System.out.printf("-4_000_000_001 = %016X%n", -4_000_000_001L);
		System.out.printf("Integer.MIN_VALUE = %08X%n", Integer.MIN_VALUE);
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		double a = -4_000_000_001.45;
		int b;
		
		b = (int)a;
		
		System.out.printf("b = %02X%n", b);
		System.out.printf("-4_000_000_001 = %016X%n", -4_000_000_001L);
		System.out.printf("Integer.MIN_VALUE = %08X%n", Integer.MIN_VALUE);
	}
}
```

>Bazı durumlarda tür dönüştürme operatörü kullanılmazsa bilgi kaybı oluşabilir. Aşağıdaki örnekte tür dönüştürme operatörü kullanılmasaydı ne olurdu?

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int count = 0;
		int total = 0;
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			if (val == 0)
				break;
			
			total += val;
			++count;
		}
		
		double avg = (double)total / count;
		
		System.out.printf("Ortalama:%f%n", avg);
	}
}
```

>Bazı durumlarda tür dönüştürme operatörü kullanılmazsa bilgi kaybı oluşabilir. Aşağıdaki örnekte tür dönüştürme operatörü kullanılmasaydı ne olurdu?

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci sayıyı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("İkinci sayıyı giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			
			if (a == 0 && b == 0)
				break;
			
			long total = (long)a + b;
			
			System.out.printf("%d + %d = %d%n", a, b, total);
			
		}
	}
}
```

>Aşağıdaki demo örnekte double türden sabit kullanılarak işlem double olarak yapılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int total = 0;
		
		for (int i = 0; i < 5; ++i) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			total += val;
		}	
		
		double avg = total / 5.;
		
		System.out.printf("Ortalama:%f%n", avg);
	}
}
```

>Aşağıdaki demo örnekte double türden sabit kullanılarak işlem double olarak yapılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int total = 0;
		
		for (int i = 0; i < 5; ++i) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			total += val;
		}	
		
		double avg = total / 5D;
		
		System.out.printf("Ortalama:%f%n", avg);
	}
}
```

#### 14 Mayıs 2024

>Aslında işlemli atama operatörlerinin genelm biçimi şu şekildedir:

		T1 ve T2 birer tür olmak üzere
		T1 a;
		T2 b;		
için
		
		a <op>= b;
ifadesi açık olarak şu şekildedir:

		a = (T1)(a <op> b)
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		a += Math.sqrt(b); //a = (int)(a + Math.sqrt(b));
		
		System.out.printf("a = %d%n", a);
	}
}
```

>Aşağıdaki örnekte bir sayının basamak sayısı döngü kullanmadan bulunmuştur. Bu işlemin detayı Matematiksel olarak karmaşık olsa da bu şekilde bilinmesi önerilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		long a = kb.nextLong();
				
		int count = 1;
		
		if (a != 0)
			count = (int)Math.log10(Math.abs(a)) + 1;
		
		System.out.printf("%d sayısının basamak sayısı:%d%n", a, count);
	}
}
```

>Koşul Operatörü (Conditional/Ternary operator): Koşul operatörü özel amaçlı, 3 operandlı (ternary) ve araek (infix) durumundadır. Bu operatörü Java'nın tek 3 operandlı operatörüdür. Bu sebeple bu operatöre "ternary operator" de denilmektedir. Operatörün yan etkisi yoktur. Operatörün genel biçimi şu şekildedir:

		<ifade1> ? <ifade2> : <ifade3>
>Bu operatörde `<ifade1>` `boolean` türünden olmalıdır. Aksi durumda error oluşur. Bu operatör için `ifade1` hesaplandığında elde edilen değer `true` ise `ifade2` hesaplanır, `false` ise `ifade3` hesaplanır ve duruma göre `ifade2`'nin veya `ifade3`'ün değeri üretilir. Yani bu operatör için çalışma zamanında `ifade1` yapılır ve duruma göre `ifade2` veya `ifade3`'den yalnızca biri hesaplanır.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		result = a > b ? a : b;
		
		
		System.out.printf("max(%d, %d) = %d%n", a, b, result);
		
	}
}
```

>Koşul operatöründe :'den sonraki tüm ifade 3. operand olarak alınır 
>
>Aşağıdaki demo örneği inceliyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		result = a > b ? a : b + 200;
		
		
		System.out.printf("result = %d%n", result);
		
	}
}
```
>Aşağıdaki demo örnekte koşul operatörüne ilişkin ifade parantez içerisine alınarak ürettiği değer 200 sayısı ile toplanmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		result = (a > b ? a : b) + 200;
		
		System.out.printf("result = %d%n", result);	
	}
}
```

>Aşağıdaki demo örnekte `b + a > b` ifadesinin tamamı koşul operatörünün birinci operandıdır

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		result = b + a > b ? a : b;
		
		System.out.printf("result = %d%n", result);	
	}
}
```

>Aşağıdaki demo örnekte koşul operatörüne ilişkin ifade parantez içerisine alınarak ürettiği değer b'nin değeri ile toplanmıştır
	
```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		result = b + (a > b ? a : b);
		
		System.out.printf("result = %d%n", result);	
	}
}
```

>Koşul operatörünün aşağıdaki durumlarda kullanımı okunabilirliği/algılanabilirliği artırır ve bu sebeple de if deyimi yerine kullanımı tavsiye edilir:
>1. Atama operatörleriyle kullanımı
>2. Metot çağrısında argüman olarak
>3. Metodun geri dönüş değeri için kullanılan return deyimine ilişkin ifadede
>4. Bu operatörün ürettiği değerin bir işleme sokulması durumunda 
>
>**Anahtar Notlar:** Yukarıdaki ilk 3 durumunda aslında birer atama (assignment) işlemi olduğunu anımsayınız
>
>Aşağıdaki demo örnekte koşul operatörünün ürettiği değer atama işleminde kullanılmıştır. Bu durumda if deyimi yerine bu operatörün kullanımı tercih edilmelidir

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		result = a > b ? a : b;
		
		System.out.printf("max(%d, %d) = %d%n", a, b, result);	
	}
}
```
	 
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		a += a > b ? a : b;
		
		System.out.printf("a = %d%n", a);	
	}
}
```
	 
>Aşağıdaki demo örnekte koşul operatörünün ürettiği değer argüman olarak printf metoduna geçilmiştir. Bu durumda da if deyimi yerine bu operatör kullanılmalıdır
	
```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();	
		
		System.out.printf("max(%d, %d) = %d%n", a, b, a > b ? a : b);
	}
}
```

>Aşağıdaki demo örnekte koşul operatörünün return deyimine ilişkin ifade olarak verilmiştir

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();	
		
		System.out.printf("max(%d, %d) = %d%n", a, b, Util.max(a, b));
	}
}

class Util {
	public static int max(int a, int b)
	{
		return a > b ? a : b;
	}
}
```

>Aşağıdaki demo örnekte koşul operatörünün ürettiği değer toplama işlemine sokulmuştur

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int result;
		
		result = a + b + (a > b ? a : b);
		
		System.out.printf("result = %d%n", result);
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden bir sayının Armstrong sayısı olup olmadığını test eden `isArmstrong` metodunu `NumberUtil` sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- Metot sayı Armstrong sayısı ise true, değilse false değerine geri dönecektir	
>- Negatif olmayan bir sayının basamak sayısı n ise her bir basamağının n-inci kuvvetleri toplamı kendisine 
	eşitse o sayı bir Armstrong sayısıdır. Örneğin:
>
>		1 * 1  * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153 olduğundan 153 bir Armstrong sayısıdır

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		NumberUtilIsArmstrongTest.run();		
	}
}

class NumberUtilIsArmstrongTest {
	public static void run()
	{
		for (int n = -1; n <= 9_999_999; ++n)
			if (NumberUtil.isArmstrong(n))
				System.out.println(n);
	}
}

class NumberUtil {
	public static boolean isArmstrong(int a)
	{
		return a >= 0 && getDigitsPowSum(a) == a;
	}
	
	public static int getDigitsPowSum(int a)
	{
		int result = 0;
		int n = countDigits(a);
		
		while (a != 0) {
			result += Math.pow(a % 10, n);
			a /= 10;
		}
		
		return result;
	}
	
	public static int countDigits(int a)
	{
		return a != 0 ? (int)Math.log10(Math.abs(a)) + 1 : 1;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden gün, ay ve yıl bilgilerine ilişkin tarihin haftanın hangi günü olduğu bilgisine geri dönen `getDayOfWeek` isimli metodu ve uygulamayı aşağıdaki açıklamalara göre yazınız
>
>**Açıklamalar:**
>- getDayOfWeek metodu tarih geçerlilik kontrolü yapmayacaktır.
>- getDayOfWeek metodu haftanın hangi günü olduğuna ilişkin bilgiyi şu algoritmaya göre bulacaktır:
01.01.1900 tarihi ile ilgili tarih (dahil) arasındaki gün sayısı hesaplanıp 7 ile bölümünden elde edilen
kalan alındığında 0 Pazar, 1 Pazartesi, ..., 6 Cumartesi anlamına gelir.
>- Program klavyeden gün ay ve yıl bilgisini isteyecek ve eğer tarih geçerli ise aşağıdaki formatta tarihi yazdırıcaktır:
>
>		25/04/2024 Perşembe
>- Tarih geçersiz ise Geçersiz tarih yazdıracaktır. Klavyeden gün ay ve yıl bilgilerinin 3'ü birden sıfır girildiğinde program sonlandırılacaktır. 
>
>Not: İleride daha iyisi yazılacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		DemoDateApp.run();	
	}
}

class DemoDateApp {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Gün, ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			DateUtil.printDateTR(day, month, year);
			
			if (day == 0 && month == 0 && year == 0)
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
} 

class DateUtil {
	public static void printDateTR(int day, int month, int year)
	{
		if (!isValidDate(day, month, year)) {
			System.out.println("Geçersiz tarih!...");
			return;
		}
		
		switch (getDayOfWeek(day, month, year)) {
			case 0 -> System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);			
			case 1 -> System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);		
			case 2 -> System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);			
			case 3 -> System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);		
			case 4 -> System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);		
			case 5 -> System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);		
			case 6 -> System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);		
		}			
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays = getDayOfYear(day, month, year);
		
		for (int y = 1900; y < year; ++y)
			totalDays += isLeapYear(y) ? 366 : 365; 
		
		return totalDays % 7;
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		int dayOfYear = day;
		
		switch (month - 1) {
		case 11:
			dayOfYear += 30;
		case 10:
			dayOfYear += 31;
		case 9:
			dayOfYear += 30;
		case 8:
			dayOfYear += 31;
		case 7:
			dayOfYear += 31;
		case 6:
			dayOfYear += 30;
		case 5:
			dayOfYear += 31;
		case 4:
			dayOfYear += 30;
		case 3:
			dayOfYear += 31;
		case 2:
			dayOfYear += isLeapYear(year) ? 29 : 28;
		case 1:
			dayOfYear += 31;
		}
		
		
		return dayOfYear;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 &&  1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		return switch (month) {
			case 4, 6, 9, 11 -> 30;
			case 2 -> isLeapYear(year) ? 29 : 28;
			default -> 31;		
		};	
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
```

>Aşağıdaki demo örnekte koşul operatörününün ikinci ve üçüncü operandı da koşul olarak adeta içiçe koşul operatörleri yazılmıştır. Aşağıdaki örnekte ifadelerin parantez içerisine alınamsı gerekmediğine dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Üç sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		int max;
		
		max = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, max);
	}
}
```

>Yukarıdaki gibi bir örneği daha okunabilir yazmak için koşul operatörüne ilişkin operandların parantez içerisine alınması tavsiye edilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Üç sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		int max;
		
		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, max);
	}
}
```
	 
>Aşağıdaki if deyimi koşul operatörü ile yapılamazdı değil mi?

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İki sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		if (a > b)
			Sample.foo();
		else 
			Sample.bar();
	}
}

class Sample {
	public static void foo()
	{
		System.out.println("foo");
	}
	
	public static void bar()
	{
		System.out.println("bar");
	}
}
```

#### 21 Mayıs 2024
 
>Method Overloading: Bir sınıf içerisinde aynı isimde birden fazla metot bildirilmesi durumuna denir. Farklı sınıflar içerisinde aynı isimde metot olması durumu method overloading değildir. Çünkü zaten bu metotlar farklı sınıflarda olduğundan farklı metotlardır. Method overloading konusu sentaks ve semantik olarak iki biçimde ele alınacaktır:
>- Method overloading yapılabilmesi için kurallar nelerdir?
>- Bir metot çağrıldığında derleyici hangi metodun çağrılacağına nasıl karar verecektir? Bu kavrama İngilizce "method overload resolution" denilmektedir. 
>
>Method overloading konusunun gerekliliği yani kabaca "ne işe yaradığı" ileride ele alınacaktır
 
>Aşağıdaki örnekteki foo metotları overload edilmemiştir. Çünkü bu metotlar farklı sınıflardadır. Method overloading aynı sınıfta olan, aynı isimdeki metotlar için geçerlidir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample.foo();
		Mample.foo();
	}
}

class Sample {
	public static void foo()
	{
		System.out.println("Sample.foo");
	}
}

class Mample {
	public static void foo()
	{
		System.out.println("Mample.foo");
	}
}
```

>Anahtar Notlar: Aslında genel bir kural olarak "bir sınıf içerisinde AYNI metottan birden fazla olamaz" ya da başka bir şekilde söylersek "bir sınıf içerisindeki tüm metotların FARKLI olması gerekir". Bu durumda bir metot için AYNI olmayı (veya olmamayı), FARKLI olmayı (veya olmamayı) sağlayan kurallar bulunur.
 
>Bir metodun erişim belirleyicisini değiştirme o metodu FARKLI yapmaz. Yani erişim belirleyicinin overloading işlemine etkisi yoktur

```java
package csd;

class Sample {
	public static void foo() //error
	{
		
	}
	
	private static void foo() //error
	{
		
	}
}
```

>Bir metodun `static` veya `non-static` olmasının da `overload` işlemine etkisi yoktur

```java
package csd;

class Sample {
	public static void foo() //error
	{
		
	}
	
	public void foo() //error
	{
		
	}
}
```

>Bir metodun geri dönüş değeri bilgisinin overloading işlemine etkisi yoktur

```java
package csd;

class Sample {
	public static void foo() //error
	{
		
	}
	
	public static int foo() //errror
	{
		//...
		
		return 0;
	}
}
```

>Bir metodun parametre değişken isimlerinin overloading işlemine etkisi yoktur

```java
package csd;


class Sample {
	public static void foo(int a, double b) //error
	{
		
	}
	
	public static void foo(int x, double y) //error
	{
		
	}
}
```

>Aynı sınıf içerisinde, aynı isimli iki metodun FARKLI olabilmesi için "parametre türlerinin VE dizilimlerinin" farklı olması gerekir. Bir metot için "parametre türü VE dizilimine" genel olarak "parametrik yapı" denir. Öyleyse bir metodun overload edilebilmesi için aynı isimde olanlardan parametrik yapı olarak farklı olması gerekir

```java
package csd;


class Sample {
	public static void foo()
	{
		
	}
	
	public static void foo(int a, int b)
	{
		
	}
	
	public static void foo(int a, double b, float c)
	{
		
	}
	
	public static void foo(int a)
	{
		
	}
	
	public static void foo(int a, double b)
	{
		
	}
	
	public static void foo(double b, int a)
	{
		
	}
	
	public static void foo(double a)
	{
		
	}
}
```

>Aslında bir sınıf içerisindeki her metodun kendine özğü (unique) bir bir bilgisi olmalıdır. Bu unique bilgiye genel olarak "imza (signature)" diyebilir. İmza, metodun ismi ve parametrik yapı kombinasyonudur. Genel kural şudur: Bir sınıf içerisinde aynı imzaya sahip birden fazla metot bildirimi geçersizdir. Yani bir sınıf içerisindeki her metodun imzası farklı olmalıdır. Aksi durumda error oluşur.

```java
package csd;

class Sample {
	public static void foo() //imza: foo
	{
		//...	
	}
	
	public static void foo(int a, int b) //imza: foo, int, int
	{
		//...
	}
	
	public static void foo(int a, double b, float c) //imza: foo, int, double, float
	{
		//...
	}
	
	public static void foo(int a) //imza: foo, int
	{
		//...
	}
	
	public static void foo(int a, double b) //imza: foo, int, double
	{
		//...
	}
	
	public static void foo(double b, int a) //imza: foo, double, int
	{
		//...
	}
	
	public static void foo(double a) //imza: foo, double
	{
		//...
	}
	
	public static void bar(int a, double b) //imza: bar, int, double
	{
		//...
	}
}
```

#### 28 Mayıs 2024
 
>İmza kavramından da anlaşılacağı gibi, bir metodun overload edilebilmesi için farklı olması gerekir, bu da ancak parametrik yapısının aynı isimde olan diğerlerinden farklı olması ile mümkündür.
>
>Bir metot çağrısı için derleyici hangi metodun çağrılacağını belirlemelidir. Bu belirleme sürecine "method overload resolution" ya da kısaca "overload resolution" denilmektedir. Derleyici method overload resolution işlemini aşağıdaki adımlardan geçerek yapar:
>
>1. Aday metotlar (candidate methods) belirlenir: Sınıf içerisindeki, çağrılan metot ile aynı isimdeki tüm metotlardır
>2. Uygun metotlar (applicable methods) belirlenir: Aday metotlar içerisinde, çağrılan metodun argüman sayısı ile parametre sayısı aynı olan VE argümanların türünden, karşılık geldikleri parametrelerin türüne implicit conversion'ın geçerli olduğu metotlardır. 
>3. En uygun metot (the most applicable method) belirlenir: En uygun metot öyle bir metottur ki, uygun metotların her bir argümanı karşılık geldiği parametrelerin türleri ile yarışa sokulduğunda toplamda diğerlerine göre daha iyi olan, ya da daha kötü olmayan (diğer bir deyişle kaliteli) dönüşüm sunar. Dönüşümün kalitesi şu kurallar ile belirlenir:\
>T1 argümanın türü, T2 ve T3 yarışa sokulan parametrelerin türü olsun
>- T1 -> T2 ve T1 -> T3 için, T2 veya T3'den biri T1 ile aynı ise aynı olan daha kalitelidir. Örneğin
>
>		int -> int *
>		int -> float
>-  T1 -> T2 ve T1 -> T3 için, T2'den T3'e implicit dönüşüm geçerli, T3'den T2'ye geçersizse T2 daha kalitelidir. Örneğin:
>
>		int -> long *
>		int -> float  
>Herhangi bir adımda bir problem olursa error oluşur. Yani örneğin, aday metot yoksa VEYA aday metot var, uygun metot yoksa	VEYA uygun metot var, en uygun metot yoksa error oluşur.
>	
>Yukarıdaki kurallara göre, metot çağrısında argümanların türü ile karşılık geldikleri parametrelerin türlerinin birebir aynı olduğu bir metot varsa o en kalitelidir. Buna "best match" de denilmektedir.
 
>Aşağıdaki çağrı aslında "best match" durumudur. Ancak, adımlar şunlardır:

	1. Aday metotlar 	: 1, 2, 3, 4, 5, 6, 7
	2. Uygun metotlar	: 5, 6
	3. En uygun metot	: 5

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		double b = 4.5;
		
		Sample.foo(a, b);
	}
}

class Sample {
	public static void foo() //1
	{
		System.out.println("foo");
	}
	
	public static void foo(int a, int b) //2
	{
		System.out.println("foo, int, int");
	}
	
	public static void foo(int a, double b, float c) //3
	{
		System.out.println("foo, int, double, float");
	}
	
	public static void foo(int a) //4
	{
		System.out.println("foo, int");
	}
	
	public static void foo(int a, double b) //5
	{
		System.out.println("foo, int, double");
	}
	
	public static void foo(double b, double a) //6
	{
		System.out.println("foo, double, double");
	}
	
	public static void foo(double a) //7
	{
		System.out.println("foo, double");
	}
	
	public static void bar(int a, double b) //8	
	{
		System.out.println("bar, int, double");
	}
}
```

	1. Aday metotlar	: 1, 2, 3, 4, 5, 6, 7
	2. Uygun metotlar	: 2, 5, 6
	3. En uygun metot	: 2

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		short a = 10;
		int b = 4;
		
		Sample.foo(a, b);
	}
}

class Sample {
	public static void foo() //1
	{
		System.out.println("foo");
	}
	
	public static void foo(int a, int b) //2
	{
		System.out.println("foo, int, int");
	}
	
	public static void foo(int a, double b, float c) //3
	{
		System.out.println("foo, int, double, float");
	}
	
	public static void foo(int a) //4
	{
		System.out.println("foo, int");
	}
	
	public static void foo(int a, double b) //5
	{
		System.out.println("foo, int, double");
	}
	
	public static void foo(double b, double a) //6
	{
		System.out.println("foo, double, double");
	}
	
	public static void foo(double a) //7
	{
		System.out.println("foo, double");
	}
	
	public static void bar(int a, double b) //8	
	{
		System.out.println("bar, int, double");
	}
}
```

	1. Aday metotlar	: 1, 2, 3, 4, 5, 6, 7
	2. Uygun metotlar	: 2, 5, 6
	3. En uygun metot	: 2

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		short a = 10;
		int b = 4;
		
		Sample.foo(a, b);
	}
}

class Sample {
	public static void foo() //1
	{
		System.out.println("foo");
	}
	
	public static void foo(int a, int b) //2
	{
		System.out.println("foo, int, int");
	}
	
	public static void foo(int a, double b, float c) //3
	{
		System.out.println("foo, int, double, float");
	}
	
	public static void foo(int a) //4
	{
		System.out.println("foo, int");
	}
	
	public static void foo(int a, double b) //5
	{
		System.out.println("foo, int, double");
	}
	
	public static void foo(double b, double a) //6
	{
		System.out.println("foo, double, double");
	}
	
	public static void foo(double a) //7
	{
		System.out.println("foo, double");
	}
	
	public static void bar(int a, double b) //8	
	{
		System.out.println("bar, int, double");
	}
}
```

	1. Aday metotlar	: 1, 2, 3, 4, 5, 6, 7
	2. Uygun metotlar	: 5, 6
	3. En uygun metot	: 5 

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		double b = 4.5;
		
		Sample.foo(a, b);
	}
}

class Sample {
	public static void foo() //1
	{
		System.out.println("foo");
	}
	
	public static void foo(int a, int b) //2
	{
		System.out.println("foo, int, int");
	}
	
	public static void foo(int a, double b, float c) //3
	{
		System.out.println("foo, int, double, float");
	}
	
	public static void foo(int a) //4
	{
		System.out.println("foo, int");
	}
	
	public static void foo(float a, double b) //5
	{
		System.out.println("foo, float, double");
	}
	
	public static void foo(double b, double a) //6
	{
		System.out.println("foo, double, double");
	}
	
	public static void foo(double a) //7
	{
		System.out.println("foo, double");
	}
	
	public static void bar(int a, double b) //8	
	{
		System.out.println("bar, int, double");
	}
}
```

	1. Aday metotlar: Yok

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		double b = 4.5;
		
		Sample.fo(a, b); //error
	}
}

class Sample {
	public static void foo() //1
	{
		System.out.println("foo");
	}
	
	public static void foo(int a, int b) //2
	{
		System.out.println("foo, int, int");
	}
	
	public static void foo(int a, double b, float c) //3
	{
		System.out.println("foo, int, double, float");
	}
	
	public static void foo(int a) //4
	{
		System.out.println("foo, int");
	}
	
	public static void foo(float a, double b) //5
	{
		System.out.println("foo, float, double");
	}
	
	public static void foo(double b, double a) //6
	{
		System.out.println("foo, double, double");
	}
	
	public static void foo(double a) //7
	{
		System.out.println("foo, double");
	}
	
	public static void bar(int a, double b) //8	
	{
		System.out.println("bar, int, double");
	}
}
```

	1. Aday metotlar	: 1, 2, 3, 4, 5, 6, 7
	2. Uygun metotlar	: Yok

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		boolean a = true;
		double b = 4.5;
		
		Sample.foo(a, b); //error
	}
}

class Sample {
	public static void foo() //1
	{
		System.out.println("foo");
	}
	
	public static void foo(int a, int b) //2
	{
		System.out.println("foo, int, int");
	}
	
	public static void foo(int a, double b, float c) //3
	{
		System.out.println("foo, int, double, float");
	}
	
	public static void foo(int a) //4
	{
		System.out.println("foo, int");
	}
	
	public static void foo(float a, double b) //5
	{
		System.out.println("foo, float, double");
	}
	
	public static void foo(double b, double a) //6
	{
		System.out.println("foo, double, double");
	}
	
	public static void foo(double a) //7
	{
		System.out.println("foo, double");
	}
	
	public static void bar(int a, double b) //8	
	{
		System.out.println("bar, int, double");
	}
}
```

	1. Aday metotlar	: 1, 2, 3, 4, 5, 6, 7
	2. Uygun metotlar	: 2, 5, 6
	3. En uygun metot	: Yok

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		short a = 10;
		short b = 4;
		
		Sample.foo(a, b); //error: ambiguity (ambiguous)
	}
}

class Sample {
	public static void foo() //1
	{
		System.out.println("foo");
	}
	
	public static void foo(int a, long b) //2
	{
		System.out.println("foo, int, long");
	}
	
	public static void foo(int a, double b, float c) //3
	{
		System.out.println("foo, int, double, float");
	}
	
	public static void foo(int a) //4
	{
		System.out.println("foo, int");
	}
	
	public static void foo(long a, int b) //5
	{
		System.out.println("foo, long, int");
	}
	
	public static void foo(double b, double a) //6
	{
		System.out.println("foo, double, double");
	}
	
	public static void foo(double a) //7
	{
		System.out.println("foo, double");
	}
	
	public static void bar(int a, double b) //8	
	{
		System.out.println("bar, int, double");
	}
}
```

**Anahtar Notlar:** `Method overload resolution` kavramının temel türler dışındaki bazı ayrıntıları konular içerisinde ele alınacaktır


#### 30 Mayıs 2024

>Nesne Yönelimli Programlama (Object Oriented Programming): Nesne yönelimli programlama tekniğini (NYPT) tek bir cümle ile açıklamak pek mümkün değildir. Ancak, bu tekniği bilen veya belirli ölçüde fikri olan birisine "sınıflar kullanarak	program yazma tekniğidir" denebilir. NYPT aslında pek çok anahtar kavramın birleşimidir. Bu anahtar kavramlar içiçe geçmiş dairler biçiminde düşünülebilir. Tüm bu anahtar kavramların temelinde kodun okunabilir/algılanabilir olması ve daha iyi yönetilmesi vardır. Örneğin, benzer işi yapan metotlara aynı ismin verilmesi (method overloading) programcıyı "çok şey var" algısından uzaklaştırıp, "az şey var" gibi bir algı oluşmasını sağlar. Bu da hatırlamayı kolaylaştırır ve kodun okunabilirliğini/algılanabilirliğini artırır.
>
>NYPT insanın doğayı algılama biçimini model alır. İnsanlar her şeyi nesne biçiminde alıp kullanırlar. Örneğin herkesin cep telefonu olabilse de konuşurken bunu cep telefonu olarak konuşuruz. Yani aslında cep telefonu soyut (abstract) bir kavramdır. Örneğin, bize ait olan bir cep telefonu artık somutlaşmıştır (concrete). Bu anlamda, herkesin sahip olduğu cep telefonu artık bir nesne biçimindedir.
>
>NYPT'de artık fonksiyonlar (Java'da metotlar) ile değil sınıflar ile konuşulur. Böylece yine "çok şey var" algısından uzaklaşıp, "az şey var" algısı oluşur. Bu anlamda sınıf ve nesne seviyesinde detaylar programcıdan gizlenmiş olur. Bu da yine algıyı kolaylaştırır.
>
>Burada anlatılanların pek çok detayı vardır. Özet biçiminde ele alınmıştır. Anlatılan kavramlar ve diğer pek çok NYPT bileşeni konular içerisinde detaylandırılacaktır.

#### 6 Haziran 2024
 
>Anımsanacağı gibi bir değişkenin (ya da nesnenin) bellekte yaratılmasıyla (yani bellekte yer ayrılması), yok edilmesi (yani bellekten atılması) arasındaki süreye "ömür (storage duration)" denilmektedir. Peki, bir değişken için ayrılan bellek bölgesi neresidir? Bir Java uygulaması çalıştırıldığında, o uygulama için iki tane bellek alanı ayrılır: `stack`, `heap`. Aslında aşağı seviyede başka bellek alanları da ayrılır. Stack ve heap, Java seviyesinde ayrılan alanlar olarak düşünülebilir. Stack ve heap alanları RAM'de organize edilir. Program çalıştırılırken bu alanların uzunlukları belirlenebilir. Herhangi bir belirleme yapılmazsa default uzunluklar alınır. Default uzunluklar sistemden sisteme değişebilmektedir.
	
**Anahtar Notlar:** Yukarıdaki cümlelerde geçen nesne (object) kavramı ileride ele alınacaktır.
	
**Anahtar Notlar:** Veri Yapısı (Data Structure), genel olarak birbiri ile ilişkili olan verilerin bir arada ve belirli bir takım algoritmalara göre tutulmasını sağlayan ve istenildiğinde bu verilere erişilebilen yapılardır. Örneğin dizi, elemanları aynı türden olan ve bellekte peşpeşe olarak yaratılan bir veri yapısıdır. `Stack`, `LIFO` (Last In First Out) kuyruk sistemi biçiminde çalışan bir veri yapısıdır. Tipik olarak editör programlarının "undo-redo" mekanizmaları bu şekilde gerçekleştirilir (implementation). Stack veri yapısına eleman ekleme işlemine "push", eleman silme (bazı yaklaşımlara göre hem silme hem elemanı elde etme) işlemine "pop" denir. Uygulama için ayrılan stack alanında yer ayrılması işlemi stack veri yapısı biçiminde (donanımsal da destek ile) yapıldığından, bu alana "stack alanı" denilmektedir. Stack alanında, yaratma ve yok etme işlemi çok hızlı bir biçimde gerçekleşmektedir.

>`Yerel değişkenler` ve `parametre değişkenleri` `stack` alanında yaratılırlar. Stack alanı doldur boşalt biçiminde çalışan bellek alanıdır. Böylece program çalışma zamanında, toplamda, bu alanın uzunluğundan daha fazla değişken için yer ayrılabilir
>
>Yerel bir değişken, akış kod bakımından bildirim noktasına geldiğinde yaratılır, bildirildiği blok sonunda yok edilir. Bu durumda bir yerel değişkenin yaratılması "push" komutu ile, yok edilmesi ise "pop" komutu ile yapılır. Peşpeşe bildirilen (yani çalışma zamanında peşpeşe yaratılan) yerel değişkenlerin yok edilmesi ters sırada yapılır. Buna göre faaliyet alanı (scope) ve ömür arasında dolaylı bir ilişki söz konusudur. Ancak yine de faaliyet alanı derleme zamanına ilişkin, ömür ise çalışma zamanına ilişkindir. Yerel bir değişkenin bildirildiği blok sonlandığında yok edilmesi dolayısıyla faaliyet alanı da bildirildiği yerden bildirildiği bloğun sonuna kadardır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a; //a yaratıldı (push a)
		double b; //b yaratıldı (push b)
		
		{
			int c; //c yaratıldı (push c)
			float d; // d yaratıldı (push d)
			
			//...
		} //d yok edildi (pop d) -> c yok edildi (pop c)
		
		int x;
		
	} //b yok edildi (pop b) -> a yok edildi (pop a)
}
```

>Bir parametre değişkeni ait olduğu metot çağrıldığında yaratılır (push), metot çağrısı bittiğinde yok edilir (pop)

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample.foo(10, 20); //a yaratıldı (push a) -> b yaratıldı (push b)
		//b yok edildi (pop b), a yok edildi (pop a)
		
		//...
		
		Sample.foo(10, 20); //a yaratıldı (push a) -> b yaratıldı (push b)
		//b yok edildi (pop b), a yok edildi (pop a)
		
		//...
	} 
}

class Sample {
	public static void foo(int a, int b)
	{
		//...
	}
}
```

>Bir parametre değişkeni ait olduğu metot çağrıldığında yaratılır (push), metot çağrısı bittiğinde yok edilir (pop)

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample.foo(10, 20); //a yaratıldı (push a) -> b yaratıldı (push b)
		//b yok edildi (pop b), a yok edildi (pop a)
		
		//...
		
		Sample.foo(10, 20); //a yaratıldı (push a) -> b yaratıldı (push b)
		//b yok edildi (pop b), a yok edildi (pop a)
		
		//...
	} 
}


class Sample {
	public static void foo(int a, int b)
	{
		//...
	}
}
```

>Sınıf içerisinde, tüm metotların dışında bildirilen değişkenlere sınıf veri elemanı (class data member/member variable) denir. Sınıf veri elemanları metotlarda olduğu gibi erişim belirleyiciye (public, protected, no-modifier, private) sahip olabilirler. Yine metotlarda olduğu gibi ilgili konuya gelene kadar tüm veri elemanlarımızı public olarak bildireceğiz. Sınıf veri elemanları da metotlarda olduğu gibi static veya non-static olabilirler. static anahtar sözcüğü ile bildirilmemişse non-static olur.

**Anahtar Notlar:** Sınıf içerisindeki bildirimlere sınıfın elemanları `members` denir. Bu, anlamda veri elemanı ve metot sınıfın elemanlarıdır. Sınıfın başka elemanları da vardır. Sınıf veri elemanlarına "data member/member variable/field" denilmektedir. Sınıfın elemanı bir alt program ise metot denir. Sınıfın diğer elemanları konular içerisinde ele alınacaktır.
	
>Bir sınıf veri elemanının faaliyet alanı ve ömrü ileride ele alınacaktır. Sınıf içerisindeki veri elemanları aynı türdense, aynı erişim belirleyiciye sahipse ve static veya non-static olma bakımından aynı ise virgül ile ayrılarak da bildirilebilir.

```java
package csd;

class Sample {
	int a;
	private int x, y;
	private int z;	 
	
	public static void foo()
	{
		//...
	}
	
	protected double b;
	
	public static float c;
}
```

>Java'da sınıf dışında değişken bildirimi geçersizdir ya da başka bir deyişle Java'da bir değişkenin bir sınıf içerisinde bildirilmiş olması (veri elemanı veya parametre değişkeni veya yerel değişken olarak) gerekir


```java
package csd;

int a; //error
```

>Sınıf bildirimi aslında bir tür bildirimidir. Sınıf bildirimi dışında da tür bildirimleri söz konusudur. Bu şekilde yapılan bildirimlere "user defined type (UDT)" denilmektedir. Bu durumda sınıf da bir UDT'dir. Sınıf dışındaki UDT'ler konular içerisinde ele alınacaktır

```java
package csd;

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
```

>Madem ki sınıf bildirimi bir tür bildirimidir, bu durumda sınıf türünden değişkenler bildirilebilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Person p;
		Server s;
		USBPort u;
		TCP t;
		
		
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
```

>Java'da türler kategori olarak iki gruba ayrılır:
>
>		değer türleri (value types)
>		referans türleri (reference types) 
>T bir tür ismi olmak üzere, T türden bir değişken içerisinde bir adres tutuluyorsa T bir referans türüdür, tutulmuyorsa bir değer türüdür. Ya da başka bir deyişle, T türden bir değişkenin içerisindeki değer bir adres ise T referans türü, adres değilse değer türüdür. Java'da temel türler (primitive/built-in/predefined types) değer türleridir. Yani temel bir türden değişken içerisinde adres tutulmaz. Java'da bir sınıf referans türüdür. Öyleyse sınıf türünden bir değişken içerisinde adres tutulur. Aslında genel olarak temel türler dışında kalan türler (yani UDT'ler) referans türleridir
>
>Sınıf türünden değişkenlere referans değişken `reference variable` ya da kısaca referans (reference) denir. Java seviyesinde adres (address) terimi yerine referans (reference) terimi de kullanılmaktadır. Referans dendiğinde ya bir adres ya da bir referans değişken kastedilmiş olur. Buna göre örneğin bir cümlede **"reference of an object"** gibi bir içerik söz konusuysa, buradaki referans adres anlamındadır. Ya da örneğin bir cümlede **"address of an object is assigned to a reference"** gibi bir içerik söz konusuysa, buradaki referans, değişken anlamındadır.
>
>Peki bir referansa atanacak adres nasıl elde edilecektir?

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Person p; //p referans (değişken)
		Server s; //s referans (değişken)
		USBPort u; //u referans (değişken)
		TCP t; //t referans (değişken)
		
		
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
```

#### 11 Haziran 2024

>- Sınıf türünden bellekte ayrılan bir alana nesne `object` denir.
>- Nesneler `heap` alanında yaratılırlar. Java'da stack'de nesne **yaratılamaz**.
>- Java'da bir nesnenin kendisi tutulamaz, adresi tutulabilir. Bu adres de aynı türden bir referans (değişken) içerisinde tutulabilir.
>- Java'da nesne yaratılması `new` operatörü ile yapılır. `new` operatörünün kullanımına ilişkin genel biçimi şu şekildedir:

		new <sınıf ismi>([argümanlar]);
>Bu operatör özel amaçlı **tek operandlı** ve **önek** durumundadır. Operatör, yaratılmış olan nesnenin adresini üretir. Bir nesne ile referans için hangi uzunlukta yer ayrılacağı ileride ele alınacaktır. Bu operatörün yan etkisi yoktur. 
>
>Aşağıdaki örnekte `p`, `s`, `u` ve `t` birer nesne **DEĞİLDİR**, ilgili türden nesnelerin adreslerini tutan `referans` değişkenlerdir.
>
>Örnekte `*, **, *** ve ****` ile belirtilen deyimlerde ilgili türden nesneler yaratılmış ve ilgili türden referans değişkenlere adresleri atanmıştır. Bu durumda bir referans değişkene bir adres atandığında o referans o nesneyi gösteriyor (reference to) duruma gelmiş olur. 
>- Bir nesne ilgili sınıf türünden bir örnektir. Buna İngilizce olarak `instance` terimi de kullanılır. Bu anlamda nesne yaratma işlemi için de "create" fiili ile birlikte "instantiate" fiili de kullanılır.
>- Referans ve nesne kavramları birbirinden farklıdır. Referans bir nesneyi gösterir ya da adresi anlamında kullanılır.
>- Her `new` işlemi yeni bir nesne yaratmak demektir.

```java
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
	//...
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
```
>Sınıfın `non-static` bir veri elemanına sınıf dışından referans ve nokta operatörü ile erişilir. Nokta operatörü iki operandlı ve araek durumundadır. Bu operatörün birinci operandı bir `referans`, ikinci operandı `non-static` bir veri elemanı ise bu durumda o veri elemanına ilişkin değişkeni üretir.

>Sınıfın `non-static` veri elemanları her nesne yaratıldığında nesnenin içerisinde yaratılırlar. Yani sınıfın `non-static` veri elemanları nesneye özgüdür ya da başka bir deyişle her nesne için ayrıdır. Bu durumda referans ile non-static bir veri elemanına erişmek aslında referansın gösterdiği nesnenin içerisinde elemana erişmek anlamına gelir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s1, s2;
		
		s1 = new Sample();
		s2 = new Sample();		
		
		s1.x = 10;
		s1.y = true;
		
		s2.x = 20;
		s2.y = false;
		
		System.out.printf("s1.x = %d, s1.y = %b%n", s1.x, s1.y);
		System.out.printf("s2.x = %d, s2.y = %b%n", s2.x, s2.y);
	} 
}

class Sample {
	public int x;
	public boolean y;
	
	//...
}
```

>Bir nesne yaratıldığında nesneye ait `non-static` veri elemanlarına **default** değerler (default/zero value) atanır. Default değer mantıksal sıfır (türe özgü sıfır) değeridir. Örneğin int türü için default değer sıfırdır, double türü için default değer yine sıfırdır, boolean türü için ise false değeridir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s;
		
		s = new Sample();		
	
		System.out.printf("s.x = %d, s.y = %b%n", s.x, s.y);		
	} 
}

class Sample {
	public int x;
	public boolean y;
	
	//...
}
```

>Aşağıdaki örnekte **değer verilmemiş** bir yerel değişkenin kullanılmasından dolayı **error** oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s;			
		
		System.out.printf("s.x = %d, s.y = %b%n", s.x, s.y); //error
	} 
}

class Sample {
	public int x;
	public boolean y;
	
	//...
}
```

#### 13 Haziran 2024
 
>Sınıfın `non-static` veri elemanı nesneye özel olduğundan sınıf ile temsil edilen kavrama ilişkin bir karakteristiği (characteristics) ya da başka bir deyişle bir özniteliği (attribute) belirtir. Bu durumda bir sınıf `non-static` veri elemanları ile bir bileşik türdür (compound type). Örneğin, analitik düzlemde bir noktanın iki tane bileşeni vardır: axis, ordinate. Bu durumda analitik düzlemde bir "nokta" kavramı ne tek başına axis ne de tek başına ordinate'dir. İkisi birlikte bir noktadır. Bu durumda programcı bu noktayı temsil eden bir sınıf bildiriminde `non-static` veri elemanı olarak (en azından) axis ve ordinate bilgilerini tutar. Dikkat edilirse sınıfın isminin belirlenmesinden, içerisindeki elemanların belirlenmesine kadarki kısım sınıfın ait olduğu `domain`'e göre ele alınır.
>
>Peki bir **referansın** uzunluğu ne kadardır?
>
>Bir referansın uzunluğu sistemin adresleyebileceği kadardır. Yani örneğin `32 bit` bir sistemde `4 byte`, `64 bit` bir sistemde `8 byte`'dır. Bu anlamda adresler tamsayı formatında olduğundan tutuluş biçimleri yine işaretsiz ikiye tümleme formatıdır. **Referansların** uzunluğu türe göre **değişmez**. Bu anlamda bir uygulama için ilgili sistemde tüm referansların uzunluğu **aynıdır.**
>
>Peki bir **nesnenin** uzunluğu ne kadardır?
>
>Bir nesnenin uzunluğu "en az, ilişkin olduğu sınıfın `non-static` veri elemanlarının toplam uzunluğu kadardır". Burada en az kavramıyla sisteme ilişkin başka bilgilerin de eklenebileceği anlatılmaktadır. Detaylar önemsizdir. Java programcısı açısından **"uzunluk non-static veri elemanları ile belirlenir"** olarak algılanmalıdır.
>
>Peki `non-static` bir veri elemanının `ömrü` (storage duration) ne kadardır?
> 
>`Non-static` bir veri elemanı nesne yaratıldığında yaratılır. Nesne yok edildiğinde yok edilir. Java'da nesne **"garbage collector"** tarafından yok edilir. Bir nesnenin yok edilmesine ilişkin detaylar ileride ele alınacaktır.
>
>Peki `non-static` bir veri elemanının faaliyet alanı nedir?
>
>Bu konu ileride ele alınacaktır.

>Sınıfın `static` bir veri elemanı nesne içerisinde yaratılmaz. Sınıfın `static` bir veri elemanına sınıf dışından sınıf ismi ve nokta operatörü ile erişilir. Nokta operatörü sınıf ismi ve static veri elemanı ile kullanıldığında veri elemanına ilişkin değişkeni üretir. Sınıfın static veri elemanları sınıfın bir elemanı (member) ilk kez kullanıldığında yaratılır ve program sonuna kadar yaşarlar. Bu durumda sınıfın `static` bir veri elemanı stack'de **yaratılamaz**. Static veri elemanlarının yaratıldığı alana ilişkin detaylar söz konusu olsa da dolaylı olarak `heap`'de olduğu söylenebilir.
>
>Bu durumda static bir veri elemanına erişmek için bir nesne yaratılması gerekmez. Static veri elemanlarına da yaratıldıklarında default değerler atanır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		System.out.printf("Sample.x = %d, Sample.y = %b%n", Sample.x, Sample.y);
		
		Sample.x = 10;
		Sample.y = true;
		
		System.out.printf("Sample.x = %d, Sample.y = %b%n", Sample.x, Sample.y);
		
		++Sample.x;
		
		System.out.printf("Sample.x = %d, Sample.y = %b%n", Sample.x, Sample.y);
	} 
}

class Sample {	
	public static boolean y;
	public static int x;	
	
	//...
}
```

>Aşağıdaki demo örnekte sayaçlar, sınıfları kullanan programcı tarafından tutulmuş ve gerektiğinde artırılmıştır. Bu durumda programcı artırma işlemini unutabilir. Ayrıca başka türler için de sayaçlar tutulması gerektiğinde sayaç için değişken bildirimi hem isim açısından hem de kod yükü açısından bir maliyet getirecektir. Buradaki maliyet geliştirme zamanı maaliyetidir. Üstelik örnek bir demodur ve algoritmik bakımdan pek çok detaylı durum söz konusudur.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		DemoGameApp.run();
	}
}

class DemoGameApp {
	public static void run()
	{		
		int alienCount = 0;
		int soldierCount = 0;
		//...
		
		for (int i = 0; i < 10; ++i) {
			Alien a = new Alien();
			
			++alienCount;			
			//...
		}
		
		for (int i = 0; i < 20; ++i) {
			Soldier soldier = new Soldier();
			
			++soldierCount;
			
			//...
		}
		
		//...
		
		System.out.printf("Number of aliens:%d%n", alienCount);
		System.out.printf("Number of soldiers:%d%n", soldierCount);			
	}
}

class Alien {
	public int color;
	public int armCount;
	//...
}

class Soldier {
	 public int title;
	 public int gunCount;
	 //...
}

class Civilian {
	//...
}

class Building {
	//...
}

class Animal {
	//...
}

//...
```

>Yukarıdaki demo örnekte sınıflara "count static veri elemanı eklenerek" anlatılan problemler çözülebilir.
	
**Anahtar Notlar:** `**` ve `***` ile belirtilen kodların detayları şu an önemsizdir. Burada sayacın nesne yaratıldıkça artırıldığına odaklanınız. Buradaki detaylar ileride ele alınacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		DemoGameApp.run();
	}
}

class DemoGameApp {
	public static void run()
	{		
		//...
		
		for (int i = 0; i < 10; ++i) {
			Alien a = new Alien();		
				
			//...
		}
		
		for (int i = 0; i < 20; ++i) {
			Soldier soldier = new Soldier();		
			
			//...
		}
		
		//...
		
		System.out.printf("Number of aliens:%d%n", Alien.count);
		System.out.printf("Number of soldiers:%d%n", Soldier.count);			
	}
}

class Alien {
	public static int count;
	public int color;
	public int armCount;
	
	// ...
	public Alien() //**
	{
		//...
		++count;		
	}
	//...
}

class Soldier {
	
	public static int count;
	public int title;
	public int gunCount; 
	 
	//...

	
	public Soldier() //***
	{
		++count;
		//...
	}
	 
	 //...
}

class Civilian {
	public static int count;
	//...
}

class Building {
	public static int count;
	//...
}

class Animal {
	public static int count;
	//...
}

//...
```

#### 20 Haziran 2024

>Sınıfın `non-static` bir veri elemanına sınıf dışından sınıf ismi ile erişilemez. Erişilebilseydi sınıfın ilgili elemanı hangi nesneye ait olurdu? Bu sebeple erişilemez.

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		Sample.x = 10; /error
	}
}

class Sample {
	public int x;
	public boolean y;
	
	//...
}
```

>Aslında sınıfın `static` bir veri elemanına sınıf dışından referans ile de erişilebilir. Aslında bu erişimin sınıf ismi ile erişmekten farkı yoktur. Dilin Matematiksel anlatımı gereği bu sentaks geçerlidir. Ancak Java programcısının bu şekilde erişmesi kesinlikle **tavsiye edilmez**. Bu durum Java programcısı açısından adeta bir `error` gibi değerlendirilmeli dolayısıyla kullanılmamalıdır. Kullanımı durumundan kodun okunabilirliğini/algılanabilirliğini olumsuz etkilediğine dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		Sample s = new Sample();
		
		s.x = 10; //Gönlümüzün error'u
		s.y = true; //Gönlümüzün error'u
		
		System.out.printf("Sample.x = %d, Sample.y = %b%n", Sample.x, Sample.y);
	}
}

class Sample {
	public static int x;
	public static boolean y;
	
	//...
}
```

>Sınıfnın `non-static` bir metoduna sınıf dışından referans ve nokta operatörü ile erişelebilir. Sınıf ismi ile **erişilemez**. Sınıfın `non-static` metotlarının nesne ile ilişkisi ileride ele alınacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		Sample s = new Sample();
		
		s.foo();
		
		Sample.foo(); //error
	}
}

class Sample {
	//...
	
	public void foo()
	{
		//...
	}
	//...
}
```

**Anahtar Notlar:** `non-static metotlar` nesne içerisinde tutulmaz. Aslında metotlar aşağı seviyede genel olarak ismine "code section" denilen bir bölümde tutulurlar. Bu bölümün detayları ve Java düzeyindeki karşılığı burada ele alınamayacaktır. Bu durumda metotlar stack veya heap alanında tutulmazlar değil mi?

>Sınıfın `static` bir metoduna sınıf dışından sınıf ismi ve nokta operatörü ile erişilebilir. static veri elemanlarında olduğu gibi referans ve nokta operatörü ile de erişlebilir. Yine Java programcısı olarak static metotlara da referans ile erişmeyeceğiz. Sınıfın static metotlarının tür ile ilişkisi ileride ele alınacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample.foo();
		
		Sample s = new Sample();
		
		s.foo(); //gönlümüzün error'u		
	}
}

class Sample {
	//...
	public static void foo()
	{
		//...
	}
	//...
}
```

**Anahtar Notlar:** Dikkat edilirse yukarıdaki anlatılanlar, sınıf dışından yani başka bir sınıfın içinden olan erişimler içindir.

>Sınıfın `non-static` bir veri elemanına ait olduğu sınıfın `non-static` bir `metodu` içerisinde doğrudan yani nokta operatörü kullanmadan **erişilebilir**.
>
>Doğrudan erişilen non-static veri elemanı, non-static metodun çağrılmasında kullanılan referansın gösterdiği nesnenin veri elemanıdır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		s1.foo(10);
		s2.foo(20);
		
		System.out.printf("s1.x = %d%n", s1.x);
		System.out.printf("s2.x = %d%n", s2.x);
		s1.bar();
		s2.bar();
	}
}

class Sample {
	public int x;
	//...
	public void foo(int a)
	{
		x = a;
	}
	
	public void bar()
	{
		System.out.printf("x = %d%n", x);
	}
	//...
}
```

>Sınıfın `non-static` bir metodu ait olduğu sınıfın `non-static` bir metodu içerisinde doğrudan çağrılabilir.
>
>Doğrudan çağrılan `non-static metot`, çağıran `non-static metodun` çağrılmasında kullanılan referans ile çağrılmış olur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		s1.foo(10);
		s2.foo(20);
	}
}

class Sample {
	public int x;
	//...
	public void foo(int a)
	{
		x = a;
		bar();
	}
	
	public void bar()
	{
		System.out.printf("x = %d%n", x);
	}
	//...
}
```

>Yukarıdaki iki maddenin özeti olarak şu söylenebilir:
>- Sınıfın `non-static` bir metodu içerisinde, **tüm** `non-static` elemanlarına (member) doğrudan **erişilebilir**

>Sınıfın `non-static` bir metodu içerisinde, aynı sınıfın `static` veri elemanlarına doğrudan **erişilebilir**

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		s1.foo(10);
		
		s1.bar();
		s2.bar();
		System.out.println("----------------------");
		
		s2.foo(20);
		
		s1.bar();
		s2.bar();
		System.out.println("----------------------");
	}
}

class Sample {
	public static int x;
	//...
	public void foo(int a)
	{
		x = a;
		bar();
	}
	
	public void bar()
	{
		System.out.printf("x = %d%n", x);
	}
	//...
}
```

>Sınıfın `non-static` bir metodu içerisinde, aynı sınıfın `static` metotları **doğrudan çağrılabilir**

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		s1.foo(10);
		s2.foo(20);
	}
}

class Sample {
	public static int x;
	//...
	public void foo(int a)
	{
		x = a;
		bar();
	}
	
	public static void bar()
	{
		System.out.printf("x = %d%n", x);
	}
	//...
}
```

>Yukarıdaki **iki** maddenin özeti olarak şu söylenebilir:
>- Sınıfın `non-static` bir metodu içerisinde, tüm `static` elemanlarına **doğrudan erişilebilir**
>
>Yukarıdaki **dört** maddenin özeti olarak şu söylenebilir:
>- Sınıfın `non-static` bir metodu içerisinde, sınfın **tüm** elemanlarına **doğrudan erişilebilir**

>Sınıfın `static` bir metodu içerisinde, aynı sınıfın `non-static` bir veri elemanına **doğrudan erişilemez**

```java
package csd;

class Sample {
	public int x;
	//...
	public static void foo(int a)
	{
		x = a; //error
	}

	//...
}
```

>Sınıfın `static` bir metodu içerisinde, aynı sınıfın `non-static` bir metodu **doğrudan çağrılamaz**

```java
package csd;

class Sample {
	public int x;
	//...
	public static void foo(int a)
	{
		bar(a); //error
	}
	
	public void bar(int a)
	{
		x = a;
	}

	//...
}
```

>Yukarıdaki iki maddenin özeti olarak şu söylenebilir:
>- Sınıfın `static` bir metodu içerisinde, aynı sınıfın `non-static` elemanlarına doğrudan **erişilemez**

>Sınıfın `static` bir metodu içerisinde, aynı sınıfın `static` bir veri elemanına doğrudan **erişilebilir**

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample.foo(10);
		System.out.printf("Sample.x = %d%n", Sample.x);
	}
}

class Sample {
	public static int x;
	//...
	public static void foo(int a)
	{
		x = a;
	}
	
	//...
}
```

>Sınıfın `static` bir metodu içerisinde, aynı sınıfın `static` bir metodu doğrudan **çağrılabilir**

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample.foo(10);
		System.out.printf("Sample.x = %d%n", Sample.x);
	}
}

class Sample {
	public static int x;
	//...
	public static void foo(int a)
	{
		bar(a);
	}
	
	public static void bar(int a)
	{
		x = a;
	}
	
	//...
}
```

>Yukarıdaki **iki** maddenin özeti olarak şu söylenebilir: 
>- Sınıfın `static` bir metodu içerisinde aynı sınıfın `static` elemanlarına **doğrudan erişilebilir**
> 
>Yukarıdaki **dört** maddenin özeti olarak şu söylenebilir: 
>- Sınıfın `static` bir metodu içerisinde **aynı** sınıfın 
>	- `static` elemanlarına doğrudan **erişilebilirken**
>	- `non-static` elemanlarına doğrudan **erişilemez**
>
>Yukarıdaki **sekiz** maddenin özeti olarak şu söylenebilir: 
>- Sınıfın `non-static` bir metodu içerisinde aynı sınıfın **tüm** elemanlarına doğrudan **erişilebilir** 
>- `static` bir metodu içerisinde **yalnızca** `static` elemanlarına doğrudan **erişilebilir**

>Aşağıdaki demo örnekte foo metodu içerisinde bar metoduna doğrudan erişilmediğine dikkat ediniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample.foo(10);
	}
}

class Sample {
	public int x;
	//...
	public static void foo(int a)
	{
		Sample s = new Sample();
		
		s.bar(a);
	}
	
	public void bar(int a)
	{
		x = a;
	}
	
	//...
}
```
 
>Peki tüm bu anlatılanlara göre sınıfı yazan programcı bir metodu `static` veya` non-static` yapacağına nasıl karar verecektir?
>
>Bir metot `non-static` bir elemana erişmeyecekse `static` yapılmalıdır. Bu durumda yani `non-static` bir elemana erişmeyen bir metodun `static` yapılması durumu, `non-static` metotların okunabilirliğini/algılanabilirliğini artırır.
>
>Yani bir sinıfı kullanan programcı `non-static` bir metot gördüğünde o metodun `non-static` bir veri elemanına eriştiğini bilir. Çünkü erişmeseydi programcı bu metodu `static` yapardı olarak algılar

>Aşağıdaki örnekte `s1` referansının gösterdiği nesne ile `s2` referansının gösterdiği nesne farklıdır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		s1.x = 10;
		s1.y = true;
		s2.x = 30;
		
		System.out.printf("s1.x = %d, s1.y = %b%n", s1.x, s1.y);
		System.out.printf("s2.x = %d, s2.y = %b%n", s2.x, s2.y);
	}
}

class Sample {
	public int x;
	public boolean y;
	
	//...
}
```

>Aynı türden referansların birbirine atanması durumunda artık referanslar aynı nesneyi gösteriyor duruma gelmiş olurlar. Bu durumda hangi referans ile nesneye erişildiğinin bir önemi yoktur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		s1.x = 10;
		s1.y = true;
		s2.x = 30;
		
		System.out.printf("s1.x = %d, s1.y = %b%n", s1.x, s1.y);
		System.out.printf("s2.x = %d, s2.y = %b%n", s2.x, s2.y);
		
		s2 = s1;
		
		System.out.printf("s1.x = %d, s1.y = %b%n", s1.x, s1.y);
		System.out.printf("s2.x = %d, s2.y = %b%n", s2.x, s2.y);
		
		++s2.x;
		System.out.printf("s1.x = %d, s1.y = %b%n", s1.x, s1.y);
		System.out.printf("s2.x = %d, s2.y = %b%n", s2.x, s2.y);
	}
}

class Sample {
	public int x;
	public boolean y;
	
	//...
}
```

#### 25 Haziran 2024

>Aşağıdaki örnekte argüman olarak geçilen `x` yerel değişkeninin değeri metot içerisinde değiştirilemez değil mi?

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		int x = 10;
		
		Sample.foo(x);
		
		System.out.printf("x = %d%n", x);
	}
}

class Sample {
	public static void foo(int x)
	{
		++x;
		
		System.out.printf("foo:x = %d%n", x);
	}
}
```

>Bir metodun parametre değişkeni bir referans olabilir. Bu durumda metodun çağrılabilmesi için metoda aynı türden bir referansın argüman olarak geçilmesi gerekir. Bu durumda metodun perametresi olan referans ile argüman olarak geçilen referans aynı nesneyi gösterir duruma gelir. Anımsanacağı gibi argümanlardan parametre değişkenlerine aktarım da bir atama işlemidir. Bu durumda metot çağrısı boyunca ilgili nesneye erişilebilir. Hatta metot nesnenin içeriğini de değiştirebilir. Örnekte `DateUtil` sınıfının `change` metodunun nesnenin içeriğini değiştirdiğine dikkat ediniz.

>Bir metodun geri dönüş değeri bir sınıf türünden olabilir. Bu durumda bir metot `referansa` (adrese) geri dönmüş olur. Böyle bir metodun `return` deyimine ilişkin ifadesi de aynı türden bir referans olmalıdır. Örnekteki `create` metodunun bir nesne yaratıp o nesnenin adresine geri döndüğüne dikkat ediniz

```java
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
```

#### 27 Haziran 2024

##### Point sınıfı ve test kodları

```java
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
```

```java
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
		p1.offset(3.4, -6.7);
		p2.offset(-45, 9.78);
		p1.display();
		p2.display();	
	}
}
```

```java
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
		p1.offset(3.4);
		p2.offset(-45, 9.78);
		p1.display();
		p2.display();	
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.x = 23;
		p1.y = 56;
		p2.x = 26;
		p2.y = 52;
		
		double x = 26, y = 52;
		
		p1.display();
		p2.display();		
		
		double d = p1.distance(p2);

		System.out.printf("Distance:%f%n", d);
		
		d = p1.distance(x, y);
		
		System.out.printf("Distance:%f%n", d);
		
		d = p1.distance();
		
		System.out.printf("Distance:%f%n", d);
	}
}

class Point {
	public double x;
	public double y;
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}	
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public void display()
	{
		System.out.printf("(%f, %f)%n", x, y);
	}
}
```

##### Complex sınıfı ve test kodları
	
```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		Complex z1 = new Complex();
		Complex z2 = new Complex();
		Complex z;
		
		System.out.print("Input two complex numbers:");
		z1.real = kb.nextDouble();
		z1.imag = kb.nextDouble();
		z2.real = kb.nextDouble();
		z2.imag = kb.nextDouble();		
		
		z1.display();
		z2.display();
		
		z = z1.add(z2);	//Mantıksal z1 + z2 işlemi
		z.display();		
		z = z1.add(3.6); //Mantıksal z1 + 3.6 işlemi
		z.display();
		z = Complex.add(3.6, z1); //Mantıksal 3.6 + z1 işlemi
		z.display();		
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		Complex z1 = new Complex();
		Complex z2 = new Complex();
		Complex z;
		
		System.out.print("Input two complex numbers:");
		z1.real = kb.nextDouble();
		z1.imag = kb.nextDouble();
		z2.real = kb.nextDouble();
		z2.imag = kb.nextDouble();		
		
		z1.display();
		z2.display();
		
		z = z1.subtract(z2); //Mantıksal z1 - z2 işlemi
		z.display();		
		z = z1.subtract(3.6); //Mantıksal z1 - 3.6 işlemi
		z.display();
		z = Complex.subtract(3.6, z1); //Mantıksal 3.6 - z1 işlemi
		z.display();		
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		Complex z = new Complex();	
		
		System.out.print("Input a complex number:");
		z.real = kb.nextDouble();				
		z.imag= kb.nextDouble();		
		z.display();		
		z.inc(); //Mantıksal ++z işlemi
		z.display();
		z.dec(); //Mantıksal --z
		z.display();
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		Complex z = new Complex();	
		
		System.out.print("Input a complex number:");
		z.real = kb.nextDouble();				
		z.imag= kb.nextDouble();		
		z.display();		
		z.inc(2); //Mantıksal ++z işlemi
		z.display();
		z.dec(2); //Mantıksal --z
		z.display();
	}
}

class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		Complex result = new Complex();
		
		result.real = re1 + re2;
		result.imag = im1 + im2;
		
		return result;
	}
	
	public static Complex subtract(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return add(re1, im1, -re2, -im2);		
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}	
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	public void inc(double val)
	{
		real += val;
	}
	
	public void inc()
	{
		inc(1);
	}
	
	public void dec(double val)
	{
		inc(-val);
	}
	
	public void dec()
	{
		dec(1);
	}
	
	public Complex getConjugate()
	{
		Complex result = new Complex();
		
		result.real = real;
		result.imag = -imag;
		
		return result;
	}
	
	public double getNorm()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double getLength()
	{
		return getNorm();
	}	
	
	public void display()
	{
		System.out.printf("(%.2f, %.2f)%n", real, imag);
	}
}
```

#### 2 Temmuz 2024

##### Nesnenin Yaratılması Aşamaları:
>1. Bellekte yer ayrılır.
>2. `Non-static` olan (ancak `final olmayan`) veri elemanlarına `default` değerler verilir. 
>3. Constructor (`ctor`) çağrılır.
>
>Bu `üç` adım tamamlandığında nesne yaratılmış olur. Herhangi bir adımda bir problem oluştuğunda nesnenin yaratılması **tamamlanmamış** olur.
	
**Anahtar Notlar:** final veri elemanları ileride ele alınacaktır.

>`ctor` aşağıdaki özelliklere sahip bir `metottur`
>- ctor nesne yaratılması aşamasında **çağrılır**.
>- ctor overload edilebilir `constructor overloading`.
>- Sınıf içerisinde programcı tarafından hiç bir ctor bildirilmemişse parametresiz ctor `default ctor` derleyici tarafından public ve içi boş olarak yazılır. Programcı en az bir tane ctor bildirirse artık derleyici default ctor'u **yazmaz**.
>- ctor ismi, sınıf ismi ile **aynı** olan ve **geri dönüş değeri kavramı olmayan** metottur. Burada geri dönüş değeri kavramı olmaması void bir metot olması anlamına **GELMEZ**. Ctor için geri dönüş değeri bilgisi yerine herhangi bir şey yazılmaz. Hatta sınıf ismi ile aynı isimde olan ve geri dönüş değeri bilgisi yazılmış olan bir metot bildirimi geçerlidir. Ancak hiç bir programcı böylesi bir metot yazmaz. Çünkü sınıf ismi ile aynı olan bir metodun geri dönüş değeri bilgisi yazılırsa bu metot artık ctor anlamına gelmez.
>- ctor `non-static` bir metottur.
>- Hangi ctor'un çağrılacağı `new` operatöründe geçilen argümanlara göre klasik **"method overload resolution"** kuralları ile belirlenir.
>- ctor programcı tarafından **çağrılamaz**. Programcı, nesne yaratılması sırasında hangi ctor'un çağrılacağının belirlendiği kodu yazar.
>- Nesne yaratılması adımları gereği ctor'dan önce `non-static` veri elemanlarına `default` değerleri verilmiş olur.
>- ctor geri dönüş değeri kavramı olmayan bir metot olsa da void bir metot gibi istenirse return deyimi sonlandırmak için kullanılabilir. Buradaki sonlandırma normal bir sonlandırmadır yani nesne yaratılmış olur.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s;
		Mample m;
		
		s = new Sample();
		s = new Sample(10, true);
		s = new Sample(20);
		m = new Mample(); 
		//...		
	}
}

class Mample {
	//...
}

class Sample {
	//...
	
	public Sample()
	{
		System.out.println("I am a default ctor");
	}
	
	public Sample(int a, boolean b)
	{
		System.out.println("I am a ctor with parameter types int and boolean");
	}
	
	public Sample(int a)
	{
		System.out.println("I am a ctor with parameter type int");
	}
}
```

>Aşağıdaki demo örnekte Sample sınıfının parametresiz ctor'u olmadığından error oluşur. Çünkü bu sınıf için derleyici default ctor'u otomatik olarak yazmaz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s;	
		
		s = new Sample(); //error	
	 
		//...		
	}
}

class Sample {
	//...
	
	public Sample(int a, boolean b)
	{
		System.out.println("I am a ctor with parameter types int and boolean");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s;
		
		s = new Sample(); 
		System.out.println("-----------------------------------------");
		s = new Sample(10, true);
		System.out.println("-----------------------------------------");
		s = new Sample(20);
	}
}

class Sample {
	public int x;
	public boolean y;
	//...
	
	public Sample()
	{
		System.out.println("I am a default ctor");
		System.out.printf("x = %d, y = %b%n", x, y);
	}
	
	public Sample(int a, boolean b)
	{
		System.out.println("I am a ctor with parameter types int and boolean");
		System.out.printf("x = %d, y = %b%n", x, y);
	}
	
	public Sample(int a)
	{
		System.out.println("I am a ctor with parameter type int");
		System.out.printf("x = %d, y = %b%n", x, y);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Sample s;
		
		s = new Sample(10, false); 
		System.out.println("-----------------------------------------");
		s = new Sample(-10, true);
		System.out.println("-----------------------------------------");	
	}
}

class Sample {
	public int x;
	public boolean y;
	//...
	
	public Sample(int a, boolean b)
	{
		System.out.println("I am a ctor with parameter types int and boolean");
		
		if (a < 0)
			return;
		
		System.out.printf("x = %d, y = %b%n", x, y);
	}	
}
```

>Peki, ctor ne işe yarar?
>
>Ctor, nesne yaratılmadan önce bir takım ilk işlemlerin yapılması amacıyla kullanılır. Bu işlemlerden en tipik olanı veri elemanlarına değer verilmesidir. Sınıfın ilgili ctor'ları aldıkları parametre değişkenlerini kullanarak veri elemanlarına değer verebilirler. Şüphesiz bu durum sınıfın senaryosu yani ne olduğu ile ilgilidir. Yine örneğin, bir sınıf aldığı bağlantı bilgilerine göre nesne yaratılmadan önce o bağlantıda bulunan bir cihaza bağlanabilir. Şüphesiz en çok karşılaşılan durum sınıfın veri elemanlarına değer verilmesi durumudur

##### Point sınıfı ve test kodları

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Point p1, p2, p3;
		
		p1 = new Point(100, 200);
		p2 = new Point(200);
		p3 = new Point();
		
		p1.display();
		p2.display();
		p3.display();
	}
}

class Point {
	public double x;
	public double y;

	public Point()
	{		
	}

	public Point(double a)
	{
		x = a;		
	}
	
	public Point(double a, double b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}	
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public void display()
	{
		System.out.printf("(%f, %f)%n", x, y);
	}
}
```

#### 4 Temmuz 2024

##### Complex sınıfı ve test kodları

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Complex z1, z2, z3;
		
		z1 = new Complex();
		z2 = new Complex(-5.6);
		z3 = new Complex(-5, 8);
		
		z1.display();
		z2.display();
		z3.display();
	}
}
```

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Complex z1, z2;
		Complex z;
		
		z1 = new Complex(-5.6);
		z2 = new Complex(-5, 8);
		
		z1.display();
		z2.display();
		
		z = z1.add(z2);
		
		z.display();		
	}
}

class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return new Complex(re1 + re2, im1 + im2);
	}
	
	public static Complex subtract(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return add(re1, im1, -re2, -im2);		
	}
	
	public Complex()
	{		
	}
	
	public Complex(double a)
	{
		real = a;		
	}
	
	public Complex(double a, double b)
	{
		real = a;
		imag = b;
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}	
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	public void inc(double val)
	{
		real += val;
	}
	
	public void inc()
	{
		inc(1);
	}
	
	public void dec(double val)
	{
		inc(-val);
	}
	
	public void dec()
	{
		dec(1);
	}
	
	public Complex getConjugate()
	{				
		return new Complex(real, -imag);
	}
	
	public double getNorm()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double getLength()
	{
		return getNorm();
	}	
	
	public void display()
	{
		System.out.printf("(%.2f, %.2f)%n", real, imag);
	}
}
```

##### Rassal (Random) Sayı Üretimi

>Rassal sayı üretimi Bilgisayar dünyasında çok fazla kullanılmaktadır. Örneğin bir oyunda rassal sayılar üretilerek bir takım karakterler (game object) rassal olarak oluşturulup hareket ettirilebilirler. Ya da örneğin simülasyon programlarında da rassal sayılar üretilmektedir. Gerçek hayattaki rassallık bilgisayar dünyasında gerçeklleştirilemez. Bu anlamda Bilgisayar dünyasında deterministik olarak rassal sayılar üretilebilmektedir. Bu sebeple Bilgisayar dünyasında üretilen rassal sayılara **"pseudo random numbers"** da denilmektedir.
>	
>Bilgisayar dünyasında rassal sayı üretiminin kalitesi söz konusudur. Rassal sayı üretimine ilişkin işlemler bir mantık çerçevesinde karmaşıklaştıkça genel olarak kalite artar. Ancak bu durumda da yapılan işlemlere ilişkin bir maliyet söz	konusu  olabilmektedir. Bu anlamda Bilgisayar dünyasında rassal sayı üretimine ilişkin bilimsel çalışmalar hali	hazırda devam etmektedir.
>
>Java'da rassal sayı üretimine ilişkin pek çok sınıf bulunmaktadır. Özellikle `Java 17` ile birlikte çeşitli algoritmalara göre rassal sayı üretebilmesine yönelik JavaSE'ye eklentiler yapılmıştır. Java'da rassal sayı üretimine ilişkin en temel sınıf `java.util` paketi içerisinde bulunan `Random` sınıfıdır. Bu sınıfın rassal sayı üretimi orta kalitelidir. Çoğu	zaman yeterli olmaktadır. Zaten yeterli olmadığı durumda programcı diğerlerine yönelir. Özellikle `Java 17`'den itibaren `Random` sınıfına ilişkin rassal sayı üretimine **"legacy random"** da denilmektedir. Burada `Random` sınıfı dışındaki rassal sayı üretimi ele alınmayacaktır.
>
>**Anahtar Notlar:** `java.util.Random` sınıfı Donald Knuth'un "The Art of Computer Programming" kitaplar serisinin ikinci cildinde "Seminumerical Algorithms" bölümündeki (Section 3.2.1) algoritmayı kullanmaktadır.
>	
>Bilgisayar dünyasında genel olarak rassal sayı üretiminde ismine **"tohum değeri (seed value)"** bir değer kullanılır. Aslında rassal sayı üretimi bu değer ile başlar ve her üretimde bu değer güncellenerek devam eder. Yani tohum değeri, rassal sayı üretimine ilişkin Matematiksel işlemlerde kullanılır. `java.util.Random` sınıfının default ctor'u ile nesne yaratıldığında, tohum değeri o uygulama içerisinde daha önce yine default ctor kullanılarak yaratılmış olan nesnelere ilişkin tohum değerlerinden mümkün olduğunca farklı olma eğilimindedir. 
>
>`java.util.Random` sınıfının `nextXXX` metotları ile rassal sayılar elde edilebilir. Şüphesiz bu metotlar dışında da metotları bulunmaktadır. Bazı metotlar ileride ele alınacaktır

>`Random` sınıfının parametresiz nextInt metodu int türü sınırları içerisinde rassal olarak üretilmiş bir sayıya geri döner

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();
		
		for (int i = 0; i < count; ++i)
			System.out.printf("%d%n", r.nextInt());
	}
}
```

>`Random` sınıfının tek parametreli nextInt metodu sıfır ile parametresi ile aldığı değer aralığında rassal sayı üretir. Burada parametresi ile aldığı değer üretilecek sayı sınırına dahil değildir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();
		
		for (int i = 0; i < count; ++i)
			System.out.printf("%02d ", r.nextInt(100)); //[0, 100)
		
		System.out.println();
	}
}
```

>`Random` sınıfına Java 17 ile birlikte iki parmatreli `nextInt` metodu da dolaylı olarak eklenmiştir. Bu metot aldığı parametre değerlerine göre `[origin, bound)` aralığında üretilmiş rassal bir sayıya geri döner.
	
**Anahtar Notlar:** Burada "dolaylı eklenmiştir" denmesinin ayrıntıları ileride ele alınacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		System.out.print("Üç tane sayı giriniz:");
		int count = kb.nextInt();
		int origin = kb.nextInt();
		int bound = kb.nextInt();
		
		for (int i = 0; i < count; ++i)
			System.out.printf("%02d ", r.nextInt(origin, bound)); //[origin, bound)
		
		System.out.println();
	}
}
```

>`Random` sınıfının `nextLong` metotları long türden rassal bir sayı üretilmesini sağlar. Tek parametreli ve iki parametreli `nextLong` metotları Java 17 ile birlikte dolaylı olarak eklenmiştir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		System.out.print("Üç tane sayı giriniz:");
		int count = kb.nextInt();
		long origin = kb.nextLong();
		long bound = kb.nextLong();
		
		for (int i = 0; i < count; ++i)
			System.out.printf("%d%n", r.nextLong(origin, bound)); //[origin, bound)
		
		System.out.println("-------------------------------------------");

		
		for (int i = 0; i < count; ++i)
			System.out.printf("%d%n", r.nextLong(bound)); //[0, bound)
		
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < count; ++i)
			System.out.printf("%d%n", r.nextLong());
		
		System.out.println("-------------------------------------------");
	}
}
```

>`Random` sınıfının `nextDouble` metotları `double` türden rassal bir sayı üretilmesini sağlar. Parmetresiz nextDouble metodu `[0, 1)` aralığında rassal olarak üretilmiş bir sayıya geri döner. Tek parametreli ve iki parametreli `nextDouble` metotları yine Java 17 ile birlikte dolaylı olarak eklenmiştir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		System.out.print("Üç tane sayı giriniz:");
		int count = kb.nextInt();
		double origin = kb.nextDouble();
		double bound = kb.nextDouble();
		
		for (int i = 0; i < count; ++i)
			System.out.printf("%f%n", r.nextDouble(origin, bound)); //[origin, bound)
		
		System.out.println("-------------------------------------------");

		
		for (int i = 0; i < count; ++i)
			System.out.printf("%f%n", r.nextDouble(bound)); //[0, bound)
		
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < count; ++i)
			System.out.printf("%f%n", r.nextDouble()); //[0, 1)
		
		System.out.println("-------------------------------------------");
	}
}
```

>`Random` sınıfının `nextBoolean` boolean türden rassal olarak üretilmiş değere geri döner

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();
		
		for (int i = 0; i < count; ++i)
			System.out.printf("%b ", r.nextBoolean());
		
		System.out.println();		
	}
}
```

>**Sınıf Çalışması:** Hilesiz bir paranın yazı gelme olasılığının yaklaşık olarak 0.5 olduğunu hesaplayan basit simülasyon programını yazınız.
>
>**_Not:_** İleride daha iyisi yazılacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		CoinTailProbabilitySimulationApp.run();				
	}
}

class CoinTailProbabilitySimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Input count:");
		int count = kb.nextInt();
		
		CoinTailProbabilitySimulation simulation = new CoinTailProbabilitySimulation();
		
		simulation.run(count);
		
		System.out.printf("Probability of tail:%f%n", simulation.p);
		
	}
}

class CoinTailProbabilitySimulation {
	public double p;
	
	public void run(int count)
	{
		java.util.Random r = new java.util.Random();		
		int n = 0;
		
		for (int i = 0; i < count; ++i)
			n += r.nextInt(2);
		
		p = (double)n / count;
	}
}
```

>**Sınıf Çalışması:** Hilesiz bir paranın yazı gelme olasılığının yaklaşık olarak 0.5 olduğunu hesaplayan basit simülasyon programını yazınız.
>
>**_Not:_** İleride daha iyisi yazılacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		CoinTailProbabilitySimulationApp.run();				
	}
}

class CoinTailProbabilitySimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Input count:");
		int count = kb.nextInt();
		
		CoinTailProbabilitySimulation simulation = new CoinTailProbabilitySimulation();
		
		simulation.run(count);
		
		System.out.printf("Probability of tail:%f%n", simulation.p);
	}
}

class CoinTailProbabilitySimulation {
	public double p;
	
	public void run(int count)
	{
		java.util.Random r = new java.util.Random();		
		int n = 0;
		
		for (int i = 0; i < count; ++i)
			if (r.nextBoolean())
				++n;
		
		p = (double)n / count;
	}
}
```

>**Sınıf Çalışması:** Hilesiz iki zarın atılması deneyinde zarların çift gelmesi (ikisinin de aynı) olasılığını yaklaşık olarak hesaplayan simülasyonu yazınız.
>
>**_Not:_** İleride daha iyisi yazılacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		SameDiceProbabilitySimulationApp.run();						
	}
}

class SameDiceProbabilitySimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Input count:");
		int count = kb.nextInt();
		
		SameDiceProbabilitySimulation simulation = new SameDiceProbabilitySimulation();
		
		simulation.run(count);
		
		System.out.printf("Probability:%f%n", simulation.p);
	}
}

class SameDiceProbabilitySimulation {
	public double p;
	
	public static boolean areSame(java.util.Random r)
	{
		return r.nextInt(6) + 1 == r.nextInt(6) + 1;
	}
	
	public void run(int count)
	{
		java.util.Random r = new java.util.Random();
		int n = 0;
		
		for (int i = 0; i < count; ++i)
			if (areSame(r))
				++n;
		
		p = (double)n / count;		
	}
}
```

>**Sınıf Çalışması:** Hilesiz iki zarın atılması deneyinde zarların her ikisinin birden çift sayılar gelmesi olasılığını yaklaşık olarak hesaplayan simülasyonu yazınız.
>
>**_Not:_** İleride daha iyisi yazılacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		EvenDiceProbabilitySimulationApp.run();						
	}
}

class EvenDiceProbabilitySimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Input count:");
		int count = kb.nextInt();
		
		EvenDiceProbabilitySimulation simulation = new EvenDiceProbabilitySimulation();
		
		simulation.run(count);
		
		System.out.printf("Probability:%f%n", simulation.p);
	}
}

class EvenDiceProbabilitySimulation {
	public double p;
	
	public static boolean areEven(java.util.Random r)
	{
		return (r.nextInt(6) + 1) % 2 == 0 && (r.nextInt(6) + 1) % 2 == 0;
	}
	
	public void run(int count)
	{
		java.util.Random r = new java.util.Random();
		int n = 0;
		
		for (int i = 0; i < count; ++i)
			if (areEven(r))
				++n;
		
		p = (double)n / count;		
	}
}
```

#### 9 Temmuz 2024

>Anımsanacağı gibi rassal sayı üretimi bir takım Matematiksel işlemlerle bilgisayar dünyasında gerçekleştirilir. Şüphesiz bu işlemler kullanılan algoritmalara göre değişiklik gösterebilir. Ancak neredeyse tüm algoritmalarda **"tohum değeri (seed value)"** denilen bir değer kullanılır. Bu değer her sayı üretiminde ilgili algoritmaya göre güncellenir. Bu durumda bir işlem aynı tohum değeriyle tekrar yapıldığında aynı sonuçlar elde edilir. Yani örneğin bir programda `10` tane `[0, 99]` aralığında sayı üretiliyorsa bu program hep **aynı** tohum değeri ile çalıştırılırsa hep aynı sayılar aynı dizilimde üretilir. Random sınıfının default ctor'u her yaratılan nesne için tohum değerini farklı verecek şekilde yazılmıştır. Bu işlem genel olarak zaman kavramı kullanılarak yapılabilir. Örneğin tohum değeri belirli bir tarihten itibaren geçen milisaniye olarak alınırsa veya donanıma ilişkin üretilen tick sayısına bağlı olarak alınırsa her değer farklı olma eğiliminde olur. Random sınıfının tohum değerini başlangıçta programcıdan alabildiği bir ctor'u ve `setSeed` isimli bir metodu da vardır. Örneğin bir resim içerisinde resimde gözle değişiklikle anlaşılamayacak şekilde bir yazı gizlemek için yazının bitleri rassal olarak belirlenen pixel'lere yazılabilir. Bu durumda resimden yazı elde edilirken aynı pixel'lerin elde edilebilmesi için aynı tohum değeriyle üretim yapılması gerekir. Şüphesiz bu işlemin nasıl yapılacağına ilişkin pek çok detay söz konusudur. Burada önemli olan yani odaklanmanız örnekte tohum değerinin aynı olacak şekilde kullanılmasıdır.

>Aşağıdaki demo örneğin her çalıştırılmasında üretilen ilk 10 sayının dizilimi diğer çalıştırmalardan farklıdır. İkinci 10 sayının dizilimi ise tohum değerine bağlı olduğundan daha önceki bir çalıştırılmada girilen tohum değeri ile aynı değer tekrar girildiğinde dizilim aynı olur

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		System.out.print("Tohum değerini giriniz:");
		long seed = kb.nextLong();
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%d ", r.nextInt(100));
		
		System.out.println();
		
		r.setSeed(seed);
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%d ", r.nextInt(100));
		
		System.out.println();		
	}
}
```

**Anahtar Notlar:** Burada `java.util.Random` sınıfının bazı metotları ele alınmıştır. Diğer metotlar başka konuları da gerektirdiğinden daha sonra belirli ölçüde ele alınacaktır

##### Yazılarla işlemler ve String sınıfı:

>Yazılarla işlemler programlamada çok fazla yapılmaktadır. İrili ufaklı tüm programlar bir şekilde yazıları kullanırlar. Programlamada karakterlerden oluşan bir topluluğa ya da genel olarak yazılara "string" terimi karşılık getirilmektedir. Java'da yazı işlemlerine ilişkin en temel sınıf `java.lang` paketinde bulunan `String` sınıfıdır. JavaSE'de yazılarla işlem yapan başka sınıflar da vardır. Ancak bunlar genel olarak String sınıfına yardımcı sınıflardır.

**Anahtar Notlar:** `java.lang` paketi içerisinde bulunan UDT'ler herhangi bir bildirim yapmadan doğrudan kullanılabilir. Örneğin, `String`, `System` gibi sınıflar `java.lang` paketi içerisinde olduğundan isimleri doğrudan kullanılabilir. Ancak örneğin `Random` sınıfı `java.util` paketi içerisinde olduğundan doğrudan kullanılması için ileride detaylı olarak ele alacağımız bir takım işlemlerin de yapılması gerekir ya da paket ismiyle kombine edilerek kullanılabilir.

**Anahtar Notlar:** Bir nesnenin içeriği (yani kabaca `non-static` veri elemanları) nesne yaratıldıktan sonra sınıfı kullanan programcı tarafından değiştirilemiyorsa bu tarz nesnelerin yaratılabildiği sınıflara **"immutable class"** denir. Pek çok immutable sınıfın `non-static` veri elemanları içsel olarak da değiştirilemez. `Immutable` bir sınıfın nasıl yazılacağı ileride ele alınacaktır.

>Derleyici bir string literal gördüğünde ve bu string literal'ı ilk kez görüyorsa kabaca şu şekilde bir kod üretir:
>
>"String türden bir nesne yarat ve string literal içerisindeki karakterleri bu string nesnesi ile tutulabilecek şekle getir ve ilgili string nesnesinin referansını (adresini) ver". Bu durumda bir string literal ile bir string nesnesinin referansı elde edilebilir. print ve println metotlarının String parametreli overload'ları vardır. Bu metotlar aldıkları String referansına ilişkin nesne ile tutulan yazıyı yazdırır. printf metodu ile bir yazı s format karakteri ile yazdırılabilir. Klavyeden bir yazı elde etmek için Scanner sınıfının String geri dönüş değerine sahip metotları kullanılabilir. Örneğin nextLine metodu klavyeden enter girilene alınan yazılara ilişkin bir String nesnesi yaratır ve onun referansına geri döner. Bu yazı içerisinde enter karakteri yoktur

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		String s;
		
		s = "ankara";
		
		System.out.println(s);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		String s;
		
		s = "ankara";
		
		System.out.printf("Yazı:%s%n", s);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
		System.out.printf("Yazı:%s%n", s);
	}
}
```

#### 11 Temmuz 2024

>Bir String nesnesine ilişkin yazının karakterlerinin her birine sıfırdan başlayarak bir indeks numarası verilmiş gibi yani bir dizi gibi düşünebiliriz. Bu durumda bir yazının herhangi bir indeksteki karakterine `charAt` isimli metot ile erişilebilir. Bu metot aldığı indeks numarasına ilişkin karaktere geri döner. Metoda pozitif ya da negatif bakımdan sınırlar dışında bir indeks numarası verildiğinde exception oluşur. Yazının uzunluğu yani kaç tane karakterden oluştuğu bilgisi length metodu ile elde edilebilir

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
		int len = s.length();
		
		System.out.printf("Yazının uzunluğu:%d%n", len);
		
		for (int i = 0; i < len; ++i)
			System.out.printf("%c ", s.charAt(i));
		
		System.out.println();
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
		int len = s.length();
		
		System.out.printf("Yazının uzunluğu:%d%n", len);
		
		char c = s.charAt(5);
		
		System.out.printf("c = %c%n", c);
	}
}
```

>String sınıfı `immutable` bir sınıftır. Yani, bir String nesnesine ilişkin yazı değiştirilemez. Bu durumda yazı üzerinde değişiklik yapan metotlar değiştirilmiş yazıyı tutan yeni bir String referansına geri dönerler. Örneğin, `toLowerCase` metotları yazının tüm karakterlerini küçük harfe çeviren metottur. Metot ilgili yazıyı değiştiremeyeceğinden tamamı küçük harflerden oluşan bir yazıya ilişkin yeni bir String referansına geri döner. Benzer şekilde `toUpperCase` metotları yazının tüm karakterlerini büyük harfe çevirir. Şüphesiz küçük/büyük harf karşılığı olmayan karakterlerin aynıları alınır. Bu metotların bu bölümde yalnızca parametresiz overload'ları ele alınacaktır

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();	
		String lower = s.toLowerCase();
		
		System.out.printf("s = %s%nlower = %s%n", s, lower);		
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();	
		String upper = s.toUpperCase();
		
		System.out.printf("s = %s%nupper= %s%n", s, upper);		
	}
}
```

>Bazen aynı referans ile kod içerisinde devam edilmesi gerektiğinde değiştirilmiş yazıya ilişkin nesnenin adresi referansa atanır.
>
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();	
		s = s.toUpperCase();
		
		System.out.printf("s = %s%n", s);		
	}
}
```

>Bazen aynı referans ile kod içerisinde devam edilmesi gerektiğinde değiştirilmiş yazıya ilişkin nesnenin adresi referansa atanır.
>
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();	
		s = s.toUpperCase();
		
		System.out.printf("s = %s%n", s);		
	}
}
```

**Anahtar Notlar:** Aynı türden iki referans `==` veya `!=` operatörü ile işleme sokulabilir. Bu durumda aslında iki referansın da aynı nesneyi gösterip göstermediğine ilişkin değer üretilir. Yani `==` operatörü iki referans da **aynı** nesneyi gösteriyorsa	**true**, göstermiyorsa **false** değerini, `!=` operatörü iki referans **aynı** nesneyi gösteriyosa **false**, göstermiyorsa **true** değerini üretir. **Farklı** türden referanslar hiç bir şekilde işleme **sokulamaz**.

Dikkat edilirse aynı türden referansların eşitlik karşılaştırması adreslerin karşılaştırılmasıdır. Nesnelerin içeriğinin yani `non-static` veri elemanlarının **aynı olup olmadığı** kontrolü bu şekilde **yapılamaz**

>Aşağıdaki demo örnekte `farklı` nesneler yaratılmıştır değil mi?

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		Sample s1 = new Sample(10);
		Sample s2 = new Sample(10);
		
		System.out.println(s1 == s2 ? "Aynı nesne" : "Farklı nesneler");
		System.out.println(s1 != s2 ? "Farklı nesneler" : "Aynı nesne");
	}
}

class Sample {
	public int x;
	
	public Sample(int a)
	{
		x = a;
	}
	
	//...
}
```

>Aşağıdaki demo örnekte referanslar `aynı` nesneyi gösteriyor değil mi?

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		Sample s1 = new Sample(10);
		Sample s2 = s1;
		
		System.out.println(s1 == s2 ? "Aynı nesne" : "Farklı nesneler");
		System.out.println(s1 != s2 ? "Farklı nesneler" : "Aynı nesne");
	}
}

class Sample {
	public int x;
	
	public Sample(int a)
	{
		x = a;
	}
	
	//...
}
```

>Aşağıdaki örnekte iki yazının özdeşlik yani tüm karakterlerinin karşılıklı olarak aynı olması karşılaştırması yapılmamıştır değil mi?

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci yazıyı giriniz:");
		String s1 = kb.nextLine();
		
		System.out.print("İkinci yazıyı giriniz:");
		String s2 = kb.nextLine();
		
		System.out.println(s1 == s2 ? "Aynı yazı" : "Farklı yazılar");
	}
}
```

>Yazıların özdeşlik karşılaştırması equals isimli metot ile yapılabilir. Bu metot case-sensitive olarak çalışır. Case-insensitive karşılaştırma için `equalsIgnoreCase` metodu kullanılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci yazıyı giriniz:");
		String s1 = kb.nextLine();
		
		System.out.print("İkinci yazıyı giriniz:");
		String s2 = kb.nextLine();
		
		System.out.println(s1.equals(s2) ? "Aynı yazı" : "Farklı yazılar");		
		System.out.println(s1.equalsIgnoreCase(s2) ? "Aynı yazı" : "Farklı yazılar");
	}
}
```

>Derleyici özdeş string literal'lar için aynı adresin verileceği kodu üretir. Yani özdeş string'lere ilişkin bir tane nesne yaratılmış olur. Zaten sınıf immutable olduğundan iki referansın aynı nesneyi göstermesi durumunda nesnenin içeriği değiştirelemezdir, bu da herhangi bir probleme yol açmaz. Bu durumda bellek efektif olarak kullanılmış olur
>
>Aşağıdaki örnekte yine referans karşılaştırması yapılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		String s1 = "ankara";
		String s2 = "ankara";
		
		System.out.println(s1 == s2 ? "Aynı nesne" : "Farklı nesneler");		
	}
}
```

#### 16 Temmuz 2024

>String sınıfının `concat` metodu çağrıldığı yazının sonuna parametresi ile aldığı yazıyı ekler

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			String str = s1.concat(s2);
			
			System.out.println(str);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			String str = s1.concat(" ").concat(s2);
			
			System.out.println(str);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			String str = s1.concat(" ".concat(s2));
			
			System.out.println(str);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>`+` operatörünün operandları String türündense bu işlem yazı birleştirmesi anlamına gelir ve birleştirilmiş yazıya ilişkin String referansı elde edilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			String str = s1 + " " + s2;
			
			
			System.out.println(str);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>`+` operatörünün bir operandı String türündense, diğer operandın yazı karşılığı elde edilerek birleştirme işlemi yapılır. String türden olmayan bir ifadenin yazı karşılığının (yani String karşılığının) nasıl elde edildiği "Java Language Specification"'da açıklanmıştır ve detayları ileride ele alınacaktır. Aşağıdaki dönüşüm tür dönüştürme operatörü ile yapılamaz değil mi?

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Hava sıcaklığını giriniz:");
			int degree = Integer.parseInt(kb.nextLine());
			
			String message = "Bugün hava " + degree + " derece";
			
			System.out.println(message);
			
			if (degree == 0)
				break;			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Aşağıdaki örnekte önce yazılar birleştirilip println metodu çağrılır. Anımsanacağı gibi bir metot çağrısı için önce argümana ilişkin ifade hesaplanır elde edilen değer ile metot çağrılır

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Hava sıcaklığını giriniz:");
			int degree = Integer.parseInt(kb.nextLine());	
			
			System.out.println("Bugün hava " + degree + " derece");
			
			if (degree == 0)
				break;			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>Length bilgisi sıfır olan yani hiçbir karakter içermeyen bir yazıya "boş string (empty string)" denir. Boş string en kolay iki tane çift tırnak işaretinin yan yana getirilmesi ile ("") elde edilebilir.

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		String s = "";

		System.out.printf("Length: %d%n", s.length());
	}
}
```

>Bir String'in boş olup olmadığı çeşitli şekillerde anlaşılıabilir. Örneğin length'inin sıfır olup olmadığına bakılabilir. Ya da "" ile equals metodu kullanılarak karşılaştırma yapılabilir. Ancak bu işlem pratikte çok gerekli olduğundan String sınıfında `isEmpty` isimli bir metot bulundurulmaktadır. Bu durumda hem okunabilir hem de kolay olması açısından bir yazının boş string olup olmadığının anlaşılması için `isEmpty` metodu kullanılmalıdır.
>
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if (s.isEmpty()) {
				System.out.println("Boş string girdiniz");
				continue;
			}
			if ("elma".equals(s))
				break;
			
			System.out.printf("Girilen yazı:(%s)%n", s);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
```

>`String` sınıfnın `substring` metotları bir yazının belli bir kısmını elde etmek için kullanılır. substring metodunun tek paramtreli overload'u parametresi ile aldığı indeks değerinden itibaren yazının sonuna kadarki kısmına ilişkin String referansına geri döner. İki parametreli overload'u ise birinci parametresi ile aldığı indeks değerinden ikinci parametresi ile aldığı indeks değerine kadar (hariç) olan yazıya ilişkin String referansına geri döner

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		String s = "ankara";
		
		System.out.printf("(%s)%n", s.substring(2)); //(kara)
		System.out.printf("(%s)%n", s.substring(2, 5)); //(kar)
	}
}
```

>`substring` metodunun tek parametreli overload'una yazının uzunluğu indeks olarak verildiğinde özel bir durum olarak boş string'e geri döner. Uzunluktan daha büyük bir indeks numarası için exception oluşur

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.print("İndeks numarasını giriniz:");
			int idx = Integer.parseInt(kb.nextLine());
			
			String str = s.substring(idx);
			
			System.out.println(str.isEmpty() ? "Boş string" : "Yazı:" + str);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");	
	}
}
```

>**Sınıf Çalışması:** Klavyeden elma girilene kadar alınan yazıları aralarına `-` koyacak şekilde birleştirilmiş yeni bir yazı (yani String referansı) elde eden programı yazınız
>
>**Açıklamalar:**
>- Programda dizi kullanılmayacaktır. Zaten gerek de yoktur
>**_Not:_** İleride daha iyisi yazılacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		ConcatWithHyphenApp.run();	
	}
}

class ConcatWithHyphenApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String str = "";
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			str += s + "-";			
		}
		
		str = str.isEmpty() ? str : str.substring(0, str.length() - 1);
		
		System.out.println(str);
	}
}
```

>**Sınıf Çalışması:** Klavyeden elma girilene kadar alınan yazıları aralarına `-` koyacak şekilde birleştirilmiş yeni bir	yazı (yani String referansı) elde eden programı yazınız.
>
>**Açıklamalar:**
>- Programda dizi kullanılmayacaktır. Zaten gerek de yoktur
>- Girilen boş string'ler yazıya dahil edilmeyecektir
>
>**_Not:_** İleride daha iyisi yazılacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{			
		ConcatWithHyphenApp.run();	
	}
}

class ConcatWithHyphenApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String str = "";
		
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if (s.isEmpty())
				continue;
				
			if ("elma".equals(s))
				break;
			
			str += s + "-";			
		}
		
		str = str.isEmpty() ? str : str.substring(0, str.length() - 1);
		
		System.out.println(str);
	}
}
```

>`substring` metodunun ikiparametreli overload'u için her iki parametreye de aynı değer yani ayno indeks numarası geçirlise boş string'e geri döner.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
		
		s = s.substring(0, 0);
		
		System.out.println(s.isEmpty() ? "Boş string" : "Yazı:" + s);
	}
}
```

>`String` sınıfının `indexOf` metotları yazı içerisinde bir karakteri ya da yazı içerisinde bir yazıyı aramak için kullanılırlar. `indexOf` metotlarının prototipleri şu şekildedir:	
>1. int indexOf(int ch)
>2. int indexOf(int ch, int fromIndex)	
>3. int indexOf(String str)
>4. int indexOf(String str, int fromIndex)
>
>`1. ve 2.` metotlar yazı içerisinde karakter aramak için kullanılır. Eğer ilgili karakter bulunursa karakterin ilk bulunduğu indeks numarasına geri dönerler, bulunamazsa -1 değerine geri dönerler.\
>`3. ve 4.` metotlar yazı içerisinde bir yazıyı aramak için kullanılır. Bulursa aranan yazının ilk bulunduğu yerdeki ilk karakterinin indeks numarasına geri dönerler. Bulunamazsa -1 değerine geri dönerler.\
>`2. ve 4.` metotlar arama işlemine ikinci parametreleri ile aldıkları indeks numarasından başlarlar.\
>`1. ve 3.` metotlar arama işlemine yazının başından başlarlar

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		String text = "Bugün hava çok güzel, çok çok güzel";
		String s = "çok";
		
		System.out.println(text.indexOf(s));
		System.out.println(text.indexOf(s, 12));		
		System.out.println(text.indexOf(s, 27));
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı iki yazıdan birinci içerisinde ikincisinden kaç olduğuna geri dönen `countString` isimli metodu `StringUtil` isimli bir sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilCountStringTest.run();
	}
}

class StringUtilCountStringTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			System.out.printf("Count:%d%n", StringUtil.countString(s1, s2));
		}
	}
}

class StringUtil {
	public static int countString(String s1, String s2)
	{
		int count = 0;
		int idx = 0;
		
		
		while ((idx = s1.indexOf(s2, idx)) != -1) {
			++count;
			++idx;
		}
		
		
		return count;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı iki yazıdan birinci içerisinde ikincisinden kaç olduğuna geri dönen `countString` isimli metodu `StringUtil` isimli bir sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilCountStringTest.run();
	}
}

class StringUtilCountStringTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			System.out.printf("Count:%d%n", StringUtil.countString(s1, s2));
		}
	}
}

class StringUtil {
	public static int countString(String s1, String s2)
	{
		int count = 0;
		int idx = -1;		
		
		while ((idx = s1.indexOf(s2, idx + 1)) != -1)
			++count;		
		
		return count;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı iki yazıdan birinci içerisinde ikincisinden kaç olduğuna geri dönen `countString` isimli metodu `StringUtil` isimli bir sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilCountStringTest.run();
	}
}

class StringUtilCountStringTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			System.out.printf("Count:%d%n", StringUtil.countString(s1, s2));
		}
	}
}

class StringUtil {
	public static int countString(String s1, String s2)
	{
		int count = 0;
		
		for (int i = -1; (i = s1.indexOf(s2, i + 1)) != -1; ++count)
			;		

		return count;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı iki yazıdan birinci içerisinde ikincisinden kaç olduğuna geri dönen `countString` isimli metodu `StringUtil` isimli bir sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilCountStringTest.run();
	}
}

class StringUtilCountStringTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			System.out.printf("Count:%d%n", StringUtil.countString(s1, s2));
		}
	}
}

class StringUtil {
	public static int countString(String s1, String s2)
	{		
		int count = 0;
		
		for (int i = 0; (i = s1.indexOf(s2, i)) != -1; ++i, ++count)
			;		

		return count;
	}
}
```

#### 18 Temmuz 2024

>**Sınıf Çalışması:** Parametresi ile aldığı iki yazıdan birinci içerisinde ikincisinden kaç olduğuna geri dönen ve case insensitive olarak çalışan `countStringIgnoreCase` isimli metodu yazınız ve aşağıdaki kod ile test ediniz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilCountStringIgnoreCaseTest.run();
	}
}

class StringUtilCountStringIgnoreCaseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.print("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			
			System.out.printf("Count:%d%n", StringUtil.countStringIgnoreCase(s1, s2));
		}
	}
}

class StringUtil {
	public static int countStringIgnoreCase(String s1, String s2)
	{
		return countString(s1.toLowerCase(), s2.toLowerCase());
	}
	
	public static int countString(String s1, String s2)
	{		
		int count = 0;
		
		for (int i = 0; (i = s1.indexOf(s2, i)) != -1; ++i, ++count)
			;		

		return count;
	}
}
```

>`String` sınıfının `lastIndexOf` metotları sondan itibaren ilk bulunan yazı veya karaktere ilişkin indeks numarasına geri dönerler. Bu metotlar da bulamadıkları durumda -1 değerine geri dönerler

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		String text = "Bugün hava çok güzel, çok çok güzel";
		String s = "çok";
		
		System.out.println(text.lastIndexOf(s));
		System.out.println(text.lastIndexOf(s, 12));		
		System.out.println(text.lastIndexOf(s, 27));
	}
}
```

>**Sınıf Çalışması:** Aşağıdaki açıklamalara göre parametresi ile aldığı bir yol ifadesine (path) ilişkin dosyanın yalnızca ismine geri dönen `getFileName` isimli metodu yazınız.
>
>**Açıklamalar:**
>- Metot yol ifadesi geçerliliği yapmayacaktır.
>- Metot yol ifadesine `/` veya `\` karakterlerini kabul edecektir.
>- Yol ifadesi `/` ya da `\` içermiyorsa doğrudan yol ifadesini döndürecektir.
>- Örneğin yol ifadesi `C:/test/mest.dat` için elde edilen dosya ismi mest.dat olarak elde edilecektir. Ya da örneğin test gibi bir ifadesi için dosya ismi test olarak elde edilecektir.
>- Metodu `FileUtil` isimli bir sınıf içerisinde yazınız.
>- Bu işlemi JavaSE'de yapan türler ve metotlar kullanılmayacaktır.
>- Metodu klavyeden alınan yol ifadeleri ile test edebilirsiniz.
>
>Not: İleride daha iyisi yazılacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		FileUtilgetFileNameTest.run();
	}
}

class FileUtilgetFileNameTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input path:");
			String path = kb.nextLine();
			
			System.out.printf("File name:%s%n",FileUtil.getFileName(path));
			
			if ("quit".equals(path))
				break;
		}
	}
}

class FileUtil {
	public static String getFileName(String path)
	{
		int idx;
		
		idx = path.lastIndexOf('\\');		
	
		return idx != -1 ? path.substring(idx + 1) : path.substring(path.lastIndexOf('/') + 1);		
	}
}

```

##### IntegerDecimalOccurence

>String pattern matching in decimal representations of ints.
>
>Task description:\
>Two integers A and B are given. We are interested in positions at which decimal representation of A occurs as a substring in the decimal representation of B (counting from 0) For example:
>
>- 53 occurs in 1953786 at position 2.
>- 78 occurs in 1953786786 at positions 4 and 7
>- 57 does not occur in 153786.
>
>Decimal representations are assumed to be big-endian and without leading zeros (the only exception being the number 0, whose decimal representation is "0")
>
>Write function
>
>		class Solution { public int solution(int A, int B); }	
>that, given two integers A and B, returns the leftmost position at which A occurs in B the function should return -1 if A does not occur in B.
>
>For example, given A = 53 and B = 195378653, the function should return 2, as explained above.\
>Assume that:	
>- A and B are integers within the range `[0..999,999,999]`
>
>In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		SolutionTest.run();
	}
}

class SolutionTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input first number:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("Input second number:");
			int b = Integer.parseInt(kb.nextLine());
			
			Solution s = new Solution();
			
			System.out.printf("Position:%d%n", s.solution(a, b));
			
			if (a == 0 && b == 0)
				break;
		}
	}
}

class Solution { 
	public int solution(int A, int B)
	{
		return (B + "").indexOf(A + "");
	}
}
```

>Aşağıdaki örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		System.out.println("Java" + 10 + 11); //Java1011
		System.out.println(10 + 11 + "Java"); //21Java
	}
}
```

>**Anahtar Notlar:** Java'da aşağıdaki koşullardan birini sağlayan bir karakter whitespace karakterdir. Tersine whitespace bir karakter aşağıdaki koşullardan birini sağlar (if and only if):
>  	
>- Karakter "Unicode space" karakter ve "Non-breaking space" olmayan karakterlerdendir. Unicode space karakterler şunlardır:  Space Separator, Line Separator, Paragraph Separator. Bu karakterler UNICODE'da çeşitli kategorilerdir. Detaylar burada ele alınmayacaktır. Bu karakter Character sınıfının SPACE_SEPERATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR isimli static veri elemanları ile elde edilebilir. non-breaking space karakterler şunlardır: '\u00A0', '\u2007', '\u202F'
>
>		'\t' 		horizontal tabulation
>		'\n' 		line feed (LF)
>		'\u000B' 	vertical tabulation
>		'\f' 		form tabulation
>		'\r' 		carriage return (CR)
>		'\u001C' 	file separator
>		'\u001D' 	group separator
>		'\u001E' 	record separator
>		'\u001F' 	unit separator

>Bir karakter ile çeşitli işlemler yapan çeşitli metotların bulunduğu `Character` sınıfı aynı zamanda `String` sınıfına da yardımcı olarak kullanılabilmektedir. Sınıfın `isXXX` metotları parametresi aldığı karaktere ilişkin kontrol yaparlar. Bu metotlardan bazıları şunlardır:
>
>- `isWhitespace`: Karakterin whitespace karakter olup olmadığını test eder.
>- `isLetter`: Karakterin alfabetik olup olmadığını test eder.
>- `isDigit`: Karakterin bir sayısal karakter olup olmadığını test eder
>
>Sınıfın `toXXX` metotları parametresi ile aldığı karakteri dönüştürmekte kullanılır. Bu metotlardan bazıları şunlardır:
>- `toUpperCase`: Karakterin büyük harf karşılığını döndürür. Yoksa aynı karaktere geri döner
>- `toLowerCase`: Karakterin küçük harf karşılığını döndürür. Yoksa aynı karaktere geri döner
>
>Bu sınıfa ait bir metodun hem char hem de int paremetreli overload'ları bulunur. Bu durumda tüm karakterler yani sıra numarası 65535'den büyük olan karakterler için de işlem yapan metotlar bulunmaktadır.

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringCharactersReportApp.run();		
	}
}

class StringCharactersReportApp {
	public static void printReport(String s)
	{
		int len = s.length();
		int whitespaceCount = 0;
		int letterCount = 0;
		int digitCount = 0;		
		
		for (int i = 0; i < len; ++i) {
			char ch = s.charAt(i);
			
			if (Character.isWhitespace(ch))
				++whitespaceCount;			
			else if (Character.isLetter(ch))
				++letterCount;
			else if (Character.isDigit(ch))
				++digitCount;		
					
		}
		
		System.out.printf("Whitespace count:%d%n", whitespaceCount);
		System.out.printf("Letter count:%d%n", letterCount);
		System.out.printf("Digit count:%d%n", digitCount);
		System.out.printf("Others:%d%n", len - whitespaceCount - letterCount - digitCount);	
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			printReport(s);
			
			if ("quit".equals(s))
				break;
		}
	}
}
```

>**Sınıf Çalışması:** parametresi ile aldığı bir yazının ilk karakteri büyük diğer karakterleri küçük harf olan biçimine geri dönen `capitalize` isimli metodu `StringUtil` sınıfı içerisinde yazınız ve test ediniz. Örneğin yazı:
>
>		bugün hava ÇOK güzel
>ise elde edilecek yazı
>
>		Bugün hava çok güzel
>olacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilCapitalizeTest.run();		
	}
}

class StringUtilCapitalizeTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("(%s)%n", StringUtil.capitalize(s));
			
			if ("quit".equals(s))
				break;
		}
	}
}

class StringUtil {
	public static String capitalize(String s)
	{
		return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}
}
```

>`String` sınıfının `trim` metodu yazının başındaki (leading) ve sonundaki (trailing) boşluk karakterlerini atar. Bu metot `[\u0000, \u0020]` aralığındaki boşluk karakterleri için çalışır. Diğer whitespace karakterleri atmaz. `Java 11` ile birlikte tüm whitespace karakterler için çalışan yani yazının başındaki ve sonundaki whitespace karakterleri atan strip isimli bir metot eklenmiştir. Ayrıca `Java 11` ile birlikte yazının sadece başındaki whitespace karakterleri atan stripLeading ve sadece sonundaki boşluk karakterlerini atan stripLeading isimli metotlar da eklenmiştir. Java 11 öncesince yazının yalnızca başındaki veya yalnızca sonundaki boşluk karakterlerini atan metotlar bulunmamaktadır. `Java 11` öncesinde çalışıldığı durumda  bu tarz metotlar programcı tarafından yazılmalıdır.

**Anahtar Notlar:** Pratikte trim metodu çoğu zaman işimizi görse de bazı özel whitespace karakterler için çalışamamaktadır.
Bu sebeple `Java 11+` ile çalışıldığında trim metodu yerine her zaman strip metodu tercih edilmelidir. `Java 11` öncesinde
çalışılıyorsa strip gibi bir metot gerekirse programcı tarafından eklenebilir

>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", s.trim());
			System.out.printf("(%s)%n", s.strip());
			System.out.printf("(%s)%n", s.stripLeading());
			System.out.printf("(%s)%n", s.stripTrailing());
			
			if ("exit".equals(s))
				break;
		}
	}
}
```

#### 23 Temmuz 2024

>**_Sınıfı Çalışması:_** Aşağıda belirtilen metotları `StrigUtil` sınıfı içerisinde açıklamalara yazınız ve test ediniz.
>
>**Açıklamalar:**
>- Metotların prototipleri şunlardır:
>
>		public static String trim(String s);
>		public static String trimLeading(String s);
>		public static String trimTrailing(String s);
>		
>- Metotlar sırasıyla yazının başındaki ve sonundaki, yalnızca başındaki ve yalnızca sonundaki whitespace karakterleri atacaklardır.
>- Metotlar Java 11 öncesi için yazılacaktır. Yani `stripXXX` metotları kullanılmayacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilTrimMethodsTest.run();
	}
}

class StringUtilTrimMethodsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", StringUtil.trim(s));			
			System.out.printf("(%s)%n", StringUtil.trimLeading(s));
			System.out.printf("(%s)%n", StringUtil.trimTrailing(s));
			
			if ("exit".equals(s))
				break;
		}
	}
}

class StringUtil {
	public static String trim(String s)
	{
		return trimTrailing(trimLeading(s));
	}
	
	public static String trimLeading(String s)
	{
		int i = 0;
		
		for (; i < s.length() && Character.isWhitespace(s.charAt(i)); ++i)
			;
		
		return s.substring(i);
	}
	
	public static String trimTrailing(String s)
	{
		int i = s.length() - 1;
		
		for (; i >= 0 && Character.isWhitespace(s.charAt(i)); --i)
			;
		
		return s.substring(0, i + 1);
	}
}
```

>**_Sınıfı Çalışması:_** Parametresi ile aldığı yazının tersini döndüren `reverse` isimli metodu yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:** Metodun yazımında performansı (ya da daha genel bir deyişle hızı) düşünmenize gerek yoktur.
>	
>**Anahtar Notlar:** Aşağıdaki `reverse` metodunda String birleştirme işlemi sırasında sürekli String nesnesi yaratılıp referans da eski nesneden kopartılmaktadır. Burada bellek açısından bir sorun oluşmasa da nesne yaratılması bir maliyet oluşturur:
>
>		str += s.charAt(i)
>ifadesinin
>
>		str = (String)(str + s.charAt(i))
>ifadesine karşılık geldiğini anımsayınız
>	
>**_Not:_** Bu metodun daha hızlı olacak şekilde çözümleri ileride ele alınacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilReverseTest.run();
	}
}

class StringUtilReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("Reverse:%s%n", StringUtil.reverse(s));
			
			if ("exit".equals(s))
				break;
		}
	}
}

class StringUtil {
	public static String reverse(String s)
	{
		String str = "";
		
		for (int i = s.length() - 1; i >= 0; --i)
			str += s.charAt(i);
		
		return str;
	}
}
```

>String sınıfının immutable olmasının maliyetli olması durumunda string işlemleri için String sınıfına yardımcı StringBuilder isimli bir sınıf kullanılabilir. Bu sınıf immutable değildir. Bu sınıf yazı üzerinde değişiklik yapabilen pek çok yararlı metoda sahiptir. Ancak bu sınıf String sınıfına alternatif olarak düşünülmemelidir. Bu sınıf String sınıfına yardımcı bir sınıftır. StringBuilder sınıfının append metotları ile yazının sonuna ekleme	yapılabilir. toString metodu ile StringBuilder içerisindeki yazı String olarak elde edilebilir. Bu sınıfın diğer metotları bu kurs ve Uygulama kursları içerisinde kullanıldıkça ele alınacaktır. Bu sınıfın içsel detayları şu an için önemsizdir. Bu durumda Java programcısı yazı üzerinde değişiklik yapılacak durumların performansı etkilemesi halinde bu sınıfı kullanmalı, işlemlerin sonunda yine String olarak ilgili yazıyı elde etmelidir.
>	
>**Anahtar Notlar:** StringBuilder sınıfının pek çok metodu StringBuilder referansına geri döner. Yazı üzerinde değişiklik yapan metotlar aynı StringBuilder referansına geri döner. Bu şekildeki sınıflar ileride ele alacağımız "fluent pattern"'e uygun olarak yazılmışlardır.
>
>Aşağıdaki `changeCase` metodu parametresi ile aldığı yazının büyük harflerini küçük harfe, küçük harflerini de büyük harfe dönüştürmektedir. Alfabetik olmayan karakterler için herhangi bir işlem yapmamaktadır. Örnek String birleştirme kullanılarak şu şekilde yazılabilir.
		
```java
public static String changeCase(String s)
{
	String str = "";
	
	for (int i = 0; i < s.length(); ++i) {
		char c = s.charAt(i);
		
		str += Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
	}
	
	return str;
}
```
>StringBuilder kullanıldığındaki kod ile arasındaki farkı gözlemleyiniz.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilChangeCaseTest.run();
	}
}

class StringUtilChangeCaseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("%s%n", StringUtil.changeCase(s));
			
			if ("exit".equals(s))
				break;
		}
	}
}

class StringUtil {
	public static String changeCase(String s)
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			
			sb.append(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
		}
		
		return sb.toString();
	}
}
```

>`StringBuilder` sınıfının String parametreli ctor'u ile verilen yazıyı içeren bir StringBuilder nesnesi yaratılabilir. `setCharAt` metodu ile verilen bir indeksteki karakteri değiştirmek için kullanılır. Metoda indek olarak pozitif ya da negatif bakımdan sınırlar dışında bir değer geçilirse exception oluşur.
>
>Yukarıdaki changeCase metodu aşağıdaki gibi de yazılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilChangeCaseTest.run();
	}
}

class StringUtilChangeCaseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("%s%n", StringUtil.changeCase(s));
			
			if ("exit".equals(s))
				break;
		}
	}
}

class StringUtil {
	public static String changeCase(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			
			sb.setCharAt(i, Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
		}
		
		return sb.toString();
	}
}
```

>Aşağıdaki reverse metodunu inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilReverseTest.run();
	}
}

class StringUtilReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("Reverse:%s%n", StringUtil.reverse(s));
			
			if ("exit".equals(s))
				break;
		}
	}
}

class StringUtil {
	public static String reverse(String s)
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = s.length() - 1; i >= 0; --i)
			sb.append(s.charAt(i));
		
		return sb.toString();
	}
}
```

>`StringBuilder` sınıfının `reverse` metodu ile yazının tersi elde edilebilir. Aşağıdaki reverse metodunun en etkin ve compact yazımı Java'da aşağıdaki gibidir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilReverseTest.run();
	}
}

class StringUtilReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			System.out.printf("Reverse:%s%n", StringUtil.reverse(s));
			
			if ("exit".equals(s))
				break;
		}
	}
}

class StringUtil {
	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
}
```

>`String` sınıfına `Java 11` ile birlikte `repeat` isimli bir metot eklenmiştir. Bu metot parametresi ile adığı değer kadar ilgili yazıyı çoklar

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.print("Input count:");
			int count = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%s%n", s.repeat(count));			
		}
	}
}
```

>`String` sınıfına `Java 11` ile birlikte `isBlank` isimli bir metot eklenmiştir. Bu metot yazının tamamının whitespace karakterlerden oluşup oluşmadığını veya boş string olup olmadığını test eder.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.println(s.isBlank() ? "Blank string" : "Not a blank string");			
		}
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı bir yazının pangram olup olmadığını test eden `isPangramTR` ve `isPangramEN` isimli metotları yazınız ve aşağıdaki kod ile test ediniz.
>
>**Açıklamalar:**
>- İlgili dilin alfabesindeki tüm karakterler kullanılarak oluşturulan ve içerisinde özel isim olmayan anlamlı 
cümlelere "pangram" denir. 
Örneğin tipik bir İnglizce pangram şudur:	
>	
>		The quick brown fox jumps over the lazy dog.
>Örneğin tipik bir Türkçe pangram şudur:
>
>		Pijamalı hasta yağız şoföre çabucak güvendi.
>- Metotlar, cümlenin anlamına ve özel isim içerip içermediğine bakmayacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilIsPangramTest.run();
	}
}

class StringUtilIsPangramTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		StringUtilIsPangramTRTest.run(kb);
		StringUtilIsPangramENTest.run(kb);
	}
}

class StringUtilIsPangramTRTest {
	public static void run(java.util.Scanner kb)
	{
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramTR(s) ? "Pangram" : "Pangram değil");			
		}
	}
}

class StringUtilIsPangramENTest {
	public static void run(java.util.Scanner kb)
	{		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a pangram");			
		}
	}
}

class StringUtil {
	public static boolean isPangram(String s, String alphabet)
	{
		for (int i = 0; i < alphabet.length(); ++i)
			if (s.indexOf(alphabet.charAt(i)) == -1)
				return false;
		
		return true;
	}
	
	public static boolean isPangramTR(String s)
	{
		return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
	}
	
	public static boolean isPangramEN(String s)
	{
		return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuvwxyz");
	}
}
```

>Yukarıdaki örnekte yalnızca `isPangramEN` yazılacak olsaydı `ASCII` karakter tablosundan faydalanılarak aşağıdaki gibi yazılabilirdi. Şüphesiz yukarıdaki `isPangram` metodu daha genel yazılmıştır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilIsPangramENTest.run();
	}
}

class StringUtilIsPangramENTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a pangram");			
		}
	}
}

class StringUtil {
	
	public static boolean isPangramEN(String s)
	{
		s = s.toLowerCase();
		 
		for (char c = 'a'; c <= 'z'; ++c)
			if (s.indexOf(c) == -1)
				return false;
		
		return true;
	}
}
```

>Yukarıdaki örnek aşağıdaki gibi de yazılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilIsPangramENTest.run();
	}
}

class StringUtilIsPangramENTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a pangram");			
		}
	}
}

class StringUtil {
	public static boolean isPangramEN(String s)
	{
		s = s.toLowerCase();
		
		for (int i = 0; i < 26; ++i) 
			if (s.indexOf((char)('a' + i)) == -1)
				return false;
		
		return true;
	}
}
```

>Yukarıdaki örnek aşağıdaki gibi de yazılabilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilIsPangramENTest.run();
	}
}

class StringUtilIsPangramENTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a pangram");
		}
	}
}

class StringUtil {
	
	public static boolean isPangramEN(String s)
	{
		s = s.toLowerCase();
		
		for (int i = 0; i < 26; ++i) 
			if (s.indexOf('a' + i) == -1)
				return false;
		
		return true;
	}
}
```

#### 25 Temmuz 2024

>**Sınıf Çalışması:** Aşağıdaki metotları açıklamalara göre StringUtil sınıfı içerisinde yazınız ve test ediniz.
>
>		public static String padLeading(String s, int n, char ch);
>		public static String padLeading(String s, int n);
>		public static String padTrailing(String s, int n, char ch);
>		public static String padTrailing(String s, int n);
>
>**Açıklamalar:** 
>- padLeading metodunun üç parametreli overload'u parametresi ile aldığı yazıyı ikinci parametresi ile aldığı
uzunluk kadar baştan ch karakteri ile besleyecektir. İkinci parametresi ile aldığı uzunluk bilgisi ilgili 
yazının uzunluğundan küçük veya eşit aynı yazıya geri dönecektir. 
>
>Örneğin:\
>`padLeading("ankara", 8, 'x');`\
>çağrısı ile\
>`xxankara`\
>yazısı elde edilecektir.
>
>Örneğin:\
>`padLeading("ankara", 5, 'x');`\
>çağrısı ile\
>`ankara`\
>yazısı elde edilecektir.
>
>- padLeading metodunun iki parametreli overload'u yazıyı space karakteri ile besleyecektir.
>- padTrailing metotları padLeading'in yaptıklarını sondan besleyecek şekilde yapacaktır.
>- Metotlar Java 11 öncesi için yazılacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilPadLeadingTrailingTest.run();
	}
}

class StringUtilPadLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input text:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.print("Input count:");
			int count = Integer.parseInt(kb.nextLine());
			
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count));
		}
	}
}

class StringUtil {
	public static String padLeading(String s, int n, char ch)
	{
		int len = s.length();
		
		return len < n ? repeat(n - len, ch) + s : s;
	}
	
	public static String padLeading(String s, int n)
	{
		return padLeading(s, n, ' ');
	}
	
	public static String padTrailing(String s, int n, char ch)
	{
		int len = s.length();
		
		return len < n ? s + repeat(n - len, ch) : s;
	}
	
	public static String padTrailing(String s, int n)
	{
		return padTrailing(s, n, ' ');
	}
	
	public static String repeat(int n, char ch)
	{		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; ++i)
			sb.append(ch);
		
		return sb.toString();
	}
}
```

>**Sınıf Çalışması:** Aşağıdaki metotları açıklamalara göre StringUtil sınıfı içerisinde yazınız ve test ediniz.
>
>		public static String padLeading(String s, int n, char ch);
>		public static String padLeading(String s, int n);
>		public static String padTrailing(String s, int n, char ch);
>		public static String padTrailing(String s, int n);
>
>**Açıklamalar:**
>- padLeading metodunun üç parametreli overload'u parametresi ile aldığı yazıyı ikinci parametresi ile aldığı uzunluk kadar baştan ch karakteri ile besleyecektir. İkinci parametresi ile aldığı uzunluk bilgisi ilgili yazının uzunluğundan küçük veya eşit aynı yazıya geri dönecektir.
>
>Örneğin:\
>`padLeading("ankara", 8, 'x');`\
>çağrısı ile\
>`xxankara`\
>yazısı elde edilecektir.
>
>Örneğin:\
>`padLeading("ankara", 5, 'x');`\
>çağrısı ile\
>`ankara`\
>yazısı elde edilecektir.
>
>- padLeading metodunun iki parametreli overload'u yazıyı space karakteri ile besleyecektir.
>- padTrailing metotları padLeading'in yaptıklarını sondan besleyecek şekilde yapacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilPadLeadingTrailingTest.run();
	}
}

class StringUtilPadLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input text:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.print("Input count:");
			int count = Integer.parseInt(kb.nextLine());
			
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count));
		}
	}
}

class StringUtil {
	public static String padLeading(String s, int n, char ch)
	{
		int len = s.length();
		
		return len < n ? (ch + "").repeat(n - len) + s : s;
	}
	
	public static String padLeading(String s, int n)
	{
		return padLeading(s, n, ' ');
	}
	
	public static String padTrailing(String s, int n, char ch)
	{
		int len = s.length();
		
		return len < n ? s + (ch + "").repeat(n - len) : s;
	}
	
	public static String padTrailing(String s, int n)
	{
		return padTrailing(s, n, ' ');
	}
}
```

>`String` sınıfının static `valueOf` metotları temel bir türe ilişkin değerin yazı karşılığını elde etmekte kullanılır.
	
**Anahtar Notlar:** Aldığı parametreleri kullanarak bir nesnenin referansına geri dönen bir metoda "factory method" denir. Factory bir metot ilgili sınıfa aitse static olarak bildirilir. Bu anlamda valueOf metodu bir factory metottur. 

**Anahtar Notlar:** JavaSE'de bazı sınıfların çeşitli `factory metotları` bulunur. Java 8'e kadar bu tarz metotların isimlendirilmesinde genel olarak "valueOf" kullanılırken, `Java 8` ve sonrasında "of" ismi kullanılmaktadır. Bu anlamda bazı sınıfların `valueOf` veya `of` gibi factory metotları bulunur. Şüphesiz farklı isimlerde factory metotları olan sınıflar da vardır. 
	
>Aşağıdaki örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilPadLeadingTrailingTest.run();
	}
}

class StringUtilPadLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input text:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.print("Input count:");
			int count = Integer.parseInt(kb.nextLine());
			
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padLeading(s, count));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count, 'x'));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, count));
		}
	}
}

class StringUtil {
	public static String padLeading(String s, int n, char ch)
	{
		int len = s.length();
		
		return len < n ? String.valueOf(ch).repeat(n - len) + s : s;
	}
	
	public static String padLeading(String s, int n)
	{
		return padLeading(s, n, ' ');
	}
	
	public static String padTrailing(String s, int n, char ch)
	{
		int len = s.length();
		
		return len < n ? s + String.valueOf(ch).repeat(n - len) : s;
	}
	
	public static String padTrailing(String s, int n)
	{
		return padTrailing(s, n, ' ');
	}
}
```

>`String` sınıfının `contains` metodu bir yazı içerisinde parmetesi ile aldığı yazının var olup olmadığını test eder. Metodun geri dönüş değeri boolean türündendir
	
**Anahtar Notlar:** `contains` metodunun parametresi `CharSequence` türündendir. `CharSequence` gereken yerlerde String referansı verilebilir. Detaylar ileride ele alınacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilIsPangramTest.run();
	}
}

class StringUtilIsPangramTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		StringUtilIsPangramTRTest.run(kb);
		StringUtilIsPangramENTest.run(kb);
	}
}

class StringUtilIsPangramTRTest {
	public static void run(java.util.Scanner kb)
	{
		while (true) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramTR(s) ? "Pangram" : "Pangram değil");			
		}
	}
}

class StringUtilIsPangramENTest {
	public static void run(java.util.Scanner kb)
	{		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a pangram");			
		}
	}
}

class StringUtil {
	public static boolean isPangram(String s, String alphabet)
	{
		for (int i = 0; i < alphabet.length(); ++i)
			if (!s.contains(String.valueOf(alphabet.charAt(i))))
				return false;
		
		return true;
	}
	
	public static boolean isPangramTR(String s)
	{
		return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
	}
	
	public static boolean isPangramEN(String s)
	{
		return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuvwxyz");
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı bir yazının palindrome olup olmadığını test eden `isPalindrome` isimli metodu `StringUtil` sınıfı içerisinde yazınız ve test ediniz.
>
>**Açıklamalar:**
>- Alfabetik olmayan karakterleri çıkartıldığında tersi kendisine eşit olan yazılara pandrom denir.
Örneğin
>
>		Ey Edip Adana'da pide ye
>		Anastas mum satsana
>		Ali Papila
>- Palindromlar case-insensitive'dir

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
		StringUtilIsPalindromeTest.run();
	}
}

class StringUtilIsPalindromeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input string:");
			String s = kb.nextLine();
			
			if ("exit".equals(s))
				break;
			
			System.out.println(StringUtil.isPalindrome(s) ? "Palindrome" : "Not a palindrome");				
		}
	}
}

class StringUtil {
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			char cLeft = s.charAt(left);
			
			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}
			
			char cRight = s.charAt(right);
			
			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}
			
			if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight))
				return false;
			
			++left;
			--right;
		}
		
		return true;		
	}
}
```

**Anahtar Notlar:** `java.util.Scanner` sınıfının çalışma sistemi gereği bazı sistemlerde aynı nesne ile `nextLine` ve temel türlere ilişkin `nextXXX` metotları peşpeşe kullanılmamalıdır. Bu Scanner açısından bir problem değildir, Scanner'ın içsel çalışması ile ilgili sistemin içsel yapısı gereği oluşan bir sonuçtur. Detayının önemi yoktur. Programcı bu tip durumlarda hep `nextLine` metoduyla değerleri alması ve temel türler için ilgili `parseXXX` metotlarını çağırmalıdır.

>Aşağıdaki demo örnek bazı sistemlerde doğru çalışmayacaktır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input name:");
			String name = kb.nextLine();
			
			if ("exit".equals(name))
				break;
			
			System.out.print("Input number:");
			int no = kb.nextInt();
			
			System.out.printf("%d, %s%n", no, name);
		}		
	}
}
```

>Yukarıdaki örnek aşağıdaki gibi yazılmalıdır

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input name:");
			String name = kb.nextLine();
			
			if ("exit".equals(name))
				break;
			
			System.out.print("Input number:");
			int no = Integer.parseInt(kb.nextLine());
			
			System.out.printf("%d, %s%n", no, name);
		}		
	}
}
```

#### 30 Temmuz 2024

>Anahtar Notlar: JavaSE'de her temel türe ilişkin sınıflar bulunur. Bu sınıflara "sarmalayan sınıflar (wrapper classes)" denir. Sarmalayan sınıfların ilişkin oldukları temel türe yönelik pek çok yardımcı metotları vardır. Temel tür ve ilgili sarmalayan sınıflar şunlardır:
		
|Temel Tür	|	Sarmalayan sınıf|
|-----------|-------------------|
|short		|	Short			|
|int		|	Integer			|
|long		|	Long			|
|byte		|	Byte			|
|			|					|
|float		|	Float			|
|double		|	Double			|
|			|					|
|char		|	Character		|
|boolean	|	Boolean			|

>Sarmalayan sınıflara ilişkin kullanım detayları ileride ele alınacaktır.

>`Character` sınıfı dışında kalan sınıfların (yani nümerik türlere ilişkin sarmalayan sınıfların) `parseXXX` metotları aldıkları yazıyı ilgili temel türe dönüştürme işleminde kullanılır. `Boolean` sınıfının `parseBoolean` metodu dışındaki diğer `parseXXX` metotları aldıkları yazı ilgili türe dönüştürülemiyorsa exception oluştururlar (fırlatırlar). `parseBoolean` metodu aldığı yazı case-insensitive olarak true değilse false değerine geri döner.
	
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir tamsayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("Bir gerçek sayı giriniz:");
			double b = Double.parseDouble(kb.nextLine());
			
			System.out.printf("a = %d, b = %f%n", a, b);
		
			System.out.printf("Çıkmak etmek için büyük küçük harf duyarsız true giriniz:");
			boolean exitFlag = Boolean.parseBoolean(kb.nextLine());
			
			if (exitFlag)
				break;
		}		
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}
```

>`String` sınıfının `startsWith` metodu ilgili yazının parametresi ile aldığı yazı ile başlayıp başlamadığını test etmek için kullanılır
>
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Web Adresi giriniz:");
			String address = kb.nextLine();
			
			if (address.equals("elma"))
				break;
			
			if (!address.startsWith("http://"))
				address = "http://" + address;
			
			System.out.println(address);
		}							
	}
}
```

>`String` sınıfının `endsWith` metodu ilgili yazının parametresi ile aldığı yazı ile bitip bitmediğini test etmek için kullanılır
>	
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{		
	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Email bilgisini giriniz:");
			String email = kb.nextLine();
			
			if (email.equals("elma"))
				break;
			
			if (!email.endsWith(".com"))
				email += ".com";
			
			System.out.println(email);
		}							
	}
}
```

>`String` sınıfının `format` isimli static metodu `printf` metodu gibi çalışır. ekrana basmak yerine formatlanmış yazıya geri döner.
>
>Aşağıdaki demo örneği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Email bilgisini giriniz:");
			String email = kb.nextLine();
			
			if (email.equals("elma"))
				break;
			
			if (!email.endsWith(".com"))
				email += ".com";
			
			String message = String.format("Email:%s", email);
			
			System.out.println(message);
		}							
	}
}
```

>Complex sınıfının toString metodu

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Complex z1 = new Complex(3, 4);
		Complex z2 = new Complex(-5.6, 9.67);
		Complex z = z1.add(z2);
		
		String str = z.toString();
		
		System.out.println(str);
	}
}

class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return new Complex(re1 + re2, im1 + im2);
	}
	
	public static Complex subtract(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return add(re1, im1, -re2, -im2);		
	}
	
	public Complex()
	{		
	}
	
	public Complex(double a)
	{
		real = a;		
	}
	
	public Complex(double a, double b)
	{
		real = a;
		imag = b;
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}	
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	public void inc(double val)
	{
		real += val;
	}
	
	public void inc()
	{
		inc(1);
	}
	
	public void dec(double val)
	{
		inc(-val);
	}
	
	public void dec()
	{
		dec(1);
	}
	
	public Complex getConjugate()
	{				
		return new Complex(real, -imag);
	}
	
	public double getNorm()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double getLength()
	{
		return getNorm();
	}	
	
	public String toString()
	{
		return String.format("(%.2f, %.2f)", real, imag);
	}
}
```

>Point sınıfının toString metodu

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Point p1 = new Point();
		Point p2 = new Point(100, -456);
		
		String str1 = p1.toString();
		String str2 = p2.toString();
		
		System.out.println(str1);
		System.out.println(str2);
	}
}

class Point {
	public double x;
	public double y;

	public Point()
	{		
	}

	public Point(double a)
	{
		x = a;		
	}
	
	public Point(double a, double b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}	
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", x, y);
	}
}
```

>`String` sınıfına `Java 15` ile birlikte `formatted` isimli bir metot eklenmiştir. Bu metot format metodunun non-static versiyonu olarak düşünülebilir. Bu durumda programcının `Java 15` ve üzerinde yani pratikte `Java 17+` ile çalışıyorsa `format` metodu yerine bu metodu çağırması uygundur
>
>Aşağısdaki demo önreği inceleyiniz

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Email bilgisini giriniz:");
			String email = kb.nextLine();
			
			if (email.equals("elma"))
				break;
			
			if (!email.endsWith(".com"))
				email += ".com";
			
			String message = "Email:%s".formatted(email);
			
			System.out.println(message);
		}							
	}
}
```

>Complex sınıfının toString metodu

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Complex z1 = new Complex(3, 4);
		Complex z2 = new Complex(-5.6, 9.67);
		Complex z = z1.add(z2);
		
		String str = z.toString();
		
		System.out.println(str);
	}
}

class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return new Complex(re1 + re2, im1 + im2);
	}
	
	public static Complex subtract(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return add(re1, im1, -re2, -im2);		
	}
	
	public Complex()
	{		
	}
	
	public Complex(double a)
	{
		real = a;		
	}
	
	public Complex(double a, double b)
	{
		real = a;
		imag = b;
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}	
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	public void inc(double val)
	{
		real += val;
	}
	
	public void inc()
	{
		inc(1);
	}
	
	public void dec(double val)
	{
		inc(-val);
	}
	
	public void dec()
	{
		dec(1);
	}
	
	public Complex getConjugate()
	{				
		return new Complex(real, -imag);
	}
	
	public double getNorm()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double getLength()
	{
		return getNorm();
	}	
	
	public String toString()
	{
		return "(%.2f, %.2f)".formatted(real, imag);
	}
}
```

>Point sınıfının toString metodu

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		Point p1 = new Point();
		Point p2 = new Point(100, -456);
		
		String str1 = p1.toString();
		String str2 = p2.toString();
		
		System.out.println(str1);
		System.out.println(str2);
	}
}

class Point {
	public double x;
	public double y;

	public Point()
	{		
	}

	public Point(double a)
	{
		x = a;		
	}
	
	public Point(double a, double b)
	{
		x = a;
		y = b;
	}
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}	
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return "(%f, %f)".formatted(x, y);
	}
}
```

>`String` sınıfının iki tane `char` parametreli `replace` metodu, birinci parametresi verilen karakterleri, ikinci parametresi ile verilen karakter ile değiştirir. Benzer şekilde iki `CharSequence` parametreli replace metodu, birinci parametresi verilen yazıları, ikinci parametresi ile verilen yazı ile değiştirir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		String s1 = "ankara";
		String s2 = "Bugün hava çok sıcak. Bu sıcak havada ders mi yapılır!...";
		
		System.out.println(s1.replace('a', 'b'));
		System.out.println(s2.replace("sıcak", "çok soğuk"));
	}
}
```

>`String` sınıfının `compareTo` metodu
>
>		result = a.compareTo(b)
>işlemi için şu şekilde çalışır:
>
>		result > 0 <=> a yazısı b yazısından sonra gelir
>		result == 0 <=> a yazısı b yazısı ile özdeştir (equals)
>		result < 0 <=> a yazısı b yazısından önce gelir
>Buradaki karşılaştırma "lexicographically" olarak yapılır. Detaylar gözardı edilirse, bu karşılaştırmaya genel olarak karakter tablosunda göre karşılaştırma denebilir

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		System.out.println("ankara".compareTo("Ankara"));
		System.out.println("Ankara".compareTo("ankara"));
		System.out.println("ankara".compareTo("ankara"));
		System.out.println("bursa".compareTo("izmir"));
		System.out.println("ozan".compareTo("oğuz"));
		System.out.println("ozan".compareTo("oguz"));
	}
}
```

>`String` sınıfının `compareToIgnoreCase` metodu karşılaştırma işlemini case-insensitive olarak yapar

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		System.out.println("ankara".compareToIgnoreCase("Ankara"));
		System.out.println("Ankara".compareToIgnoreCase("ankara"));	
	}
}
```

>**Sınıf Çalışması:** Aşağıdaki metodu açıklamalara göre yazınız.
>
>		public static String repeat(int count, char ch);
>**Açıklamalar:**
>- Metot StringUtil sınıfı içerisinde yazılacaktır.
>- Metot yazılırken döngü kullanılmayacaktır.
>- String sınıfının repeat metodu kullanılmayacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		System.out.println(StringUtil.repeat(4, 'c'));	
	}
}

class StringUtil {
	public static String repeat(int count, char ch)
	{
		return String.format("%0" + count + "d", 0).replace('0', ch);
	}
}
```

>**Sınıf Çalışması:** Aşağıdaki metodu açıklamalara göre yazınız.
>
>		public static String repeat(int count, char ch);
>**Açıklamalar:**
>- Metot StringUtil sınıfı içerisinde yazılacaktır.
>- Metot yazılırken döngü kullanılmayacaktır.
>- String sınıfının repeat metodu kullanılmayacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		System.out.println(StringUtil.repeat(4, 'c'));	
	}
}

class StringUtil {
	public static String repeat(int count, char ch)
	{
		return String.format("%" + count + "c", ' ').replace(' ', ch);
	}
}
```

>**Sınıf Çalışması:** Aşağıdaki metodu açıklamalara göre yazınız.
>
>		public static String repeat(int count, char ch);
>**Açıklamalar:**
>- Metot StringUtil sınıfı içerisinde yazılacaktır.
>- Metot yazılırken döngü kullanılmayacaktır.
>- String sınıfının repeat metodu kullanılmayacaktır.

```java
package csd;

class App {
	public static void main(String [] args) 
	{	
		System.out.println(StringUtil.repeat(4, 'c'));	
	}
}

class StringUtil {
	public static String repeat(int count, char ch)
	{
		return ("%0" + count + "d").formatted(0).replace('0', ch);
	}
}
```

**Anahtar Notlar:** String sınıfına ilişkin diğer metotlar konular içerisinde ele alınacaktır.

**Anahtar Notlar:** `Java 13` ile birlikte "Text block" denilen bir String literal dile eklenmiştir. Buna göre bir String sabiti """ ve """ arasında yazılabilmektedir. Text block detaylı bir konudur ve ileride ayrı bir bölüm olarak ele alınacaktır.

#### 1 Ağustos 2024- 6 Ağustos 2024

##### Paketler ve İsim Arama (Packages and Name Lookup)

>Anımsanacağı gibi bir Java programı genel olarak paketlerden oluşur. Java kodlarını içeren ve genel olarak `.java` uzantılı olarak derlenen dosyalara "derleme birimi (translation/compilation unit) denir". Java'da her User Defined Type (UDT) ayrı bir derleme birimi olarak düşünülebilir.
>
>Paketlere ilişkin detaylar:
>- `javac` her UDT için bir ".class" uzantılı dosya üretir. İşte bu dosyalara "byte code (BC)" denir. 
>- UDT'ler aynı derleme biriminde olsalar bile her biri için ayrı BC üretilir. 
>- Bir UDT herhangi bir pakette olabilir. Bir proje içerisindeki UDT'lerin aynı pakette olması gerekmez.
>- Bir ".class" uzantılı dosyaya ilişkin UDT'nin başka derleme biriminden kullanılabilmesi için UDT'nin ait olduğu paketle aynı isimde bir dizinde (directory) olması gerekir. Java IDE'leri bu işlemi otomatik olarak yaparlar. Yani BC'yi uygun yerinde üretirler. Derleme birimleri için böyle bir zorunluluk yoktur ancak Java'da kullanılan IDE'lerin hemen hepsi derleme birimleri için de pakete ilişkin directory'de olma zorunluluğu tutar.
>- Bir UDT'nin ismine bulunduğu paket dışından paket ismi ve nokta operatörü ile erişilebilir. Bir UDT'ye bulunduğu paket dışından erişilebilmesi için public olarak bildirilmesi gerekir. public olarak bildirilmeyen yani yalnızca kendi paketi içerisinden erişilebilen UDT'ler için "friendly" terimi kullanılır. Bazı kaynaklar `friendly` terimi yerine "internal" terimini de kullanırlar.
>- Farklı paketlerde bulunan UDT'lerin BC'lerinin, bulunduğu pakete ilişkin dizinlerin, yani kodda paketi belirtilen dizinin, uygulamanın çalışmaya başladığı yerde olması gerekir. Bu durumda tüm paketler burada bulundurulmalıdır
>- Uygulamada kullanılan sınıflar içerisinde bir tane main metodu olmak zorunda değildir. java programına verilen sınıfın uygun main metodu çalıştırılır. main metodunun prototipi aşağıdaki gibi olmalıdır:
>
>		public static void main(String [] args);
>Bu prototipte uygunluğu bozmayacak tek değişiklik parametre ismi olan args'ta yapılabilir. Java programına verilen sınıfın `main` metodunun bu prototipe sahip olması zorunludur. Aksi durumda exception oluşur. Akışın başladığı main metoduna "entry point" dendiğini anımsayınız. Entry point olarak belirlenen main metodunun ait olduğu UDT kesinlikle bir sınıf olmalıdır.
>
>**Anahtar Notlar:** `Java 21` ile birlikte entry point olarak belirlenen main metodunun yapısına ilişkin bazı esnek kullanımlar söz konusu olmaktadır. Bu durum "uygulama kurslarında" ele alınacaktır.
>- `public` olarak bildirilen bir UDT, ismi ile aynı isimde bir `.java` dosyasında olmalıdır. Aksi durumda error oluşur. Bu durumda bir java dosyası içerisinde ancak dosya ismi ile aynı isimde bir UDT `public` olabilir
>- Bir java dosyasında dosya ile aynı isimde olan bir UDT olmak zorunda değildir. Ancak bu durum pratikte çok kullanılmaz
>- Paket bildirimi tüm bildirimlerden önce olmalıdır. Dolayısıyla bir java dosyasında bir tane paket bildirimi yapılabilir
>- Birden fazla `.java` dosyasında aynı isimde paket bildirimi yapılabilir. Bu durumda bu dosyalardaki tüm UDT'ler **aynı pakette** bildirilmiş olur
>- Bir paket içerisinde **aynı** isimde birden fazla UDT bildirimi **geçersizdir**
>- Farklı paketler içerisinde aynı isimde UDT bildirimleri geçerlidir. Bu UDT'ler isimleri aynı olsa da aslında farklı türlerdir
>- Bir paketin `alt paketleri` olabilir. Alt paket bildiriminin genel biçimi şu şekildedir:

		package <paket ismi>[.<alt paket ismi>.<alt paket ismi>...];
>Alt paket içerisindeki UDT'lerin byte code'ları paket hiyerarşisinde uygun alt dizinde bulunmalıdır. Yine IDE programlar bunu otomatik olarak yaparlar.
>- Paketler içiçe bile olsa farklı paketlerdir. Yani örneğin `arman` paketi içerisinde `SerialPort` isimli bir sınıf varsa, `arman.util` paketi içerisinde de `SerialPort` isimli bir sınıf olabilir. Çünkü paketler **farklıdır** ve isim çakışması oluşmaz
>- Paketler isim çakışmasını engellemek için düşünülmüştür. Paketler ile farklı firmalar kendi paket isimleriyle UDT yazdıklarında UDT'lerin isimleri aynı olsa bile diğerleriyle birlikte aynı projede kullanılabilirler
>- Paket isimleri genelde bir firmaya özgü tekil (unique) bir olan domain isminden türetilir. Örneğin CSD'nin paketleri domain ismi "csystem.org" olduğundan "org.csystem" paketi altında yazılır. Bu bir **convention**'dır ve firmalar özellikle bu kurala genel UDT'ler için mutlaka uyarlar. Pratikte domain ismi altında doğrudan bir UDT bildirilmez. En az bir tane paket altında bildirilir. Yani aslında bu convention'da domain ismi taban paket (base package) olarak kullanılır. Programcının bir UDT'yi koyacağı paketi okunabilir/algılanabilir ve isim çakışma olasığını en aza olacak şekilde belirler. Bu anlamda alt paketlerin fazla olması bir sorun oluşturmaz. Paket isimlendirmede programcı anlamlı olacak şekilde cömert olmalıdır.
>- Paket isimleri bir convention olarak **tamamı küçük harf** olacak şekilde bildirilir. Birden fazla kelimeden oluşuyorsa **bitişik** olarak yazılır. Örnğin:
>
>		org.csystem.util.net
>		org.csystem.util.mapoperations
>- `JavaSE` içerisindeki tüm paketler ve UDT'ler `java` isimli bir paket altında bildirilmiştir. Bu anlamda programcının `java` paketi altında bir bildirim yapması tavsiye edilmez. Zaten yıkarıdaki domain ismi convention'ına uyulduğunda böyle bir durum da oluşmaz
>- `java.lang` paketi içerisindeki tüm UDT'ler her yerden görülebilirdir. Yani bu paket içerisindeki UDT isimleri doğrudan kullanılabilir. Ayrıca belirtilmesi gerekmez. Bu UDT'ler ileride göreceğimiz "import bildirimi (import declaration)" yapılmasına gerek yoktur. Örneğin `System`, `String`, `Integer`, `Double` sınıfları `java.lang` paketi altında bildirilmiştir
>- Hiç bir paket altında bildirilmeyen UDT'ler **isimsiz paket** (unnamed package) içerisinde bildirilmiş olur. Pratikte bir uygulama içerisinde isimsiz paket altında bir UDT bildirimi yapılmaz. Bunun nedeni ileride ele alınacaktır

```java
/**
 * Point class that represents a point in geometry
 * Last Update: 6th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

public class Point {
	public double x;
	public double y;

	public Point()
	{
	}

	public Point(double a)
	{
		x = a;
	}

	public Point(double a, double b)
	{
		x = a;
		y = b;
	}

	public double distance()
	{
		return distance(0, 0);
	}

	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}

	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}

	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}

	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}

	public String toString()
	{
		return "(%f, %f)".formatted(x, y);
	}
}
```

```java
/**
 * Point class that represents a point in geometry
 * Last Update: 6th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

public class Point {
	public double x;
	public double y;

	public Point()
	{
	}

	public Point(double a)
	{
		x = a;
	}

	public Point(double a, double b)
	{
		x = a;
		y = b;
	}

	public double distance()
	{
		return distance(0, 0);
	}

	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}

	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}

	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}

	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}

	public String toString()
	{
		return "(%f, %f)".formatted(x, y);
	}
}
```

#### 8 Ağustos 2024

```java
/**
 * Utility class for numeric operations
 * Last Update: 8th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.numeric;

public class NumberUtil {
	public static int countDigits(int a)
	{
		return a != 0 ? (int) Math.log10(Math.abs(a)) + 1 : 1;
	}

	public static long factorial(int n)
	{
		long result = 1;

		for (long i = 2; i <= n; ++i)
			result *= i;

		return result;
	}

	public static int fibonacciNumber(int n)
	{
		if (n <= 2)
			return n - 1;

		int prev1 = 1, prev2 = 0, result = prev1 + prev2;

		for (int i = 3; i < n; ++i) {
			prev2 = prev1;
			prev1 = result;
			result = prev1 + prev2;
		}

		return result;
	}

	public static int getDigitsPowSum(int a)
	{
		int result = 0;
		int n = countDigits(a);

		while (a != 0) {
			result += (int)Math.pow(a % 10, n);
			a /= 10;
		}

		return result;
	}

	public static boolean isArmstrong(int a)
	{
		return a >= 0 && getDigitsPowSum(a) == a;
	}

	public static boolean isEven(int a)
	{
		return a % 2 == 0;
	}

	public static boolean isOdd(int a)
	{
		return !isEven(a);
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

	public static long nextClosestPrime(long a)
	{
		if (a < 2)
			return 2;

		while (!isPrime(++a))
			;

		return a;
	}

	public static int nextFibonacciNumber(int val)
	{
		if (val < 0)
			return 0;

		int prev1 = 1, prev2 = 0, next = prev1 + prev2;

		while (next <= val) {
			prev2 = prev1;
			prev1 = next;
			next = prev1 + prev2;
		}

		return next;
	}

	public static long nthPrime(int n)
	{
		long result = 2;
		int count = 0;

		for (long i = 2; count < n; ++i)
			if (isPrime(i)) {
				++count;
				result = i;
			}
		return result;
	}

	public static int reverse(int val)
	{
		int result = 0;

		while (val != 0) {
			result = result * 10 + val % 10;
			val /= 10;
		}

		return result;
	}

	public static int sumDigits(int val)
	{
		int total = 0;

		while (val != 0) {
			total += val % 10;
			val /= 10;
		}

		return Math.abs(total);
	}
}
```

```java
/**
 * Utility class for string operations
 * Last Update: 8th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.string;

public class StringUtil {
	public static String capitalize(String s)
	{
		return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}

	public static String changeCase(String s)
	{
		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);

			sb.setCharAt(i, Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
		}

		return sb.toString();
	}

	public static int countString(String s1, String s2)
	{
		int count = 0;

		for (int i = 0; (i = s1.indexOf(s2, i)) != -1; ++i, ++count)
			;

		return count;
	}

	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			char cLeft = s.charAt(left);

			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}

			char cRight = s.charAt(right);

			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}

			if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight))
				return false;

			++left;
			--right;
		}

		return true;
	}

	public static boolean isPangram(String s, String alphabet)
	{
		for (int i = 0; i < alphabet.length(); ++i)
			if (s.indexOf(alphabet.charAt(i)) == -1)
				return false;

		return true;
	}

	public static boolean isPangramEN(String s)
	{
		s = s.toLowerCase();

		for (char c = 'a'; c <= 'z'; ++c)
			if (s.indexOf(c) == -1)
				return false;

		return true;
	}

	public static boolean isPangramTR(String s)
	{
		return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
	}

	public static String padLeading(String s, int n, char ch)
	{
		int len = s.length();

		return len < n ? String.valueOf(ch).repeat(n - len) + s : s;
	}

	public static String padLeading(String s, int n)
	{
		return padLeading(s, n, ' ');
	}

	public static String padTrailing(String s, int n, char ch)
	{
		int len = s.length();

		return len < n ? s + String.valueOf(ch).repeat(n - len) : s;
	}

	public static String padTrailing(String s, int n)
	{
		return padTrailing(s, n, ' ');
	}

	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
}
```

>Derleyici kod içerisinde kullanılan bir ismi gördüğünde bu ismin bildirimini arar. Bu kavrama **"isim arama (name lookup)"** denir. Derleyici bir ismi bildirim noktasında aramaz. Derleyici ismi bulduğunda (yani bildirimini bulduğunda) o ismin geçerli olarak kullanılıp kullanılmadığına bakar. Eğer geçersiz olarak kullanılmışsa error oluşur. Yani aslında derleyici önce isim araması yapar, bulduktan sonra geçerlilik kontrolü yapar. Zaten ismi bulamazsa yine error oluşur. Bu durumda bir ismin bulunamaması ile bulunup geçersiz kullanılması durumunda oluşan error'lar aynı değildir.
>
>Aşağıdaki örnekte `**` ile belirtilen error a isminin bulunması ancak geçersiz kullanılması durumunda oluşmuştur. `***` ile belirtilen error ise x isminin bulunamaması dolayısıyla oluşmuştur

```java

package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		boolean a = true;

		++a; //error **
		++x; //error ***
	}
}
```

>Kod içerisinde bir isim iki şekilde kullanılabilir: **nitelikli** (qualified), **niteliksiz** (unqualified).
>
>Kullanılan bir isim nokta operatörünün sağında kalıyorsa nitelikli, kalmıyorsa niteliksiz kullanılmış olur.
>
>Nitelikli kullanılan bir isim nitelikli isim arama kurallarına göre, niteliksiz kullanılan bir isim ise niteliksiz isim arama kurallarına göre aranır.
>
>**Anahtar Notlar:** Buradaki "qualified" ve "unqualified" terimleri algısal olarak olumlu ya da olumsuz bir durum belirtmemektedir. Tamamen kullanım biçimlerine ilişkin kavramlardır.
>
>**Anahtar Notlar:** Nitelikli ve niteliksiz isim arama kuralları genel ve özel olmak üzere iki gruba ayrılabilir. Biz öncelikle genel kuralları, sonrasında özel kuralları ele alacağız

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s; //Sample niteliksiz kullanılmıştır

		s = new Sample(); //s ve Sample niteliksiz kullanılmıştır
		s.foo(10); // s niteliksiz, foo nitelikli kullanılmıştır
	}
}

class Sample {
	public int x;

	public void foo(int a)
	{
		x = a; //x ve a niteliksiz kullaılmıştır
		//...
	}
}
```

>Kod içerisinde bir isim iki şekilde kullanılabilir: nitelikli (qualified), niteliksiz (unqualified).
>
>Kullanılan bir isim nokta operatörünün sağında kalıyorsa nitelikli, kalmıyorsa niteliksiz kullanılmış olur.
>
>Nitelikli kullanılan bir isim nitelikli isim arama kurallarına göre, niteliksiz kullanılan bir isim ise niteliksiz isim arama kurallarına göre aranır.
>
>**Anahtar Notlar:** Buradaki "qualified" ve "unqualified" terimleri algısal olarak olumlu ya da olumsuz bir durum
belirtmemektedir. Tamamen kullanım biçimlerine ilişkin kavramlardır.
>
>**Anahtar Notlar:** Nitelikli ve niteliksiz isim arama kuralları genel ve özel olmak üzere iki gruba ayrılabilir. Biz
öncelikle genel olanları, sonrasında özel durumlarını ele alacağız

```java
package org.csystem.app;

class App { //App aranmaz
	public static void main(String [] args) //main aranmaz
	{
		Sample s; //Sample niteliksiz kullanılmıştır, s aranmaz

		s = new Sample(); //s ve Sample niteliksiz kullanılmıştır
		s.foo(10); // s niteliksiz, foo nitelikli kullanılmıştır
	}
}

class Sample { //Sample aranmaz
	public int x; //x aranmaz

	public void foo(int a) // foo aranmaz
	{
		x = a; //x ve a niteliksiz kullanılmıştır
		//...
	}
}
```
##### Niteliksiz isim arama genel kuralları

>Niteliksiz isim arama genel kuralları (else if biçiminde değerlendiriniz):
>
>1. İsim metot içerisinde kullanılmışsa kullanılan noktadan yukarıya doğru metot içerisinde aranır. Bu aramaya metot parametre değişkenleri de dahildir

```java
class Sample {
	public void foo(int a)
	{
		int x;

		x = a;
	}
}
```

>Niteliksiz isim arama genel kuralları (else if biçiminde değerlendiriniz):
>
>2. Kullanılan isim sınıf içerisinde, tüm metotların dışında kalan her yerde aranır. Bulunamazsa taban sınıflara da
bulununcaya veya bulunamayıncaya kadar bakılır. Taban sınıf (super class) kavramı türetme (inheritance) konusunda
ele alınacaktır

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s = new Sample();

		s.foo(19);

		System.out.printf("s.x = %d%n", s.x);
	}
}

class Sample {
	public void foo(int a)
	{
		x = a;
	}

	public int x;

	public void bar(int x)
	{
		//...
	}
}
```

>Yukarıdaki iki maddenin sonucu olarak, bir metodun parametre değişkeni veya bir yerel değişkeni ait olduğu sınıfın veri elemanı ile aynı isimde olabilir.
>
>Aşağıdaki örnekte `**` belirtilen atama işleminde x yerel değişken olan x'dir değil mi?

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s = new Sample();

		s.foo(19);

		System.out.printf("s.x = %d%n", s.x);
	}
}

class Sample {
	public int x;

	public void foo(int a)
	{
		int x;

		x = a; //**
	}
}
```

>Niteliksiz isim arama genel kuralları (else if biçiminde değerlendiriniz):
>
>3. İsim, kullanılan metodun ait olduğu sınıfın ait olduğu paket içerisinde aranır. Burada alt ve üst paketlere bakılmaz

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s;
	}
}

class Sample {
	//
}
```

>Niteliksiz isim arama genel kuralları (else if biçiminde değerlendiriniz):
>
>3. İsim, kullanılan metodun ait olduğu sınıfın ait olduğu paket içerisinde aranır. Burada alt ve üst paketlere bakılmaz

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s;
	}
}
```

```java
package org.csystem;

public class Sample {
    //...
}
```

>Niteliksiz isim arama genel kuralları (else if biçiminde değerlendiriniz):
>
>3. İsim, kullanılan metodun ait olduğu sınıfın ait olduğu paket içerisinde aranır. Burada alt ve üst paketlere bakılmaz

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s;
	}
}
```

```java
package org.csystem.app.sample;

public class Sample {
    //...
}
```

>Niteliksiz isim arama genel kuralları (else if biçiminde değerlendiriniz):
>
>4. "import on demand declaration" olarak belirtilen paketlerin hepsinde arama yapar. "import on demand declaration" ileride ele alınacaktır

##### Nitelikli isim arama genel kuralları

>Nitelikli isim arama genel kuralları (else if biçiminde değerlendiriniz):
>
>1. Aranan ismin solunda bir UDT ismi varsa, isim o UDT içerisinde aranır. Burada bulunamazsa taban sınıflara bulununcaya veya bulunamayıncaya kadar bakılır

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample.foo(20);
		System.out.printf("Sample.x = %d%n", Sample.x);
	}
}

class Sample {
	public static int x;

	public static void foo(int a)
	{
		x = a;
	}
}
```

>Nitelikli isim arama genel kuralları (else if biçiminde değerlendiriniz):
>
>2. Aranan ismin solunda bir referans (değişken) ismi varsa, isim referans değişkenin türüne ilişkin UDT içerisinde	aranır. Burada bulunamazsa taban sınıflara bulununcaya veya bulunamayıncaya kadar bakılır

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s = new Sample();

		s.foo(20);
		System.out.printf("Sample.x = %d%n", s.x);
	}
}

class Sample {
	public int x;

	public void foo(int a)
	{
		x = a;
	}
}
```

>Nitelikli isim arama genel kuralları (else if biçiminde değerlendiriniz):
>
>3. Aranan ismin solunda bir paket ismi varsa, isim o paket içerisinde aranır. Burada da alt paketlere ya da üst paketlere bakılmaz

```java

package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		org.csystem.math.geometry.Point p;
	}
}
```

>Paket isimleri niteliksiz isim aramaya dahil değildir. Aslında bu kural daha teknik olarak şu şekilde açıklanabilir:
>
>Paket içerisinde arama yapılırken paket isimleri niteliksiz aramaya dahil edilmez

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		sample.Sample s;
	}
}
```

```java
package org.csystem.app.sample;

public class Sample {
    //...
}
```

>Yukarıda anlatılan isim arama kurallarına göre isimsiz (unnamed) bir paket içerisinde bildirilen bir UDT'ye başka bir paketten erişilemez. Bu durumda isimsiz paket altında bildirilen bir UDT ancak isimsiz paket altında bildirilen başka bir UDT içerisinden erişilebilirdir. Bu durumda isimsiz bir paket altında UDT bildirimi pratikte tavsiye edilmez

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s;
	}
}

public class Sample {
    //...
}
```

#### 15 Ağustos 2024

##### import bildirimleri (import declarations)

>import bildirimleri niteliklendirmeyi azaltmak ve kodu daha yalın olarak yazabilmek için düşünülmüştür. import bildirimlerinin UDT ismi bakımından iki kullanım biçimi vardır:
>
>1. `Yıldızlı` import bildirimi (import on demand declaration)
>2. `Yıldızsız` import bildirimi (import single type declaration)
>
>import bildirimlerine ilişkin ortak özellikler:
>
>- import bildirimleri bir derleme biriminde paket bildiriminden `sonra` ve tüm diğer bildirimlerden `önce` bulunmalıdır.
>- Birden fazla import bildirimi geçerlidir ve bildirim sırasının önemi yoktur.
>- import bildirimleri niteliksiz isimler için (yani niteliksiz isim arama için) geçerlidir. Nitelikli isimler için import bildiriminin önemi yoktur.
>- Bir import bildirimi yalnızca bildirildiği derleme biriminde geçerlidir.
>
>**Anahtar Notlar:** `import` bildirimi bir kütüphaneyi projeye dahil etmek demek **DEĞİLDİR**. Bir kütüphaneyi projeye dahil etmek için başka yöntemler kullanılmaktadır. Bir kütüphaneyi projeye dahil etme işlemi `Java ile Uygulama Geliştirme 1` ve `Android Programlama` kurslarında ele alınacaktır.
>
>**Anahtar Notlar:** Yukarıdaki "yıldızlı" ve "yıldızsız" terimleri tamamen _Oğuz Karan_ tarafından uydurulmuştur. Bunlar gerçek terimlerin Türkçe karşılıkları değildir. Kolay anlaşılması açısından bu şekilde kullanılmaktadır

###### Yıldızlı import bildirimi (import on demand declaration) 

>Yıldızlı import bildiriminin genel biçimi şu şekildedir:

		import <paket ismi>[.<alt paket listesi>].*;
>Niteliksiz isim arama genel kurallarına göre isim, paket içerisinde bulunamazsa yıldızlı import bildirimlerine ilişkin tüm paketlerde aranır. Burada yine alt ve üst paketlere bakılmaz. Bu bildirim adeta bir paketi isim arama anlamında derleme birimine ilişkin pakete dahil etmektir.

```java
package org.csystem.app;

import java.util.*;
import org.csystem.math.*;
import org.csystem.math.geometry.*;

class App {
	public static void main(String [] args)
	{
		Random r = new Random();
		Scanner kb = new Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		for (int i = 0; i < count; ++i) {
			Point p = new Point(r.nextInt(-100, 100), r.nextInt(-100, 100));
			Complex z = new Complex(r.nextDouble(-3.456, 3.456), r.nextDouble(-3.456, 3.456));

			System.out.println("--------------------------------------");
			System.out.printf("Point:%s%n", p.toString());
			System.out.printf("Complex Number:%s%n", z.toString());
			System.out.println("--------------------------------------");
		}
	}
}
```

>Arama tüm yıldızlı import bildirimlerinde yapılır. Eğer isim import bildirimlerine ilişkin birden fazla pakette bulunursa error oluşur (ambiguity)

```java
package org.csystem.app;

import gorkem.*;
import arman.*;

class App {
	public static void main(String [] args)
	{
		Mample m;
		Test t;
		Sample s; //error: ambiguity
	}
}
```

```java
package arman;

public class Sample {
    //...
}
```

```java
package gorkem;

public class Sample {
    //...
}
```

```java
package gorkem;

public class Mample {
    //...
}
```

```java
package arman;

public class Test {
    //...
}
```
###### Yıldızsız import bildirimleri (import single type declaration)

>Bu bildirimin genel biçimi şu şekildedir:

		import <paket ismi>[.alt paket listesi>].<UDT ismi>;
>Bu bildirimde belirtilen UDT ismi derleme birimöi boyunca her yerde niteliksiz olarak kullanılabilir (visible). Ya da başka bir deyişle buradaki bildirim, bu ismin derleme birimi boyunca niteliksiz kullanılabileceğini belirtir. Yani bu bildirime ilişkin isim niteliksiz isim arama genel kurallarına göre aranmaz. Yani ilgili isim için niteliksiz isim arama genel kuralları uygulanmaz

```java
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;
import org.csystem.math.Complex;
import org.csystem.math.geometry.Point;

class App {
	public static void main(String [] args)
	{
		Random r = new Random();
		Scanner kb = new Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		for (int i = 0; i < count; ++i) {
			Point p = new Point(r.nextInt(-100, 100), r.nextInt(-100, 100));
			Complex z = new Complex(r.nextDouble(-3.456, 3.456), r.nextDouble(-3.456, 3.456));

			System.out.println("--------------------------------------");
			System.out.printf("Point:%s%n", p.toString());
			System.out.printf("Complex Number:%s%n", z.toString());
			System.out.println("--------------------------------------");
		}
	}
}
```

>Yıldızsız import bildiriminde aynı ismin farklı paketlerden verilmesi error oluşuturur. Çünkü bu bildirim ile bir	isim artık niteliksiz kullanılabilirdir. Bu durumda farklı paketlerde olan aynı isim için bildirim yapılamaz

```java
package org.csystem.app;

import arman.Sample;
import gorkem.Sample; //error

class App {
	public static void main(String [] args)
	{

	}
}
```

```java
package arman;

public class Sample {
    //...
}
```

```java
package gorkem;

public class Sample {
    //...
}
```

**Anahtar Notlar:** Programcı mümkün olduğunda yıldızsız import bildirimlerini tercih etmelidir. Aslında bu bildirim ile artık ismin kullanımında ambiguity durumu oluşamayacağından tercih edilmeldir. IDE'ler genel olarak yıldızsız import bildirimine yönlendirirler. Ancak bu çeşitli konfigürasyon ayarlarından değiştirilebilmektedir. Yine çok fazla aynı paketteki UDT'ler için yıldızsız bildirim yapıldığında bunlar yıldızlı ile de birleştirilebilir. Bu aslında bir yaklaşımdır ve programcıdan programcıya değişiklik gösterebilir

>Aşağıdaki demo örnekte `Sample`, `org.csystem.app` paketi içerisinde olandır

```java
package org.csystem.app;

import gorkem.*;

class App {
	public static void main(String [] args)
	{
		Sample.foo();
	}
}
```

```java
package gorkem;

public class Sample {
    //...
    public static void foo()
    {
        System.out.println("gorkem.Sample.foo()");
    }
}
```

```java
package org.csystem.app;

class Sample {
    //...
    public static void foo()
    {
        System.out.println("org.csystem.app.Sample.foo()");
    }
}
```

>Aşağıdaki demo örnekte `Sample`, `gorkem` paketi içerisinde olandır

```java
package org.csystem.app;

import gorkem.Sample;

class App {
	public static void main(String [] args)
	{
		Sample.foo();
	}
}
```

```java
package gorkem;

public class Sample {
    //...
    public static void foo()
    {
        System.out.println("gorkem.Sample.foo()");
    }
}
```

```java
package org.csystem.app;

class Sample {
    //...
    public static void foo()
    {
        System.out.println("org.csystem.app.Sample.foo()");
    }
}
```

>Aşağıdaki demo örnekte `Sample` sınıfı aynı derleme biriminde de bildirildiğinden içerisinde bildirildiğinden error oluşur

```java
package org.csystem.app;

import gorkem.Sample;

class App {
	public static void main(String [] args)
	{
		Sample.foo();
	}
}

class Sample {
	//...
	public static void foo()
	{
		System.out.println("org.csystem.app.Sample.foo()");
	}
}
```

```java
package gorkem;

public class Sample {
    //...
    public static void foo()
    {
        System.out.println("gorkem.Sample.foo()");
    }
}
```
##### import static bildirimleri (import static declarations)

>import static bildirimleri `Java 5` ile dile eklenmiştir.
>
>Bu bildirimler de iki gruba ayrılabilir:
>1. `Yıldızlı` import static bildirimi (import static on demand declaration)
>2. `Yıldızsız` import static bildirimi (import static single member declaration)
>
>import bildirimleri için yazılan ortak özellikler import static bildirimleri için de geçerlidir
>
>**Anahtar Notlar:** import static bildirimlerinin okunabilirliği olumsuz etkilemedikten sonra kullanılması tavsiye edilir

###### Yıldızlı import static bildirimi (import static on demand declaration)

>Bu bildirimin genel biçimi şu şekildedir:

		import static <paket ismi>[.<alt paket listesi>].<UDT ismi>.*;
>Bu bildirim ile niteliksiz kullanılan bir isim ilgili pakette de bulunamazsa yıldızlı import static bildirimine ilişkin UDT'de aranır

```java
package org.csystem.app;

import java.util.Scanner;
import static java.lang.Math.*;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();

		System.out.printf("sqrt(%f) = %f%n", a, sqrt(a));
	}
}
```

```java
/**
 * Point class that represents a point in geometry
 * Last Update: 15th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.*;

public class Point {
	public double x;
	public double y;

	public Point()
	{
	}

	public Point(double a)
	{
		x = a;
	}

	public Point(double a, double b)
	{
		x = a;
		y = b;
	}

	public double distance()
	{
		return distance(0, 0);
	}

	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}

	public double distance(double a, double b)
	{
		return sqrt(pow(x - a, 2) + pow(y - b, 2));
	}

	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}

	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}

	public String toString()
	{
		return "(%f, %f)".formatted(x, y);
	}
}
```

```java
/**
 * Complex class that represents a complex number in math
 * Last Update: 15th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math;

import static java.lang.Math.*;

public class Complex {
	public double real;
	public double imag;

	public static Complex add(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return new Complex(re1 + re2, im1 + im2);
	}

	public static Complex subtract(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return add(re1, im1, -re2, -im2);
	}

	public Complex()
	{
	}

	public Complex(double a)
	{
		real = a;
	}

	public Complex(double a, double b)
	{
		real = a;
		imag = b;
	}

	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}

	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}

	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}

	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}

	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}

	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}

	public void inc(double val)
	{
		real += val;
	}

	public void inc()
	{
		inc(1);
	}

	public void dec(double val)
	{
		inc(-val);
	}

	public void dec()
	{
		dec(1);
	}

	public Complex getConjugate()
	{
		return new Complex(real, -imag);
	}

	public double getNorm()
	{
		return sqrt(real * real + imag * imag);
	}

	public double getLength()
	{
		return getNorm();
	}

	public String toString()
	{
		return "(%.2f, %.2f)".formatted(real, imag);
	}
}
```
###### Yıldızsız import static bildirimi (import static on demand declaration)

>Bu bildirimin genel biçimi şu şekildedir:

		import static <paket ismi>[.<alt paket listesi>].<UDT ismi>.<static eleman>;
>Bu bildirim ile ilgili static eleman tüm derleme birimi boyunca kullanılabilir

```java
package org.csystem.app;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		double a = kb.nextDouble();

		System.out.printf("sqrt(%f) = %f%n", a, sqrt(a));
	}
}
```

```java
/**
 * Point class that represents a point in geometry
 * Last Update: 15th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
	public double x;
	public double y;

	public Point()
	{
	}

	public Point(double a)
	{
		x = a;
	}

	public Point(double a, double b)
	{
		x = a;
		y = b;
	}

	public double distance()
	{
		return distance(0, 0);
	}

	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}

	public double distance(double a, double b)
	{
		return sqrt(pow(x - a, 2) + pow(y - b, 2));
	}

	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}

	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}

	public String toString()
	{
		return "(%f, %f)".formatted(x, y);
	}
}
```

```java
/**
 * Complex class that represents a complex number in math
 * Last Update: 15th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math;

import static java.lang.Math.sqrt;

public class Complex {
	public double real;
	public double imag;

	public static Complex add(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return new Complex(re1 + re2, im1 + im2);
	}

	public static Complex subtract(double re1, double im1, double re2, double im2) //İleride sınıfı kullanan kodlardan gizleyeceğiz
	{
		return add(re1, im1, -re2, -im2);
	}

	public Complex()
	{
	}

	public Complex(double a)
	{
		real = a;
	}

	public Complex(double a, double b)
	{
		real = a;
		imag = b;
	}

	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}

	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}

	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}

	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}

	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}

	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}

	public void inc(double val)
	{
		real += val;
	}

	public void inc()
	{
		inc(1);
	}

	public void dec(double val)
	{
		inc(-val);
	}

	public void dec()
	{
		dec(1);
	}

	public Complex getConjugate()
	{
		return new Complex(real, -imag);
	}

	public double getNorm()
	{
		return sqrt(real * real + imag * imag);
	}

	public double getLength()
	{
		return getNorm();
	}

	public String toString()
	{
		return "(%.2f, %.2f)".formatted(real, imag);
	}
}
```

**Anahtar Notlar:** Paket ve isim arama konusunda burada anlatılmayan diğer detaylar ya ileride ele alınacaktır ya da pratikte çok kullanılmadağından hiç ele alınmayacaktır

#### 20 Ağustos 2024

##### Diziler (Arrays)

>Elemanları **aynı türden** olan ve elemanları bellekte **peşpeşe** tutulacak şekilde yaratılan veri yapısıdır. Diziler programlamada en temel veri yapılarıdır. Hatta bazı veri yapıları dizi kullanılarak implemente edilebilir.
>
>Java'da diziler `heap`'de yaratılırlar. Yani sınıfsal temsil edilmişlerdir. Java'da `stack`'de dizi **yaratılamaz**. `T` bir tür ismi olmak üzere her bir elemanı `T` türünden olan (bu durumda `T` türden dizi de denebilir) bir dizi referansı bildiriminin iki biçimi vardır:
>
>		T [] a;
>		T a[];
>Burada `a` bir referans değişkendir. Henüz daha dizi yaratılmamıştır. İkinci biçime **"C stili (C style)"** bildirim de denilmektedir. Java programcısına önerilmemektedir. Pek çok static kod analizi aracı da ikinci biçimde default olarak uyarı verebilmektedir. Biz de kodlarımıza birinci biçimi tercih edeceğiz
>
>Örneğin:
>
>		int [] a;
>		int a[];

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int [] a; //int türden dizi referansı bildirimi
		int b[]; //int türden dizi referansı bildirimi

	}
}
```

>Dizi referansı bildirimlerinin farkı

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int [] a, b, c; //a, b ve c int [] türünden
		int x[], y, z; // x int[], y ve z int türden
	}
}
```

>Dizi yaratmak için yine `new` operatörü kullanılır. Dizi yaratmak için `new` operatörü kullanımının genel biçimi şu şekildedir:

		new <tür>[<int türüne doğrudan dönüşebilen türden bir değer>];
>Burada `[]` içerisinde verilen değere dizinin uzunluğu (length) denir. Uzunluk dizinin eleman sayısıdır. Java'da dizi uzunluğunun sabit ifadesi olması gerekmez. Dizi yaratıldıktan sonra uzunluğu **değiştirilemez**. Dizi uzunluğunun negatif olması durumunda **exception** oluşur. Dizi uzunluğuna `length` isimli veri elemanı ile erişilebilir. `length` veri elemanının değeri **değiştirilemez**
>
>Dizinin elemanlarına erişmek için `[]` operatörü (subscription operator) kullanılır. Bu operatör özel amaçlı iki operandlı ve araek durumundadır. Operatörün birinci operandı bir referansı ikinci operandı ise `int` türüne **doğrudan** dönüşebilen bir değer olmalıdır. İkinci operandına indeks değeri de denilmektedir. Dizinin ilk elemanına sıfır numaralı indeks değeri kullanılarak erişilir. Yani bu anlamda dizinin elemanlarına erişmek için kullanılan indeks değerleri `[0, length)` aralığıdır. Bu operatör operatör öncelik tablosunda birinci seviyededir. Operatörün ürettiği değer indeksteki elemana ilişkin değişkendir. Indeks numarası pozitif ya da negatif bakımdan sınırlar dışında bir değer olarak verilirse exception oluşur.
>
>Dizi yaratıldığında elemanlarının her birine `default` değerler atanır.

>Aşağıdaki demo örneği inceleyiniz

```java
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		int [] a;

		a = new int[count];
		int len = a.length;

		for (int i = 0; i < len; ++i)
			a[i] = i;

		for (int i = 0; i < len; ++i)
			System.out.printf("%d ", a[i]);

		System.out.println();
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		int [] a;

		a = new int[count];
		int len = a.length;

		for (int i = 0; i < len; ++i)
			a[i] = i;

		System.out.println(a[5]);
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		int [] a;

		a = new int[count];
		int len = a.length;

		for (int i = 0; i < len; ++i)
			a[i] = r.nextInt(100);

		for (int i = 0; i < len; ++i)
			System.out.printf("%02d ", a[i]);

		System.out.println();
	}
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		int [] a;
		boolean [] b;

		a = new int[count];
		b = new boolean[count];

		for (int i = 0; i < count; ++i)
			System.out.printf("%d ", a[i]);

		System.out.println();

		for (int i = 0; i < count; ++i)
			System.out.printf("%b ", b[i]);

		System.out.println();
	}
}
```

>Bir diziye ilk değer verilebilir (initialization). Bu işlem için `{}` kullanılır. `{}` içerisindeki değerler virgül ile ayrılırlar. Dizinin eleman sayısı verilen değer kadar olur. Yani ilk değer verildiğinde ilgili dizi nesnesi yaratılır ve elemanlar ilk değer olarak verilir. İlk değer verme sentaksında yine `new` operatörü kullanılır. `[]` içerisi boş bırakılır. `[]` içerisine değer verilmesi durumunda error oluşur. Diziye ilk değer verirken aynı zamanda dizinin adresine ilişkin referans değişkene de ilk değer veriliyorsa `new` operatörü kullanılmasına gerek yoktur. İstenirse kullanılabilir.

>Aşağıdaki örnekte diziye ilk değer verilmiştir ancak referansa ilk değer verilmemiştir

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int [] a;

		a = new int[] {1, 2, 3, 4, 5, 6};

		for (int i = 0; i < a.length; ++i)
			System.out.printf("%d ", a[i]);

		System.out.println();
	}
}
```

>Aşağıdaki örnekte diziye ve ilgili referansa da ilk değer verilmiştir

```java
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		int [] a = {1, 2, 3, 4, 5, 6};

		for (int i = 0; i < a.length; ++i)
			System.out.printf("%d ", a[i]);

		System.out.println();
	}
}
```

>Diziye ilk değer verme sentaksında son elemandan sonra virgül yazılabilir. Buna "trailing comma" denir. Bunu yazmakla yazmamak arasında bir fark yoktur. Bunun programcının yaklaşımına göre iki tane kullanımı söz konusu olabilir:
>1. Programcı henüz ilk değerleri kod içerisinde tamamlamamıştır ve bunu belirtmek için sondaki virgülü kullanabilir
>2. Verilen ilk değerlerin geliştirme aşamasında yerlerinin çok sık değişebileceği durumda, değiştirme işlemi daha kolay yapılabilir

>Bir metodun parametre değişkeni bir dizi referansı olabilir

```java
package org.csystem.app;

import static org.csystem.util.array.ArrayUtil.print;

class App {
	public static void main(String [] args)
	{
		int [] a = {1, 2, 3, 4, 5, 6};

		print(a);
	}
}
```

#### 22 Ağustos 2024

>Bir metodun geri dönüş değeri de bir dizi referansı olabilir

```java
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

			int[] a = generateRandomArray(random, count, 0, 100);

			print(a, 2);
		}
	}
}
```

>Bir metodun geri dönüş değeri de bir dizi referansı olabilir

```java
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
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden bir dizinin elemanları toplamına geri dönen `sum` metodunu `ArrayUtil` sınıfı içerisinde yazınız. Metodunuzu rassal olarak üretilmiş diziler ile test ediniz.

```java
package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

public class ArrayUtilSumTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Bir sayı giriniz:");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            int [] a = generateRandomArray(r, count, 0, 100);

            print(a, 2);
            System.out.printf("Total:%d%n", sum(a));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
```

>Sıfır elemanlı bir dizi yaratılabilir. Bu durumda şüphesiz dizide bir eleman tutulamaz ancak dizi yaratılmış olur. Sıfır elemanlı diziler bazı durumlarda kontrol amaçlı kullanılabimlir. Örneğin bir metot bir takım değerlere göre bir dizi yuratacak olsun. Metoda geçilen değerlerin geçersiz olması durumunda metot sıfır elemanlı bir diziye geri dönebilir. Bu durumda metodu çağıran programcı geri dönen dizinin eleman sayısına bakarak geçerlilik kontrolü yapabilir. Şüphesiz bunu yapmanın başka yöntemleri de vardır. Sıfır elemanlı bir dizi aşağıdakilerden biri ile yaratılabilir:
>
>		1. new int[0]
>		2. new int[]{};
>Aşağıdaki demo örnekte bu gösterilmeye çalışılmıştır.

```java
package org.csystem.app;

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

			boolean [] a = Util.generateRandomBooleanArray(random, count);

			if (a.length > 0) {
				for (int i = 0; i < a.length; ++i)
					System.out.printf("%b ", a[i]);

				System.out.println();
			}
			else
				System.out.printf("Dizi uzunluğu sıfırdan büyük olmalıdır:%d%n", count);

		}
	}
}

class Util {
	public static boolean [] generateRandomBooleanArray(Random r, int count)
	{
		if (count <= 0)
			return new boolean[0];

		boolean [] a = new boolean[count];

		for (int i = 0; i < count; ++i)
			a[i] = r.nextBoolean();

		return a;
	}
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden bir dizinin en büyük elemanına geri dönen `max` ve en küçük elemanına geri dönen `min` isimli metotları `ArrayUtil` sınıfı içerisinde yazınız ve aşağıdaki kodlarla test ediniz.

```java
package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

public class ArrayUtilMinMaxTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Bir sayı giriniz:");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            int [] a = generateRandomArray(r, count, 0, 100);

            print(a, 2);
            System.out.printf("En büyük eleman:%d%nEn küçük eleman:%d%n", max(a), min(a));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
```

>**Sınıf Çalışması:** Sayısal loto kupon üreten programı yazınız.
>
>**_Açıklama:_** Bir sayısal loto kuponu birbirinden farklı 6 tane küçükten büyüğe sıralanmış `[1, 49]` aralığındaki sayılardan oluşur
>
>**_Not:_** Aşağıdaki yaklaşım çok iyi değildir
>
>**Anahtar Notlar:** `Arrays` sınıfının `sort` metodu parametresi ile aldığı diziyi **(ascending)** artan şekilde sıralar

```java
package org.csystem.app.lottery.numeric;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery numericLottery = new NumericLottery(new Random());

        while (true) {
            System.out.print("Kaç tane kupon oynamak istersiniz?");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0) {
                System.out.println("Lütfen pozitif bir sayı giriniz");
                continue;
            }

            while (n-- > 0)
                ArrayUtil.print(numericLottery.getNumbers(), 2);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
```


```java
package org.csystem.app.lottery.numeric;

import java.util.Arrays;
import java.util.Random;

public class NumericLottery {
    public Random random;

    public NumericLottery(Random r)
    {
        random = r;
    }

    public int [] getNumbers()
    {
        int [] a = new int[6];

        for (int i = 0; i < 6; ++i) {
            boolean repeat;

            do {
                repeat = false;
                a[i] = random.nextInt(1, 50);

                for (int k = 0; k < i; ++k)
                    if (a[k] == a[i]) {
                        repeat = true;
                        break;
                    }
            } while (repeat);
        }

        Arrays.sort(a);

        return a;
    }
}
```

#### 27 Ağustos 2024

>**Sınıf Çalışması:** Sayısal loto kupon üreten programı yazınız.
>
>**_Açıklama:_** Bir sayısal loto kuponu birbirinden farklı 6 tane küçükten büyüğe sıralanmış `[1, 49]` aralığındaki sayılardan oluşur
>
>**_Not:_** Aşağıdaki yaklaşım bir öncekine göre oldukça iyidir. Ancak daha iyileri de vardır. İleride yazılacaktır

```java
package org.csystem.app.lottery.numeric;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery numericLottery = new NumericLottery(new Random());

        while (true) {
            System.out.print("Kaç tane kupon oynamak istersiniz?");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0) {
                System.out.println("Lütfen pozitif bir sayı giriniz");
                continue;
            }

            while (n-- > 0)
                ArrayUtil.print(numericLottery.getNumbers(), 2);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
```

```java
package org.csystem.app.lottery.numeric;  
  
import java.util.Random;  
  
public class NumericLottery {  
    public Random random;  
  
    public boolean [] getFlags()  
    {  
        boolean [] flags = new boolean[50];  
  
        for (int i = 0; i < 6; ++i) {  
            int val;  
  
            while (true) {  
                val = random.nextInt(1, 50);  
                if (!flags[val])  
                    break;  
            }  
  
            flags[val] = true;  
        }  
  
        return flags;  
    }  
  
    public int [] getNumbers(boolean [] flags)  
    {  
        int [] a = new int[6];  
        int idx = 0;  
  
        for (int i = 1; i < flags.length; ++i)  
            if (flags[i])  
                a[idx++] = i;  
  
        return a;  
    }  
  
    public NumericLottery(Random r)  
    {  
        random = r;  
    }  
  
    public int [] getNumbers()  
    {  
        return getNumbers(getFlags());  
    }  
}
```

>**Sınıf Çalışması:** Sayısal loto kupon üreten programı yazınız.
>
>**_Açıklama:_** Bir sayısal loto kuponu birbirinden farklı 6 tane küçükten büyüğe sıralanmış `[1, 49]` aralığındaki sayılardan oluşur
>
>**_Not:_** Aşağıdaki yaklaşım bir öncekine göre oldukça iyidir. Ancak daha iyileri de vardır. İleride yazılacaktır

```java
package org.csystem.app.lottery.numeric;  
  
import org.csystem.util.array.ArrayUtil;  
  
import java.util.Random;  
import java.util.Scanner;  
  
public class NumericLotteryApp {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        NumericLottery numericLottery = new NumericLottery(new Random());  
  
        while (true) {  
            System.out.print("Kaç tane kupon oynamak istersiniz?");  
            int n = Integer.parseInt(kb.nextLine());  
  
            if (n <= 0) {  
                System.out.println("Lütfen pozitif bir sayı giriniz");  
                continue;  
            }  
  
            while (n-- > 0)  
                ArrayUtil.print(numericLottery.getNumbers(), 2);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

```java
package org.csystem.app.lottery.numeric;  
  
import java.util.Random;  
  
public class NumericLottery {  
    public Random random;  
  
    public boolean [] getFlags()  
    {  
        boolean [] flags = new boolean[50];  
  
        for (int i = 0; i < 6; ++i) {  
            int val;  
  
            do  
                val = random.nextInt(1, 50);  
            while (flags[val]);  
  
            flags[val] = true;  
        }  
  
        return flags;  
    }  
  
    public int [] getNumbers(boolean [] flags)  
    {  
        int [] a = new int[6];  
        int idx = 0;  
  
        for (int i = 1; i < flags.length; ++i)  
            if (flags[i])  
                a[idx++] = i;  
  
        return a;  
    }  
  
    public NumericLottery(Random r)  
    {  
        random = r;  
    }  
  
    public int [] getNumbers()  
    {  
        return getNumbers(getFlags());  
    }  
}
```

##### Dizilerin Sıraya Dizilmesi (Sorting)

>Dizilerin sıraya dizilmesine yönelik pek çok algoritma bulunmaktadır. Sıralama işleminin küçükten büyüğe ya da başka bir deyişle artan sırada (ascending) yapılmasına doğal sıralama (natural sort order) denir. Dizilerin azalan sırada sıralanmasına "descending order" denilmektedir. Biz burada kabarcık sıralama (bubble sort) ve seçerek sıralama (selection sort) algoritmalarını ele alacağız. Bu algoritmaların doğal sıralayan biçimi anlatımda kullanılacaktır ancak hem ascending hem de descending biçimleri ayrıca implemente edilecektir

**Anahtar Notlar:**  Algoritmaların karşılaştırılmasına yönelik iki ölçüt kullanılır: hız (speed), kaynak kullanımı (resource usage). Burada ele alacağımız bubble sort ve selection sort algoritmaları karşılaştırılmayacaktır. Algoritma analizi isimli konuda bu iki algoritmanın karşılaştırılması da ayrıca ele alınacaktır.

>Kabarcık sıralama algoritmasında dizinin yanyana iki elemanı karşılaştırılır. Duruma göre yer değiştirilir. Her yinelemede en büyük eleman daraltılmış dizinin sonuna gider. Böylece her yinelemede bir geriye kadar gidilmiş olur
>
>Örneğin :
>22 8 66 -7 34 -6 17 21 68 45 -10 3 16
>8 22 -7 34 -6 17 21 66 45 -10 3 16 68
>8 22 -7 -6 ..

```java
package org.csystem.util.array.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.array.ArrayUtil.*;  
  
public class ArrayUtilBubbleSortTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Bir sayı giriniz:");  
            int count = Integer.parseInt(kb.nextLine());  
  
            if (count <= 0)  
                break;  
  
            int [] a = generateRandomArray(r, count, 0, 100);  
  
            print(a, 2);  
            boolean descending = r.nextBoolean();  
            System.out.printf("Dizi %s olarak sıralanıyor%n", descending ? "azalan sırada" : "artan sırada");  
            bubbleSort(a, descending);  
            print(a, 2);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

#### 3 Eylül 2024

>Seçerek sıralama algoritmasında en küçük eleman bulunur, ilk eleman ile değiştirilir. Dizi bir daraltılır, aynı işlem daraltılmış dizi için yapılır. Böylece ilerleriz
>
>Örneğin :\
>22 8 66 -7 34 -6 17 21 68 45 -10 3 16\
>-10 8 66 -7 34 -6 17 21 68 45 22 3 16\
>-10 -7 66 8 34 -6 17 21 68 45 22 3 16\
>. . .


```java
package org.csystem.util.array.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.array.ArrayUtil.*;  
  
public class ArrayUtilSelectionSortTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Bir sayı giriniz:");  
            int count = Integer.parseInt(kb.nextLine());  
  
            if (count <= 0)  
                break;  
  
            int [] a = generateRandomArray(r, count, 0, 100);  
  
            print(a, 2);  
            boolean descending = r.nextBoolean();  
            System.out.printf("Dizi %s olarak sıralanıyor%n", descending ? "azalan sırada" : "artan sırada");  
            selectionSort(a, descending);  
            print(a, 2);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

>***Bölümleme (Partition) Algoritması:*** Bu algoritmada amaç, bir dizinin belirli bir koşula uyan elemanlarının dizinin başında, koşula uymayanların ise dizinin sonuna getirilmesidir. Bu algoritma başka bir dizi yaratılmadan da gerçekleştirilebilir (implementation). Zaten başka bir dizi kullanımı efektif değildir. Dizi bölümlendikten sonra ilk koşula uymayan elemanın bulunduğu indeks değerine ***"bölümleme noktası (partition point)"*** denir. Bu durumda dizinin tüm elemanları ilgili koşula uyuyor ise partition point'in değeri dizinin uzunluğudur, dizinin hiç bir elemanı koşula uymuyorsa partitionpoint'in değeri sıfırdır. Bu işlem tipik olarak şu şekilde yapılabilir: Önce dizinin koşula uymayan ilk elemanı bulunur. Sonra ikinci bir indeks, koşula uymayan ilk elemandan bir sonraki elemana konumlandırılır. Eğer eleman (ikinci indeksdeki eleman) koşula uyuyorsa, koşula uymayan eleman ile (birinci indeksteki eleman ile) yer değiştirilir ve birinci indeks artırılır. İkinci indeks her duruda artırılır. Böylece ilerlenir. Bu durumda birinci indeks partition point olarak elde edilmiş olur.
>
> Örneğin:\
> 2 8 66 7 34 6 17 21 68 45 10 3 16
>
> dizisinde 11 değerinden küçük olan elemanların bölümlenmesi şu şekilde elde edilebilir\
> 1.indeks:2\
> 2.indeks:3
>
> 2 8 7 66 34 6 17 21 68 45 10 3 16\
> 1.indeks:3\
> 2.indeks:4
>
> 2 8 7 66 34 6 17 21 68 45 10 3 16\
> 1.indeks:3\
> 2.indeks:5
> 
> 2 8 7 6 34 66 17 21 68 45 10 3 16\
> 1.indeks:4\
> 2.indeks:6\
> . . .

```java
package org.csystem.util.array.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.array.ArrayUtil.*;  
  
public class ArrayUtilPartitionTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Input count:");  
            int count = Integer.parseInt(kb.nextLine());  
  
            if (count <= 0)  
                break;  
  
            int [] a = generateRandomArray(r, count, 0, 100);  
  
            print(a, 2);  
  
            System.out.print("Input threshold:");  
            int threshold = Integer.parseInt(kb.nextLine());  
              
            System.out.printf("Threshold:%d%n", threshold);  
            int partitionPoint = partition(a, threshold);  
  
            print(a);  
            System.out.printf("Partition Point:%d%n", partitionPoint);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```


> **Sınıf Çalışması:** Parametresi ile aldığı long türden bir sayının basamaklarından oluşan diziye geri dönen getDigits isimli metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz. 
> ***Açıklama:*** Metot negatif bir argüman için basamak değerlerini pozitif olarak verecektir

```java
package org.csystem.util.numeric.test;  
  
import static org.csystem.util.numeric.NumberUtil.*;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.array.ArrayUtil.*;  
  
public class NumberUtilGetDigitsTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        System.out.print("Bir sayı giriniz:");  
        int n = kb.nextInt();  
  
        for (int i = 0; i < n; ++i) {  
            long val = r.nextLong();  
  
            System.out.printf("%d -> ", val);  
            print(getDigits(val));  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

#### 5 Eylül 2024

>**Sınıf Çalışması:** Aşağıda prototipi verilen metodu açıklamalara göre yazınız ve test ediniz:
>`public static int [] histogramData(int [] a, int n);`
>**Açıklamalar:** 
>- Metot ArrayUtil sınıfı içerisinde yazılacaktır.
>- Metodun birinci parametresi, içerisinde [0, n] aralığında değerlerden oluşan bir dizi olacaktır.
>- Parametre ile alınan dizinin değerleri için geçerlilik kontrolü yapılmayacaktır.
>- Metot, parametresi ile aldığı dizinin içerisinde [0, n] aralığındaki sayıların sıklık sayılarından yani hangi sayıdan kaç tane olduğu bilgisine ilişkin diziye geri dönecektir.
>- Geri dönüş değeri olan dizinin indeks numarası [0, n] aralığındaki ilgili sayıya karşılık gelecektir. Yani örneğin 25 numaralı indeksteki eleman, 25 sayısının kaç tane olduğu bilgisini tutacaktır.


```java
package org.csystem.util.array.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.array.ArrayUtil.*;  
  
public class ArrayUtilHistogramDataTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Bir sayı giriniz:");  
            int count = Integer.parseInt(kb.nextLine());  
  
            if (count <= 0)  
                break;  
  
            int [] a = generateRandomArray(r, count, 0, 11);  
  
            System.out.print("Dizi:");  
            print(a, 2);  
            int [] hist = histogramData(a, 10);  
            System.out.print("Sayı dizisi:");  
            print(hist, 2);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

>char türden diziler String sınıfına benzetilebilir. char türden diziler immutable değildir. Bu anlamda char türden diziler String sınıfına yardımcı olarak da kullanılabilir. Örneğin String sınıfının immutable olmasından dolayı oluşabilecek maliyetli bir durumda char türden dizi kullanılabilir. Şüphesiz böyle bir durumda StringBuilder sınıfı da String sınıfına yardımcı olarak tercih edilebilir. Zaten StringBuilder sınıfı da genellikle içsel olarak char türden dizi kullanmaktadır. String sınıfının toCharArray metodu ile yazıya ilişkin karakterlerden oluşan char türden dizi elde edilebilir. Şüphesiz toCharArray metodu ile her çağrıda yeni bir dizi yaratılır. String sınıfnın char [] parametreli ctor'ları ile char türden dizi içerisindeki karakteri tutan String nesnesi elde edilebilir. String sınıfnın char [] parametresi alan 3 parametreli ctor'u dizinin herhangi bir indeksinden başlayarak 3. parametresi ile aldığı sayı kadar karakterden oluşan bir String nesnesi yaratılmasını sağlar. String sınıfının char [] parametreli valueOf factory metotları da yine char türden bir diziden String nesnesi elde etmek için kullanılabilir. Aşağıdaki demo örneği inceleyiniz


```java
package org.csystem.app;  
  
import java.util.Scanner;  
  
class App {  
    public static void main(String [] args)  
    {  
       Scanner kb = new Scanner(System.in);  
  
       while (true) {  
          System.out.print("Input a text:");  
          String s = kb.nextLine();  
  
          if ("quit".equals(s))  
             break;  
  
          char [] chars = s.toCharArray();  
  
          for (int i = 0; i < chars.length / 2; ++i) {  
             char temp = chars[i];  
  
             chars[i] = chars[chars.length - 1 - i];  
             chars[chars.length - 1 - i] = temp;  
          }  
  
          System.out.printf("Reverse of text:%s%n", new String(chars));  
          System.out.printf("Reverse of text:%s%n", String.valueOf(chars));  
       }  
    }  
}
```



>**Sınıf Çalışması:** StringUtil sınıfı içerisinde daha önceden yazılmış olaran changeCase metodunu char türden dizi kullanarak Util isimli bir sınıf içerisinde yazınız. Util sınıfını, test kodlarını ve entry point'i içeren sınıfı tek bir derleme biriminde yazabilirsiniz


```java
package org.csystem.app;  
  
import org.csystem.util.string.StringUtil;  
  
import java.util.Scanner;  
  
class App {  
    public static void main(String [] args)  
    {  
       ChangeCaseTest.run();;  
    }  
}  
  
class ChangeCaseTest {  
    public static void run()  
    {  
       Scanner kb = new Scanner(System.in);  
  
       while (true) {  
          System.out.print("Input string:");  
          String s = kb.nextLine();  
  
          System.out.printf("%s%n", StringUtil.changeCase(s));  
  
          if ("exit".equals(s))  
             break;  
       }  
    }  
}  
  
class Util {  
    public static String changeCase(String s)  
    {  
       char [] c = s.toCharArray();  
  
       for (int i = 0; i < c.length; ++i)  
          c[i] = Character.isUpperCase(c[i]) ? Character.toLowerCase(c[i]) : Character.toUpperCase(c[i]);  
  
       return String.valueOf(c);  
    }  
}
```



>***Referans Dizileri:*** Her bir elemanı bir referans olan dizilere denir. Bu durumda dizinin her bir elemanı ilgili türden bir adres tutar. Bu durumda bir referans dizisinin yaratılması, elemanı olan her bir referansın gösterdiği nesnelerin de yaratılması anlamına gelmez. Yani bir referans dizisi yaratıldıktan sonra diziye ilişkin referanslara da uygun adreslerin verilmesi gerekir. Bir referans dizisi ilk değer vermeden yaratıldığında her bir referansa null değeri atanır.
>**Anahtar Notlar:** Programlamada kullanılmayan adrese `null adres (null address)` denilmektedir. Java'da null adres null isimli bir sabit ile temsil edilir. null, bir referansın default değeri olarak atanır. null adrese ilişkin diğer detaylar ileride ele alınacaktır.

>Aşağıdaki demo örnekte referans dizisi yaratılmış ancak, dizinin elemanı olan referanslar herhangi bir nesneyi göstermediğinden exception oluşur

```java
package org.csystem.app;  
  
import org.csystem.util.string.StringUtil;  
  
import java.util.Scanner;  
  
class App {  
    public static void main(String [] args)  
    {  
       Sample [] samples;  
  
       samples = new Sample[10];  
  
       for (int i = 0; i < 10; ++i)  
          samples[i].x = i;  
  
       System.out.println("Dizi elemanları yazdırılıyor:");  
       for (int i = 0; i < 10; ++i)  
          System.out.printf("%d ", samples[i].x);  
  
       System.out.println();  
    }  
}  
  
class Sample {  
    public int x;  
  
    public Sample(int a)  
    {  
       x = a;  
    }  
  
    //...  
}
```


>Yukarıdaki örnek aşağıdaki gibi, her bir referansa yeni yaratılmış bir nesnenin adresi verilerek yapılabilir. Şüphesiz duruma göre (yani domain'e göre) referanslara verilecek adresler daha önceden yaratılmış nesnelerin adresleri de olabilir. Çözüm durumu anlatmak için yapılmıştır


```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       Sample [] samples;  
  
       samples = new Sample[10];  
  
       for (int i = 0; i < 10; ++i)  
          samples[i] = new Sample(i);
  
       System.out.println("Dizi elemanları yazdırılıyor:");  
       for (int i = 0; i < 10; ++i)  
          System.out.printf("%d ", samples[i].x);  
  
       System.out.println();  
    }  
}  
  
class Sample {  
    public int x;  
  
    public Sample(int a)  
    {  
       x = a;  
    }  
  
    //...  
}
```

#### 10 Eylül 2024

>Referans dizilerine ilk değer verilmesi aslında referans dizisinin elemanları olan referanslara adreslerin verilmesi demektir. Aşağıdaki demo örneiği inceleyiniz


```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       Sample s1 = new Sample(67);  
       Sample s2 = new Sample(35);  
       Sample [] samples = {s1, new Sample(23), s1, s2, new Sample(10), s2};  
  
       System.out.println("Dizi elemanları yazdırılıyor:");  
       for (int i = 0; i < samples.length; ++i)  
          System.out.printf("%d ", samples[i].x);  
  
       System.out.println();  
    }  
}  
  
class Sample {  
    public int x;  
  
    public Sample(int a)  
    {  
       x = a;  
    }  
  
    //...  
}
```



>Pratikte String türden referans dizileri çok sık kullanılmaktadır. String türden bir diziye ilk değer olarak String sabitleri de (string literals) verilebilir


```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       String [] cities = {"ankara", "istanbul", "izmir", "zonguldak", "muğla"};  
  
       for (int i = 0; i < cities.length; ++i)  
          System.out.println(cities[i].toUpperCase());  
    }  
}
```



>**Sınıf Çalışması:** Parametresi ile aldığı `int` türden gün, ay ve yıl bilgilerine ilişkin tarihin haftanın hangi günü olduğu bilgisine geri dönen `getDayOfWeek` isimli metodu ve uygulamayı aşağıdaki açıklamalara göre yazınız
>	
>**Açıklamalar:**
>- JavaSE'de bulunan veya başka bir kütüphanedeki tarih zaman işlemlerine ilişkin sınıflar ve metotlar kullanılmayacaktır.
>- getDayOfWeek metodu tarih geçerlilik kontrolü yapmayacaktır.
>- getDayOfWeek metodu haftanın hangi günü olduğuna ilişkin bilgiyi şu algoritmaya göre bulacaktır: `01.01.1900` tarihi ile ilgili tarih (dahil) arasındaki gün sayısı hesaplanıp 7 ile bölümünden elde edilen kalan alındığında 0 Pazar, 1 Pazartesi, ..., 6 Cumartesi anlamına gelir.
>- Program klavyeden gün ay ve yıl bilgisini isteyecek ve eğer tarih geçerli ise aşağıdaki formatta tarihi yazdırıcaktır:
>
>		25/04/2024 Perşembe
>- Tarih geçersiz ise Geçersiz tarih yazdıracaktır. Klavyeden gün ay ve yıl bilgilerinin 3'ü birden sıfır girildiğinde program sonlandırılacaktır. 
>
>Not: İleride daha iyisi yazılacaktır

```java
package org.csystem.app.datetime;  
  
import java.util.Scanner;  
  
class DemoDateApp {  
    public static void run()  
    {  
       Scanner kb = new Scanner(System.in);  
         
       while (true) {  
          System.out.print("Gün, ay ve yıl bilgilerini giriniz:");  
          int day = kb.nextInt();  
          int month = kb.nextInt();  
          int year = kb.nextInt();  
            
          DateUtil.printDateTR(day, month, year);  
          DateUtil.printDateEN(day, month, year);  
            
          if (day == 0 && month == 0 && year == 0)  
             break;  
       }  
         
       System.out.println("Tekrar yapıyor musunuz?");  
    }  
  
    public static void main(String[] args)  
    {  
       run();  
    }  
}
```

```java
package org.csystem.app.datetime;  
  
public class DateUtil {  
    public static int [] daysOfMoths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
    public static String [] daysOfWeekTR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};  
    public static String [] daysOfWeekEN = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};  
    public static String [] monthsTR = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",  
          "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};  
    public static String [] monthsEN = {"", "January", "February", "March", "April", "May", "June",  
          "July", "August", "September", "October", "November", "December"};  
  
    public static void printDateTR(int day, int month, int year)  
    {  
       if (!isValidDate(day, month, year)) {  
          System.out.println("Geçersiz tarih!...");  
          return;  
       }  
  
       System.out.printf("%d %s %d %s%n", day, monthsTR[month], year, daysOfWeekTR[getDayOfWeek(day, month, year)]);  
    }  
  
    public static void printDateEN(int day, int month, int year)  
    {  
       if (!isValidDate(day, month, year)) {  
          System.out.println("Invalid date!...");  
          return;  
       }  
  
       System.out.printf("%d%s %s %d %s%n", day, getDaySuffix(day), monthsEN[month], year,  
             daysOfWeekEN[getDayOfWeek(day, month, year)]);  
    }  
  
    public static String getDaySuffix(int day)  
    {  
       return switch (day) {  
          case 1, 21, 31 -> "st";  
          case 2, 22 -> "nd";  
          case 3, 23 -> "rd";  
          default -> "th";  
       };  
    }  
      
    public static int getDayOfWeek(int day, int month, int year)  
    {  
       int totalDays = getDayOfYear(day, month, year);  
         
       for (int y = 1900; y < year; ++y) {  
          totalDays += 365;  
          if (isLeapYear(y))  
             ++totalDays;  
       }  
         
       return totalDays % 7;  
    }  
      
      
    public static int getDayOfYear(int day, int month, int year)  
    {  
       int dayOfYear = day;  
  
       for (int m = month - 1; m >= 1; --m)  
          dayOfYear += daysOfMoths[m];  
  
       if (month > 2 && isLeapYear(year))  
          ++dayOfYear;  
         
       return dayOfYear;  
    }  
      
    public static boolean isValidDate(int day, int month, int year)  
    {  
       return 1 <= day && day <= 31 &&  1 <= month && month <= 12 && day <= getDays(month, year);  
    }  
      
    public static int getDays(int month, int year)  
    {  
       return month == 2 && isLeapYear(year) ? 29 : daysOfMoths[month];  
    }  
      
    public static boolean isLeapYear(int year)  
    {  
       return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;  
    }  
}
```

>**Sınıf Çalışması:** Aşağıda prototipi verilen metodu StringUtil sınıfı içerisinde açıklamalara göre yazınız ve aşağıdaki kod ile test ediniz:
>`public static String join(String [] s, String delimiter)` 
>**Açıklamalar:**
>- Metot birinci parametresi ile aldığı String dizisi ile tutulan yazıları ikinci parametresi ile aldığı separator ile birleştirilmiş bir yazıya geri dönecektir.
>- Metot parametre geçerlilik kontrolü yapmayacaktır

```java
package org.csystem.util.string.test;  
  
import org.csystem.util.string.StringUtil;  
  
import java.util.Random;  
import java.util.Scanner;  
  
public class StringUtilJoinTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random random = new Random();  
  
        System.out.print("Bir sayı giriniz:");  
        String [] s = StringUtil.generateRandomTextsTR(random, kb.nextInt(), 5, 16);  
          
        System.out.printf("(%s)", StringUtil.join(s, "--"));  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

>**Anahtar Notlar:** Aslında yukarıdaki metot doğrudan String sınıfının static join metodu çağrılarak da yapılabilir. Bu metodun parametrelerine ilişkin detaylar daha sonra ele alınacaktır.

#### 12 Eylül 2024

>String sınıfının `split` isimli metodu ile bir yazı ayraç (delimiter/separator) ya da ayraçlara göre parçalanabilir. Bu metot parametresi ile ayraç veya ayraçlara ilişkin bir yazı alır. Bu metot ayraç veya ayraçlara ilişkin yazıyı bir düzenli ifade (regular expression) pattern'i olarak alır.
>
>**Anahtar Notlar:** Bir yazı içerisinde belirli kalıplara uygun yazıları aramak için düzenli ifade motorları (regular expression engines/regex engines) kullanılır. Örneğin bir yazı içerisinde sayıların bulunması isteniyorsa ya da örneğin bir yazı içerisinde gg/aa/yyyy formatındaki tarih bilgileri bulunması isteniyorsa ya da örneğin bir yazı içerisinde a ile başlayan ve z biten ve içerisinde rakamların olmadığı yazılar bulunmak isteniyorsa düzenli ifadeler kullanılır. Düzenli ifadeler `Java ile Uygulama Geliştirme` kurslarında detaylı olarak ele alınacaktır.
>
> ***Burada split metodunun kullanımında en çok karşılaşılan regex patternleri ele alınacaktır. Pattern'lere ilişkin detayların bilinmesine şu an gerek yoktur. Birer kalıp olarak hatırlanması önerilir.*** 
> split metodunda ayraçların [ ile ] arasında yazılması önerilir. Bazı karakterlerin regex olarak özel anlamları vardır ve tek başına split metoduna verildiklerinde doğrudan ayraç olarak ele alınmaz. Bu sebeple [ ile ] arasında yazılması uygundur. Eğer [ veya ] ayraç olarak kullanılacaksa ters bölü ile yazılmalıdır. **Yine belirtmekte fayda var ki bu kalıbın da istisna durumları yani detayları söz konusudur.** Ancak pratikte çoğu zaman işimizi görmektedir. [ ile ] arasındaki karakterlerin en az bir tanesinin bulunması durumunda ayraç olarak ele alınır. Örneğin `split("[, .]")` çağrısı virgül, space ve nokta karakterlerini ayraç kabul et anlamındadır.  Ancak burada iki ayraç yanyana geldiğinde aralarındaki boş string de diziye eklenir. Boş string eklenmesi istenmiyorsa yani ayraçların istenildiği kadar yanyana olması durumunda da ayraç olması isteniyorsa ]'den sonra + konmalıdır: `split("[, .]+")

>Aşağıdaki demo örnekte boş string'lerin de diziye eklendiğini gözlemleyiniz

```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       String s = "Bugün hava çok güzel, çok çok güzel. Yarın nasıl olacak acaba?";  
       String [] str = s.split("[, .]");  
  
       for (int i = 0; i < str.length; ++i)  
          System.out.printf("(%s)%n", str[i]);
    }  
} 
```


>Aşağıdaki demo örnekte boş string'lerin diziye eklenmediğini gözlemleyiniz


```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       String s = "Bugün hava çok güzel, çok çok güzel. Yarın nasıl olacak acaba?";  
       String [] str = s.split("[, .]+");  
         
       for (int i = 0; i < str.length; ++i)  
          System.out.printf("(%s)%n", str[i]);
    }  
}
```


>Aşağıdaki örnekte [ ve ] de ayraç olarak verilmiştir


```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       String s = "Bugün hava [çok] güzel, [çok] çok güzel. Yarın nasıl olacak acaba?";  
       String [] str = s.split("[, .\\]\\[]+");  
  
       for (int i = 0; i < str.length; ++i)  
          System.out.printf("(%s)%n", str[i]);  
    }  
}
```


>Aşağıdaki demo örneği inceleyiniz

```java
package org.csystem.app;  
  
import org.csystem.util.string.StringUtil;  
  
class App {  
    public static void main(String [] args)  
    {  
       String s = "Bugün hava [çok] güzel, [çok] çok güzel. Yarın nasıl olacak acaba?";  
       String [] str = StringUtil.split(s, ", . ] [");  
  
       for (int i = 0; i < str.length; ++i)  
          System.out.printf("(%s)%n", str[i]);  
    }  
}
```


>**Sınıf Çalışması:** Klavyeden aşağıdaki formatta girilen yazıyı açıklamalara göre ayrıştırınız.
>öğrenci no:ad soyad:doğum tarihi:ders adı:arasınav notu:final notu
>**Açıklamalar:**
>- Yazının format geçerlilik kontrolü yapılmayacaktır.
>- Formata ilişkin bir örnek aşağıdaki gibidir:
>1234:Oğuz Karan:10/09/1976:Matematik:67:100
>- Öğrenci numarasının sayıya çevrilmesine gerek yoktur
>- Doğum tarihi gg/aa/yyyy formatında olacaktır.
>- Arasınav ve final notları int türden ele alınacaktır.
>- Yazının parse edilmesinden sonra `%40 * arasınav notu + %60 * final notu` formülüne göre en az 50 alanın geçebildiği bir sistemde aşağıdaki gibi bir çıktı üretilecektir:
>
> Öğrenci Numarası: 1234
> Ad Soyad: Oğuz Karan
> Doğum Tarihi: 10 Eylül 1976
> Ders Adı: Matematik
> Arasınav Notu: 67
> Final Notu: 100
> Geçme Notu: 86.8
> Durum: Geçti
>
> - Geçme Notu noktadan sonra tek basamak olarak bilimsel yuvarlanacaktır.
> - Doğum tarihi için JavaSE'de veya başka bir kütüphanede bulunan sınıflar ya da metotlar kullanılmayacaktır. Bunun için DateUtil sınıfınının ilgili metotlarını kullanabilirsiniz.
> ***Not:*** İleride daha iyisi yazılacaktır.

```java
package org.csystem.app.school;  
  
import java.util.Scanner;  
  
public class GradeInfoApp {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
  
        while (true) {  
            System.out.print("Input text:");  
            String s = kb.nextLine();  
  
            if ("quit".equals(s))  
                break;  
  
            GradeInfo gradeInfo = GradeInfoHelper.parse(s);  
  
            GradeInfoHelper.printReport(gradeInfo);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

```java
package org.csystem.app.school;  
  
import static java.lang.Integer.parseInt;  
import static org.csystem.app.datetime.DateUtil.getDateStrTR;  
  
public class GradeInfoHelper {  
    public static GradeInfo parse(String s)  
    {  
        String [] info = s.split("[:]+");  
  
        //...  
  
        String [] birthDateInfo = info[2].split("[/]+");  
        GradeInfo gradeInfo = new GradeInfo();  
  
        gradeInfo.number = info[0];  
        gradeInfo.name = info[1];  
        gradeInfo.birthDate = getDateStrTR(parseInt(birthDateInfo[0]), parseInt(birthDateInfo[1]), parseInt(birthDateInfo[2]));  
        gradeInfo.lectureName = info[3];  
        gradeInfo.midtermGrade = parseInt(info[4]);  
        gradeInfo.finalGrade = parseInt(info[5]);  
  
        return gradeInfo;  
    }  
  
    public static void printReport(GradeInfo gradeInfo)  
    {  
        double grade = gradeInfo.getGrade();  
  
        System.out.printf("Öğrenci Numarası:%s%n", gradeInfo.number);  
        System.out.printf("Ad Soyad:%s%n", gradeInfo.name);  
        System.out.printf("Doğum Tarihi:%s%n", gradeInfo.birthDate);  
        System.out.printf("Ders Adı:%s%n", gradeInfo.lectureName);  
        System.out.printf("Arasınav Notu:%d%n", gradeInfo.midtermGrade);  
        System.out.printf("Final Notu:%d%n", gradeInfo.finalGrade);  
        System.out.printf("Geçme Notu:%.1f%n", grade);  
        System.out.printf("Durum:%s%n", grade > 50 ? "Geçti" : "Kaldı");  
    }  
}
```

```java
package org.csystem.app.school;  
  
public class GradeInfo {  
    public String number;  
    public String name;  
    public String birthDate;  
    public String lectureName;  
    public int midtermGrade;  
    public int finalGrade;  
  
    //...  
    public double getGrade()  
    {  
        return 0.4 * midtermGrade + 0.6 * finalGrade;  
    }  
  
    //...  
}
```

```java
package org.csystem.app.datetime;  
  
public class DateUtil {  
    public static int [] daysOfMoths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
    public static String [] daysOfWeekTR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};  
    public static String [] daysOfWeekEN = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};  
    public static String [] monthsTR = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",  
          "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};  
    public static String [] monthsEN = {"", "January", "February", "March", "April", "May", "June",  
          "July", "August", "September", "October", "November", "December"};  
  
    public static void printDateTR(int day, int month, int year)  
    {  
       if (!isValidDate(day, month, year)) {  
          System.out.println("Geçersiz tarih!...");  
          return;  
       }  
  
       System.out.println(getDateStrTR(day, month, year));  
    }  
  
    public static void printDateEN(int day, int month, int year)  
    {  
       if (!isValidDate(day, month, year)) {  
          System.out.println("Invalid date!...");  
          return;  
       }  
  
       System.out.println(getDateStrEN(day, month, year));  
    }  
  
    public static String getDateStrTR(int day, int month, int year)  
    {  
       return "%d %s %d %s".formatted(day, monthsTR[month], year, daysOfWeekTR[getDayOfWeek(day, month, year)]);  
    }  
  
    public static String getDateStrEN(int day, int month, int year)  
    {  
       return "%d%s %s %d %s".formatted(day, getDaySuffix(day), monthsEN[month], year,  
             daysOfWeekEN[getDayOfWeek(day, month, year)]);  
    }  
  
    public static String getDaySuffix(int day)  
    {  
       return switch (day) {  
          case 1, 21, 31 -> "st";  
          case 2, 22 -> "nd";  
          case 3, 23 -> "rd";  
          default -> "th";  
       };  
    }  
      
    public static int getDayOfWeek(int day, int month, int year)  
    {  
       int totalDays = getDayOfYear(day, month, year);  
         
       for (int y = 1900; y < year; ++y) {  
          totalDays += 365;  
          if (isLeapYear(y))  
             ++totalDays;  
       }  
         
       return totalDays % 7;  
    }  
      
      
    public static int getDayOfYear(int day, int month, int year)  
    {  
       int dayOfYear = day;  
  
       for (int m = month - 1; m >= 1; --m)  
          dayOfYear += daysOfMoths[m];  
  
       if (month > 2 && isLeapYear(year))  
          ++dayOfYear;  
         
       return dayOfYear;  
    }  
      
    public static boolean isValidDate(int day, int month, int year)  
    {  
       return 1 <= day && day <= 31 &&  1 <= month && month <= 12 && day <= getDays(month, year);  
    }  
      
    public static int getDays(int month, int year)  
    {  
       return month == 2 && isLeapYear(year) ? 29 : daysOfMoths[month];  
    }  
      
    public static boolean isLeapYear(int year)  
    {  
       return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;  
    }  
}
```

##### Programın Komut Satırı Argümanları

>Program çalıştırılırken programa verilen yazılara komut satırı argümanları (command line arguments) denir. Komut satırı argümanları terminal/console/shell/comment prompt üzerinden whitespace karakterlerle ayrılacak şekilde verilebilir. Bir java programı çalıştırıldığında komut satırı argümanlarından oluşan bir String dizisi yaratılır ve dizinin referansı ile main çağrılır. Program çalıştırılırken hiç komut satırı argümanı geçilmemişse sıfır elemanlı bir String dizisi ile main çağrılır. Bu durumda programcı, komut satırı argümanlarını alarak ilgili işlemleri yapar. 
>**Anahtar Notlar:** Komut satırı argümanları aslında işletim sistemi tarafında ilgili programa aktarılır. Modern pek çok işletim sisteminde programın ismi de ilk komut satırı argümanı olarak geçilir. Java'da main metoduna geçilen dizide yalnızca komut satırı argümanları bulunur program ismi bulunmaz.
> Bir uygulamada komut satırı argümanları sayısı önemli olabilir. Bu durumda programcı komut satırı argümanına ilişkin dizinin uzunluğuna bakabilir. Tipik olarak komut satırı argümanları sayısının geçerli olmaması durumunda pek çok program ilgili mesajları vererek sonlanabilmektedir.

>Aşağıdaki örnekte programın komut satırı argümanları yazdırılmıştır
```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       for (int i = 0; i < args.length; ++i)  
          System.out.println(args[i]);  
    }  
}
```


>Aşağıdaki demo örneği inceleyiniz
>
>**Anahtar Notlar:** Genellikle hata mesajları `stderr` denilen bir dosyaya yazılır. Java'da `stderr` dosyasına yazma yapmak için System sınıfının err referansı kullanılşabilir. `stdin, stdout ve stderr` dosyaları ileride ele alınacaktır

```java
package org.csystem.app;  
  
import java.util.Random;  
  
class App {  
    public static void main(String [] args)  
    {  
       if (args.length != 3) {  
          System.err.println("usage: java org.csystem.app.App <count> <origin> <bound>");  
          System.exit(1);  
       }  
  
       Random random = new Random();  
       int count = Integer.parseInt(args[0]);  
       int origin = Integer.parseInt(args[1]);  
       int bound = Integer.parseInt(args[2]);  
  
       for (int i = 0; i < count; ++i)  
          System.out.printf("%d ", random.nextInt(origin, bound));  
    }  
}
```

>Aşağıdaki demo örneği inceleyiniz

```java
package org.csystem.app;  
  
import java.util.Random;  
  
import static org.csystem.util.console.CommandLineArgsUtil.checkLengthEquals;  
  
class App {  
    public static void main(String [] args)  
    {  
       checkLengthEquals(3, args.length, "usage: java org.csystem.app.App <count> <origin> <bound>");  
  
       Random random = new Random();  
       int count = Integer.parseInt(args[0]);  
       int origin = Integer.parseInt(args[1]);  
       int bound = Integer.parseInt(args[2]);  
  
       for (int i = 0; i < count; ++i)  
          System.out.printf("%d ", random.nextInt(origin, bound));  
    }  
}
```

#### 17 Eylül 2024

```java
/**  
 * Utility class for array operations * Last Update: 10th September 2024 * @author Java-Jan-2024 Group */
package org.csystem.util.array;  
  
import java.util.Random;  
  
public class ArrayUtil {  
    public static void bubbleSortAscending(int [] a)  
    {  
        for (int i = 0; i < a.length - 1; ++i)  
            for (int k = 0; k < a.length -1 - i; ++k)  
                if (a[k + 1] < a[k])  
                    swap(a, k, k + 1);  
    }  
  
    public static void bubbleSortDescending(int [] a)  
    {  
        for (int i = 0; i < a.length - 1; ++i)  
            for (int k = 0; k < a.length -1 - i; ++k)  
                if (a[k] < a[k + 1])  
                    swap(a, k, k + 1);  
    }  
  
    public static void selectionSortAscending(int [] a)  
    {  
        int min, minIndex;  
  
        for (int i = 0; i < a.length - 1; ++i) {  
            min = a[i];  
            minIndex = i;  
  
            for (int k = i + 1; k < a.length; ++k)  
                if (a[k] < min) {  
                    min = a[k];  
                    minIndex = k;  
                }  
            a[minIndex] = a[i];  
            a[i] = min;  
        }  
    }  
  
    public static void selectionSortDescending(int [] a)  
    {  
        int max, maxIndex;  
  
        for (int i = 0; i < a.length - 1; ++i) {  
            max = a[i];  
            maxIndex = i;  
  
            for (int k = i + 1; k < a.length; ++k)  
                if (max < a[k]) {  
                    max = a[k];  
                    maxIndex = k;  
                }  
            a[maxIndex] = a[i];  
            a[i] = max;  
        }  
    }  
  
    public static void bubbleSort(int [] a)  
    {  
        bubbleSort(a, false);  
    }  
  
    public static void bubbleSort(int [] a, boolean descending)  
    {  
        if (descending)  
            bubbleSortDescending(a);  
        else  
            bubbleSortAscending(a);  
    }  
  
    public static int [] generateRandomArray(Random random, int count, int origin, int bound)  
    {  
        int [] a = new int[count];  
  
        for (int i = 0; i < count; ++i)  
            a[i] = random.nextInt(origin, bound);  
  
        return a;  
    }  
  
    public static double [] generateRandomArray(Random random, int count, double origin, double bound)  
    {  
        double [] a = new double[count];  
  
        for (int i = 0; i < count; ++i)  
            a[i] = random.nextDouble(origin, bound);  
  
        return a;  
    }  
  
    public static boolean [] generateRandomArray(Random random, int count)  
    {  
        boolean [] a = new boolean[count];  
  
        for (int i = 0; i < count; ++i)  
            a[i] = random.nextBoolean();  
  
        return a;  
    }  
  
    public static int [] histogramData(int [] a, int n)  
    {  
        int [] data = new int[n + 1];  
  
        for (int i = 0; i < a.length; ++i)  
            ++data[a[i]];  
  
        return data;  
    }  
  
    public static int max(int [] a)  
    {  
        int result = a[0];  
  
        for (int i = 1; i < a.length; ++i)  
            result = Math.max(result, a[i]);  
  
        return result;  
    }  
  
    public static int max(int [] a, int startIndex)  
    {  
        int result = a[startIndex];  
  
        for (int i = startIndex + 1; i < a.length; ++i)  
            result = Math.max(result, a[i]);  
  
        return result;  
    }  
  
    public static int min(int [] a)  
    {  
        int result = a[0];  
  
        for (int i = 1; i < a.length; ++i)  
            result = Math.min(result, a[i]);  
  
        return result;  
    }  
  
    public static int min(int [] a, int startIndex)  
    {  
        int result = a[startIndex];  
  
        for (int i = startIndex + 1; i < a.length; ++i)  
            result = Math.min(result, a[i]);  
  
        return result;  
    }  
  
    public static int partition(int [] a, int threshold)  
    {  
        int partitionPoint = 0;  
  
        while (partitionPoint != a.length && a[partitionPoint] < threshold)  
            ++partitionPoint;  
  
        if (partitionPoint == a.length)  
            return partitionPoint;  
  
        for (int i = partitionPoint + 1; i < a.length; ++i)  
            if (a[i] < threshold)  
                swap(a, i, partitionPoint++);  
  
        return partitionPoint;  
    }  
  
    public static int partitionByEven(int [] a)  
    {  
        int partitionPoint = 0;  
  
        while (partitionPoint != a.length && a[partitionPoint] % 2 == 0)  
            ++partitionPoint;  
  
        if (partitionPoint == a.length)  
            return partitionPoint;  
  
        for (int i = partitionPoint + 1; i < a.length; ++i)  
            if (a[i] % 2 == 0)  
                swap(a, i, partitionPoint++);  
  
        return partitionPoint;  
    }  
  
    public static void print(int [] a)  
    {  
        print(a, ' ', '\n');  
    }  
  
    public static void print(int [] a, char sep, char end)  
    {  
        print(a, 1, sep, end);  
    }  
  
    public static void print(int [] a, int n)  
    {  
        print(a, n, ' ', '\n');  
    }  
  
    public static void print(int [] a, int n, char sep, char end)  
    {  
        String fmt = String.format("%%0%dd%c", n, sep);  
  
        for (int i = 0; i < a.length; ++i)  
            System.out.printf(fmt, a[i], sep);  
  
        System.out.print(end);  
    }  
  
    public static void print(double [] a)  
    {  
        print(a, '\n', '\n');  
    }  
  
    public static void print(double [] a, char sep, char end)  
    {  
        for (int i = 0; i < a.length; ++i)  
            System.out.printf("%f%c", a[i], sep);  
  
        System.out.print(end);  
    }  
  
    public static void selectionSort(int [] a)  
    {  
        selectionSort(a, false);  
    }  
  
    public static void selectionSort(int [] a, boolean descending)  
    {  
        if (descending)  
            selectionSortDescending(a);  
        else  
            selectionSortAscending(a);  
    }  
    public static long sum(int [] a)  
    {  
        long total = 0;  
  
        for (int i = 0; i < a.length; ++i)  
            total += a[i];  
  
        return total;  
    }  
  
    public static void swap(int [] a, int i, int k)  
    {  
        int temp = a[i];  
  
        a[i] = a[k];  
        a[k] = temp;  
    }  
  
    //...  
}
```

```java
/**  
 * Utility class for command line operations * Last Update: 12th September 2024 * @author Java-Jan-2024 Group */package org.csystem.util.console;  
  
public class CommandLineArgsUtil {  
    public static void checkLengthEquals(int len, int argsLen, String message)  
    {  
        checkLengthEquals(len, argsLen, message, 1);  
    }  
  
    public static void checkLengthEquals(int len, int argsLen, String message, int exitCode)  
    {  
        if (len != argsLen) {  
            System.err.println(message);  
            System.exit(exitCode);  
        }  
    }  
  
    public static void checkLengthGreater(int len, int argsLen, String message)  
    {  
        checkLengthGreater(len, argsLen, message, 1);  
    }  
  
    public static void checkLengthGreater(int len, int argsLen, String message, int exitCode)  
    {  
        if (len <= argsLen) {  
            System.err.println(message);  
            System.exit(exitCode);  
        }  
    }  
  
    //...  
}
```

```java
/**  
 * Utility class for numeric operations * Last Update: 3rd September 2024 * @author Java-Jan-2024 Group */package org.csystem.util.numeric;  
  
public class NumberUtil {  
    public static int countDigits(long a)  
    {  
       return a != 0 ? (int) Math.log10(Math.abs(a)) + 1 : 1;  
    }  
  
    public static long factorial(int n)  
    {  
       long result = 1;  
  
       for (long i = 2; i <= n; ++i)  
          result *= i;  
  
       return result;  
    }  
  
    public static int fibonacciNumber(int n)  
    {  
       if (n <= 2)  
          return n - 1;  
  
       int prev1 = 1, prev2 = 0, result = prev1 + prev2;  
  
       for (int i = 3; i < n; ++i) {  
          prev2 = prev1;  
          prev1 = result;  
          result = prev1 + prev2;  
       }  
  
       return result;  
    }  
  
    public static int [] getDigits(long a)  
    {  
       int [] digits = new int[countDigits(a)];  
  
       a = Math.abs(a);  
  
       for (int i = digits.length - 1; i >= 0; digits[i--] = (int)(a % 10), a /= 10)  
          ;  
  
       return digits;  
    }  
  
    public static int getDigitsPowSum(int a)  
    {  
       int result = 0;  
       int n = countDigits(a);  
  
       while (a != 0) {  
          result += (int)Math.pow(a % 10, n);  
          a /= 10;  
       }  
  
       return result;  
    }  
  
    public static boolean isArmstrong(int a)  
    {  
       return a >= 0 && getDigitsPowSum(a) == a;  
    }  
  
    public static boolean isEven(int a)  
    {  
       return a % 2 == 0;  
    }  
  
    public static boolean isOdd(int a)  
    {  
       return !isEven(a);  
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
  
    public static long nextClosestPrime(long a)  
    {  
       if (a < 2)  
          return 2;  
  
       while (!isPrime(++a))  
          ;  
  
       return a;  
    }  
  
    public static int nextFibonacciNumber(int val)  
    {  
       if (val < 0)  
          return 0;  
  
       int prev1 = 1, prev2 = 0, next = prev1 + prev2;  
  
       while (next <= val) {  
          prev2 = prev1;  
          prev1 = next;  
          next = prev1 + prev2;  
       }  
  
       return next;  
    }  
  
    public static long nthPrime(int n)  
    {  
       long result = 2;  
       int count = 0;  
  
       for (long i = 2; count < n; ++i)  
          if (isPrime(i)) {  
             ++count;  
             result = i;  
          }  
       return result;  
    }  
  
    public static int reverse(int val)  
    {  
       int result = 0;  
  
       while (val != 0) {  
          result = result * 10 + val % 10;  
          val /= 10;  
       }  
  
       return result;  
    }  
  
    public static int sumDigits(int val)  
    {  
       int total = 0;  
  
       while (val != 0) {  
          total += val % 10;  
          val /= 10;  
       }  
  
       return Math.abs(total);  
    }  
}
```

```java
/**  
 * Utility class for string operations * Last Update: 12th September 2024 * @author Java-Jan-2024 Group */package org.csystem.util.string;  
  
import java.util.Random;  
  
public class StringUtil {  
    public static String capitalize(String s)  
    {  
       return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();  
    }  
  
    public static String changeCase(String s)  
    {  
       StringBuilder sb = new StringBuilder(s);  
  
       for (int i = 0; i < s.length(); ++i) {  
          char c = s.charAt(i);  
  
          sb.setCharAt(i, Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));  
       }  
  
       return sb.toString();  
    }  
  
  
    public static int countString(String s1, String s2)  
    {  
       int count = 0;  
  
       for (int i = 0; (i = s1.indexOf(s2, i)) != -1; ++i, ++count)  
          ;  
  
       return count;  
    }  
  
    public static String generateRandomText(Random random, int count, String sourceText)  
    {  
       char [] c = new char[count];  
  
       for (int i = 0; i < count; ++i)  
          c[i] = sourceText.charAt(random.nextInt(sourceText.length()));  
  
       return String.valueOf(c);  
    }  
  
    public static String generateRandomTextEN(Random random, int count)  
    {  
       return generateRandomText(random, count, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");  
    }  
  
    public static String generateRandomTextTR(Random random, int count)  
    {  
       return generateRandomText(random, count, "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz");  
    }  
  
    public static String [] generateRandomTexts(Random random, int count, int origin, int bound, String sourceText)  
    {  
       String [] str = new String[count];  
  
       for (int i = 0; i < count; ++i)  
          str[i] = generateRandomText(random, random.nextInt(origin, bound), sourceText);  
  
       return str;  
    }  
  
    public static String [] generateRandomTextsEN(Random random, int count, int origin, int bound)  
    {  
       return generateRandomTexts(random, count, origin, bound, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");  
    }  
  
    public static String [] generateRandomTextsTR(Random random, int count, int origin, int bound)  
    {  
       return generateRandomTexts(random, count, origin, bound, "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz");  
    }  
  
    public static boolean isPalindrome(String s)  
    {  
       int left = 0;  
       int right = s.length() - 1;  
  
       while (left < right) {  
          char cLeft = s.charAt(left);  
  
          if (!Character.isLetter(cLeft)) {  
             ++left;  
             continue;  
          }  
  
          char cRight = s.charAt(right);  
  
          if (!Character.isLetter(cRight)) {  
             --right;  
             continue;  
          }  
  
          if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight))  
             return false;  
  
          ++left;  
          --right;  
       }  
  
       return true;  
    }  
  
  
    public static boolean isPangram(String s, String alphabet)  
    {  
       for (int i = 0; i < alphabet.length(); ++i)  
          if (s.indexOf(alphabet.charAt(i)) == -1)  
             return false;  
  
       return true;  
    }  
  
  
    public static boolean isPangramEN(String s)  
    {  
       return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuvwxyz");  
    }  
  
    public static boolean isPangramTR(String s)  
    {  
       return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");  
    }  
  
    public static String join(String [] s, String delimiter)  
    {  
       StringBuilder sb = new StringBuilder();  
  
       for (int i = 0; i < s.length; ++i)  
          sb.append(s[i]).append(delimiter);  
  
       return sb.substring(0, sb.length() - delimiter.length());  
    }  
  
    public static String join(String [] s, char delimiter)  
    {  
       return join(s, String.valueOf(delimiter));  
    }  
  
    public static String padLeading(String s, int n, char ch)  
    {  
       int len = s.length();  
  
       return len < n ? String.valueOf(ch).repeat(n - len) + s : s;  
    }  
  
    public static String padLeading(String s, int n)  
    {  
       return padLeading(s, n, ' ');  
    }  
  
    public static String padTrailing(String s, int n, char ch)  
    {  
       int len = s.length();  
  
       return len < n ? s + String.valueOf(ch).repeat(n - len) : s;  
    }  
  
    public static String padTrailing(String s, int n)  
    {  
       return padTrailing(s, n, ' ');  
    }  
  
    public static String reverse(String s)  
    {  
       return new StringBuilder(s).reverse().toString();  
    }  
  
    public static String [] split(String s, String delimiters)  
    {  
       return split(s, delimiters, true);  
    }  
  
    public static String [] split(String s, String delimiters, boolean removeEmptyEntries)  
    {  
       StringBuilder pattern = new StringBuilder("[");  
  
       for (int i = 0; i < delimiters.length(); ++i) {  
          char c = delimiters.charAt(i);  
  
          if (c == '[' || c == ']')  
             pattern.append('\\');  
  
          pattern.append(c);  
       }  
  
       pattern.append(']');  
  
       if (removeEmptyEntries)  
          pattern.append("+");  
  
       return s.split(pattern.toString());  
    }  
}
```


##### for-each Döngü Deyimi

>for-each döngü deyimi Java'ya 1.5 ile eklenmiştir. Bu döngü deyimi "dolaşılabilir (iterable)" türler ile kullanılabilmektedir. Diziler bu anlamda dolaşılabilir türlerdir. İleride başka dolaşılabilir sınıflar da ele alınacaktır. for-each döngü deyimine "enhanced for loop" ya da "range based loop"gibi isimler de verilmektedir. Java programcısı for-each döngü deyiminin kullanıldığı VE okunabilirliği/algılanabilirliği olumsuz etkilemediği durumda kesinlikle for-each döngü deyimini kullanmalıdır. for-each döngü deyiminin genel biçimi şu şekildedir:
>```
>for (<tür> <değişken> : <dolaşılabilir türden referans>)
>   deyim
>```
> Burada döngü değişkeni dolaşılabilir türün her bir elemanının doğrudan atanabildiği (implicit conversion) türden olmalıdır. Aksi durumda error oluşur. Bu döngüda sırasıyla dolaşılabilir türün her elemanı baştan sona olmak üzere döngü değişkenine atanır. Yani, örneğin dolaşılabilir tür bir dizi ise her adımda dizinin ilgili elemanı döngü değişkenine atanmış olur. Bu döngü ile dizi baştan sona dolaşılmış olur. Dikkat edilirse bu döngüde dizinin elemanına erişmek için indeks kullanılması gerekmez.

```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       int [] a = {1, 2, 3, 4, 5, 6};  
  
       for (int val : a)  
          System.out.printf("%d ", val);  
  
       System.out.println();  
    }  
}
```


>for-each döngü deyiminde döngü değişkenine atama implicit olarak yapıldığından aşağıdaki örnekte error oluşur


```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       int [] a = {1, 2, 3, 4, 5, 6};  
  
       for (short val : a) //error  
          System.out.printf("%d ", val);  
  
       System.out.println();  
    }  
}
```

>for-each döngü deyiminde döngü değişkenine atama implicit olarak yapıldığından aşağıdaki örnek geçerlidir

```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       int [] a = {1, 2, 3, 4, 5, 6};  
  
       for (long val : a)  
          System.out.printf("%d ", val);  
  
       System.out.println();  
    }  
}
```

>Aslnda for-each döngü deyimi for döngü gibi de kullanılabilir. Örneğin bir dizinin elemanlarına atama yapmak için indeks numarası gerekir. Programcı bu durumda for-each döngü deyiminde indeks için değişkeni kendisi belirleyerek yine kullanabilir. Ancak bu durum okunabilirlik/algılanabilirlik açısından olumsuz bir durum oluşturur. Bu durumda programcı klasik for döngü deyimini kullanmalıdır. Aşağıdaki örneği inceleyiniz ve durumu gözlemleyiniz. Örnekte ilk döngü klasik for döngüsü olarak yazılsaydı daha okunabilir/algılanabilir olurdu

```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       int [] a = new int[10];  
  
       int i = 0;  
  
       for (int val : a)  
          a[i++] = i * 10;  
  
       for (int val : a)  
          System.out.printf("%d ", val);  
  
       System.out.println();  
    }  
}
```

>**Anahtar Notlar:** Bu durumda for-each döngü deyimi bir dizi için ne zaman tercih edilmemelidir? Aslında bu sorunun cevabı oldukça basittir. Ne zaman dizi için indeks gerekirse o zaman for-each kullanılmamalıdır. Bu durumda tersten söylersek, indeks gerekmediği her durumda for-each kullanılmalıdır

>for-each döngü deyiminde : den sonraki ifade döngünün başında bir kez hesaplanır

```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       for (int val : Sample.getArray())  
          System.out.printf("%d ", val);  
  
       System.out.println();  
    }  
}  
  
class Sample {  
    public static int [] getArray()  
    {  
       System.out.println("getArray");  
  
       return new int[] {1, 2, 3, 4, 5, 6};  
    }  
}
```


>Aşağıdaki örneği inceleyiniz

```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       String [] cities = {"ankara", "istnbul", "İznir"};  

  
       for (String s : cities)  
          System.out.println(s);  
    }  
}
```

>String sınıfı "iterable" bir sınıf olmadığından for-each ile aşağıdaki gibi kullanılamaz

```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       String s = "ankara";  
  
       for (char c : s) //error  
          System.out.printf("%c ", c);  
  
       System.out.println();  
    }  
}
```


>Aşağıdaki örnekte String sınıfının toCharArray metodu çağrılarak char türden dizi dolaşılmıştır

```java
package org.csystem.app;  
  
class App {
    public static void main(String [] args)  
    {  
       String s = "ankara";  
  
       for (char c : s.toCharArray())  
          System.out.printf("%c ", c);  
  
       System.out.println();  
    }  
}
```

>**

```java

```

#### Dizi Dizileri ve Matrisler

> Dizinin her bir elemanı yine bir dizi referansı ise bu durumda bu diziye artık bir dizi dizisi (array of array) denebilir. Programlamada dizi dizisi "jagged array" olarak da adlandırılmaktadır. Örneğin
> `int [][] a` bildiriminde a referansı her bir elamanı int [ ] türünden bir dizi türündendir. Yani aslında bu bir referans dizisidir. Bu durumda dizi yaratılırken new operatörü ile birlikte yine iki tane [ ] kullanılır. Aslında diziler için karmaşık bildirimler de söz konusu olabilir. Örneğin 
> `int [][][] a` bildiriminde a referansı, her bir elemanı bir dizi dizisi olan bir dizi türündendir. Pratikte diziler ve dizi dizileri daha çok kullanılmaktadır. 
> Bir dizi dizisinin her bir elemanı olan dizi referanslarına ilişkin dizilerin uzunları aynı ise bu dizi dizisi artık bir matrisi temsil eder. Yani örneğin ana dizinin uzunluğu m, elemanı olan her dizininin uzunluğu n ise bu dizi artık m x n'lık bir matris olarak kullanılabilir. 
> new operatörü ile bir dizi dizisi yaratılmasında ilk [ ]'in içeris boş olamaz. Çünkü ilk [ ] ana dizinin uzunluğunu belirtir. Diğer [ ]'ler boş olabilir. 

**Anahtar Notlar:** Java'da çok boyutlu dizi (multi dimensional array) yoktur. Yani, Java'da bir matris için iki boyutlu dizi demek teknik olarak doğru değildir. Teknik olarak bir matris de bir dizi dizisidir. 

>Aşağıdaki örneği inceleyiniz 

```java
package org.csystem.app;  
  
import java.util.Random;  
import java.util.Scanner;  
  
class App {  
    public static void main(String [] args)  
    {  
       Random r = new Random();  
       Scanner kb = new Scanner(System.in);  
       System.out.print("Matrisin satır ve sütun sayılarını giriniz:");  
       int m = kb.nextInt();  
       int n = kb.nextInt();  
  
       int[][] a = new int[m][];  
  
       for (int i = 0; i < m; ++i) {  
          a[i] = new int[n];  
          for (int j = 0; j < n; ++j)  
             a[i][j] = r.nextInt(10);  
       }  
  
       for (int i = 0; i < m; ++i) {  
          for (int j = 0; j < n; ++j)  
             System.out.printf("%02d ", a[i][j]);  
  
          System.out.println();  
       }  
  
    }  
}
```

>Bir dizi dizisinin ana dizisi dışında kalan [ ]'ler içeirisinde uzunluk yazıldığında ilgili diziler otomatik olarak o uzunlukta yaratılır. Bu özellike Java 5 ile dile eklenmiştir. Yukarıdaki örnek aşağıdaki gibi yapılabilir

```java
package org.csystem.app;  
  
import java.util.Random;  
import java.util.Scanner;  
  
class App {  
    public static void main(String [] args)  
    {  
       Random r = new Random();  
       Scanner kb = new Scanner(System.in);  
       System.out.print("Matrisin satır ve sütun sayılarını giriniz:");  
       int m = kb.nextInt();  
       int n = kb.nextInt();  
  
       int[][] a = new int[m][n];  
  
       for (int i = 0; i < m; ++i)  
          for (int j = 0; j < n; ++j)  
             a[i][j] = r.nextInt(10);  
  
       for (int i = 0; i < m; ++i) {  
          for (int j = 0; j < n; ++j)  
             System.out.printf("%02d ", a[i][j]);  
  
          System.out.println();  
       }  
  
    }  
}
```

>Aşağıdaki örnekte ikinci [ ]'in içerisinde n yazılması gereksizdir değil mi?

```java
package org.csystem.app;  
  
import org.csystem.util.array.ArrayUtil;  
  
import java.util.Random;  
import java.util.Scanner;  
  
class App {  
    public static void main(String [] args)  
    {  
       Random r = new Random();  
       Scanner kb = new Scanner(System.in);  
       System.out.print("Matrisin satır ve sütun sayılarını giriniz:");  
       int m = kb.nextInt();  
       int n = kb.nextInt();  
  
       int[][] a = new int[m][];  
  
       for (int i = 0; i < m; ++i)  
          a[i] = ArrayUtil.generateRandomArray(r, n, 0, 100);  
  
       for (int i = 0; i < a.length; ++i) {  
          for (int j = 0; j < a[i].length; ++j)  
             System.out.printf("%02d ", a[i][j]);  
  
          System.out.println();  
       }  
  
    }  
}
```

>Dizi dizilerinin for-each döngü deyimi ile dolaşılması

```java
package org.csystem.app;  
  
import org.csystem.util.array.ArrayUtil;  
  
import java.util.Random;  
import java.util.Scanner;  
  
class App {  
    public static void main(String [] args)  
    {  
       Random r = new Random();  
       Scanner kb = new Scanner(System.in);  
       System.out.print("Matrisin satır ve sütun sayılarını giriniz:");  
       int m = kb.nextInt();  
       int n = kb.nextInt();  
  
       int[][] a = new int[m][];  
  
       for (int i = 0; i < m; ++i)            
			a[i] = ArrayUtil.generateRandomArray(r, n, 0, 100);  
  
       for (int [] array : a) {  
          for (int val : array)  
             System.out.printf("%02d ", val);  
  
          System.out.println();  
       }  
    }  
}
```

#### 19 Eylül 2024

> Dizi dizilerine ilk değer içiçe küme parantezleri ile verilebilir

```java
package org.csystem.app;  
  
import org.csystem.util.array.ArrayUtil;  
  
class App {  
    public static void main(String [] args)  
    {  
       int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  
       int [][] b = {{1, 2, 3}, {4, 5, 6, 3}, {7, 8, 9}};  
  
       ArrayUtil.print(a);  
       System.out.println("--------------------------------");  
       ArrayUtil.print(b);  
    }  
}
```

>**Sınıf Çalışması:** Parametresi ile aldığı bir dizi dizisinin matris olup olmadığını test eden `isMatrix` isimli metodu ve parametresi ile aldığı bir dizi dizisinin bir kare matris olup olmadığını test eden `isSquareMatrix` metodunu `MatrixUtil` isimli sınıfın içerisinde yazınız ve test ediniz

```java
package org.csystem.util.matrix.test;  
  
import org.csystem.util.array.ArrayUtil;  
import org.csystem.util.matrix.MatrixUtil;  
  
public class MatrixUtilIsMatrixTest {  
    public static void run()  
    {  
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  
        int [][] b = {{1, 2, 3}, {4, 5, 6, 3}, {7, 8, 9}};  
  
        ArrayUtil.print(a);  
        System.out.println("--------------------------------");  
        ArrayUtil.print(b);  
  
        System.out.println(MatrixUtil.isMatrix(a) ? "Matris" : "Matris değil");  
        System.out.println(MatrixUtil.isMatrix(b) ? "Matris" : "Matris değil");  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

```java
package org.csystem.util.matrix.test;  
  
import org.csystem.util.array.ArrayUtil;  
import org.csystem.util.matrix.MatrixUtil;  
  
public class MatrixUtilIsSquareMatrixTest {  
    public static void run()  
    {  
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  
        int [][] b = {{1, 2, 3}, {4, 5, 6, 3}, {7, 8, 9}};  
        int [][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3}};  
  
        ArrayUtil.print(a);  
        System.out.println("--------------------------------");  
        ArrayUtil.print(b);  
        System.out.println("--------------------------------");  
        ArrayUtil.print(c);  
  
        System.out.println(MatrixUtil.isSquareMatrix(a) ? "Kare matris" : "Kare matris değil");  
        System.out.println(MatrixUtil.isSquareMatrix(b) ? "Kare matris" : "Kare matris değil");  
        System.out.println(MatrixUtil.isSquareMatrix(c) ? "Kare matris" : "Kare matris değil");  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

>**Sınıf Çalışması:*** Parametresi ile aldığı bir kare matrisin esas köşegeni (diagonal) üzerindeki elemanların toplamına geri dönen `sumDiagonal` isimli metodu MatrixUtil içerisinde yazınız ve test ediniz.
>**Açıklamalar:**
>- Metot parametresi ile aldığı referansa ilişkin dizi dizisinin kare matris olup olmadığını kontrol etmeyecektir.
>- Bir kare matrisin esas köşegeni üzerindeki elemanlar, matrisin n x n lik ise sırasıyla `a[0][0], a[1][1], ..., a[n - 1][n - 1]` elemanlarıdır.
>- Metot taşmaları düşünmeden long türüne geri dönecektir.

```java
package org.csystem.util.matrix.test;  
  
import org.csystem.util.matrix.MatrixUtil;  
  
import java.util.Random;  
import java.util.Scanner;  
  
public class MatrixUtilSumDiagonalTest {  
    public static void run()  
    {  
        Random random = new Random();  
        Scanner kb = new Scanner(System.in);  
  
  
        while (true) {  
            System.out.print("Bir sayı giriniz:");  
            int n = Integer.parseInt(kb.nextLine());  
  
            if (n <= 0)  
                break;  
  
            int [][] a = MatrixUtil.generateRandomSquareMatrix(random, n, 0, 100);  
  
            MatrixUtil.print(a, 2);  
  
            System.out.printf("Esas köşegen toplamı:%d%n", MatrixUtil.sumDiagonal(a));  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```


>Bir dizi dizisinin en büyük elemanı bulunurken, dizinin ilk elemanını almak yerine ilgili türün en küçük değeri alınır. İşlem klasik olarak devam eder. Benzer dırım en küçük eleman bulunurken de ilgili türün en büyük değerini alarak yapılabilir. Bu bir yaklaşımdır. Pek çok başka yaklaşım söz konusu olabilir. Aşağıdaki max ve min metotlarını inceleyiniz. Metotlar durumu anlatmak için en ilkel biçimde yazılmıştır

```java
public static int max(int [][] a)  
{  
    int result = Integer.MIN_VALUE;  
  
    for (int i = 0; i < a.length; ++i)  
        for (int j = 0; j < a[i].length; ++j)  
            if (result < a[i][j])  
                result = a[i][j];  
  
    return result;  
}

public static int min(int [] a, int startIndex)  
{  
    int result = a[startIndex];  
  
    for (int i = startIndex + 1; i < a.length; ++i)  
        result = Math.min(result, a[i]);  
  
    return result;  
}
```



>MatrixUtil sınıfının min ve max metotları

```java
package org.csystem.util.matrix.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.matrix.MatrixUtil.*;  
  
public class MatrixUtilMinMaxTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Satır sayısını giriniz:");  
            int m = Integer.parseInt(kb.nextLine());  
  
            System.out.print("Sütun sayısını giriniz:");  
            int n = Integer.parseInt(kb.nextLine());  
  
            if (m <= 0 || n <= 0)  
                break;  
  
            int [][] a = generateRandomMatrix(r, m, n, 0, 100);  
  
            print(a, 2);  
            System.out.printf("En büyük eleman:%d%nEn küçük eleman:%d%n", max(a), min(a));  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

#### 24 Eylül 2024

>**Sınıf Çalışması:** Parametresi ile aldığı int türden iki matrisin toplamından oluşan matrise geri dönen add isimli metodu MatrixUtil sınıfı içerisinde yazınız ve test ediniz.
>**Açıklamalar:**
>- Metot matris olup olmama kontrolü yapmayacaktır.
>- Metot matrislerin toplanıp toplanmayacağını kontrol etmeyecektir.
>- İki matrisin toplamı karşılıklı elemanların toplamından elde edilen yeni bir matristir.


```java
package org.csystem.util.matrix.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.matrix.MatrixUtil.*;  
  
public class MatrixUtilAddTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Satır sayısını giriniz:");  
            int m = Integer.parseInt(kb.nextLine());  
  
            System.out.print("Sütun sayısını giriniz:");  
            int n = Integer.parseInt(kb.nextLine());  
  
            if (m <= 0 || n <= 0)  
                break;  
  
            int [][] a = generateRandomMatrix(r, m, n, 0, 100);  
            int [][] b = generateRandomMatrix(r, m, n, 0, 100);  
  
            print(a, 2);  
            System.out.println("---------------------------------------------");  
            print(b, 2);  
            System.out.println("---------------------------------------------");  
  
            int [][] c = add(a, b);  
  
            print(c, 3);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```



>**Sınıf Çalışması:** Parametresi ile aldığı int türden iki matrisinin farkında oluşan matrise geri dönen subtract isimli metodu MatrixUtil sınıfı içerisinde yazınız ve test ediniz.
>**Açıklamalar:**
>- Metot matris olup olmama kontrolü yapmayacaktır.
>- Metot matrislerin çıkartılıp çıkartılamayacağını kontrol etmeyecektir.
>- İki matrisin farkı karşılıklı elemanların farkından elde edilen yeni bir matristir.

```java
package org.csystem.util.matrix.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.matrix.MatrixUtil.*;  
  
public class MatrixUtilSubtractTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Satır sayısını giriniz:");  
            int m = Integer.parseInt(kb.nextLine());  
  
            System.out.print("Sütun sayısını giriniz:");  
            int n = Integer.parseInt(kb.nextLine());  
  
            if (m <= 0 || n <= 0)  
                break;  
  
            int [][] a = generateRandomMatrix(r, m, n, 0, 100);  
            int [][] b = generateRandomMatrix(r, m, n, 0, 100);  
  
            print(a, 2);  
            System.out.println("---------------------------------------------");  
            print(b, 2);  
            System.out.println("---------------------------------------------");  
  
            int [][] c = subtract(a, b);  
  
            print(c, 3);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```


>**Sınıf Çalışması:** Parametresi ile aldığı int türden bir matris ile, ikinci parametresi ile aldığı int türden bir sayıyı çarpan multiplyBy metodunu yazınız ve test ediniz.
>**Açıklamalar:**
>- Metot matris olup olmama kontrolü yapmayacaktır.
>- Bir matrisin bir sayı (scalar) ile çarpımı matrisin tüm elemanlarını o sayı ile çarpmaktır.

```java
package org.csystem.util.matrix.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.matrix.MatrixUtil.*;  
  
public class MatrixUtilMultiplyByTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Satır sayısını giriniz:");  
            int m = Integer.parseInt(kb.nextLine());  
  
            System.out.print("Sütun sayısını giriniz:");  
            int n = Integer.parseInt(kb.nextLine());  
  
            if (m <= 0 || n <= 0)  
                break;  
  
            System.out.print("Bir sayı giriniz:");  
            int value = Integer.parseInt(kb.nextLine());  
  
            int [][] a = generateRandomMatrix(r, m, n, 0, 100);  
  
  
            print(a, 2);  
            System.out.println();  
            multiplyBy(a, value);  
            print(a, 3);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```


>**Sınıf Çalışması:** Parametresi ile aldığı int türden bir matrisin devriğine (transpose) geri dönen transpose isimli metodu MatrixUtil sınıfı içerisinde yazınız ve test ediniz
>**Açıklamalar:**
>- Metot matris olup olmama kontrolü yapmayacaktır.
>- Bir matrisin devriği satırların sütun sütunların yapılmış halidir.

```java
package org.csystem.util.matrix.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.matrix.MatrixUtil.*;  
  
public class MatrixUtilTransposeTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Satır sayısını giriniz:");  
            int m = Integer.parseInt(kb.nextLine());  
  
            System.out.print("Sütun sayısını giriniz:");  
            int n = Integer.parseInt(kb.nextLine());  
  
            if (m <= 0 || n <= 0)  
                break;  
  
            int [][] a = generateRandomMatrix(r, m, n, 0, 100);  
  
            print(a, 2);  
            System.out.println();  
            print(transpose(a), 2);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```

>Dizi dizilerine ilişkin karmaşık bildirimler de söz konusu olabilmektedir. Örneğin: 
>`int [][][] a` referansı her bir elemanı bir dizi dizisi olan bir dizi referansını temsil eder. Bu durumda eğer dizi dizilerinin kendi aralarında uzunlukları ve dizi dizilerine ilişkin dizilerin de kendi aralarında uzunlukları eşitse yani örneğin bu referansa `new int[3][4][5]` gibi bir dizinin referansı verilirse bu bir dikdörtgen prizmayı temsil edebilir. Şüphesiz daha karmaşık bildirimler de söz konusu olabilir ancak pratikte çok kullanılmaz.

```java
package org.csystem.app;  
  
import java.util.Random;  
  
class App {  
    public static void main(String [] args)  
    {  
       int [][][] a = new int[3][4][5];  
       Random r = new Random();  
  
       for (int i = 0; i < a.length; ++i)  
          for (int j = 0; j < a[i].length; ++j)  
             for (int k = 0; k < a[i][j].length; ++k)  
                a[i][j][k] = r.nextInt(100);  
  
       //...  
  
  
       for (int [][] arrayOfArray : a)  
          for (int [] array : arrayOfArray)  
             for (int val : array)  
                System.out.println(val);  
    }  
}
```
#### 1 Ekim 2024

> **Sınıf Çalışması:** Parametresi ile aldığı int türden iki matrisin çarpımından oluşan matrisi döndüren multiply isimli metodu MatrixUtil içerisinde yazınız ve aşağıdaki kod test ediniz
> **Açıklamalar:**
> - Metot matris olup olmama kontrolü yapmayacaktır.
> - Metot matrislerin çarpılıp çarpılmayacağını kontrol etmeyecektir
> - Matris çarpımına ilişkin formülü şu link'den elde edebilirsiniz:  https://en.wikipedia.org/wiki/Matrix_multiplication

```java
package org.csystem.util.matrix.test;  
  
import java.util.Random;  
import java.util.Scanner;  
  
import static org.csystem.util.matrix.MatrixUtil.*;  
  
public class MatrixUtilMultiplyTest {  
    public static void run()  
    {  
        Scanner kb = new Scanner(System.in);  
        Random r = new Random();  
  
        while (true) {  
            System.out.print("Satır sayısını giriniz:");  
            int m = Integer.parseInt(kb.nextLine());  
  
            System.out.print("Sütun sayısını giriniz:");  
            int n = Integer.parseInt(kb.nextLine());  
  
            System.out.print("İkinci matrisin sütun sayısını giriniz:");  
            int k = Integer.parseInt(kb.nextLine());  
  
            if (m <= 0 || n <= 0 || k <= 0)  
                break;  
  
            int [][] a = generateRandomMatrix(r, m, n, 0, 10);  
            int [][] b = generateRandomMatrix(r, n, k, 0, 10);  
  
            print(a, 2);  
            System.out.println("---------------------------------------------");  
            print(b, 2);  
            System.out.println("---------------------------------------------");  
  
            int [][] c = multiply(a, b);  
  
            print(c, 3);  
        }  
    }  
  
    public static void main(String[] args)  
    {  
        run();  
    }  
}
```
XXXXXXXXXXXXXXXXXXXXXXX
> **Sınıf Çalışması:** Bir okulda ortak olarak Fizik sınavı yapılıyor olsun. Sınav n tane şube için yapılsın. n sayısını klavyeden isteyiniz. Her bir şubedeki öğrenci sayısını da klavyeden isteyiniz. Bu sınavdan alınan notları rassal olarak belirleyiniz. Bu işlemlerden sonra ilgili notlara göre her bir şubenin ayrı ayrı Fizik dersi ortalaması ve okulun Fizik dersi ortalamasını hesaplayan simülasyonu yazınız.
> **Açıklamalar:**
> - Bir öğrencinin not [0, 10] aralığında bir tamsayı olabilir.
> - Programı mümkün olduğunca nesne yönelimli olarak ve genel olarak tasarlayınız
> - Her bir şubenin not dağılımına ilişkin histogram'ları  ve okulun Fizik notlarına ilişkin histogramı (düşey olarak) çiziniz.

##### Sınıf Elemanlarının Temel Erişim Belirleyicileri

>Anımsanacağı gibi sınıf elemanları  (member) şu erişim belirleyicilerden birini alabilirler: **public, no-modifier, protected, private.**
>
>Burada no-modifier erişim belirleyici yazmamak anlamındadır. Java'da no-modifier'ın da diğerlerinden farklı bir anlamı vardır. 
>
>Burada öncelikle bu erişim belirleyicilerin syntax ve semantic olarak kuralları ele alınacak, sonrasında NYPT'de kullanımı anlatılacaktır.
>
>Aslında bir sınıf erişim belirleyiciler açısından 4 bölümden oluşur. Bir eleman hangi erişim belirleyici ile bildirilirse o bölüme eklenmiş olur. 
>
>public ve private bölümlerin anlamı aynı paketteki diğer sınıflar (friendly classes) veya farklı paketlerdeki diğer sınıflar için değişmez. Yani private bölüme erişim aynı paketteki veya farklı paketlerdeki diğer sınıflar için aynı anlamdadır. Benzer şekilde public bölümün anlamı aynı paketteki diğer sınıflar için ve farklı paketlerdeki diğer sınıflar için aynıdır. Ancak no-modifier ve protected bölümlere aynı paketteki diğer sınıfların erişimi ile farklı paketlerdeki diğer sınıflların erişimleri değişiklik göstermektedir. 
>
>Erişim belirleyiciler, sınıf dışından erişimlerde geçerlidir. Sınıf içerisinde her bölüme erişilebilir.
>
>Syntax açısından bölümlere ait elemanlar karışık olarak bildirilebilir. Şüphesiz belli bir düzende bildirimi okunabilirliği artırır. 


>Sınıfın public bölümüne aynı paketteki tüm sınıflardan erişilebilir

```java
package x;  
  
public class A {  
    public int a;  
  
    public A(/*...*/)  
    {  
        //...  
    }  
  
    public void foo()  
    {  
        //...  
    }  
}
```

```java
package x;  
  
public class B {  
    public void bar()  
    {  
        A o = new A(/*...*/);  
  
        o.a = 20;  
        o.foo();  
    }  
}
```

>Sınıfın public bölümüne farklı paketlerdeki tüm sınıflardan erişilebilir

```java
package x;  
  
public class A {  
    public int a;  
  
    public A(/*...*/)  
    {  
        //...  
    }  
  
    public void foo()  
    {  
        //...  
    }  
}
```

```java
package y;  
  
import x.A;  
  
public class B {  
    public void bar()  
    {  
        A o = new A(/*...*/);  
  
        o.a = 20;  
        o.foo();  
    }  
}
```

>Sınıfın private bölümüne aynı paketteki diğer sınıflardan erişilemez

```java
package x;  
  
public class A {  
    private int a;  
  
    private A(/*...*/)  
    {  
        //...  
    }  
  
    private void foo()  
    {  
        //...  
    }  
}
```

```java
package x;  
  
public class B {  
    public void bar()  
    {  
        A o = new A(/*...*/); //error  
  
        o.a = 20; //error  
        o.foo(); //error  
    }  
}
```

>Sınıfın private bölümüne farklı paketlerdeki diğer sınıflardan erişilemez

```java
package x;  
  
public class A {  
    private int a;  
  
    private A(/*...*/)  
    {  
        //...  
    }  
  
    private void foo()  
    {  
        //...  
    }  
}
```

```java
package y;  
  
import x.A;  
  
public class B {  
    public void bar()  
    {  
        A o = new A(/*...*/); //error  
  
        o.a = 20; //error  
        o.foo(); //error  
    }  
}
```

>Sınıfın no-modifier bölümü aynı paketteki diğer sınıflar için public anlamındadır

```java
package x;  
  
public class A {  
    int a;  
  
    A(/*...*/)  
    {  
        //...  
    }  
  
    void foo()  
    {  
        //...  
    }  
}
```

```java
package x;  
  
public class B {  
    public void bar()  
    {  
        A o = new A(/*...*/);  
  
        o.a = 20;  
        o.foo();  
    }  
}
```

>Sınıfın no-modifier bölümü farklı paketlerdeki diğer sınıflar için private anlamındadır

```java
package x;  
  
public class A {  
    int a;  
  
    A(/*...*/)  
    {  
        //...  
    }  
  
    void foo()  
    {  
        //...  
    }  
}
```

```java
package y;  
  
import x.A;  
  
public class B {  
    public void bar()  
    {  
        A o = new A(/*...*/); //error
  
        o.a = 20;  //error
        o.foo();  //error
    }  
}
```

**Anahtar Notlar:** Sınıfın no-modifier bölümündeki elemanlar için "package-private" terimi de kullanılabilmektedir

>Sınıfın protected bölümü aynı paketteki diğer sınıflar için public anlamındadır

```java
package x;  
  
public class A {  
    protected int a;  
  
    protected A(/*...*/)  
    {  
        //...  
    }  
  
    protected void foo()  
    {  
        //...  
    }  
}
```

```java
package x;  
  
public class B {  
    public void bar()  
    {  
        A o = new A(/*...*/);  
  
        o.a = 20;  
        o.foo();  
    }  
}
```

>Sınıfın protected bölümü farklı paketlerdeki diğer sınıflar için türetme (inheritance) söz konusu değilse private anlamındadır. Türemiş sınıf (derived/sub class) kendisine ait protected bölüme erişibilir. protected bölümün anlamı ve türemiş sınıfı kavramı inheritance konusunda ayrıca ele alınacaktır

```java
package x;  
  
public class A {  
    protected int a;  
  
    protected A(/*...*/)  
    {  
        //...  
    }  
  
    protected void foo()  
    {  
        //...  
    }  
}
```

```java
package y;  
  
import x.A;  
  
public class B {  
    public void bar()  
    {  
        A o = new A(/*...*/); //error  
  
        o.a = 20; //error  
        o.foo(); //error  
    }  
}
```

>Sınıf içerisinde her bölüme erişilebilir

```java
package x;  
  
public class A {  
    private int a;  
  
    protected void foo()  
    {  
        a = 10;  
    }  
}
```


>Erişim belirleyicilere ilişkin özet tablo şu şekildedir:

| Erişim Belirleyici | Aynı Sınıf | Friendly Sınıf | Farklı Paketteki Sınıf | Türemiş sınıf |
| ------------------ | ---------- | -------------- | ---------------------- | ------------- |
| public             | T          | T              | T                      | T             |
| protected          | T          | T              | F                      | T             |
| no-modifier        | T          | T              | F                      | F             |
| private            | T          | F              | F                      | F             |
##### 3 Êkim 2024

#### Encapsulation, Data/Information Hiding

>NYPT'de özellikle veri elemanlarının gizlenmesine **encapsulation** denilmektedir. Bu anlamda bu kavrama **veri/bilgi gizleme (data/information hiding**) de denilmektedir. Bu kavram aslında gerçek hayattan programlamaya aktarılmıştır. Örneğin, televizyon izleyen bir kişi televizyonun, kumandası ile nasıl haberleştiğini bilmek zorunda değildir. Yani  bunu bilmesi ya da bilmemesi izlemesini etkilemez. Bu durumda aslında kumanda ile haberleşme kısmı televizyonu izleyenden gizlenmiştir.  Çünkü gerek yoktur. Ancak televizyonu üreten açısından bunun bilinmesi gerekir.  
>
>Bir sınıf için iki bakış açısı söz konusudur: **yazan bakış açısı, kullanan bakış açısı.**  Sınıfı yazan, sınıfa ilişkin tüm detayları ve sınıfı kullanan bakış açısını da bilmelidir. Sınıfı kullanan ise içsel detayları bilmek zorunda değildir. Bu anlamda sınıfın bildirimine hizmet veren anlamında **server codes**, kullanan kodlara  ise hizmet alan anlamında **client codes** da denilmektedir. Aslında bu kavramlar geneldir. Sınıf elemanlarının  gizlenmesi ile NYPT'de kullanılmaktadır.  
>
  Bir sınıfın veri elemanı gizlendiğinde, dışarıdan değerinin değiştirilmesi ve/veya değerinin elde edilmesi gerekebilir.  Bunun için veri elemanına erişen public metotların yazılması gerekir. Gizlenmiş bir veri elemanının değerini değiştirmek  için yazılan public metoda **set metodu (setter/mutator)** denir ve bir convention olarak (genelde) **set** öneki ile başlatılır.  Gizlenmiş bir veri elemanının değerini elde etmek için yazılan public metoda **get metodu (getter/accessor)** denir ve  bir convention olarak (genelde) **get** öneki ile başlatılır. Veri elemanı boolean türdense tipik olarak getter, **is** ile başlatılır. Gizlenenen bir eleman için mutator ve accessor metotlarının yazılıp yazılmayacağı sınıfa yani domain'e  bağlıdır. Bazı veri elemanları için hiç biri yazılmayabilirken, bazı veri elemanları için bir tanesi, bazı veri  elemanları için ise ikisi de yazılabilir.
>
  Bir sınıfın public ve protected bölümleri dökumante edilir. private ve no-modifier bölümleri dökumante edilmez. Bir sınıfın bir elemanının erişim belirleyicisi (yani aslında sınıfın bölümleri) diğer sınıflar için anlamldır. Sınıf  içerisinden erişimde elemanın hangi bölümde olduğunun önemi yoktur.

>**Anahtar Notlar:** Değişken atom isimlendirmede bazı teknikler kullanılmaktadır. Bu teknikler dışında da isimlendirme yapılabilir. Burada anlatılanlar çok kullanılan ve bilinen tekniklerdir:
>1. **Unix style (snake case):** Bu isimlendirmede karakterlerin tamamı küçük harfle yazılır, kelimeler alttire karakteri ile ayrılır. Örneğin: `number_of_devices` `find_file`. Bu isimlendirme Java'da doğrudan tercih edilmez.
>2. **Lower Camel Case:** Bu isimlendirmede kelimeler bitişik yazılır. İlk kelimenin baş harfi küçük, diğer kelimelerin baş harfi büyük olur. Diğer tüm karakterler de küçük harfle yazılır. Örneğin: `numberOfDevices`, `nextInt`, `findFile`. Bu isimlendirme genel olarak Java'da metot isimlerinde, yerel değişken isimlerinde, parametre değişkeni, sınıf elemanı isimlerinde tercih edilir.
>3. **Upper Camel Case:** Bu isimlendirmede kelimeler bitişik yazılır. Tüm kelimelerin baş hafleri büyük, geri kalan tüm karakterler küçük harfle yazılır. Örneğin: `ArrayUtil`, `ReflectionUtils`. Bu isimlerde Java'da genel olarak UDT isimlerinde tercih edilir. 
>
> İsimlendirmede bunlardan biri yada birden fazlası kullanılabilir. Hatta bunlardan biri kullanılmak zorunda bile değildir. Örneğin Java'da paket isimlerinin tamamı küçük harf  ve kelimeler bitişik olacak şekilde yazılır. Örneğin: `java.util`, `org.csystem.util.array`, `org.sprinframework.boot`.
> 
> Burada anlatılan teknikler tamamen geneldir ve bunlara isimler verilmiştir. Hatta bazen isimlendirmede bir ya da birden fazla teknik biraz değiştirilecek kullanılabilmektedir.
> 
> **Anahtar Notlar:** Programcılar genel olarak programlama dilinin doğasına uygun olacak şekilde isimlendirme yaparlar. Örneğin Java'da metot isimleri lower camel olarak kullanıldığından Java programcısı da kendi yazdığı metotlar aynı teknikle isimlendirme yapar.
> 
> **Anahtar Notlar:** Bazı programcılar özellikle private veri elemanlarının isimlendirmesinde bazı önekler (prefix) kullanalabilmektedir. Örneğin `m_`, `d_`, `m` önekleri tercih edilebilmektedir. Bazı programcılar hiç bir önek koymamayı tercih edebilirler. Bu tür yaklaşımların iyisi kötüsü yoktur. Geliştirici ekip tarafında belirlen teknik kullanılır. Biz convention olarak, sınıfların non-static ve private veri elemanları için `m_` önekini, sınıfın static ve private veri elemanları için `ms_` önekini kullanacağız.

>Aşağıdaki demo Time sınıfı ve accessor ve mutator metotlarını inceleyiniz

```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       Time t = new Time(21, 21, 39);  
  
       System.out.printf("%02d:%02d:%02d%n", t.getHour(), t.getMinute(), t.getSecond());  
       t.setHour(22);  
       t.setMinute(34);  
       t.setSecond(0);  
       System.out.printf("%02d:%02d:%02d%n", t.getHour(), t.getMinute(), t.getSecond());  
    }  
}  
  
class Time {  
    private int m_hour;  
    private int m_minute;  
    private int m_second;  
  
    //...  
  
    public Time(int hour, int minute, int second)  
    {  
       //...  
       m_hour = hour;  
       m_minute = minute;  
       m_second = second;  
    }  
  
    public int getHour()  
    {  
       return m_hour;  
    }  
  
    public void setHour(int value)  
    {  
       //...  
       m_hour = value;  
    }  
  
    public int getMinute()  
    {  
       return m_minute;  
    }  
  
    public void setMinute(int value)  
    {  
       //...  
       m_minute = value;  
    }  
  
    public int getSecond()  
    {  
       return m_second;  
    }  
  
    public void setSecond(int value)  
    {  
       //...  
       m_second = value;  
    }  
  
    //...  
}
```

>Aşağıdaki durumlardan en az bir tanesi varsa ilgili veri elemanı gizlenir:
>- Sınıfların versiyonları ilerledikçe yani sınıfın kodlarında değişiklik ya da eklentiler yapıldıkça veri elemanları isimlerinin hatta türlerinin değiştirilmesi ile çok fazla karşılaşılır. Bu durumda eski kodların yeni değişikliklerden etkilenmemesi için veri elemanları gizilenir.
>
>-  Bir veri elemanının sınır değerleri olabilir. Bu durumda sınırlar dışında değer verilmemesi için veri elemanı gizlenir.
>
>- Bir veri elemanının değeri, başka bir veri elemanın değerine bağlı olarak hesaplanıyor olabilir. Bu durumda veri elemanı gizlenir. 
>
>- Bir veri elemanının değişen değerine göre bir işlem yapılması gerekebilir. Örneğin, bir veritabanı bağlantısına yönelik bir bilginin değişmesi durumunda eski bağlantının kopartılıp yeni bağlantının sağlanması gerekebilir. Bu durumda ilgili veri elemanı gizlenir.
> 
> **Anahtar Notlar:** Bazı durumlarda yukarıki durumlarda biri olmasa bile veri elemanı gizlenebilir. Örneğin, sınıfın bir veri elemanı dışında kalan diğer veri elemanları gizlenmesi gerekebilir. Bütünlüğün bozulmaması için gizlenmesi gerekmeyen veri elemanı da gizlenebilir. Bu durumda yine ilgili accessor ve mutator metotlar yazılır. Bu da aslında sınıfa bağlıdır.
> 
> **Anahtar Notlar:** Yukarıdaki 4 durumdan en az bir tanesi varsa programcı hiç düşünmeden veri elemanın gizlemelidir.
> 
> **Anahtar Notlar:** Yukarıdaki durumlardan hiçibirisi ile karşılaşılmaması durumunda (%3 - %5 arasında karşılaşılmaz) illgili veri elemanı yapılabilir.

>Aşağıdaki demo Time sınıfının kodları değişmesine rağmen, değişiklik yapılmadan yazılmış client code'ların etkilenmediğine dikkat ediniz

```java
package org.csystem.app;  
  
class App {  
    public static void main(String [] args)  
    {  
       Time t = new Time(21, 21, 39);  
  
       System.out.printf("%02d:%02d:%02d%n", t.getHour(), t.getMinute(), t.getSecond());  
       t.setHour(22);  
       t.setMinute(34);  
       t.setSecond(0);  
       System.out.printf("%02d:%02d:%02d%n", t.getHour(), t.getMinute(), t.getSecond());  
    }  
}  
  
class Time {  
    private String m_timeStr;  
    //...  
  
    public Time(int hour, int minute, int second)  
    {  
       //...  
       m_timeStr = "%02d:%02d:%02d".formatted(hour, minute, second);  
    }  
  
    public int getHour()  
    {  
       return Integer.parseInt(m_timeStr.substring(0, 2));  
    }  
  
    public void setHour(int value)  
    {  
       //...  
       m_timeStr = "%02d:%02d:%02d".formatted(value, getMinute(), getSecond());  
    }  
  
    public int getMinute()  
    {  
       return Integer.parseInt(m_timeStr.substring(3, 5));  
    }  
  
    public void setMinute(int value)  
    {  
       //...  
       m_timeStr = "%02d:%02d:%02d".formatted(getHour(), value, getSecond());  
    }  
  
    public int getSecond()  
    {  
       return Integer.parseInt(m_timeStr.substring(6));  
    }  
  
    public void setSecond(int value)  
    {  
       //...  
       m_timeStr = "%02d:%02d:%02d".formatted(getHour(), getMinute(), value);  
    }  
  
    //...  
}
```

>**Anahtar Notlar:** Bazı durumlarda sınıfın public bölümünde değişiklik yapılması gerekebilir. Bu durumda değişikliği doğrudan yapmak yerine, eskisi korunup deprecated yapılabilir. Şüphesiz bu durum da domain'e bağlıdır. Ayrıca bu durum sınıfın dökumantasyonunda belirtilir.

