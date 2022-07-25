package BackTrack;

/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board, 0, 0);
    }

    private boolean backtrack(char[][] board, int i, int j) {
        int m = 9, n = 9;
        if (j == n) {
            // 穷举到最后一列就换到下一行重新开始。
            return backtrack(board, i + 1, 0);
        }
        if (i == m) {
            // 找到一个可行解，触发 base case
            return true;
        }
    
        if (board[i][j] != '.') {
            // 如果有预设数字
            return backtrack(board, i, j + 1);
        } 
    
        for (char ch = '1'; ch <= '9'; ch++) {
            // 如果遇到不合法的数字就跳过
            if (!isValid(board, i, j, ch))
                continue;
            
            board[i][j] = ch;
            // 如果找到一个可行解，立即结束
            if (backtrack(board, i, j + 1)) {
                return true;
            }
            board[i][j] = '.';
        }
        // 穷举完 1~9 依然没有找到可行解
        return false;
    }

    private boolean isValid(char[][] board, int row, int col, char n) {
        for(int i = 0; i < 9; i++) {
            // 判断行是否存在重复
            if(board[row][i] == n) {
                return false;
            }
            // 判断列是否存在重复
            if(board[i][col] == n) {
                return false;
            }
            // 判断 3 x 3 方框是否存在重复
            if(board[(row / 3) * 3 + i / 3][(col / 3) * 3 + i % 3] == n) {
                return false;
            }
        }
        return true;
    }
    
}
// @lc code=end

