package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}

abstract class A {
    public abstract void foo();

    public void bar()
    {

    }

}

interface IX {
    void foo();
    default void bar()
    {

    }
}