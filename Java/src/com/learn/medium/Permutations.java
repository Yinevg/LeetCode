package com.learn.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2019/6/10
 * Given a collection of distinct integers, return all possible permutations.
 * <p>
 * Example:
 * <p>
 * Input: [1,2,3]
 * Output:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> cur, int[] nums, boolean[] used) {
        if (cur.size() == nums.length) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                cur.add(nums[i]);
                used[i] = true;
                backTrack(result, cur, nums, used);
                used[i] = false;
                cur.remove(cur.size() - 1);
            }
        }
    }
}
