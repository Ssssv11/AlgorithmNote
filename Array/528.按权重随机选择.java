package Array;

import java.util.Random;

/*
 * @lc app=leetcode.cn id=528 lang=java
 *
 * [528] 按权重随机选择
 */

// @lc code=start

/*
 * 1. 根据指定的权重构造前缀和数组 preSum
 * 2. 生成一个取值在 preSum 内的随机数，用二分查找算法查找大于等于该数的最小元素索引
 * 3. 对索引减一（前缀和数组 0 为辅助位）
 * 其中 target 的区间为[1, preSum[w.length + 1]]
 * 二分查找使用查找左边界的二分查找
 */
class Solution {
    private int[] preSum;
    private Random random = new Random();

    public Solution(int[] w) {
        int n = w.length;
        preSum = new int[n + 1];
        preSum[0] = 0;
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + w[i - 1];
        }
    }
    
    public int pickIndex() {
        int n = preSum.length;
        int target = random.nextInt(preSum[n - 1]) + 1;
        return leftBound(preSum, target) - 1;
    }

    public int leftBound(int[] nums, int target) {
        int left = 0, right = nums.length;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                right = mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid;
            }
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
// @lc code=end

