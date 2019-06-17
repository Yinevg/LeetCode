package com.learn.medium;

import com.learn.object.ListNode;

/**
 * Created by Yinevg on 2019/6/17
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 * Example 2:
 * <p>
 * Input: 0->1->2->NULL, k = 4
 * Output: 2->0->1->NULL
 * Explanation:
 * rotate 1 steps to the right: 2->0->1->NULL
 * rotate 2 steps to the right: 1->2->0->NULL
 * rotate 3 steps to the right: 0->1->2->NULL
 * rotate 4 steps to the right: 2->0->1->NULL
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int len = 0;
        for (ListNode i = head; i != null; i = i.next) {
            len++;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        ListNode result = head;
        for (int i = len - k; i > 0; i--) {
            ListNode tmp = result.next;
            if (i == 1) {
                result.next = null;
            }
            result = tmp;
        }
        ListNode tmp = result;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = head;
        return result;
    }
}
