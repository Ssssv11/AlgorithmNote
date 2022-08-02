package DP;
/*
 * @lc app=leetcode.cn id=72 lang=java
 *
 * [72] 编辑距离
 */

import java.util.Arrays;

// @lc code=start
// class Solution {
//     // 备忘录
//     int[][] memo;

//     public int minDistance(String s1, String s2) {
//         int m = s1.length(), n = s2.length();
//         // 备忘录初始化为特殊值，代表还未计算
//         memo = new int[m][n];
//         for (int[] row : memo) {
//             Arrays.fill(row, -1);
//         }
//         return dp(s1, m - 1, s2, n - 1);
//     }

//     private int dp(String s1, int i, String s2, int j) {
//         // base case
//         if (i == -1)
//             return j + 1;
//         if (j == -1)
//             return i + 1;

//         // 查备忘录，避免重叠子问题
//         if (memo[i][j] != -1) {
//             return memo[i][j];
//         }

//         // 状态转移，结果存入备忘录
//         if (s1.charAt(i) == s2.charAt(j)) {
//             memo[i][j] = dp(s1, i - 1, s2, j - 1);
//         } else {
//             memo[i][j] = min(
//                     dp(s1, i, s2, j - 1) + 1,
//                     dp(s1, i - 1, s2, j) + 1,
//                     dp(s1, i - 1, s2, j - 1) + 1);
//         }

//         return memo[i][j];
//     }

//     private int min(int a, int b, int c) {
//         return Math.min(a, Math.min(b, c));
//     }
// }

class Solution {
    public int minDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        // 定义：s1[0..i] 和 s2[0..j] 的最小编辑距离是 dp[i+1][j+1]
        int[][] dp = new int[m + 1][n + 1];

        // base case
        for(int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }
        for(int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }
    
        // 自底向上求解
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = min(
                        dp[i][j - 1] + 1,
                        dp[i - 1][j] + 1,
                        dp[i - 1][j - 1] + 1
                    );
                }
            }
        }
        return dp[m][n];
    }
    
    private int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
// @lc code=end
