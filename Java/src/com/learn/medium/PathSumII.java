package com.learn.medium;

import com.learn.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yinevg on 2019/7/9
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Given the below binary tree and sum = 22,
 * <p>
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \    / \
 * 7    2  5   1
 * Return:
 * <p>
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), root, sum);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> cur, TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                cur.add(root.val);
                result.add(new ArrayList<>(cur));
                cur.remove(cur.size() - 1);
            }
        }
        cur.add(root.val);
        helper(result, cur, root.left, sum - root.val);
        helper(result, cur, root.right, sum - root.val);
        cur.remove(cur.size() - 1);
    }
}
