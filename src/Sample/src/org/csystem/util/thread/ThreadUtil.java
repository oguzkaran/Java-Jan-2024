/**
 * Utility class for thread operations
 * Last Update:10th December 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.thread;

import java.util.concurrent.TimeUnit;

public final class ThreadUtil {
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
