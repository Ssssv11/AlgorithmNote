package Graph;

/*
 * @lc app=leetcode.cn id=1905 lang=java
 *
 * [1905] 统计子岛屿
 */

// @lc code=start
class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length, n = grid2[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid2[i][j] == 1 && grid1[i][j] == 0) {
                    // 这样的岛屿肯定不是子岛屿，淹没
                    dfs(grid2, i, j);
                }
            }
        }

        // 剩下的都是子岛屿，统计数量
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid2[i][j] == 1) {
                    res++;
                    dfs(grid2, i, j);
                }
            }   
        }
        return res;
    }

    private void dfs(int[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }
        if(grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
// @lc code=end

