package BackTrack;
/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 从[i,j]这个坐标开始查找
                if (backtrack(board, words, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, char[] word, int i, int j, int index) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[index]) {
            return false;
        }
        if (index == word.length - 1) {
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '.';
        boolean res = backtrack(board, word, i + 1, j, index + 1) || backtrack(board, word, i - 1, j, index + 1)
                || backtrack(board, word, i, j + 1, index + 1) || backtrack(board, word, i, j - 1, index + 1);
        board[i][j] = temp;
        return res;
    }
}
// @lc code=end
