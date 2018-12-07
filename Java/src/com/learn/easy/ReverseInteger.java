package com.learn.easy;

/**
 * Created by Yinevg on 2018/11/10
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * Input: 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: 120
 * Output: 21
 * <p>
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^(31),  2^(31) − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {
    public static int reverse(int x) {
        //特殊值处理
        if(x==Integer.MIN_VALUE) return 0;
        if (x < 0) return -reverse(-x);
        int result = 0;
        while (x != 0) {
            int pre = result;
            result = result * 10 + x % 10;
            //注意溢出判断
            if ((result - x % 10) / 10 != pre) {
                return 0;
            }
            x /= 10;
        }
        return result;
    }
}
