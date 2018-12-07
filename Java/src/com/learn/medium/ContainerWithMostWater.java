package com.learn.medium;

/**
 * Created by Yinevg on 2018/12/7
 * <p>
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two
 * lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 * <p>
 * The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 * <p>
 * Example:
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * <p>
 * 该算法舍弃了穷举过程中一些多余的计算过程，比如当左端线段L小于右端线段R时，我们把L右移，
 * 这时舍弃的是L与右端其他线段（R-1, R-2, ...）组成的木桶，这些木桶是没必要判断的，因为这
 * 些木桶的容积肯定都没有L和R组成的木桶容积大。（若右边比L大，底变小，L不变，容量变小，舍弃；
 * 若右边比L小，底变小，L不变，右边比L小故容量变小，舍弃。
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length <= 1) return 0;
        int left = 0, right = height.length - 1;
        int max = (right - left) * Math.min(height[left], height[right]);
        while (left < right) {
            if (height[left] < height[right]) left++;
            else right--;
            int temp = (right - left) * Math.min(height[left], height[right]);
            if (temp > max)
                max = temp;
        }
        return max;
    }
}
