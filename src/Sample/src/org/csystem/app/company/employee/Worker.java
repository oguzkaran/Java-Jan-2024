package org.csystem.app.company.employee;

public class Worker extends Employee {
    private double m_feePerHour;
    private int m_hourPerDay;

    public Worker(String name, String citizenId, String address, double feePerHour, int hourPerDay)
    {
        super(name, citizenId, address);
        m_feePerHour = feePerHour;
        m_hourPerDay = hourPerDay;
    }

    public double getFeePerHour()
    {
        return m_feePerHour;
    }

    public void setFeePerHour(double feePerHour)
    {
        m_feePerHour = feePerHour;
    }

    public int getHourPerDay()
    {
        return m_hourPerDay;
    }

    public void setHourPerDay(int hourPerDay)
    {
        m_hourPerDay = hourPerDay;
    }

    public double calculateInsurancePayment()
    {
        return m_feePerHour * m_hourPerDay * 30;
    }

    //...
}
