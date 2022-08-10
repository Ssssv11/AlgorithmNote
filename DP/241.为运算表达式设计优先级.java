package DP;

import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=241 lang=java
 *
 * [241] 为运算表达式设计优先级
 */

// @lc code=start
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // 扫描算式中的运算符
            if (c == '-' || c == '*' || c == '+') {
                /* 分 */
                // 以运算符为中心，分割成两个字符串，分别递归计算
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

                /* 治 */
                // 通过子问题的结果，合成原问题的结果
                for (int a : left) {
                    for (int b : right) {
                        if (c == '+') {
                            res.add(a + b);
                        } else if (c == '-') {
                            res.add(a - b);
                        } else if (c == '*') {
                            res.add(a * b);
                        }
                    }
                }
                
            }
        }

        // base case
        // 如果 res 为空，说明算式是一个数字，没有运算符
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }
        return res;
    }

}
// @lc code=end
