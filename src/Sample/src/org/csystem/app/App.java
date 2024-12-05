package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        C x = new C();

        x.a = 100;
        x.b = 34;
        x.c = 67;
        x.tar();
        x.bar();
        x.foo();
    }
}

class C extends B {
    public int c;

    public void tar()
    {
        a = 20;
        b = 30;
        c = 20;
    }
}

class B extends A {
    public int b;

    public void bar()
    {
        System.out.println("B.bar");
    }
}

class A {
    public int a;
    public void foo()
    {
        System.out.println("A.foo");
    }
}
