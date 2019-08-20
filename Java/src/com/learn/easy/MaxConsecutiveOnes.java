package com.learn.easy;

/**
 * Created by Yinevg on 2019/8/20
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * Note:
 * <p>
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int num : nums) {
            if (num == 0) {
                max = cur > max ? cur : max;
                cur = 0;
            } else {
                cur++;
            }
        }
        max = cur > max ? cur : max;
        return max;
    }
}
