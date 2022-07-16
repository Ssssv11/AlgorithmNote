package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=210 lang=java
 *
 * [210] 课程表 II
 */

// @lc code=start
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);
        // 构建入度数组
        int[] indegree = new int[numCourses];
        for(int[] edge : prerequisites) {
            int from = edge[1], to = edge[0];
            indegree[to]++;
        }

        // 根据入度初始化队列中的节点
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                // 节点 i 没有入度，即没有依赖的节点
                // 可以作为拓扑排序的起点，加入队列
                queue.offer(i);
            }
        }

        // 记录遍历的节点个数
        int count = 0;
        // 记录拓扑排序结果
        int[] res = new int[numCourses];
        // 开始执行 BFS 循环
        while(!queue.isEmpty()) {
            // 弹出节点 cur，并将它指向的节点的入度减一
            int cur = queue.poll();
            res[count] = cur;
            count++;
            for(int next : graph[cur]) {
                indegree[next]--;
                if(indegree[next] == 0) {
                    // 如果入度变为 0，说明 next 依赖的节点都已被遍历
                    queue.offer(next);
                }
            }
        }
        if (count != numCourses) {
            // 存在环，拓扑排序不存在
            return new int[]{};
        }
        
        return res;
    }

    private List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new LinkedList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new LinkedList<>();
        }

        for (int[] edge : prerequisites) {
            int from = edge[1], to = edge[0];
            graph[from].add(to);
        }
        return graph;
    }
}
// @lc code=end

