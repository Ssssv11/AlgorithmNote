package Array;

/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
/*
 * 使用辅助数组，先将二维数组行倒转，再将列变为行
 */
class Solution {
    public void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = matrix.length-1; i >= 0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}

/*
 * 思想相似但是对角线转换且不使用辅助数组
 */
//  class Solution {
//     public void rotate(int[][] matrix) {
//         for (int i = 0; i < matrix.length/2; i++) {
//             for (int j = 0; j < matrix.length; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[matrix.length - i - 1][j];
//                 matrix[matrix.length - i - 1][j] = temp;
//             }
//         }
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < i; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//     }
//  }
// @lc code=end

