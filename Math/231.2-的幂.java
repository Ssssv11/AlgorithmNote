package Math;

/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2 的幂
 */

// @lc code=start

/*
 * 一个数如果是 2 的指数，那么它的二进制表示一定只含有一个 1。
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
// @lc code=end

