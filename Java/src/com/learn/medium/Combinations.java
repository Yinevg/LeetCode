package com.learn.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2019/6/20
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * <p>
 * Example:
 * <p>
 * Input: n = 4, k = 2
 * Output:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> cur, int start, int n, int k) {
        if (cur.size() == k) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i <= n; i++) {
            cur.add(i);
            backTrack(result, cur, i + 1, n, k);
            cur.remove(cur.size() - 1);
        }
    }
}
