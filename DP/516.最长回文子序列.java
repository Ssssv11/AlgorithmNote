package DP;
/*
 * @lc app=leetcode.cn id=516 lang=java
 *
 * [516] 最长回文子序列
 */

// @lc code=start
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        // dp 数组初始化为 0
        int[][] dp = new int[n][n];

        // base case
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // 反向遍历
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }
}

/**
 * 空间压缩
 */
// class Solution {
//     public int longestPalindromeSubseq(String s) {
//         int n = s.length();
//         // dp 数组初始化为 0
//         int[] dp = new int[n];
//         Arrays.fill(dp, 1);
    
//         for (int i = n - 2; i >= 0; i--) {
//             // 存储 dp[i+1][j-1] 的变量
//             int pre = 0;
//             for (int j = i + 1; j < n; j++) {
//                 int temp = dp[j];
//                 if (s.charAt(i) == s.charAt(j))
//                     // dp[i][j] = dp[i+1][j-1] + 2;
//                     dp[j] = pre + 2;
//                 else
//                     dp[j] = Math.max(dp[j], dp[j - 1]);
//                 // 到下一轮循环，pre 就是 dp[i+1][j-1] 了
//                 pre = temp;
//             }
//         }
    
//         return dp[n - 1];
//     }
// }
// @lc code=end
