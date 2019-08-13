package com.learn.easy;

/**
 * Created by Yinevg on 2019/8/13
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * Note:
 * 0 ≤ x, y < 2^31.
 * <p>
 * Example:
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * The above arrows point to positions where the corresponding bits are different.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int result = 0, z = x ^ y;
        for (int i = 0; i < 32; i++) {
            if ((z & 1) == 1) {
                result++;
            }
            z >>= 1;
        }
        return result;
    }
}
