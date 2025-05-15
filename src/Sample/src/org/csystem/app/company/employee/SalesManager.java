package org.csystem.app.company.employee;

public class SalesManager extends Manager {
    private double m_saleExtra;

    public SalesManager(String name, String citizenId, String address, String department, double salary, double saleExtra)
    {
        super(name, citizenId, address, department, salary);
        m_saleExtra = saleExtra;
    }

    public double getSaleExtra()
    {
        return m_saleExtra;
    }

    public void setSaleExtra(double saleExtra)
    {
        m_saleExtra = saleExtra;
    }

    public double calculateInsurancePayment()
    {
        return super.calculateInsurancePayment() + m_saleExtra;
    }
}
