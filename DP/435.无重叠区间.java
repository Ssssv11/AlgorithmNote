package DP;
/*
 * @lc app=leetcode.cn id=435 lang=java
 *
 * [435] 无重叠区间
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if(n == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int xEnd = intervals[0][1];

        for(int[] interval : intervals) {
            int start = interval[0];
            if(start >= xEnd) {
                count++;
                xEnd = interval[1];
            }
        }

        return n - count;
    }
}
// @lc code=end

