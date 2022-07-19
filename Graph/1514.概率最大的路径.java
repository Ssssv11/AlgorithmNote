package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1514 lang=java
 *
 * [1514] 概率最大的路径
 */

// @lc code=start
class Solution {
    double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<double[]>[] graph = new LinkedList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new LinkedList<>();
        }
    
        // 构造无向图
        for(int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            double weight = succProb[i];
    
            // 双向图
            graph[from].add(new double[]{(double)to, weight});
            graph[to].add(new double[]{(double)from, weight});
        }
        return dijkstra(start, end, graph);
    }
    
    double dijkstra(int start, int end, List<double[]>[] graph) {
        // 定义：probTo[i] 的值就是节点 start 到达节点 i 的最大概率
        double[] probTo = new double[graph.length];
    
        // dp table 初始化为一个取不到的最小值
        Arrays.fill(probTo, -1);
    
        // base case，start 到 start 的概率就是 1
        probTo[start] = 1;
    
         // 优先级队列，probFromStart 较大的排在前面
        Queue<State> pq = new PriorityQueue<>((a, b) -> {
            return Double.compare(b.probFromStart, a.probFromStart);
        });
    
        // 从起点 start 开始进行 BFS
        pq.offer(new State(start, 1));
    
        while(!pq.isEmpty()) {
            State curState = pq.poll();
            int curNodeID = curState.id;
            double curProbFromStart = curState.probFromStart;
    
            // 遇到终点提前返回
            if (curNodeID == end) {
                return curProbFromStart;
            }
            
            if (curProbFromStart < probTo[curNodeID]) {
                // 已经有一条概率更大的路径到达 curNode 节点了
                continue;
            }
            // 将 curNode 的相邻节点装入队列
            for (double[] neighbor : graph[curNodeID]) {
                int nextNodeID = (int)neighbor[0];
                // 判断从 curNode 到 nextNode 的概率是否会更大
                double probToNextNode = probTo[curNodeID] * neighbor[1];
                if (probTo[nextNodeID] < probToNextNode) {
                    probTo[nextNodeID] = probToNextNode;
                    pq.offer(new State(nextNodeID, probToNextNode));
                }
            }
        }
        // 如果到达这里，说明从 start 开始无法到达 end，返回 0
        return 0.0;
    }
    
    class State {
        // 图节点的 id
        int id;
        // 从 start 节点到达当前节点的概率
        double probFromStart;
    
        State(int id, double probFromStart) {
            this.id = id;
            this.probFromStart = probFromStart;
        }
    }
}
// @lc code=end

