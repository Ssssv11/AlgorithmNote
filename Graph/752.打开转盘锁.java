package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=752 lang=java
 *
 * [752] 打开转盘锁
 */

// @lc code=start
class Solution {
    public int openLock(String[] deadends, String target) {
        // 记录需要跳过的 deadens
        Set<String> deads = new HashSet<>();
        for(String s : deadends) {
            deads.add(s);
        }

        // 记录已经穷举过的密码，防止走回头路
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        // 从起点开始 BFS
        int step = 0;
        q.offer("0000");
        visited.add("0000");

        while(!q.isEmpty()) {
            int sz = q.size();
            // 将当前队列中的所有节点向周围扩散
            for(int i = 0; i < sz; i++) {
                String cur = q.poll();

                // 判断是否到达终点
                if(deads.contains(cur)) {
                    continue;
                }
                if(cur.equals(target)) {
                    return step;
                }

                // 将一个节点的未遍历相邻节点加入队列
                for(int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if(!visited.contains(up)) {
                        q.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if(!visited.contains(down)) {
                        q.offer(down);
                        visited.add(down);
                    }
                }
            }
            // 增加步数
            step++;
        }
        // 无法达到
        return -1;
    }

    // 向上转
    String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if(ch[j] == '9') {
            ch[j] = '0';
        } else {
            ch[j] += 1;
        }
        return new String(ch);
    }

    // 向下转
    String minusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if(ch[j] == '0') {
            ch[j] = '9';
        } else {
            ch[j] -= 1;
        }
        return new String(ch);
    }
}
// @lc code=end

