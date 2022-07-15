package Else;

/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start

/*
 * 先异或运算
 * 再计算这个异或运算的结果在二进制表示中1的个数
 */
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
// @lc code=end

