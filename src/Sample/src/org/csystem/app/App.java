package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        A x = new A();
        System.out.println("--------------------------------");
        B y = new B();
        System.out.println("--------------------------------");
        C z = new C();
        System.out.println("--------------------------------");


    }
}

class C extends B {
    public int c;

    public C()
    {
        System.out.println("I am a default ctor of C");
    }

    public void tar()
    {
        System.out.println("C.tar");
    }
}

class B extends A {
    public int b;

    public B()
    {
        System.out.println("I am a default ctor of B");
    }

    public void bar()
    {
        System.out.println("B.bar");
    }
}

class A {
    public int a;

    public A()
    {
        System.out.println("I am a default ctor of A");
    }

    public void foo()
    {
        System.out.println("A.foo");
    }
}