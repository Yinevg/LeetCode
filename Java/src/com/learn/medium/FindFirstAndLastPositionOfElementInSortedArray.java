package com.learn.medium;

/**
 * Created by Yinevg on 2019/1/20
 * <p>
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a
 * given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * <p>
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        helper(result,nums,0,nums.length-1,target);
        return result;
    }

    private void helper(int[] result, int[] nums, int start, int end, int target) {
        int left = start, right = end;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }else{
                if(result[0]==-1){
                    result[0]=result[1]=mid;
                }else{
                    if(mid<result[0]) result[0]=mid;
                    if(mid>result[1]) result[1]=mid;
                }
                helper(result,nums,left,mid-1,target);
                helper(result,nums,mid+1,right,target);
                break;
            }
        }
    }
}
