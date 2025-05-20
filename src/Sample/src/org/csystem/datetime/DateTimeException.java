/**
 * Exception class for date/time operations
 * Last Update: 20th May 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.datetime;

public class DateTimeException extends RuntimeException {
    public DateTimeException(String message)
    {
        super(message);
    }

    public String getMessage()
    {
        return String.format("Invalid date and/or time values:%s", super.getMessage());
    }
}
