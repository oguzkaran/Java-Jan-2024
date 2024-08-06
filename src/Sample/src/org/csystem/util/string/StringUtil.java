/**
 * Utility class for string operations
 * Last Update: 6th August 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.string;

public class StringUtil {
	public static int countString(String s1, String s2)
	{
		int count = 0;
		int idx = 0;
		
		
		while ((idx = s1.indexOf(s2, idx)) != -1) {
			++count;
			++idx;
		}
		
		
		return count;
	}
	//...
}
