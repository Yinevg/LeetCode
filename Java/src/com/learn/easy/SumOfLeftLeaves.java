package com.learn.easy;

import com.learn.object.TreeNode;

/**
 * Created by Yinevg on 2019/8/6
 * Find the sum of all left leaves in a given binary tree.
 * <p>
 * Example:
 * <p>
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * <p>
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class SumOfLeftLeaves {

    private int sum = 0;

    public int sumOfLeftLeaves1(TreeNode root) {
        sum = 0;
        helper(root);
        return sum;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                helper(root.left);
            }
        }
        if (root.right != null) {
            helper(root.right);
        }
    }

    public int sumOfLeftLeaves2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves2(root.left);
            }
        }
        if (root.right != null) {
            sum += sumOfLeftLeaves2(root.right);
        }
        return sum;
    }
}
