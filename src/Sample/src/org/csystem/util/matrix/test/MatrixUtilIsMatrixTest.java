package org.csystem.util.matrix.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

public class MatrixUtilIsMatrixTest {
    public static void run()
    {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] b = {{1, 2, 3}, {4, 5, 6, 3}, {7, 8, 9}};

        ArrayUtil.print(a);
        System.out.println("--------------------------------");
        ArrayUtil.print(b);

        System.out.println(MatrixUtil.isMatrix(a) ? "Matris" : "Matris değil");
        System.out.println(MatrixUtil.isMatrix(b) ? "Matris" : "Matris değil");
    }

    public static void main(String[] args)
    {
        run();
    }
}
