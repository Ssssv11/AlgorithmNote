import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=95 lang=java
 *
 * [95] 不同的二叉搜索树 II
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new LinkedList<>();
        // 构造闭区间 [1, n] 组成的 BST 
        return build(1, n);
    }

    private List<TreeNode> build(int lo, int hi) {
        List<TreeNode> res = new LinkedList<>();
        if(lo > hi) {
            res.add(null);
            return res;
        }

        // 1.穷举 root 节点的所有可能
        for (int i = lo; i <= hi; i++) {
            // 2.递归构造出左右子树的所有合法 BST
            List<TreeNode> leftTree = build(lo, i - 1);
            List<TreeNode> rightTree = build(i + 1, hi);
            // 3.给 root 节点穷举所有左右子树的组合
            for(TreeNode left : leftTree) {
                for(TreeNode right : rightTree) {
                    // i 作为根节点 root 的值
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
// @lc code=end

