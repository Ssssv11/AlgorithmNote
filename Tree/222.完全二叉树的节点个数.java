/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
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
 * 遍历解法
 */
// class Solution {
//     public int countNodes(TreeNode root) {
//         return traverse(root);
//     }

//     private int traverse(TreeNode root) {
//         if(root == null) {
//             return 0;
//         }
//         int left = traverse(root.left);
//         int right = traverse(root.right);
//         return left + right + 1;
//     }
// }

/*
 * 遍历方法与高度结合
 * 判断是否是满二叉树
 */
class Solution {
    public int countNodes(TreeNode root) {
        TreeNode l = root, r = root;
        // 沿最左侧和最右侧分别计算高度
        int hl = 0, hr = 0;
        while(l != null) {
            l = l.left;
            hl++;
        }
        while(r != null) {
            r = r.right;
            hr++;
        }
        // 如果左右侧计算的高度相同，则是一棵满二叉树
        if(hl == hr) {
            return (int)Math.pow(2, hl) - 1;
        }
        // 如果左右侧的高度不同，则按照普通二叉树的逻辑计算
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
// @lc code=end

