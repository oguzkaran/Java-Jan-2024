package org.csystem.util.random;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

/**
 * RandomGeneratorAlgorithm enum class
 * Last Update: 20th May 2025
 * @author Java-Jan-2024 Group
 */
public enum RandomGeneratorAlgorithm implements IRandomGeneratorFactory {
    L128X1024_MIX_RANDOM("L128X1024MixRandom"), L128X128_MIX_RANDOM("L128X128MixRandom"), L128X256_MIX_RANDOM("L128X256MixRandom"),
    L32X64_MIX_RANDOM("L32X64MixRandom"), L64X1024MIX_RANDOM("L64X1024MixRandom"), L64X128_MIX_RANDOM("L64X128MixRandom"),
    L64X128_STAR_STAR_RANDOM("L64X128StarStarRandom"), L64X256_MIX_RANDOM("L64X256MixRandom"), RANDOM("Random"),
    XOROSHIRO128_PLUS_PLUS("Xoroshiro128PlusPlus"), XOROSHIRO256_PLUS_PLUS("Xoshiro256PlusPlus"),
    SPLITTABLE_RANDOM("SplittableRandom"), THREAD_LOCAL_RANDOM("ThreadLocalRandom") {
        public RandomGenerator create()
        {
            return ThreadLocalRandom.current();
        }
    },
    SECURE_RANDOM("SecureRandom") {
        public RandomGenerator create()
        {
            return new SecureRandom();
        }
    };

    private final String m_name;

    RandomGeneratorAlgorithm(String name)
    {
        m_name = name;
    }

    public String getName()
    {
        return m_name;
    }

    public RandomGenerator create()
    {
        return RandomGenerator.of(m_name);
    }

    //...
}

