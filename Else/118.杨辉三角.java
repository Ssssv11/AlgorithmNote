package Else;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start

/*
 * 迭代
 */
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> res = new  ArrayList<>();
//         if(numRows < 1) {
//             return res;
//         }
//         // 先把第一层装进去作为 base case
//         List<Integer> firstRow = new ArrayList<>();
//         firstRow.add(1);
//         res.add(firstRow);
//         // 开始一层一层生成，装入 res
//         for (int i = 2; i <= numRows; i++) {
//             List<Integer> prevRow = res.get(res.size() - 1);
//             res.add(generateNextRow(prevRow));
//         }
//         return res;
//     }
//     // 输入上一层的元素，生成并返回下一层的元素
//     private List<Integer> generateNextRow(List<Integer> prevRow) {
//         List<Integer> curRow = new ArrayList<>();
//         curRow.add(1);
//         for (int i = 0; i < prevRow.size() - 1; i++) {
//             curRow.add(prevRow.get(i) + prevRow.get(i + 1));
//         }
//         curRow.add(1);
//         return curRow;
//     }
// }

/*
 * 递归
 */
class Solution {
    // 定义：输入 numRows，返回行数为 numRows 的杨辉三角
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 1) {
            List<List<Integer>> triangle = new ArrayList<>();
            // 先把第一层装进去作为 base case
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            triangle.add(firstRow);
            return triangle;
        }

        // 先递归生成高度为 numRows - 1 的杨辉三角
        List<List<Integer>> triangle = generate(numRows - 1);

        // 根据最底层元素生成一行新元素
        List<Integer> bottomRow = triangle.get(triangle.size() - 1);
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);
        for (int i = 0; i < bottomRow.size() - 1; i++) {
            newRow.add(bottomRow.get(i) + bottomRow.get(i + 1));
        }
        newRow.add(1);
        // 把新的一行放到杨辉三角底部
        triangle.add(newRow);

        return triangle;
    }
}
// @lc code=end

