package com.learn.medium;

/**
 * Created by Yinevg on 2019/6/16
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * <p>
 * Example:
 * <p>
 * Input: 3
 * Output:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowS = 0, rowE = n - 1, colS = 0, colE = n - 1, value = 1;
        while (rowS <= rowE && colS <= colE) {
            for (int i = colS; i <= colE; i++) {
                matrix[rowS][i] = value++;
            }
            for (int i = rowS + 1; i <= rowE; i++) {
                matrix[i][colE] = value++;
            }
            if (rowS != rowE) {
                for (int i = colE - 1; i >= colS; i--) {
                    matrix[rowE][i] = value++;
                }
            }
            if (colS != colE) {
                for (int i = rowE - 1; i > rowS; i--) {
                    matrix[i][colS] = value++;
                }
            }
            rowS++;
            rowE--;
            colS++;
            colE--;
        }
        return matrix;
    }
}
