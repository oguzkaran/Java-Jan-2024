/*--------------------------------------------------------
	FILE NAME	: PointCommon.java
	AUTHOR		: Java-Aug-2023 Group
	LAST UPDATE	: 13th January 2024

	Friendly common utility class for Point and MutablePoint
	classes

	Copyleft C and System Programmers Association (CSD)
	All Rights Free
---------------------------------------------------------*/
package org.csystem.math.geometry;

import static java.lang.Math.*;

class PointCommon {
    private PointCommon()
    {
    }

    static double getXBy(boolean polar, double a, double b)
    {
        return polar ? a * cos(b) : a;
    }

    static double getYBy(boolean polar, double a, double b)
    {
        return polar ? a * sin(b) : a;
    }

    static double distance(double x1, double y1, double x2, double y2)
    {
        return sqrt(pow(x1- x2, 2) + pow(y1 - y2, 2));
    }

    static String toString(double x, double y)
    {
        return String.format("(%f, %f)", x, y);
    }
}
