package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}


interface IX { //marker interface
    int A = 10;
    //void foo();

    default void bar(int a) //Since Java 8
    {
        //...
    }

    static void tar(int a, double b) //Since Java 8
    {
        //...
    }

    private void car() //Since Java 9
    {
        //...
    }

    private static void zar() //Since Java 9
    {
        //...
    }
}

interface IY { //marker interface

}

interface IZ { //functional interface
    void foo();
}