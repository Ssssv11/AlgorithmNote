package List;
/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
 * while 循环每次比较 p1 和 p2 的大小，把较小的节点接到结果链表上
 * 形象地理解，这个算法的逻辑类似于拉拉链，l1, l2 类似于拉链两侧的锯齿，指针 p 就好像拉链的拉索，将两个有序链表合并；
 * 或者说这个过程像蛋白酶合成蛋白质，l1, l2 就好比两条氨基酸，而指针 p 就好像蛋白酶，将氨基酸组合成蛋白质。
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 虚拟头节点
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;

        while(p1 != null && p2 != null) {
            // 比较 p1 和 p2 两个指针
            // 将值较小的的节点接到 p 指针
            if(p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // p 指针不断前进
            p = p.next;
        }

        // 当有一个链表空时，另一个接在 p 后
        if(p1 != null){
            p.next = p1;
        }
        if(p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }
}
// @lc code=end

