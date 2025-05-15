package org.csystem.app.company.employee;

import org.csystem.app.company.employee.insurance.IInsured;

public abstract class Employee implements IInsured {
    private String m_name;
    private String m_citizenId;
    private String m_address;

    //...

    protected Employee(String name, String citizenId, String address)
    {
        //...
        m_name = name;
        m_citizenId = citizenId;
        m_address = address;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        //...
        m_name = name;
    }

    public String getId()
    {
        return m_citizenId;
    }

    public void setId(String citizenId)
    {
        //...
        m_citizenId = citizenId;
    }

    public String getAddress()
    {
        return m_address;
    }

    public void setAddress(String address)
    {
        //...
        m_address = address;
    }


    //...
}
