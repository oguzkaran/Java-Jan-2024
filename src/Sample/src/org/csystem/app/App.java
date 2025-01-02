package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        Sample s = new Sample(); //rc1:1

        Mample.foo(s); //rc1:2 -> 3
        //rc1:1

        Mample.foo(s); //rc1:2 -> 3
        //rc1:1

        s = null;//rc1:0 (eligible)

        //...
    }
}

class Mample {
    public static void foo(Sample s)
    {
        Sample k;

        k = s;

        //...
    }
}

class Sample {
    //...
}