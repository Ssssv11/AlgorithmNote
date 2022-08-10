package DP;
/*
 * @lc app=leetcode.cn id=452 lang=java
 *
 * [452] 用最少数量的箭引爆气球
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int xEnd = points[0][1];
        for (int[] interval : points) {
            int start = interval[0];
            // 边界也引爆
            if (start > xEnd) {
                count++;
                xEnd = interval[1];
            }
        }
        return count;
    }
}
// @lc code=end

