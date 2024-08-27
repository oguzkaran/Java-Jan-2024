
#### 27 Ağustos 2024

>**_Sınıf Çalışması:_** Sayısal loto kupon üreten programı yazınız.
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

>**_Sınıf Çalışması:_** Sayısal loto kupon üreten programı yazınız.
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

>*Dizilerin sıraya dizilmesine yönelik pek çok algoritma bulunmaktadır. Sıralama işleminin küçükten büyüğe ya da başka bir deyişle artan sırada (ascending) yapılmasına doğal sıralama (natural sort order) denir. Dizilerin azalan sırada sıralanmasına "descending order" denilmektedir. Biz burada kabarcık sıralama (bubble sort) ve seçerek sıralama (selection sort) algoritmalarını ele alacağız. Bu algoritmaların doğal sıralayan biçimi anlatımda kullanılacaktır ancak hem ascending hem de descending biçimleri ayrıca implemente edilecektir*

**_Anahtar Notlar:_**  Algotritmaların karşılaştırılmasına yönelik iki ölçüt kullanılır: hız (speed), kaynak kullanımı (resource usage). Burada ele alacağımız bubble sort ve selection sort algoritmaları karşılaştırılmayacaktır. Algoritma analizi isimli konuda bu iki algoritmanın karşılaştırılması da ayrıca ele alınacaktır.

>*Kabarcık sıralama algoritmasında dizinin yanyana iki elemanı karşılaştırılır. Duruma göre yer değiştirilir. Her yinelemede en büyük eleman daraltılmış dizinin sonuna gider. Böylece her yinelemede bir geriye kadar gidilmiş olur
>Örneğin :
> 22 8 66 -7 34 -6 17 21 68 45 -10 3 16
> 8 22 -7 34 -6 17 21 66 45 -10 3 16 68
* 8 22 -7 -6 ..


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


```java

```
