package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        Sample s = new Sample(20);

        System.out.printf("Value: %d%n", s.getX());

        s.setX(30);

        System.out.printf("Value: %d%n", s.getX());
    }
}

class Sample {
    private int m_x;

    public Sample(int x)
    {
        m_x = x;
    }

    public void setX(int x)
    {
        m_x = x;
    }

    public int getX()
    {
        return m_x;
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(int x)
    {
        //...
        this.x = x;
    }
    //...
}
