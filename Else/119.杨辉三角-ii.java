package Else;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start

// 定义：输入行数，返回该行的杨辉三角数列
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> curRow = new ArrayList<>();
        // 每一行开头是 1
        curRow.add(1);

        if(rowIndex == 0) {
            return curRow;
        }

        // 递归计算出上一行
        List<Integer> prevRow = getRow(rowIndex - 1);
        for (int i = 0; i < prevRow.size() - 1; i++) {
            // 这一行每个元素等于上一行的两个相邻元素之和
            curRow.add(prevRow.get(i) + prevRow.get(i + 1));
        }
        // 每一行结尾是 1
        curRow.add(1);
        return curRow;
    }
}
// @lc code=end

