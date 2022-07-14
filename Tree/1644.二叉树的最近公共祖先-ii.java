package Tree;

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
    // 记录 p、q 是否存在于树中
    private boolean foundP = false, foundQ = false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = find(root, p, q);
        if (!foundP || !foundQ) {
            return null;
        }
        // p 和 q 都存在二叉树中，才有公共祖先
        return res;
    }

    private TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }

        TreeNode left = find(root.left, p, q);
        TreeNode right = find(root.right, p, q);

        // 后序位置，判断当前节点是不是 LCA 节点
        if(left != null && right != null) {
            return root;
        }

        if(root.val == left.val || root.val == right.val) {
            if(root.val == left.val) {
                foundP = true;
            }
            if(root.val == right.val) {
                foundQ = true;
            }
            return root;
        }
        return left != null ? left : right;
    }
}