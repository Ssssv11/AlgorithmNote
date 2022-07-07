import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
  * 首先可以想到层序遍历比较
  * 若使用递归，可以发现每次都比较左子树与右子树是否相等
  * 不等则直接返回，否则递归到为 null
  */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        // 检查两棵子树是否对称
        return check(root.left, root.right);
    }

    public boolean check(TreeNode left, TreeNode right) {
        if(left == null || right == null) {
            return left == right;
        }
        // 两个根节点需要相同
        if(left.val != right.val) {
            return false;
        }
        // 左右子节点需要对称相同
        return check(left.left, right.right) && check(left.right, right.left);
    }
}
// @lc code=end

