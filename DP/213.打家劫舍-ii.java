package DP;

/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        return Math.max(
                robRange(nums, 0, n - 2),
                robRange(nums, 1, n - 1));
    }

    // 仅计算闭区间 [start,end] 的最优结果
    private int robRange(int[] nums, int start, int end) {
        int cur = 0, pre = 0;
        int res = 0;

        for (int i = end; i >= start; i--) {
            res = Math.max(cur, nums[i] + pre);
            pre = cur;
            cur = res;
        }
        return res;
    }
}
// @lc code=end
