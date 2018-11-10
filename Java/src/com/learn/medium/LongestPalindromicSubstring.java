package com.learn.medium;

/**
 * Created by Yinevg on 2018/11/10
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * <p>
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * <p>
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        for (int len = s.length(); len > 0; len--) {
            for (int i = 0; i < s.length(); i++) {
                if (i + len > s.length()) break;
                if (isPalindromic(s.substring(i, i + len))) {
                    return s.substring(i, i + len);
                }
            }
        }
        return "";
    }

    private static boolean isPalindromic(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome(""));
    }
}
