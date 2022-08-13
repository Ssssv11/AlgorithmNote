/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
    prehead := &ListNode{}
    result := prehead
    for l1 != nil && l2 != nil {
        if l1.Val < l2.Val {
            prehead.Next = l1
            l1 = l1.Next
        }else{
            prehead.Next = l2
            l2 = l2.Next
        }
        prehead = prehead.Next
    }
    if l1 != nil {
        prehead.Next = l1
    }
    if l2 != nil {
        prehead.Next = l2
    }
    return result.Next
}

