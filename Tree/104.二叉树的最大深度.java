/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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

 /*
  * 二叉树问题基本都可以使用二叉树遍历框架
  * 需要弄清楚问题所需的代码的位置与时机
  * 要清楚前中后序遍历位置的意义
  * 这里在前序遍历位置让 depth++，在进入子树前增大深度，同时保存更大的深度
  * 在后续遍历位置让 depth--，此时即将离开子树
  */
// class Solution {
//     int depth = 0;
//     int res = 0;

//     public int maxDepth(TreeNode root) {
//         traverse(root);
//         return res;
//     }
//     // 遍历二叉树
//     private void traverse(TreeNode root) {
//         if(root == null) {
//             return;
//         }
//         // 前序遍历位置
//         depth++;
//         // 遍历的过程中记录最大深度
//         res = res < depth ? depth : res;
//         traverse(root.left);
//         traverse(root.right);
//         // 后序遍历位置
//         depth--;
//     }
// }

class Solution {
    // 定义：输入一个节点，返回以该节点为根的二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        // 根据左右子树的最大深度推出原二叉树的最大深度
        return leftMax > rightMax ? leftMax + 1 : rightMax + 1;
    }
}


// @lc code=end

