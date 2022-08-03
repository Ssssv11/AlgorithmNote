package DP;

import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=64 lang=java
 *
 * [64] 最小路径和
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];

        // base case
        dp[0][0] = grid[0][0];
        // 初始化从 [0,0] 到 [i,0] 的路径和
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        // 初始化从 [0,0] 到 [0,j] 的路径和
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // 状态转移
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // dp[i][j] = 左或上的路径和加本路径
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[m - 1][n - 1];
    }
}

/**
 * 自顶向下的递归解法
 */
// class Solution {
// int[][] memo;

// public int minPathSum(int[][] grid) {
// int m = grid.length;
// int n = grid[0].length;

// // 构造备忘录，初始值全部设为 -1
// memo = new int[m][n];
// for (int[] row : memo) {
// Arrays.fill(row, -1);
// }

// return dp(grid, m - 1, n - 1);
// }

// private int dp(int[][] grid, int i, int j) {
// // base case
// if (i == 0 && j == 0) {
// return grid[0][0];
// }

// if (i < 0 || j < 0) {
// return Integer.MAX_VALUE;
// }

// if (memo[i][j] != -1) {
// return memo[i][j];
// }

// memo[i][j] = Math.min(dp(grid, i, j - 1), dp(grid, i - 1, j)) + grid[i][j];

// return memo[i][j];
// }
// }
// @lc code=end
