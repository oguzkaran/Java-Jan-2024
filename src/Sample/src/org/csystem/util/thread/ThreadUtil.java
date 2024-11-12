/**
 * Utility class for thread operations
 * Last Update:12th November 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.thread;

import java.util.concurrent.TimeUnit;

public class ThreadUtil {
    private ThreadUtil()
    {
    }

    public static void sleep(long milliseconds)
    {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }
        catch (InterruptedException ignore) {

        }
    }
}
