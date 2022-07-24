package DS;

import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    private Queue<Integer> q = new LinkedList<>();
    int top = 0;

    public MyStack() {

    }
    
    public void push(int x) {
        q.offer(x);
        top = x;
    }
    
    public int pop() {
        int size = q.size();
        while(size > 2) {
            q.offer(q.poll());
            size--;
        }
        top = q.peek();
        q.offer(q.poll());
        return q.poll();
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

