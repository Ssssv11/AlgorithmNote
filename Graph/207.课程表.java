package Graph;

import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=207 lang=java
 *
 * [207] 课程表
 */

// @lc code=start
class Solution {
    // 记录遍历过的节点
    private boolean[] visited;

    // 记录一次递归堆栈中的节点
    private boolean[] onPath;

    // 记录图中是否有环
    private boolean hasCycle = false;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);

        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            traverse(graph, i);
        }
        return !hasCycle;
    }

    private List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new LinkedList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new LinkedList<>();
        }

        for(int[] edge : prerequisites) {
            int from = edge[1], to = edge[0];
            // 边的方向是「被依赖」关系，即修完课程 from 才能修课程 to
            graph[from].add(to);
        }
        return graph;
    }

    private void traverse(List<Integer>[] graph, int s){
        if(onPath[s]) {
            // 存在环
            hasCycle = true;
        }
        if(visited[s] || hasCycle) {
            return;
        }

        visited[s] = true;
        onPath[s] = true;
        for(int t : graph[s]){
            traverse(graph, t);
        }
        onPath[s] = false;
    }
}
// @lc code=end

