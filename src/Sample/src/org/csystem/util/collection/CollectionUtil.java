package org.csystem.util.collection;

import org.csystem.util.string.StringUtil;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

/**
 * Utility class for collection operations
 * Last Update: 15th May 2025
 * @author Java-Sep-2024 Group
 */

public final class CollectionUtil {
    private CollectionUtil()
    {
    }

    public static ArrayList<String> randomStringListTR(RandomGenerator randomGenerator, int count, int min, int bound)
    {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < count; ++i)
            list.add(StringUtil.generateRandomTextTR(randomGenerator, randomGenerator.nextInt(min, bound)));

        return list;
    }

    public static ArrayList<String> randomStringListTR(RandomGenerator randomGenerator, int min, int bound)
    {
        return randomStringListTR(randomGenerator, randomGenerator.nextInt(min, bound), min, bound);
    }

    //...
}
