/**
 * Utility friendly class for common point operations
 * Last Update: 31st October 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class PointCommon {
    static String toString(double x, double y)
    {
        return "(%f, %f)".formatted(x, y);
    }

    static double euclideanDistance(double x1, double y1, double x2, double y2)
    {
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }
}
