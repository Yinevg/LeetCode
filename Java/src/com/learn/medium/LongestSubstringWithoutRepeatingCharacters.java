package com.learn.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yinevg on 2018/11/8
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        /**
         * 遇到这种有关不重复的问题，可以考虑使用map或set进行解决
         * 当与不重复长度有关时，考虑使用map保存下标
         */
        if (s.length() == 0 || s.length() == 1) return s.length();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, start = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                //关键步骤，确定子串的起点，注意重复的字符可能都位于start之后，也可能位于start两侧（abcbd、abcbad）
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
