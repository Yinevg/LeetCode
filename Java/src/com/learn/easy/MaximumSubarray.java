package com.learn.easy;

/**
 * Created by Yinevg on 2019/6/13
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            // 只要不是负的就加入sum里面，这样sum对之后的数有增益效果
            if (sum < 0) {
                sum = num;
            } else {
                sum += num;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
