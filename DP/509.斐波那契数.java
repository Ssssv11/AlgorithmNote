package DP;

/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
/*
 * 自顶向下带备忘录的递归
 */
// class Solution {
//     public int fib(int n) {
//         if (n == 0) {
//             return 0;
//         }
//         int[] memo = new int[n + 1];
//         return helper(memo, n);
//     }

//     int helper(int[] memo, int n) {
//         // base case
//         if (n == 1 || n == 2) {
//             return 1;
//         }
//         // 已经计算过
//         if (memo[n] != 0) {
//             return memo[n];
//         }
//         memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
//         return memo[n];
//     }
// }

/*
 * 自底向上 DP table 递推
 */
// class Solution {
//     int fib(int n) {
//         if(n == 0) {
//             return 0;
//         }
//         if(n == 1 || n == 2) {
//             return 1;
//         }
    
//         int dp[] = new int[n + 1];
//         // base case
//         dp[0] = 0;
//         dp[1] = dp[2] = 1;
//         // 状态转移
//         for(int i = 3; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }
//         return dp[n];
//     }
// }

/*
 * 优化空间复杂度
 */
class Solution {
    int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
    
        int prev = 1, curr = 1;
        for(int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
// @lc code=end
