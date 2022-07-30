package DP;
/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

import java.util.Arrays;

// @lc code=start
/*
 * 带备忘录的递归解法
 */
// class Solution {
//     int[] memo;
//     public int coinChange(int[] coins, int amount) {
//         memo = new int[amount + 1];
//         // 备忘录初始化为一个不会被取到的特殊值，代表还未被计算
//         Arrays.fill(memo, -100);
    
//         return dp(coins, amount);
//     }
    
//     // 定义：要凑出金额 n，至少要 dp(coins, n) 个硬币
//     int dp(int[] coins, int amount) {
//         // base case
//         if(amount == 0) {
//             return 0;
//         }
//         if(amount < 0) {
//             return -1;
//         }
//         // 查备忘录
//         if(memo[amount] != -100) {
//             return memo[amount];
//         }
    
//         int res = Integer.MAX_VALUE;
    
//         // 做选择，选择需要硬币最少的那个结果
//         for(int coin : coins) {
//             // 计算子问题的结果
//             int subProblem = dp(coins, amount - coin);
//             // 子问题无解则跳过
//             if(subProblem == -1) {
//                 continue;
//             }
//             // 在子问题中选择最优解，然后加一
//             res = Math.min(res, 1 + subProblem);
//         }
//         // 把计算结果存入备忘录
//         memo[amount] = (res == Integer.MAX_VALUE) ? -1 : res;
//         return memo[amount];
//     }
// }

/*
 * dp 数组迭代解法
 */
class Solution {
    int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        // 数组大小为 amount + 1，初始值也为 amount + 1
        Arrays.fill(dp, amount + 1);
    
        // base case
        dp[0] = 0;
        // 外层 for 循环在遍历所有状态的所有取值
        for(int i = 1; i < dp.length; i++) {
            // 内层 for 循环在求所有选择的最小值
            for(int coin : coins) {
                // 子问题无解，跳过
                if(i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }
}
// @lc code=end

