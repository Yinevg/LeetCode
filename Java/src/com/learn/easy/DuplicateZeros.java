package com.learn.easy;

/**
 * Created by Yinevg on 2019/6/20
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written.
 * <p>
 * Do the above modifications to the input array in place, do not return anything from your function.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 * <p>
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int zeroCount = 0, len = arr.length;
        for (int i = 0; i < arr.length && len > 0; i++, len--) {
            if (arr[i] == 0) {
                zeroCount++;
                len--;
            }
        }
//        if (len < 0) {
//            // 最后一个零不扩展
//            zeroCount--;
//        }
        int lastIndex = arr.length - zeroCount - 1 + len;
        int i = arr.length - 1;
        if (len < 0) {
            arr[i] = 0;
            i--;
            lastIndex--;
        }
        for (; i >= 0 && lastIndex >= 0; i--, lastIndex--) {
            arr[i] = arr[lastIndex];
            if (arr[lastIndex] == 0) {
                arr[--i] = 0;
            }
        }
    }

    // 先得出不限制扩展后的数组，再将元素移动到正确的位置上
    public void duplicateZeros2(int[] A) {
        int n = A.length, i = 0, j = 0;
        // j为不限制扩展的长度
        for (i = 0; i < n; ++i, ++j) {
            if (A[i] == 0)
                ++j;
        }
        /**
         * 不限制扩展，则A[i]不为0的话，移动到扩展后的数组占一位，否则占两位，
         * 占两位的话j需要减两次。当j在n里面时，i已经移动到实际扩展的元素上，
         * 此时可以移动元素到正确的位置上
         */
        for (i = i - 1; i >= 0; --i) {
            if (--j < n)
                A[j] = A[i];
            if (A[i] == 0 && --j < n)
                A[j] = 0;
        }
    }
}
