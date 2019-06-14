package com.learn.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2019/6/14
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 * <p>
 * Input:
 * [
 * [1, 2, 3, 4],
 * [5, 6, 7, 8],
 * [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) {
            return result;
        }
        int rowS = 0, rowE = matrix.length - 1, colS = 0, colE = matrix[0].length - 1;
        while (rowS <= rowE && colS <= colE) {
            for (int i = colS; i <= colE; i++) {
                result.add(matrix[rowS][i]);
            }
            for (int i = rowS + 1; i <= rowE; i++) {
                result.add(matrix[i][colE]);
            }
            if (rowS != rowE) {
                for (int i = colE - 1; i >= colS; i--) {
                    result.add(matrix[rowE][i]);
                }
            }
            if (colS != colE) {
                for (int i = rowE - 1; i > rowS; i--) {
                    result.add(matrix[i][colS]);
                }
            }
            rowS++;
            rowE--;
            colS++;
            colE--;
        }
        return result;
    }
}
