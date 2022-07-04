/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 /*
  * 使用两个指针来查找倒数第 k 个节点：
  * 1. 先让 p1 走 k 次，此时链表还剩 n - k 个节点
  * 2. 再让 p2 与 p1 同时走，当 p1 走到最后一个节点时，p2 刚好在第 n - k 个节点，即倒数第 k 个节点
  */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 先找到倒数第 n+1 个节点，再将该节点指向倒数第 n 个节点的下个节点
        ListNode node = findFromEnd(dummy, n + 1);
        node.next = node.next.next;
        return dummy.next;
    }

    private ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head, p2 = head;
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
// @lc code=end

