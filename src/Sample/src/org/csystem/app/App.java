package org.csystem.app;

import org.csystem.generator.random.string.RandomStringArrayGeneratorTR;

import java.util.Random;

class App {
    public static void main(String[] args)
    {
        RandomStringArrayGeneratorTR generator = new RandomStringArrayGeneratorTR(new Random(), 10, 4, 11);
        int size = generator.size();

        for (int i = 0; i < size; ++i)
            System.out.println(generator.get(i));
    }
}
