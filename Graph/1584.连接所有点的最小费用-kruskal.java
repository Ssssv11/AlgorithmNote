package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1584 lang=java
 *
 * [1584] 连接所有点的最小费用
 */

// @lc code=start
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        // 生成所有边及权重
        List<int[]> edges = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int xi = points[i][0], yi = points[i][1];
                int xj = points[j][0], yj = points[j][1];

                // 用坐标点在 points 中的索引表示坐标点
                edges.add(new int[] {
                    i, j, Math.abs(xi - xj) + Math.abs(yi - yj)
                });
            }
        }

        // 将边按照权重从小到大排序
        Collections.sort(edges, (a, b) -> (a[2] - b[2]));

        // Kruskal 算法
        int mst = 0;
        UF uf = new UF(n);
        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            if(uf.connected(u, v)) {
                continue;
            }

            mst += weight;
            uf.union(u, v);
        }
        return mst;
    }
}

class UF {
    // 连通分量个数
    private int count;
    // 存储每个节点的父节点
    private int[] parent;

    // n 为图中节点的个数
    public UF(int n) {
        this.count = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // 将节点 p 和节点 q 连通
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);

        if(rootP == rootQ) {
            return;
        }
        parent[rootP] = parent[rootQ];
        count--;
    }

    public int find(int x) {
        if(parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // 判断节点 p 和节点 q 是否连通
    public boolean connected(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        return rootP == rootQ;
    }

    // 返回图中的连通分量个数
    public int count() {
        return count;
    }
}
// @lc code=end

