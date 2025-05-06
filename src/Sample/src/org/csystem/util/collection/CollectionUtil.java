package org.csystem.util.collection;

import org.csystem.util.string.StringUtil;

import java.util.ArrayList;
import java.util.Random;

/**
 * Utility class for collection operations
 * Last Update: 6th May 2025
 * @author Java-Sep-2024 Group
 */

public final class CollectionUtil {
    private CollectionUtil()
    {
    }

    public static ArrayList randomStringListTR(Random random, int count, int min, int bound)
    {
        ArrayList list = new ArrayList();

        for (int i = 0; i < count; ++i)
            list.add(StringUtil.generateRandomTextTR(random, random.nextInt(min, bound)));

        return list;
    }

    public static ArrayList randomStringListTR(Random random, int min, int bound)
    {
        return randomStringListTR(random, random.nextInt(min, bound), min, bound);
    }

    //...
}
