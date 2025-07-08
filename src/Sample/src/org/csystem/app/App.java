package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        Integer i = 10;
        X.foo(10);
        X.foo(i);
    }
}

class X {
    public static void foo(int a)
    {
        System.out.println("foo, int");
    }
}

/*
1. Sentaks hatasıdır
2. foo, int yazılır
3. foo, Integer yazılır
 */
