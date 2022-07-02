package Array;

/*
 * @lc app=leetcode.cn id=875 lang=java
 *
 * [875] 爱吃香蕉的珂珂
 */

// @lc code=start

/*
 * 使用二分查找
 * x：吃香蕉的速度
 * f(x)：吃完香蕉所需的时间，f(x) 随 x 的增加而增加
 * target：时间限制 h
 */
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1000000000;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(f(piles, mid) <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    int f(int[] piles, int x) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / x;
            if(piles[i] % x > 0) {
                hours++;
            }
        }
        return hours;
    }
}
// @lc code=end

