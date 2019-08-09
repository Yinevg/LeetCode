package com.learn.medium;

import com.learn.object.ListNode;

import java.util.Stack;

/**
 * Created by Yinevg on 2019/8/9
 * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 * <p>
 * Example:
 * <p>
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 */
public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.add(l2.val);
            l2 = l2.next;
        }
        ListNode preHead = new ListNode(0);
        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int sum = carry;
            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }
            ListNode cur = new ListNode(sum % 10);
            carry = sum / 10;
            cur.next = preHead.next;
            preHead.next = cur;
        }
        if (carry != 0) {
            preHead.val = carry;
            return preHead;
        } else {
            return preHead.next;
        }
    }
}
