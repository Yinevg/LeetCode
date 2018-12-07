package com.learn.medium;

import com.learn.object.ListNode;

/**
 * Created by Yinevg on 2018/12/7
 * <p>
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * Example:
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * <p>
 * Note:
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }
}
