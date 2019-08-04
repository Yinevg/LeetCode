package com.learn.easy;

/**
 * Created by Yinevg on 2019/8/4
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] helper = new int[26];
        for (int i = 0; i < s.length(); i++) {
            helper[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (helper[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
