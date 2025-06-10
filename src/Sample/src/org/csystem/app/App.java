package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}

class B implements IA<Boolean, String> {
    //...
    public String foo(Boolean a)
    {
        //...

        return String.valueOf(a);
    }
}


interface IA<T, K> {
    K foo(T t);
}