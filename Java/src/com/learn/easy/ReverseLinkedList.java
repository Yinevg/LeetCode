package com.learn.easy;

import com.learn.object.ListNode;

/**
 * Created by Yinevg on 2019/7/29
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null, cur = head, next = head.next;
        while (next != null) {
            ListNode tmp = next.next;
            next.next = cur;
            cur.next = pre;
            pre = cur;
            cur = next;
            next = tmp;
        }
        return cur;
    }
}
