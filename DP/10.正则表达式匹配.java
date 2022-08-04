package DP;
/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    boolean[][] memo;

    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        memo = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(memo[i], false);
        }

        return dp(s, 0, p, 0);
    }

    boolean dp(String s, int i, String p, int j) {
        int m = s.length(), n = p.length();

        // base case
        if (j == n) {
            return i == m;
        }

        if (i == m) {
            if ((n - j) % 2 == 1) {
                return false;
            }
            for (; j + 1 < n; j += 2) {
                if (p.charAt(j + 1) != '*') {
                    return false;
                }
            }
            return true;
        }

        if (memo[i][j] != false) {
            return memo[i][j];
        }

        boolean res = false;
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            if (j + 1 < n && p.charAt(j + 1) == '*') {
                res = dp(s, i, p, j + 2) || dp(s, i + 1, p, j);
            } else {
                res = dp(s, i + 1, p, j + 1);
            }
        } else {
            if (j + 1 < n && p.charAt(j + 1) == '*') {
                res = dp(s, i, p, j + 2);
            } else {
                res = false;
            }
        }
        memo[i][j] = res;
        return res;

    }
}
// @lc code=end
