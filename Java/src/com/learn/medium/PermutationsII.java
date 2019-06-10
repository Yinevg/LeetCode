package com.learn.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yinevg on 2019/6/10
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * <p>
 * Example:
 * <p>
 * Input: [1,1,2]
 * Output:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 */
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
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
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                cur.add(nums[i]);
                used[i] = true;
                backTrack(result, cur, nums, used);
                used[i] = false;
                cur.remove(cur.size() - 1);
            }
        }
    }
}
