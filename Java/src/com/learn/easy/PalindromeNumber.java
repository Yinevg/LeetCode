package com.learn.easy;

/**
 * Created by Yinevg on 2018/11/10
 * https://leetcode.com/problems/palindrome-number/description/
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * Input: 121
 * Output: true
 * <p>
 * Example 2:
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * Follow up:
 * Coud you solve it without converting the integer to a string?
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int result = 0;
        int temp = x;
        while (temp != 0) {
            result = result * 10 + temp % 10;
            temp /= 10;
        }
        return result == x;
    }
}
