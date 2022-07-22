package DS;

import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=862 lang=java
 *
 * [862] 和至少为 K 的最短子数组
 */

// @lc code=start
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        // 根据题目的数据范围，前缀和数组中元素可能非常大，所以用 long 类型
        long[] preSum = new long[n + 1];
        preSum[0] = 0;
        
        // 计算 nums 的前缀和数组
        for(int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }

        // 单调队列结构辅助滑动窗口算法
        MonotonicQueue<Long> window = new MonotonicQueue<>();
        int left = 0, right = 0;
        int len = Integer.MAX_VALUE;

        // 开始执行滑动窗口算法框架
        while(right < preSum.length) {
            // 扩大窗口，元素入队
            window.push(preSum[right]);
            right++;
            // 若新进入窗口的元素和窗口中的最小值之差大于等于 k，
            // 说明得到了符合条件的子数组，缩小窗口，使子数组长度尽可能小
            while(right < preSum.length && !window.isEmpty() 
                && preSum[right] - window.min() >= k) {
                // 更新答案
                len = Math.min(len, right - left);
                // 缩小窗口
                window.pop();
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? -1 : len;
    }
}

/* 单调队列的实现，可以高效维护最大值和最小值 */
class MonotonicQueue<E extends Comparable<E>> {
    // 常规队列，存储所有元素
    LinkedList<E> q = new LinkedList<>();
    // 元素降序排列的单调队列，头部是最大值
    LinkedList<E> maxq = new LinkedList<>();
    // 元素升序排列的单调队列，头部是最小值
    LinkedList<E> minq = new LinkedList<>();

    public void push(E elem) {
        // 维护常规队列，直接在队尾插入元素
        q.addLast(elem);

        // 维护 maxq，将小于 elem 的元素全部删除
        while (!maxq.isEmpty() && maxq.getLast().compareTo(elem) < 0) {
            maxq.pollLast();
        }
        maxq.addLast(elem);

        // 维护 minq，将大于 elem 的元素全部删除
        while (!minq.isEmpty() && minq.getLast().compareTo(elem) > 0) {
            minq.pollLast();
        }
        minq.addLast(elem);
    }

    public E max() {
        // maxq 的头部是最大元素
        return maxq.getFirst();
    }

    public E min() {
        // minq 的头部是最大元素
        return minq.getFirst();
    }

    public E pop() {
        // 从标准队列头部弹出需要删除的元素
        E deleteVal = q.pollFirst();
        assert deleteVal != null;

        // 由于 push 的时候会删除元素，deleteVal 可能已经被删掉了
        if (deleteVal.equals(maxq.getFirst())) {
            maxq.pollFirst();
        }
        if (deleteVal.equals(minq.getFirst())) {
            minq.pollFirst();
        }
        return deleteVal;
    }

    public int size() {
        // 标准队列的大小即是当前队列的大小
        return q.size();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}
// @lc code=end

