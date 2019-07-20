package com.learn.medium;

import com.learn.object.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yinevg on 2019/7/20
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * <p>
 * Calling next() will return the next smallest number in the BST.
 * <p>
 * <p>
 * <p>
 * Example:
 *      3
 *    / \
 *  9  20
 *   /  \
 * 15   7
 * <p>
 * BSTIterator iterator = new BSTIterator(root);
 * iterator.next();    // return 3
 * iterator.next();    // return 7
 * iterator.hasNext(); // return true
 * iterator.next();    // return 9
 * iterator.hasNext(); // return true
 * iterator.next();    // return 15
 * iterator.hasNext(); // return true
 * iterator.next();    // return 20
 * iterator.hasNext(); // return false
 * <p>
 * <p>
 * Note:
 * <p>
 * next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 * You may assume that next() call will always be valid, that is, there will be at least a next smallest number in the BST when next() is called.
 */
public class BSTIterator {
    Queue<Integer> queue = null;

    public BSTIterator(TreeNode root) {
        queue = new LinkedList<>();
        init(root);
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return queue.poll();
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    private void init(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            init(root.left);
        }
        queue.offer(root.val);
        if (root.right != null) {
            init(root.right);
        }
    }

}
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
