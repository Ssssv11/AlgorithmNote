package Array;

/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start

/*
 * 与 54 相似，同样遵守右、下、左、上的顺序遍历
 */
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int upperBound = 0, lowerBound = n - 1;
        int leftBound = 0, rightBound = n - 1;
        int num = 1;

        while(num <= n * n) {
            if(upperBound <= lowerBound) {
                for (int i = leftBound; i <= rightBound; i++) {
                    matrix[upperBound][i] = num++;
                }
                upperBound++;
            }
            if(leftBound <= rightBound) {
                for (int i = upperBound; i <= lowerBound; i++) {
                    matrix[i][rightBound] = num++;
                }
                rightBound--;
            }
            if(upperBound <= lowerBound) {
                for (int i = rightBound; i >= leftBound; i--) {
                    matrix[lowerBound][i] = num++;
                }
                lowerBound--;
            }
            if(leftBound <= rightBound) {
                for (int i = lowerBound; i >= upperBound; i--) {
                    matrix[i][leftBound] = num++;
                }
                leftBound++;
            }
        }
        return matrix;
    }
}
// @lc code=end

