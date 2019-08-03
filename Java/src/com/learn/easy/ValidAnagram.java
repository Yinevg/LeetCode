package com.learn.easy;

/**
 * Created by Yinevg on 2019/8/3
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] helper = new int[26];
        for (int i = 0; i < s.length(); i++) {
            helper[s.charAt(i) - 'a']++;
            helper[t.charAt(i) - 'a']--;
        }
        for (int i : helper) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
