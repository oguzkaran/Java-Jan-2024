package org.csystem.app;

import org.csystem.util.console.Console;
import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

class App {
    public static void main(String[] args)
    {
        DemoApp.run();
    }
}

class DemoApp {
    public static void run()
    {
        AFactory factory = new AFactory();

        while (true) {
            A x = factory.create();

            Util.doSomething(x);
            ThreadUtil.sleep(1000);
        }
    }
}

class Util {
    public static void doSomething(A a)
    {
        Console.writeLine("---------------------------------------");
        Console.writeLine("Dynamic Type:%s", a.getClass().getName());
        a.foo(10);
        Console.writeLine("---------------------------------------");
    }
}

class AFactory {
    private final Random m_random = new Random();
    //...

    public A create()
    {
        return switch (m_random.nextInt(8)) {
            case 0 -> new B();
            case 1 -> new C();
            case 2 -> new D();
            case 3 -> new E();
            case 4 -> new F();
            case 5 -> new G();
            case 6 -> new H();
            default -> new A();
        };
    }
}
class H extends E {
    //...
    public void foo(int a) //override
    {
        Console.writeLine("H.foo");
    }
}

class G extends B {
    //...
}

class F extends C {
    //...
}

class E extends C {
    //...
    public void foo(int a) //override
    {
        Console.writeLine("E.foo");
    }
}

class D extends B {
    //...
    public void foo(int a) //override
    {
        Console.writeLine("D.foo");
    }
}

class C extends A {
    //...
}

class B extends A {
    public void foo(int a) //override
    {
        Console.writeLine("B.foo");
    }
}

class A {
    public void foo(int a) //virtual method
    {
        Console.writeLine("A.foo");
    }

    public final void tar() //non-virtual
    {
        Console.writeLine("A.tar");
    }

    public static void bar(int a) //non-virtual
    {
        Console.writeLine("A.bar");
    }
}