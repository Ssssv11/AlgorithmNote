package BackTrack;

import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    // 存放所有结果
    List<List<String>> res = new LinkedList<>();
    
    public List<List<String>> solveNQueens(int n) {
        // 新建棋盘
        List<String> board = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        // 初始化棋盘 全部置空
        stringBuilder.append(".".repeat(n));
        for(int i = 0; i < n; i++) {
            board.add(stringBuilder.toString());
        }

        backtrack(0, board);
        return res;
    }

    /**
     * 路径：board 中小于 row 的那些行都已经成功放置了皇后
     * 选择列表：第 row 行的所有列都是放置皇后的选择
     * 结束条件：row 超过 board 的最后一行
     * @param board 棋盘情况
     * @param row 当前游标处于第几行
     * */
    private void backtrack(int row, List<String> board) {
        // 触发结束条件
        if(row == board.size()) {
            // 递归到了最后一个行 直接跳出
            res.add(new LinkedList<>(board));
            return;
        }

        // 获取当前游标所在的行的 String 长度
        int n = board.get(row).length();
        //开始穷举 从当前行的第 0 列开始处理节点
        for(int col = 0; col < n; col++) {
            // 检查节点合法性
            if(!isValid(row, col, board)) {
                continue;
            }
            // 做选择
            String str = board.get(row).substring(0, col) + 'Q' + board.get(row).substring(col + 1);
            //将上述的替换后的 String 代替到游标所在的 row
            board.set(row, str);

            // 进入下一层决策树
            backtrack(row + 1, board);

            // 撤销处理结果
            str = board.get(row).substring(0, col) + '.' + board.get(row).substring(col + 1);
            board.set(row, str);
        }
    }

    /**
     * 判断是否当前位置是否合法
     * @param row 检查游标目前所在的行位置
     * @param col 检查游标目前所在的列位置
     * @param board 当前的棋盘状态
     **/
    private boolean isValid(int row, int col, List<String> board) {
        int n = board.size();
        // 判断列位置是否合法
        for(int i = 0; i < n; i++) {
            if(board.get(i).charAt(col) == 'Q') {
                //第 i 行第 col 列的字符
                return false;
            }
        }
        // 判断是否与右上方发生冲突
        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if(board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        // 判断是否与左上方发生冲突
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }
}


// @lc code=end

