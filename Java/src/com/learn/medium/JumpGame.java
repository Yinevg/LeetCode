package com.learn.medium;

/**
 * Created by Yinevg on 2019/6/16
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 * <p>
 * Example 1:
 * <p>
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 * <p>
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum
 * jump length is 0, which makes it impossible to reach the last index.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int reach = 0;
        int i = 0;
        for (; i < nums.length && i <= reach; i++) {
            reach = Math.max(nums[i] + i, reach);
        }
        return i == nums.length;
    }
}