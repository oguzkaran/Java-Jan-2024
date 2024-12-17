package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        A a = new A();

        a.x = 10;
        B b = new B();

        b.x = 30;

        Sample.doWork(a);
        Sample.doWork(b);
    }
}

class Sample {
    public static void doWork(A a)
    {
        System.out.printf("a = %d%n", a.x);
    }

    public static void doWork(B b)
    {
        System.out.printf("a = %d%n", b.x);
    }
}

class E extends B {
    public int z;
    //...
}

class D extends A {
    public int t;
    //...
}

class C extends B {
    public int z;
    //...
}

class B extends A {
    public int y;
    //...
}

class A {
    public int x;
    //...
}

