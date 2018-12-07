package com.learn.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2018/12/7
 * <p>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * For example, given n = 3, a solution set is:
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) return result;
        backTrack(result, "", 0, 0, n);
        return result;
    }

    private void backTrack(List<String> result, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            result.add(str);
            return;
        }
        if (open < max)
            backTrack(result, str + "(", open + 1, close, max);
        if (close < open)
            backTrack(result, str + ")", open, close + 1, max);
    }

}
