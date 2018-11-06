package com.learn.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yinevg on 2018/11/6
 * <p>
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = map.getOrDefault(target - nums[i], -1);
            if (j != -1) {
                result[0] = j;
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
