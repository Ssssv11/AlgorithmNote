/*
 * @lc app=leetcode.cn id=667 lang=java
 *
 * [667] 优美的排列 II
 */

// @lc code=start
class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int interval = k;
        res[0] = 1;
        for (int i = 1; i <= k; i++) {
            res[i] = i % 2 == 1 ? res[i - 1] + interval : res[i - 1] - interval;
            interval--;
        }
        for (int i = k + 1; i < n; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
// @lc code=end

