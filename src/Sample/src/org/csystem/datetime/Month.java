package org.csystem.datetime;

public enum Month {
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);

    private final int m_days;

    Month(int days)
    {
        m_days = days;
    }

    Month(Month month)
    {
        m_days = month.m_days;
    }

    private static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public int getDays(int year)
    {
        return ordinal() == 1 && isLeapYear(year) ? 29 : m_days;
    }
}
