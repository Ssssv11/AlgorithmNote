package Graph;
/*
 * @lc app=leetcode.cn id=886 lang=java
 *
 * [886] 可能的二分法
 */

import java.util.LinkedList;

// @lc code=start
class Solution {
    private boolean ok = true;
    private boolean[] color;
    private boolean[] visited;

    public boolean possibleBipartition(int n, int[][] dislikes) {
        // 图节点编号从 1 开始
        color = new boolean[n + 1];
        visited = new boolean[n + 1];

        // 转化成邻接表表示图结构
        List<Integer>[] graph = buildGraph(n, dislikes);

        for(int i = 0; i <= n; i++) {
            if(!visited[i]) {
                traverse(graph, i);
            }
        }
        return ok;
    }

    private List<Integer>[] buildGraph(int n, int[][] dislikes) {
        // 图节点编号为 1...n
        List<Integer>[] graph = new LinkedList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new LinkedList<>();
        }
        for(int[] edge : dislikes) {
            int v = edge[1], w = edge[0];
            graph[v].add(w);
            graph[w].add(v);
        }
        return graph;
    }

    private void traverse(List<Integer>[] graph, int v) {
        if(!ok) {
            return;
        }
        visited[v] = true;
        for(int w : graph[v]) {
            if(!visited[w]) {
                color[w] = !color[v];
                traverse(graph, w);
            } else {
                if(color[w] == color[v]) {
                    ok = false;
                }
            }
        }
    }
}
// @lc code=end

