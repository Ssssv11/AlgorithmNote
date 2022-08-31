package Math;

/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double a, int k) {
        if (k == 0) return 1;
        if (k == Integer.MIN_VALUE) {
            return myPow(1 / a, -(k + 1)) / a;
        }
        if (k < 0) {
            return myPow(1 / a, -k);
        }

        if (k % 2 == 1) {
            return (a * myPow(a, k - 1));
        } else {
            double sub = myPow(a, k / 2);
            return (sub * sub);
        }
    }
}
// @lc code=end

