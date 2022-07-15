package Else;
/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */

// @lc code=start
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            // 消除数字 n 的二进制表示中的最后一个 1
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}
// @lc code=end

