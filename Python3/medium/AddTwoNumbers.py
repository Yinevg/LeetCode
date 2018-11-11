from object.ListNode import ListNode


class AddTwoNumbers:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        result = ListNode(0)
        temp = result
        carry = 0
        while l1 is not None or l2 is not None:
            temp.next = ListNode(carry)
            temp = temp.next
            if l1 is not None:
                temp.val += l1.val
                l1 = l1.next
            if l2 is not None:
                temp.val += l2.val
                l2 = l2.next
            carry = temp.val // 10
            temp.val %= 10
        if carry != 0:
            temp.next = ListNode(carry)
        return result.next
