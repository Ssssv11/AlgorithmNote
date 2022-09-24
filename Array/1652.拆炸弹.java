package Array;
/*
 * @lc app=leetcode.cn id=1652 lang=java
 *
 * [1652] 拆炸弹
 */

// @lc code=start
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k == 0) return res;
        int[] preSum = new int[2 * n + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + code[(i - 1) % n];
        }

        for (int i = 0; i < n; i++) {
            if(k > 0) {
                res[i] = preSum[i + 1 + k] - preSum[i + 1];
            } else {
                res[i] = preSum[i + n] - preSum[i +n + k];
            }
        }

        return res;
    }
}
// @lc code=end

