package DP;

/*
 * @lc app=leetcode.cn id=188 lang=java
 *
 * [188] 买卖股票的最佳时机 IV
 */

// @lc code=start
class Solution {
    // public int maxProfit(int k, int[] prices) {
    //     int n = prices.length;
    //     if (n == 0) {
    //         return 0;
    //     }
    //     if (k > n / 2) {
    //         // 复用之前交易次数 k 没有限制的情况
    //         return maxProfit_k_inf(prices);
    //     }

    //     // base case：
    //     // dp[-1][...][0] = dp[...][0][0] = 0
    //     // dp[-1][...][1] = dp[...][0][1] = -infinity
    //     int[][][] dp = new int[n][k + 1][2];
    //     // k = 0 时的 base case
    //     for (int i = 0; i < n; i++) {
    //         dp[i][0][1] = Integer.MIN_VALUE;
    //         dp[i][0][0] = 0;
    //     }

    //     for (int i = 0; i < n; i++)
    //         for (int j = k; j >= 1; j--) {
    //             if (i - 1 == -1) {
    //                 // 处理 i = -1 时的 base case
    //                 dp[i][j][0] = 0;
    //                 dp[i][j][1] = -prices[i];
    //                 continue;
    //             }
    //             dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
    //             dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
    //         }

    //     return dp[n - 1][k][0];
    // }

    // private int maxProfit_k_inf(int[] prices) {
    //     int n = prices.length;
    //     int[][] dp = new int[n][2];
    //     for (int i = 0; i < n; i++) {
    //         if (i - 1 == -1) {
    //             // base case
    //             dp[i][0] = 0;
    //             dp[i][1] = -prices[i];
    //             continue;
    //         }
    //         dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
    //         dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
    //     }
    //     return dp[n - 1][0];
    // }

    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n <= 0) {
            return 0;
        }
        int[][][] dp = new int[n][k + 1][2];

        for (int i = 0; i < n; i++) {
            for (int j = k; j >= 1; j--) {
                if (i - 1 == -1) {
                    dp[i][j][0] = 0;
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }

        return dp[n - 1][k][0];
    }
}
// @lc code=end
