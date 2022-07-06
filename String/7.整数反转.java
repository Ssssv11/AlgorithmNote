package String;
/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start

/*
 * 常规的反转整数操作，需要注意的是溢出的判断
 */
class Solution {
    public int reverse(int x) {
        int res = 0;
        while(x != 0) {
            int temp = x % 10;
            if(res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            res = res * 10 + temp;
            x /= 10;
        }
        return res;
    }
}
// @lc code=end

