package org.csystem.app.company.hr;

import org.csystem.app.company.employee.insurance.IInsured;
import org.csystem.util.console.Console;

public class HumanResources {
    //...

    public void payInsurance(IInsured insured)
    {
        Console.writeLine("--------------------------------------------------------");
        Console.writeLine("CitizenId:%s", insured.getId());
        Console.writeLine("Insurance payment:%f", insured.calculateInsurancePayment());
        Console.writeLine("--------------------------------------------------------");
    }
}
