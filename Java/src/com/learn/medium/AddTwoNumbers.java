package com.learn.medium;

import com.learn.object.ListNode;

/**
 * Created by Yinevg on 2018/11/7
 * <p>
 * You are given two non-empty linked lists representing two
 * non-negative integers. The digits are stored in reverse order
 * and each of their nodes contain a single digit. Add the two
 * numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero,
 * except the number 0 itself.
 * <p>
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        while (l1 != null || l2 != null) {
            temp.next = new ListNode(carry);
            temp = temp.next;
            if (l1 != null) {
                temp.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp.val += l2.val;
                l2 = l2.next;
            }
            carry = temp.val / 10;
            temp.val %= 10;
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }
        return result.next;
    }
}
