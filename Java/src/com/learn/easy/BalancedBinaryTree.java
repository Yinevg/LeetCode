package com.learn.easy;

import com.learn.object.TreeNode;

/**
 * Created by Yinevg on 2019/7/7
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as:
 * <p>
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * <p>
 * Example 1:
 * <p>
 * Given the following tree [3,9,20,null,null,15,7]:
 * <p>
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Return true.
 * <p>
 * Example 2:
 * <p>
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 * <p>
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * Return false.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return root == null ? true : Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDepth(TreeNode root) {
        return root == null ? 0 : Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
}
