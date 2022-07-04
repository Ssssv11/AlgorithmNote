package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=870 lang=java
 *
 * [870] 优势洗牌
 */

// @lc code=start

/*
 * 田忌赛马问题
 * 同时要注意 nums2 中的元素顺序不能变，这里使用优先队列来对元素进行排序出队
 */
class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((int[] pair1, int[] pair2) -> {
            return pair2[1] - pair1[1];
        });
        for (int i = 0; i < n; i++) {
            priorityQueue.offer(new int[]{i, nums2[i]});
        }

        Arrays.sort(nums1);
        int left = 0, right = n - 1;
        int[] res = new int[n];

        while(!priorityQueue.isEmpty()) {
            int[] pair = priorityQueue.poll();
            int i = pair[0], max = pair[1];
            if(max < nums1[right]) {
                res[i] = nums1[right];
                right--;
            } else {
                res[i] = nums1[left];
                left++;
            }
        }
        return res;
    }
}
// @lc code=end

