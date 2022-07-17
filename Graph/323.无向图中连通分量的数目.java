package Graph;

class Solution {
    public int countComponents(int n, int[][] edges) {
        UF uf = new UF(n);
        for(int[] e : edges) {
            uf.union(e[0], e[1]);
        }
        return uf.count();
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
}

