/*----------------------------------------------------------------------------------------------------------------------
    Aşağıda bildirilen Date sınıfını açıklamalara göre yazınız
    Açıklamalar:
        - Sınıf bir tarihi temsil edecektir (gün, ay ve yıl)

        - JavaSE'nin veya başka bir kütüphanenin tarih zaman işlemlerine ilişkin sınıfları ve metotları kullanılmayacaktır

        - Sınıfın public bölümünü değiştirmeden istediğiniz eklemeyi/çıkarmayı yapabilirsiniz

        - Sınıf geçersiz tarih durumunu kontrol edecektir. Geçersizlik durumunda uygun mesaj ile birlikte, yazılmış olan
         DateTimeException fırlatılacaktır

        - Sınıf DayOfWeek ve Month enum class'larını kullanmaktadır. enum class'ların sabitlerini değiştirmeden istediğiniz
        eklemeyi yapabilirsiniz. Bu anlamda sabitlere değer iliştirebilirsiniz

        - Daha önce yazılmış olan DateUtil sınıfı içerisindeki metotlardan yararlanabilirsiniz. Ancak sınıf, DateUtil
        sınıfını kullanmayacaktır.

        - Ay bilgisini değer olarak alan veya değer olarak geri döndüren metotlar için değer [1, 12] aralığında olacaktır

        - Sınıfa ilişkin test kodlarını da yazınız
-----------------------------------------------------------------------------------------------------------------------*/

/**
 * Date class that represents a date
 * Last Update: 20th May 2025
 * @author Java-Jan-2024 Group
 */

package org.csystem.datetime;

public class Date {
    private static final int [] DAYS_OF_MONTHS;
    private static final String [] DAY_OF_WEEKS_TR;
    private static final String [] DAY_OF_WEEKS_EN;
    private static final String [] MONTHS_TR;
    private static final String [] MONTHS_EN;

    static {
        DAYS_OF_MONTHS = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        DAY_OF_WEEKS_TR = new String[]{"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
        DAY_OF_WEEKS_EN = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        MONTHS_TR = new String[]{"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz",  "Ağustos",
                "Eylül", "Ekim", "Kasım", "Aralık"};
        MONTHS_EN = new String[]{"", "January", "February", "March", "April", "May", "June", "July",  "August",
                "September", "October", "November", "December"};
    }

    public Date(int day, int monthValue, int year)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public Date(int day, Month month, int year)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public int getDay()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public void setDay(int day)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public int getMonthValue()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public void setMonthValue(int monthValue)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public Month getMonth()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public void setMonth(Month month)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public int getYear()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public void setYear(int year)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public DayOfWeek getDayOfWeek()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public String getDayOfWeekEN()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public String getDayOfWeekTR()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public boolean isLeapYear()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public boolean isWeekday()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public boolean isWeekend()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public String toString()
    {
        throw new UnsupportedOperationException("TODO -> 01/04/2023");
    }

    public String toString(char delimiter)
    {
        throw new UnsupportedOperationException("TODO -> if delimiter is . then 01.04.2023");
    }

    public boolean equals(Object other)
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public String toLongDateStringTR()
    {
        throw new UnsupportedOperationException("TODO -> 1 Nisan 2023 Cumartesi");
    }

    public String toLongDateStringEN()
    {
        throw new UnsupportedOperationException("TODO -> 1st April 2023 Saturday ");
    }

    public String toShortDateStringTR()
    {
        throw new UnsupportedOperationException("TODO -> 1 Nisan 2023");
    }

    public String toShortDateStringEN()
    {
        throw new UnsupportedOperationException("TODO -> 1st April 2023");
    }
}
