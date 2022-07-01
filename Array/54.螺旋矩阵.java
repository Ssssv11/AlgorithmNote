package Array;

import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start

/*
 * 按照右、下、左、上的顺序遍历数组，并使用四个变量圈定未遍历元素的边界
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int upperBound = 0, lowerBound = m - 1;
        int leftBound = 0, rightBound = n - 1;
        List<Integer> list = new LinkedList<>();

        // 当 list.size() == m * n 时说明元素已经被全部添加
        while(list.size() < m * n) {
            // 向右遍历
            if(upperBound <= lowerBound) {
                for (int i = leftBound; i <= rightBound; i++) {
                    list.add(matrix[upperBound][i]);
                }
                // 上界下移
                upperBound++;
            }
            // 向下遍历
            if(leftBound <= rightBound) {
                for (int i = upperBound; i <= lowerBound; i++) {
                    list.add(matrix[i][rightBound]);
                }
                // 右界左移
                rightBound--;
            }
            // 向左遍历
            if(upperBound <= lowerBound) {
                for (int i = rightBound; i >= leftBound; i--) {
                    list.add(matrix[lowerBound][i]);
                }
                // 下界上移
                lowerBound--;
            }
            // 向上遍历
            if(leftBound <= rightBound) {
                for (int i = lowerBound; i >= upperBound; i--) {
                    list.add(matrix[i][leftBound]);
                }
                // 左界右移
                leftBound++;
            }
        }
        return list;
    }
}
// @lc code=end

