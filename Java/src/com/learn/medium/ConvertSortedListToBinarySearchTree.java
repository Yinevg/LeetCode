package com.learn.medium;

import com.learn.object.ListNode;
import com.learn.object.TreeNode;

/**
 * Created by Yinevg on 2019/7/7
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * <p>
 * Example:
 * <p>
 * Given the sorted linked list: [-10,-3,0,5,9],
 * <p>
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 * <p>
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head, null);
    }

    private TreeNode buildTree(ListNode head, ListNode end) {
        if (head == end) {
            return null;
        }
        ListNode run = head, walk = head;
        while (run != end && run.next != end) {
            run = run.next.next;
            walk = walk.next;
        }
        TreeNode root = new TreeNode(walk.val);
        root.left = buildTree(head, walk);
        root.right = buildTree(walk.next, end);
        return root;
    }
}
