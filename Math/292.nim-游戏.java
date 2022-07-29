package Math;

/*
 * @lc app=leetcode.cn id=292 lang=java
 *
 * [292] Nim 游戏
 */

// @lc code=start
class Solution {
    boolean canWinNim(int n) {
        // 若 n 可以被 4 整除，则肯定赢
        return n % 4 != 0;
    }
}
// @lc code=end

