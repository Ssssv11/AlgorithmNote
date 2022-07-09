import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
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
  * 每个二叉树节点都可以认为是一棵子树的根节点，
  * 对于根节点，首先要做的是把想办法把自己先构造出来，然后想办法构造自己的左右子树。
  * 所以需要遍历数组找到最大值 maxVal，从而把根节点 root 做出来
  * 然后对 maxVal 左边的数组和右边的数组进行递归构建，作为 root 的左右子树。
  */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    // 定义：将 nums[lo..hi] 构造成符合条件的树，返回根节点
    private TreeNode build(int[] nums, int low, int high) {
        if(low > high) {
            return null;
        }

        // 找到数组中的最大值和对应的索引
        int index = -1, maxVal = Integer.MIN_VALUE;
        for (int i = low; i <= high; i++) {
            if(nums[i] > maxVal) {
                maxVal = nums[i];
                index = i;
            }
        }
        // 先构造出根节点
        TreeNode root = new TreeNode(maxVal);
        // 递归调用构造左右子树
        root.left = build(nums, low, index - 1);
        root.right = build(nums, index + 1, high);

        return root;
    }
}
// @lc code=end

