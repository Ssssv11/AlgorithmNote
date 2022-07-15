package DP;
/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start

/*
 * 最基本的动态规划
 * 爬到第 n 级台阶的方法个数等于爬到 n - 1 的方法个数和爬到 n - 2 的方法个数之和。
 */
class Solution {
    private int[] memo;

    public int climbStairs(int n) {
        memo = new int[n + 1];
        return dp(n);
    }

    // 定义：爬到第 n 级台阶的方法个数为 dp(n)
    int dp(int n) {
        if(n <= 2) {
            return n;
        }
        if(memo[n] > 0) {
            return memo[n];
        }
        // 状态转移方程：
        // 爬到第 n 级台阶的方法个数等于爬到 n - 1 的方法个数和爬到 n - 2 的方法个数之和。
        memo[n] = dp(n - 1) + dp(n - 2);
        return memo[n];
    }
}
// @lc code=end

