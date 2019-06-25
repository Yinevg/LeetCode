package com.learn.medium;

import com.learn.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2019/6/25
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * Assume a BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * 2
 * / \
 * 1   3
 * <p>
 * Input: [2,1,3]
 * Output: true
 * Example 2:
 * <p>
 * 5
 * / \
 * 1   4
 * / \
 * 3   6
 * <p>
 * Input: [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderTravel(result, root);
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i - 1) >= result.get(i)) {
                return false;
            }
        }
        return true;
    }

    private void inOrderTravel(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTravel(result, root.left);
        result.add(root.val);
        inOrderTravel(result, root.right);
    }
}
