package Graph;

class Solution {
    public boolean validTree(int n, int[][] edges) {
        // 初始化 0...n-1 共 n 个节点
        UF uf = new UF(n);

        // 遍历所有边，将组成边的两个节点进行连接
        for(int[] edge : edges) {
            int u = edge[1];
            int v = edge[0];

            // 若两个节点已经在同一连通分量中，会产生环
            if(uf.connected(u, v)) {
                return false;
            }
            // 这条边不会产生环，可以是树的一部分
            uf.union(u, v);
        }
        // 要保证最后只形成了一棵树，即只有一个连通分量
        return uf.count() == 1;
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