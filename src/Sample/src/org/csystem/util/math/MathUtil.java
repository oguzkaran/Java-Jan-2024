/**
 * Utility class for math operations
 * Last Update:10th December 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.math;

public final class MathUtil {
	private MathUtil()
	{
	}

	public static double log(double a, double b)
	{
		return Math.log(b) / Math.log(a);
	}
}
