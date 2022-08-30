package DP;

/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    private int[][] memo;

    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        return dp(m - 1, n - 1);
    }

    private int dp(int x, int y) {
        if(x == 0 && y == 0) {
            return 1;
        }
        if (x < 0 || y < 0) {
            return 0;
        }
        if(memo[x][y] <= 0) {
            memo[x][y] = dp(x - 1, y) + dp(x, y - 1);
        }
        return memo[x][y];
    }
}
// @lc code=end

