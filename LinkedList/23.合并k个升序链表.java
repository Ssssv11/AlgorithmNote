import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个升序链表
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
  * 合并 k 个有序链表的逻辑类似合并两个有序链表，难点在于如何快速得到 k 个节点中的最小节点接到结果链表上
  * 这里用到 优先级队列（二叉堆） 这种数据结构，把链表节点放入一个最小堆，就可以每次获得 k 个节点中的最小节点
  */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        // 优先队列
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, (a, b) -> 
            (a.val - b.val)
        );
        // 将 k 个链表的头节点加入优先队列
        for (ListNode listNode : lists) {
            if(listNode != null) {
                priorityQueue.add(listNode);
            }
        }

        while(!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll();
            p.next = node;
            if(node.next != null) {
                priorityQueue.add(node.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}
// @lc code=end

