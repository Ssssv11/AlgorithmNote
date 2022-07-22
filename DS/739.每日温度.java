package DS;
/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

import java.util.Stack;

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        // 存放元素索引，而不是元素
        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : (stack.peek() - i);
            stack.push(i);
        }

        return res;
    }
}
// @lc code=end

