import java.util.Stack;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
// // 原始思路
// class MinStack {
//     // 记录栈中的所有元素
//     Stack<Integer> stk = new Stack<>();
//     // 阶段性记录栈中的最小元素
//     Stack<Integer> minStk = new Stack<>();

//     public void push(int val) {
//         stk.push(val);
//         // 维护 minStk 栈顶为全栈最小元素
//         if (minStk.isEmpty() || val <= minStk.peek()) {
//             // 新插入的这个元素就是全栈最小的
//             minStk.push(val);
//         } else {
//             // 插入的这个元素比较大
//             minStk.push(minStk.peek());
//         }
//     }
    
//     public void pop() {
//         stk.pop();
//         minStk.pop();
//     }
    
//     public int top() {
//         return stk.peek();
//     }
    
//     public int getMin() {
//         // minStk 栈顶为全栈最小元素
//         return minStk.peek();
//     }
// }
// 优化版
class MinStack {
    // 记录栈中的所有元素
    Stack<Integer> stk = new Stack<>();
    // 阶段性记录栈中的最小元素
    Stack<Integer> minStk = new Stack<>();

    public void push(int val) {
        stk.push(val);
        // 维护 minStk 栈顶为全栈最小元素
        if (minStk.isEmpty() || val <= minStk.peek()) {
            // 新插入的这个元素就是全栈最小的
            minStk.push(val);
        }
    }

    public void pop() {
        // 注意 Java 的语言特性，比较 Integer 相等要用 equals 方法
        if (stk.peek().equals(minStk.peek())) {
            // 弹出的元素是全栈最小的
            minStk.pop();
        }
        stk.pop();
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        // minStk 栈顶为全栈最小元素
        return minStk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

