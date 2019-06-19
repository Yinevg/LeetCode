package com.learn.medium;

/**
 * Created by Yinevg on 2019/6/19
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * Example 1:
 * <p>
 * Input:
 * matrix = [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 * Example 2:
 * <p>
 * Input:
 * matrix = [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 13
 * Output: false
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int left = 0, right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int row = left > 0 ? left - 1 : 0;
        left = 0;
        right = matrix[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
