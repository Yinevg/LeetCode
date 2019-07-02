package com.learn.medium;

import com.learn.object.TreeNode;

/**
 * Created by Yinevg on 2019/7/2
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * <p>
 * For example, given
 * <p>
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 * Return the following binary tree:
 * <p>
 *      3
 *    / \
 *  9  20
 *   /  \
 * 15   7
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = inStart;
        for (; index <= inEnd; index++) {
            if (inorder[index] == preorder[preStart]) {
                break;
            }
        }
        int len = index - inStart;
        root.left = buildTree(preorder, preStart + 1, preStart + len, inorder, inStart, index - 1);
        root.right = buildTree(preorder, preStart + 1 + len, preEnd, inorder, index + 1, inEnd);
        return root;
    }
}
