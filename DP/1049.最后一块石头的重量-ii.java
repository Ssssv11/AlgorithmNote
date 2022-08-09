package DP;

/*
 * @lc app=leetcode.cn id=1049 lang=java
 *
 * [1049] 最后一块石头的重量 II
 */

// @lc code=start

/**
 * 转化为背包问题：将 n 块石头分为两堆，求两堆石头重量总和的最小差值
 * 背包最大容量为这 n 块石头总重量的一半
 * dp[i][j] 的含义为：当可选石头为前 i 个时，容量为 j 的背包所能存放的实际最大值
 */
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        for(int stone : stones) {
            sum += stone;
        }
        int weight = sum / 2;
        int[][] dp = new int[n + 1][weight + 1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= weight; j++) {
                if(j - stones[i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i - 1]] + stones[i - 1]);
                }
            }
        }

        // 一堆为 dp[n][weight]，另一堆为 sum - dp[n][weight]
        // 差值为 (sum - dp[n][weight]) - dp[n][weight]
        return sum - dp[n][weight] - dp[n][weight];
    }
}
// @lc code=end

