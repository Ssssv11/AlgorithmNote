import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=235 lang=java
 *
 * [235] 二叉搜索树的最近公共祖先
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

// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         return find(root, p, q);
//     }

//     private TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == null) {
//             return null;
//         }
//         if(root.val == p.val || root.val == q.val) {
//             return root;
//         }
//         TreeNode left = find(root.left, p, q);
//         TreeNode right = find(root.right, p, q);
//         if(left != null && right != null) {
//             return root;
//         }
//         return left != null ? left : right;
//     }
// }

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int val1 = p.val < q.val ? p.val : q.val;
        int val2 = p.val > q.val ? p.val : q.val;
        return find(root, val1, val2);
    }

    // 在 BST 中寻找 val1 和 val2 的最近公共祖先节点
    private TreeNode find(TreeNode root, int val1, int val2) {
        if(root == null) {
            return null;
        }
        if(root.val < val1) {
            // 当前节点太小，去右子树找
            return find(root.right, val1, val2);
        }
        if(root.val > val2) {
            // 当前节点太大，去左子树找
            return find(root.left, val1, val2);
        }
        // 此时 val1 <= root.val <= val2
        // 则该节点就是最近公共祖先
        return root;
    }
}
// @lc code=end

