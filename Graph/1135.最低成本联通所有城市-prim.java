package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int minimumCost(int n, int[][] connections) {
        List<int[]>[] graph = buildGraph(n, connections);
        Prim prim = new Prim(graph);
        if(!prim.allConnected()) {
            return -1;
        }
        return prim.weightSum();
    }

    List<int[]>[] buildGraph(int n, int[][] connections) {
        List<int[]>[] graph = new LinkedList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new LinkedList<>();
        }
        for(int[] conn : connections) {
            // 题目给的节点编号从 1 开始
            // 但实现的 Prim 算法需要从 0 开始编号
            int u = conn[0] - 1;
            int v = conn[1] - 1;
            int weight = conn[2];

            graph[u].add(new int[]{u, v, weight});
            graph[v].add(new int[]{v, u, weight});
        }
        return graph;
    }
}

class Prim {
    private PriorityQueue<int[]> pq;
    private boolean[] inMST;
    private int weightSum = 0;
    private List<int[]>[] graph;

    public Prim(List<int[]>[] graph) {
        this.graph = graph;
        this.pq = new PriorityQueue<>((a, b) -> (a[2] - b[2]));
        
        int n = graph.length;
        this.inMST = new boolean[n];

        inMST[0] = true;
        cut(0);
        while(!pq.isEmpty()) {
            int[] edge = pq.poll();
            int to = edge[1];
            int weight = edge[2];
            if(inMST[to]) {
                continue;
            }
            weightSum += weight;
            inMST[to] = true;
            cut(to);
        }
    }

    private void cut(int s) {
        for(int[] edge : graph[s]) {
            int to = edge[1];
            if(inMST[to]) {
                continue;
            }
            pq.offer(edge);
        }
    }

    public int weightSum() {
        return weightSum;
    }

    public boolean allConnected() {
        for (int i = 0; i < inMST.length; i++) {
            if(!inMST[i]) {
                return false;
            }
        }
        return true;
    }
}