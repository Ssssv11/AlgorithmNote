package Array;
/*
 * @lc app=leetcode.cn id=1582 lang=java
 *
 * [1582] 二进制矩阵中的特殊位置
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public int numSpecial(int[][] mat) {
        List<Integer> rows = new ArrayList<>(), cols = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int s = 0;
            for (int j = 0; j < mat[0].length; j++) {
                s += mat[i][j];
            }
            if (s == 1) {
                rows.add(i);
            }
        }
        for (int i = 0; i < mat[0].length; i++) {
            int s = 0;
            for (int j = 0; j < mat.length; j++) {
                s += mat[j][i];
            }
            if (s == 1) {
                cols.add(i);
            }
        }
        int ans = 0;
        for (int i: rows) {
            for (int j: cols) {
                ans += mat[i][j];
            }
        }
        return ans;
    }
}
// @lc code=end

