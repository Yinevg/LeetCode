package com.learn.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2019/8/8
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * <p>
 * Find all the elements that appear twice in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime?
 * <p>
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [2,3]
 */
public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int curNum = Math.abs(nums[i]);
            if (nums[curNum - 1] < 0) {
                result.add(curNum);
            } else {
                nums[curNum - 1] = -nums[curNum - 1];
            }
        }
        return result;
    }
}
