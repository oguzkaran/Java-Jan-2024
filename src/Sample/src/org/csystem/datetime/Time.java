/*----------------------------------------------------------------------------------------------------------------------
    Aşağıda bildirilen Time sınıfını açıklamalara göre yazınız
    Açıklamalar:
        - Sınıf bir zamanı temsil edecektir (saat, dakika, saniye, milisaniye)

        - JavaSE'nin veya başka bir kütüphanenin tarih zaman işlemlerine ilişkin sınıfları ve metotları kullanılmayacaktır

        - Sınıfın public bölümünü değiştirmeden istediğiniz eklemeyi yapabilirsiniz

        - Sınıf geçersiz zaman durumunu kontrol edecektir. Geçersizlik durumunda uygun mesaj ile birlikte, yazılmış olan
        DateTimeException fırlatılacaktır

        - Zamana ilişkin sınırlar şu şekildedir:
            saat        -> `[0, 23]`
            dakika      -> `[0, 59]`
            saniye      -> `[0, 59]`
            mili saniye -> `[0, 999]`

        - Sınıfa ilişkin test kodlarını da yazınız
-----------------------------------------------------------------------------------------------------------------------*/
/**
 * Time class that represents a time
 * Last Update: 20th May 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.datetime;

public class Time {
    public Time(int hour, int minute)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public Time(int hour, int minute, int second)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public Time(int hour, int minute, int second, int millisecond)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public int getHour()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public void setHour(int value)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public int getMinute()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public void setMinute(int value)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public int getSecond()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public void setSecond(int value)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public int getMillisecond()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public void setMillisecond(int value)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public String toString()
    {
        throw new UnsupportedOperationException("TODO -> 17:01:08");
    }

    public boolean equals(Object other)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public String toLongTimeString()
    {
        throw new UnsupportedOperationException("TODO -> 17:01:08.123");
    }

    public String toShortTimeString()
    {
        throw new UnsupportedOperationException("TODO -> 17:01");
    }
}
