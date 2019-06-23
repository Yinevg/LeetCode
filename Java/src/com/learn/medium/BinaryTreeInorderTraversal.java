package com.learn.medium;

import com.learn.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2019/6/23
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * <p>
 * Example:
 * <p>
 * Input: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * Output: [1,3,2]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        backTrack(result, root);
        return result;
    }

    private void backTrack(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            backTrack(result, root.left);
        }
        result.add(root.val);
        if (root.right != null) {
            backTrack(result, root.right);
        }
    }
}
