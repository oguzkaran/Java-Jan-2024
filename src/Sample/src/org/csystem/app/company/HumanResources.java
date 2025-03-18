package org.csystem.app.company;

import org.csystem.util.console.Console;

public class HumanResources {
    //...

    public void payInsurance(Employee employee)
    {
        Console.writeLine("--------------------------------------------------------");
        Console.writeLine("Name:%s", employee.getName());
        Console.writeLine("CitizenId:%s", employee.getCitizenId());
        Console.writeLine("Insurance payment:%f", employee.calculateInsurancePayment());
        Console.writeLine("--------------------------------------------------------");
    }
}
