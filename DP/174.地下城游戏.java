package DP;

/*
 * @lc app=leetcode.cn id=174 lang=java
 *
 * [174] 地下城游戏
 */

// @lc code=start
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
        // dp[i][j]：从 grid[i-1][j-1] 到达右下角所需的最小生命值为 dp[i][j]。
        int[][] dp = new int[m + 1][n + 1];

        // base case
        // 若右下角为怪，则生命值初始化为怪物血量+1，否则初始化为 1
        dp[m - 1][n - 1] = dungeon[m - 1][n - 1] < 0 ? -dungeon[m - 1][n - 1] + 1 : 1;

        for(int i = m; i >= 0; i--) {
            for(int j = n; j >= 0; j--) {
                // 最后一行一列为偏移
                if (i == m || j == n) {
                    dp[i][j] = Integer.MAX_VALUE;
                    continue;
                }
                // 初始化过
                if (i == m - 1 && j == n - 1) {
                    continue;
                }

                int res = Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j];
                dp[i][j] = res <= 0 ? 1 : res;
            }
        }

        return dp[0][0];
    }
}
// @lc code=end

