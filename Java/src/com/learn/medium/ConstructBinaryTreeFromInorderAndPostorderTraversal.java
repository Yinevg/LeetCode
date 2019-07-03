package com.learn.medium;

import com.learn.object.TreeNode;

/**
 * Created by Yinevg on 2019/7/3
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * <p>
 * For example, given
 * <p>
 * inorder = [9,3,15,20,7]
 * postorder = [9,15,7,20,3]
 * Return the following binary tree:
 * <p>
 *      3
 *    / \
 *   9  20
 *    /  \
 *  15   7
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (postStart > postEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = inStart;
        for (; index <= inEnd; index++) {
            if (inorder[index] == postorder[postEnd]) {
                break;
            }
        }
        int len = index - inStart;
        root.left = buildTree(inorder, inStart, index - 1, postorder, postStart, postStart + len - 1);
        root.right = buildTree(inorder, index + 1, inEnd, postorder, postStart + len, postEnd - 1);
        return root;
    }
}
