package Else;

import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start

/*
 * 利用栈
 * 左括号就入栈，右括号就与栈中最近的左括号匹配
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(!stack.isEmpty() && stack.peek().equals(match(ch))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private char match(char ch) {
        if (ch == '}') {
            return '{';
        }
        if (ch == ')') {
            return '(';
        }
        return '[';
    }
}
// @lc code=end

