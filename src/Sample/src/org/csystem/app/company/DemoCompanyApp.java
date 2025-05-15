package org.csystem.app.company;

import org.csystem.app.company.employee.Employee;
import org.csystem.app.company.employee.Manager;
import org.csystem.app.company.employee.ProjectWorker;
import org.csystem.app.company.employee.SalesManager;
import org.csystem.app.company.employee.Worker;
import org.csystem.app.company.hr.HumanResources;
import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

public class DemoCompanyApp {
    private static Manager getManager()
    {
        return new Manager("Kaan Aslan", "12345678945", "Mecidiyeköy", "Yazılım", 300000);
    }

    private static Worker getWorker()
    {
        return new Worker("Güray Sönmez", "12345789321", "Bodrum", 400, 8);
    }

    private static ProjectWorker getProjectWorker()
    {
        return new ProjectWorker("Lokman Köse", "23456789233", "Çağlayan", 200, 8, "Dernek", 2000);
    }

    private static SalesManager getSalesManager()
    {
        return new SalesManager("Ali Serçe", "34567892345", "Geyikli", "Pazarlama", 400000, 30000);
    }

    private static Employee getEmployee(Random random)
    {
        return switch (random.nextInt(4)) {
            case 0 -> getWorker();
            case 1 -> getProjectWorker();
            case 2 -> getSalesManager();
            default -> getManager();
        };
    }


    public static void run()
    {
        Random random = new Random();
        HumanResources humanResources = new HumanResources();

        while (true) {
            Employee employee = getEmployee(random);

            humanResources.payInsurance(employee);
            ThreadUtil.sleep(1000);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
