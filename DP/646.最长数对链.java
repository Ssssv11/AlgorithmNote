package DP;
/*
 * @lc app=leetcode.cn id=646 lang=java
 *
 * [646] 最长数对链
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        
        // dp[i] 表示以 pairs[i] 为结尾的最长数对链的长度
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(pairs[j][1] < pairs[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
// @lc code=end

