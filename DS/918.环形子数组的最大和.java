package DS;

import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=918 lang=java
 *
 * [918] 环形子数组的最大和
 */

// @lc code=start
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        // 模拟环状的 nums 数组
        int[] preSum = new int[2 * n + 1];
        preSum[0] = 0;

        // 计算环状 nums 的前缀和
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[(i - 1) % n];
        }

        // 记录答案
        int maxSum = Integer.MIN_VALUE;
        // 维护一个滑动窗口，以便根据窗口中的最小值计算最大子数组和
        MonotonicQueue<Integer> window = new MonotonicQueue<>();
        window.push(0);
        for (int i = 1; i < preSum.length; i++) {
            maxSum = Math.max(maxSum, preSum[i] - window.min());
            // 维护窗口的大小为 nums 数组的大小
            if (window.size() == n) {
                window.pop();
            }
            window.push(preSum[i]);
        }

        return maxSum;
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

