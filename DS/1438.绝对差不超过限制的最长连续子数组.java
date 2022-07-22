package DS;

import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=1438 lang=java
 *
 * [1438] 绝对差不超过限制的最长连续子数组
 */

// @lc code=start
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left = 0, right = 0;
        int windowSize = 0, res = 0;
        MonotonicQueue<Integer> window = new MonotonicQueue<>();

        while(right < nums.length) {
            // 扩大窗口，更新窗口最值
            window.push(nums[right]);
            right++;
            windowSize++;

            while(window.max() - window.min() > limit) {
                // 缩小窗口，更新窗口最值
                window.pop();
                left++;
                windowSize--;
            }
            // 在窗口收缩判断完之后才更新答案
            res = Math.max(res, windowSize);
        }
        return res;
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

