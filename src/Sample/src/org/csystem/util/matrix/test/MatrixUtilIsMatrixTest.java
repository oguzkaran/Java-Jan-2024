package org.csystem.util.matrix.test;

import static org.csystem.util.matrix.MatrixUtil.isMatrix;

public class MatrixUtilIsMatrixTest {
    public static void run()
    {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int [][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8}, {9, 10, 11, 12}};

        System.out.println(isMatrix(a) ? "Matris" : "Matris değil");
        System.out.println(isMatrix(b) ? "Matris" : "Matris değil");
    }

    public static void main(String[] args)
    {
        run();
    }
}
