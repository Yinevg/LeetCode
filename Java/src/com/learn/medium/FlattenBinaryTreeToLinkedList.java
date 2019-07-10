package com.learn.medium;

import com.learn.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2019/7/10
 * Given a binary tree, flatten it to a linked list in-place.
 * <p>
 * For example, given the following tree:
 * <p>
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * The flattened tree should look like:
 * <p>
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        helper(list, root);
        list.remove(0);
        for (TreeNode node : list) {
            root.right = node;
            root.left = null;
            root = node;
        }
        root.left = null;
        root.right = null;
    }

    private void helper(List<TreeNode> list, TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node);
        helper(list, node.left);
        helper(list, node.right);
    }
}
