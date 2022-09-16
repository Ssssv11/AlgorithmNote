package Array;
/*
 * @lc app=leetcode.cn id=850 lang=java
 *
 * [850] 矩形面积 II
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

// @lc code=start
class Solution {
    private static final int maxNode = 201;
    private static final int mod = (int) 1e9 + 7;
    // 常数 in 和 out 分别指示当前扫描线是入扫描线或者出扫描线
    private static final int in = 1;
    private static final int out = -1;

    // 用于扫描线问题的线段树类
    private class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int len;
        public int cover;
    }

    private void update(TreeNode root, int start, int end, int left, int right, int cover) {
        // 先为当前节点动态开左右节点
        pushDown(root);
        if (left <= start && end <= right) {
            root.cover += cover;
            // pushUp 更新当前节点的区间长度
            pushUp(root, start, end);
            return;
        }
        int mid = start + (end - start) / 2;
        // 分别更新左右区间
        if (left <= mid)
            update(root.left, start, mid, left, right, cover);
        if (mid < right)
            update(root.right, mid + 1, end, left, right, cover);
        // pushUp 更新当前节点的区间长度
        pushUp(root, start, end);
    }

    // 更新线段树节点对应的区间长度
    private void pushUp(TreeNode root, int start, int end) {
        // root.cover 是更新到当前区间上所有扫描线的 in 或者 out 标记之和，如果 cover > 0，意味着当前区间还在被扫描线直接覆盖着
        if (root.cover > 0)
            // 如果还有矩形覆盖，就通过反向的 HashMap 计算出当前节点对应区间的覆盖长度
            root.len = rev.get(end + 1) - rev.get(start);
        // cover == 0，且当前节点代表的是一个区间，则有两种可能：一是这个节点是两个具有 cover 标记的上层节点，那这个节点代表的区间内矩形覆盖的长度就应该是左右子节点覆盖的长度之和；二是可能当前区间已经到了出扫描线，此时应该取消这段区间覆盖矩形的面积，从而取左右节点还覆盖的其他长度之和
        else if (start != end)
            root.len = root.left.len + root.right.len;
        // 如果 start == end，意味着单个节点，不代表任何区间，长度自然是 0
        else
            root.len = 0;
    }

    // 动态开左右节点
    private void pushDown(TreeNode root) {
        if (root.left == null)
            root.left = new TreeNode();
        if (root.right == null)
            root.right = new TreeNode();
    }

    // 用 TreeSet 将纵坐标去重并用于后续离散化
    private TreeSet<Integer> set = new TreeSet<>();
    // 用正反两个 HashMap 存储离散化后坐标和实际纵坐标的关系
    private Map<Integer, Integer> map = new HashMap<>();
    private Map<Integer, Integer> rev = new HashMap<>();

    public int rectangleArea(int[][] rectangles) {
        List<int[]> arr = new ArrayList<>();
        for (int[] rect : rectangles) {
            // 将矩形的左边记为入扫描线
            arr.add(new int[] {rect[0], rect[1], rect[3], in});
            // 将矩形的右边即为出扫描线
            arr.add(new int[] {rect[2], rect[1], rect[3], out});
            set.add(rect[1]);
            set.add(rect[3]);
        }
        // 将纵坐标离散化，从 1 开始
        int count = 1;
        for (int x : set) {
            // 记录实际坐标和离散化坐标的关系
            map.put(x, count);
            // 记录离散化坐标和实际坐标的关系
            rev.put(count, x);
            count++;
        }
        // 将所有的扫描线按照横坐标排序
        Collections.sort(arr, (x, y) -> x[0] - y[0]);
        // 开线段树的根节点
        TreeNode root = new TreeNode();
        long res = 0;      
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int[] cur = arr.get(i);
            // 分别取出当前扫描线的上下端点
            int left = map.get(cur[1]);
            int right = map.get(cur[2]);
            // 至少要两条扫描线才可以进行区间的面积计算，因此从 i = 1 开始统计面积
            if (i > 0)
                // 当前（还未更新目前的扫描线）线段树节点的区间长度即前一条扫描线和当前扫描线之间的区间的纵向覆盖长度 L，而这一段面积可以由 S = L * deltaX 计算
                res += (long) root.len * (cur[0] - arr.get(i - 1)[0]);
            // 将当前的扫描线更新到线段树上
            update(root, 1, maxNode, left, right - 1, cur[3]);
        }
        return (int) (res % mod);
    }
}
// @lc code=end

