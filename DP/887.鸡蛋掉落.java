package DP;
/*
 * @lc app=leetcode.cn id=887 lang=java
 *
 * [887] 鸡蛋掉落
 */

import java.util.Arrays;

// @lc code=start

/**
 * 普通动态规划
 * 超时
 */
// class Solution {
//     // 备忘录
//     int[][] memo;

//     public int superEggDrop(int K, int N) {
//         // m 最多不会超过 N 次
//         memo = new int[K + 1][N + 1];
//         for (int[] row : memo) {
//             Arrays.fill(row, -111);
//         }
//         return dp(K, N);
//     }

//     // 定义：K 个鸡蛋 N 层楼，最少的扔鸡蛋次数为 dp(K, N)
//     private int dp(int K, int N) {
//         // base case
//         if (K == 1) {
//             return N;
//         }
//         if (N == 0) {
//             return 0;
//         }

//         // 查备忘录
//         if (memo[K][N] != -111) {
//             return memo[K][N];
//         }

//         // 状态转移方程
//         int res = Integer.MAX_VALUE;
//         for (int i = 1; i <= N; i++) {
//             // 在所有楼层尝试，取最少的扔鸡蛋次数
//             res = Math.min(
//                     res, Math.max(
//                             dp(K - 1, i - 1), // 碎
//                             dp(K, N - i) // 没碎
//                     ) + 1
//                 );
//         }

//         // 结果存入备忘录
//         memo[K][N] = res;
//         return res;
//     }
// }

/**
 * 二分优化查找
 */
class Solution {
    // 备忘录
    int[][] memo;

    public int superEggDrop(int K, int N) {
        // m 最多不会超过 N 次
        memo = new int[K + 1][N + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -111);
        }
        return dp(K, N);
    }

    int dp(int K, int N) {
        // base case
        if (K == 1) {
            return N;
        }
        if (N == 0) {
            return 0;
        }

        if (memo[K][N] != -111) {
            return memo[K][N];
        }

        // 用二分查找代替线性搜索
        int res = Integer.MAX_VALUE;
        int lo = 1, hi = N;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            // 鸡蛋在第 mid 层碎了和没碎的两种情况：
            int broken = dp(K - 1, mid - 1);
            int notBroken = dp(K, N - mid);
            if (broken > notBroken) {
                hi = mid - 1;
                res = Math.min(res, broken + 1);
            } else {
                lo = mid + 1;
                res = Math.min(res, notBroken + 1);
            }
        }
        memo[K][N] = res;
        return res;
    }
}

/**
 * 优化 dp 定义
 */
// class Solution {
//     public int superEggDrop(int K, int N) {
//         // m 最多不会超过 N 次（线性扫描）
//         int[][] dp = new int[K + 1][N + 1];
//         // base case:
//         // dp[0][..] = 0
//         // dp[..][0] = 0
//         // Java 默认初始化数组都为 0
//         int m = 0;
//         while (dp[K][m] < N) {
//             m++;
//             for (int k = 1; k <= K; k++)
//                 dp[k][m] = dp[k][m - 1] + dp[k - 1][m - 1] + 1;
//         }
//         return m;
//     }
// }
// @lc code=end
