package Math;

/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根 
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int left = 0, right = x;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            long pow = (long) mid * mid;
            if(pow < x) {
                left = mid + 1;
            } else if(pow > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
// @lc code=end

