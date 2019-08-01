package com.learn.easy;

/**
 * Created by Yinevg on 2019/8/1
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 * <p>
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 * <p>
 * Input: 218
 * Output: false
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n <= 0 ? false : (n & (n - 1)) == 0;
    }
}
