package com.learn.easy;

/**
 * Created by Yinevg on 2019/6/16
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && len == 0) {
                continue;
            } else if (s.charAt(i) != ' ') {
                len++;
            } else {
                break;
            }
        }
        return len;
    }
}
