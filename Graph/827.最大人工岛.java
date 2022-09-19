package Graph;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=827 lang=java
 *
 * [827] 最大人工岛
 */

// @lc code=start
class Solution {
    public int largestIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 1;
        int result = 0, index = 2;
        HashMap<Integer, Integer> areasMap = new HashMap<>();
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1) areasMap.put(index, calculateAreas(index++, grid, i, j)); // 只计算未编号的岛屿

        if (areasMap.size() == 0) return 1; // 没有岛屿，全是海洋
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> islands = getIslands(grid, i, j);
                    if (islands.size() == 0) continue; // 周围没有岛屿
                    result = Math.max(result, islands.stream().map(item -> areasMap.get(item)).reduce(Integer::sum).orElse(0) + 1);
                }
            }
        }
        if (result == 0) return areasMap.get(2); // 全是岛屿，没有海洋
        return result;
    }

    public int calculateAreas(int index, int[][] grid, int row, int column) {
        if (!isLegal(grid, row, column) || grid[row][column] != 1) return 0;
        grid[row][column] = index;
        return calculateAreas(index, grid, row + 1, column) + calculateAreas(index, grid, row - 1, column) + calculateAreas(index, grid, row, column - 1) + calculateAreas(index, grid, row, column + 1) + 1;
    }

    public boolean isLegal(int[][] grid, int row, int column) {
        return row >= 0 && row < grid.length && column >= 0 && column < grid[0].length;
    }

    public Set<Integer> getIslands(int[][] grid, int row, int column) {
        Set<Integer> result = new HashSet<>();
        if (isLegal(grid, row + 1, column) && grid[row + 1][column] != 0)
            result.add(grid[row + 1][column]);
        if (isLegal(grid, row - 1, column) && grid[row - 1][column] != 0)
            result.add(grid[row - 1][column]);
        if (isLegal(grid, row, column - 1) && grid[row][column - 1] != 0)
            result.add(grid[row][column - 1]);
        if (isLegal(grid, row, column + 1) && grid[row][column + 1] != 0)
            result.add(grid[row][column + 1]);
        return result;
    }
}
// @lc code=end

