package com.learn.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2019/6/20
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * Example:
 * <p>
 * Input: nums = [1,2,3]
 * Output:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> cur, int[] nums, int start) {
        result.add(new ArrayList<>(cur));
        if (start >= nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            backTrack(result, cur, nums, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
