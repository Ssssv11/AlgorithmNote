package LinkedList;
/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
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


class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        //奇数链表的头节点
        ListNode oddHead = head;
        //奇数链表的当前节点
        ListNode oddCur = oddHead;

        //偶数链表的头节点
        ListNode evenHead = head.next;
        //偶数链表的当前节点
        ListNode evenCur = evenHead;

        while(evenCur != null && evenCur.next != null) {
            oddCur.next = oddCur.next.next;
            evenCur.next = evenCur.next.next;

            oddCur = oddCur.next;
            evenCur = evenCur.next;
        }

        oddCur.next = evenHead;
        return oddHead;

    }
}
// @lc code=end

