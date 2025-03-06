/**
 * Utility friendly class for common point operations
 * Last Update: 6th March 2025
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class PointCommon {
    static final double DELTA = 0.000001;
    static String toString(double x, double y)
    {
        return "(%f, %f)".formatted(x, y);
    }

    static boolean equals(double x1, double y1, double x2, double y2)
    {
        return Math.abs(x1 - x2) < DELTA && Math.abs(y1 - y2) < DELTA;
    }

    static double euclideanDistance(double x1, double y1, double x2, double y2)
    {
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }
}
