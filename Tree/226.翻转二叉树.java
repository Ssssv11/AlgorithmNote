import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
  * 分解问题思路
  * 用 invertTree(x.left) 先把 x 的左子树翻转，
  * 再用 invertTree(x.right) 把 x 的右子树翻转，
  * 最后把 x 的左右子树交换
  * 这样就完成了以 x 为根的整棵二叉树的翻转，即完成了 invertTree(x) 的定义。
  */
// class Solution {
        // 定义：将以 root 为根的这棵二叉树翻转，返回翻转后的二叉树的根节点
//     public TreeNode invertTree(TreeNode root) {
//         if(root == null) {
//             return null;
//         }
//         // 利用函数定义，先翻转左右子树
//         TreeNode left = invertTree(root.left);
//         TreeNode right = invertTree(root.right);
//         // 然后交换左右子节点
//         root.left = right;
//         root.right = left;
//         // 和定义逻辑自恰：以 root 为根的这棵二叉树已经被翻转，返回 root
//         return root;
//     }
// }

/*
 * 遍历思路
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // 遍历二叉树，交换每个节点的子节点
        traverse(root);
        return root;
    }
    private void traverse(TreeNode root) {
        if(root == null) {
            return;
        }
        // 每一个节点需要做的事就是交换它的左右子节点
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // 遍历框架，去遍历左右子树的节点
        traverse(root.left);
        traverse(root.right);
    }
}
// @lc code=end

