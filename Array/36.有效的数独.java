package Array;

/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
/* 当遍历到数字时，判断其所在行、列、子九宫格是否有相同的
 * 首先要明确[i][j]所在的子九宫格位置：j/3 + (i/3)*3
 * 分别利用row、col、box来保存数字出现的行列和子九宫格
 * 某个位置出现数字时只需要在对应的row、col、box中查找该位置是否有数字即可
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '1';
                if(row[i][num] || col[j][num] || box[(j/3) + (i/3)*3][num]) {
                    return false;
                }
                row[i][num] = true;
                col[j][num] = true;
                box[(j/3) + (i/3)*3][num] = true;
                }
            }
            return true;
        }
}
// @lc code=end

