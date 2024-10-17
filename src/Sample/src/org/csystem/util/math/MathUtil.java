/**
 * Utility class for math operations
 * Last Update:17th October 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.math;

public class MathUtil {
	private MathUtil()
	{
	}

	public static double log(double a, double b)
	{
		return Math.log(b) / Math.log(a);
	}
}
