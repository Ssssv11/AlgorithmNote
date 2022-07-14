package Tree;
/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root, p, q);
    }

    // 在二叉树中寻找 p 和 q 的最近公共祖先节点
    private TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        // 前序位置
        if(root.val == p.val || root.val == q.val) {
            // 遇到目标值，直接返回
            return root;
        }
        
        TreeNode left = find(root.left, p, q);
        TreeNode right = find(root.right, p, q);

        // 后序位置，已经知道左右子树是否存在目标值
        if(left != null && right != null) {
            // 当前节点是 LCA 节点
            return root;
        }
        return left != null ? left : right;
    }
}
// @lc code=end

