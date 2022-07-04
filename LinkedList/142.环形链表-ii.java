import java.util.List;

/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 /*
  * 基于 #141 的解法，当快慢指针相遇时，让其中任一个指针指向头节点
  * 然后让它们以相同速度前进，再次相遇时所在的节点位置就是环开始的位置。
  */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while(slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
// @lc code=end

