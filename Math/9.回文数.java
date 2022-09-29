package Math;
/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x, y = 0;
        while(temp > 0) {
            int lastNum = temp % 10;
            temp = temp / 10;
            y = y * 10 + lastNum;
        }
        return y == x;
    }
}
// @lc code=end

