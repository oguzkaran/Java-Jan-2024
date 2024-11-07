package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        long a = 0;
        long b = 1_234_567_899;
        long c = 234_567_899;
        long d = 899;
        long e = 1234;

        int n = 3;

        System.out.println(a == 0 ? 1 : (int)(Math.log10(Math.abs(a)) / n) + 1);
        System.out.println(b == 0 ? 1 : (int)(Math.log10(Math.abs(b)) / n) + 1);
        System.out.println(c == 0 ? 1 : (int)(Math.log10(Math.abs(c)) / n) + 1);
        System.out.println(d == 0 ? 1 : (int)(Math.log10(Math.abs(d)) / n) + 1);
        System.out.println(e == 0 ? 1 : (int)(Math.log10(Math.abs(e)) / n) + 1);
    }
}
