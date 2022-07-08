import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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
  * 由于返回值为 void，因此无法使用遍历构造链表，只能原地修改
  * 对于一个节点 x，可以执行以下流程：
  * 1. 先利用 flatten(x.left) 和 flatten(x.right) 将 x 的左右子树拉直。
  * 2. 将 x 的右子树接到左子树下方，然后将整个左子树作为右子树。
  */
class Solution {
    // 定义：将以 root 为根的树拉平为链表
    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }
        // 利用定义，把左右子树拉直
        flatten(root.left);
        flatten(root.right);

        // 1. 左右子树已经被拉平成一条链表
        TreeNode left = root.left;
        TreeNode right = root.right;

        // 2. 将左子树作为右子树
        root.left = null;
        root.right = left;

        // 3. 将原先的右子树接到当前右子树的末端
        TreeNode p = root;
        while(p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
// @lc code=end

