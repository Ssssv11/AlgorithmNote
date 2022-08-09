package DP;

/*
 * @lc app=leetcode.cn id=518 lang=java
 *
 * [518] 零钱兑换 II
 */

// @lc code=start
class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        // base case
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= amount; j++) {
                if(j - coins[i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                }
            }
        }

        return dp[n][amount];
    }
}

/**
 * 优化空间复杂度
 */
// class Solution {
//     public int change(int amount, int[] coins) {
//         int n = coins.length;
//         int[] dp = new int[amount + 1];

//         // base case
//         dp[0] = 1;

//         for(int i = 0; i < n; i++) {
//             for(int j = 1; j <= amount; j++) {
//                 if(j - coins[i] >= 0) {
//                     dp[j] = dp[j] + dp[j - coins[i]];
//                 } 
//             }
//         }

//         return dp[amount];
//     }
// }
// @lc code=end

