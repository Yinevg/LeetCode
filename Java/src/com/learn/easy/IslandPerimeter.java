package com.learn.easy;

/**
 * Created by Yinevg on 2019/8/14
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 * <p>
 * <p>
 * <p>
 * Example:
 * <p>
 * Input:
 * [[0,1,0,0],
 * [1,1,1,0],
 * [0,1,0,0],
 * [1,1,0,0]]
 * <p>
 * Output: 16
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int isLand = 0, neighbor = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    isLand++;
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        neighbor++;
                    }
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                        neighbor++;
                    }
                }
            }
        }
        return isLand * 4 - neighbor * 2;
    }
}
