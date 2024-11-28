package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        DemoRaceApp.run();
    }
}

class DemoRaceApp {
    public static void run()
    {
        Driver driver = new Driver();

        driver.setName("Oğuz Karan");
        driver.setRating(100);
        Taxi taxi = new Taxi(driver/*...*/);
        Client client1 = new Client("kaanaslan", "Kaan Aslan");
        Client client2 = new Client("aliserce", "Ali Vefa Serçe");

        taxi.take(client1);

        //...

        taxi.take(client2);
    }
}


class Taxi {
    private Driver m_driver;

    //...

    public Taxi(Driver driver/*...*/)
    {
        m_driver = driver;
    }

    public Driver getDriver()
    {
        return m_driver;
    }

    public void setDriver(Driver driver)
    {
        m_driver = driver;
    }

    public void take(Client client)
    {
        System.out.printf("Driver:%s, %d%n", m_driver.getName(), m_driver.getRating());
        System.out.printf("Client:%s%n", client.getUsername());

        //...
    }
}

class Client {
    private String m_username;
    private String m_name;
    //...


    public Client(String name, String username)
    {
        m_name = name;
        m_username = username;
    }

    public String getUsername()
    {
        return m_username;
    }

    public void setUsername(String username)
    {
        m_username = username;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }
}

class Driver {
    private String m_name;
    private int m_rating;

    //...

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getRating()
    {
        return m_rating;
    }

    public void setRating(int rating)
    {
        m_rating = rating;
    }
}

class Engine {
    //...

    public void startEngine()
    {
        System.out.println("Start Engine");
    }

    public void accelerateEngine()
    {
        System.out.println("Accelerate Engine");
    }

    public void slowEngine()
    {
        System.out.println("Slow Engine");
    }

    public void stopEngine()
    {
        System.out.println("Stop Engine");
    }
}