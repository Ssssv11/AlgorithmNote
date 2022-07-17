package Graph;
/*
 * @lc app=leetcode.cn id=785 lang=java
 *
 * [785] 判断二分图
 */

// @lc code=start
class Solution {
    // 记录图是否符合二分图性质
    private boolean ok = true;
    // 记录图中节点的颜色，false 和 true 代表两种不同颜色
    private boolean[] color;
    // 记录图中节点是否被访问过
    private boolean[] visited;

    public boolean isBipartite(int[][] graph) {
        color = new boolean[graph.length];
        visited = new boolean[graph.length];

        // 因为图不一定是联通的，可能存在多个子图
        // 所以要把每个节点都作为起点进行一次遍历
        // 如果发现任何一个子图不是二分图，整幅图都不算二分图
        for(int i = 0; i < graph.length; i++) {
            if(!visited[i]) {
                traverse(graph, i);
            }
        }

        return ok;
    }

    private void traverse(int[][] graph, int v) {
        if(!ok) {
            return;
        }
        visited[v] = true;
        for(int w : graph[v]) {
            if(!visited[w]) {
                // 相邻节点 w 没有被访问过
                // 给节点 w 涂上和节点 v 不同的颜色
                color[w] = !color[v];
                // 继续遍历 w
                traverse(graph, w);
            } else {
                // 相邻节点 w 已经被访问过
                // 根据 v 和 w 的颜色判断是否是二分图
                if(color[w] == color[v]) {
                    // 若相同，则此图不是二分图
                    ok = false;
                }
            }
        }
    }
}
// @lc code=end

