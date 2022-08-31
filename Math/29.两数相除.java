package Math;

/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = false;
        if (dividend > 0) {
            dividend = -dividend;
            isNegative = true;
        }
        if (divisor > 0) {
            divisor = -divisor;
            isNegative = !isNegative;
        }
        if (divisor < dividend) {
            return 0;
        }
        int[] rem = new int[33];
        int right = 0;
        int tmp = divisor;
        while (tmp < 0 && dividend <= tmp) {
            rem[right++] = tmp;
            tmp <<= 1;
        }
        rem[right] = Integer.MIN_VALUE;
        int res = subDivide(rem, dividend, right);
        return isNegative ? -res : res;
    }

    private int subDivide(int[] rem, int n, int r) {
        int left = 0, right = r, res = 0;
        while (left < right) {
            int min = ((right - left) >> 1) + left;
            if (rem[min] >= n) {
                res = min;
                left = min + 1;
            } else {
                right = min - 1;
            }
        }
        n = n - rem[res];
        return (1 << res) + (n <= rem[0] ? subDivide(rem, n, res + 1) : 0);
    }
}
// @lc code=end
