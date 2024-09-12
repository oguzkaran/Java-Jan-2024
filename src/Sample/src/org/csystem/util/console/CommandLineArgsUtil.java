/**
 * Utility class for command line operations
 * Last Update: 12th September 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.console;

public class CommandLineArgsUtil {
    public static void checkLengthEquals(int len, int argsLen, String message)
    {
        checkLengthEquals(len, argsLen, message, 1);
    }

    public static void checkLengthEquals(int len, int argsLen, String message, int exitCode)
    {
        if (len != argsLen) {
            System.err.println(message);
            System.exit(exitCode);
        }
    }

    public static void checkLengthGreater(int len, int argsLen, String message)
    {
        checkLengthGreater(len, argsLen, message, 1);
    }

    public static void checkLengthGreater(int len, int argsLen, String message, int exitCode)
    {
        if (len <= argsLen) {
            System.err.println(message);
            System.exit(exitCode);
        }
    }

    //...
}
