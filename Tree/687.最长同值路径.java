/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
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
    private int res = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) {
            return 0;
        }

        traverse(root, root.val);
        return res;
    }

    private int traverse(TreeNode root, int parentValue) {
        if(root == null) {
            return 0;
        }
        
        int leftLen = traverse(root.left, root.val);
        int rightLen = traverse(root.right, root.val);

        res = Math.max(res, leftLen + rightLen);
        if(root.val != parentValue) {
            return 0;
        }

        return 1 + Math.max(leftLen, rightLen);
    }
}
// @lc code=end

