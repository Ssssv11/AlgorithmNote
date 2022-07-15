package Math;

/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start

/*
 * 4 的幂首先一定是 2 的幂，再根据模运算筛选 4 的幂
 */
class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
    }
}
// @lc code=end

