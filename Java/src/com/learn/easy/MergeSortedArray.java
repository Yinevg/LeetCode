package com.learn.easy;

/**
 * Created by Yinevg on 2019/6/22
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        m--;
        n--;
        while (i >= 0 && m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[i--] = nums1[m--];
            } else {
                nums1[i--] = nums2[n--];
            }
        }
        while (n >= 0) {
            nums1[i--] = nums2[n--];
        }
    }
}
