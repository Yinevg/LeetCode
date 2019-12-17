package medium

// Definition for singly-linked list.
type ListNode struct {
	Val  int
	Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	// new函数会分配内存，返回的值是一个指向该类型零值的地址
	head := new(ListNode)
	cur := head
	carry := 0
	for l1 != nil || l2 != nil {
		if l1 != nil {
			carry += l1.Val
			l1 = l1.Next
		}
		if l2 != nil {
			carry += l2.Val
			l2 = l2.Next
		}
		cur.Next = &ListNode{
			Val:  carry % 10,
			Next: nil,
		}
		carry /= 10
		cur = cur.Next
	}
	if carry != 0 {
		cur.Next = &ListNode{
			Val:  1,
			Next: nil,
		}
	}
	return head.Next
}
