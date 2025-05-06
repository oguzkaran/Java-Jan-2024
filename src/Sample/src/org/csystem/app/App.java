package org.csystem.app;

import org.csystem.util.console.Console;
import org.csystem.util.thread.ThreadUtil;

import java.util.Random;

class App {
    public static void main(String[] args)
    {
        DemoApplication.run();
    }
}

class DemoApplication {
    public static void run()
    {
        XFactory xFactory = new XFactory();
        YFactory yFactory = new YFactory();

        while (true) {
            IX ix = xFactory.create();
            IY iy = yFactory.create();

            Console.writeLine("---------------------------");
            Console.writeLine("Dynamic type of ix:%s", ix.getClass().getName());
            Console.writeLine("Dynamic type of iy:%s", iy.getClass().getName());
            Util.doWork(ix);
            Util.doWork(iy);
            Console.writeLine("---------------------------");
            ThreadUtil.sleep(1000);
        }
    }
}

class Util {
    public static void doWork(IX ix)
    {
        //...
        ix.foo(10);
        //...
    }

    public static void doWork(IY iy)
    {
        //...
        iy.bar(3.4);
        //...
    }
}

class XFactory {
    private final Random m_random = new Random();

    public IX create()
    {
        return switch (m_random.nextInt(5)) {
            case 0 -> new A();
            case 1 -> new B();
            case 2 -> new C();
            case 3 -> new D();
            case 4 -> new E();
            default -> new F();
        };
    }
}

class YFactory {
    private final Random m_random = new Random();

    public IY create()
    {
        return switch (m_random.nextInt(3)) {
            case 0 -> new D();
            case 1 -> new E();
            default -> new F();
        };
    }
}

class A implements IX {
    public void foo(int a)
    {
        Console.writeLine("A.foo");
    }
}

class B implements IX {
    public void foo(int a)
    {
        Console.writeLine("B.foo");
    }
}

class C implements IX {
    public void foo(int a)
    {
        Console.writeLine("C.foo");
    }
}

class D implements IX, IY {
    public void foo(int a)
    {
        Console.writeLine("D.foo");
    }

    public void bar(double a)
    {
        Console.writeLine("D.bar");
    }
}

class E implements IX, IY {
    public void foo(int a)
    {
        Console.writeLine("E.foo");
    }

    public void bar(double a)
    {
        Console.writeLine("E.bar");
    }
}

class F implements IX, IY {
    public void foo(int a)
    {
        Console.writeLine("F.foo");
    }

    public void bar(double a)
    {
        Console.writeLine("F.bar");
    }
}

interface IX {
    void foo(int a);
}

interface IY {
    void bar(double a);
}
