/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
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
  * 先构造根节点，再构造左右子树
  * 一个有序数组对于 BST 来说就是中序遍历结果
  * 根节点在数组中心，数组左侧是左子树元素，右侧是右子树元素。
  */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    // 将闭区间 [left, right] 中的元素转化成 BST，返回根节点
    private TreeNode build(int[] nums, int left, int right) {
        if(left > right) {
            // 区间为空
            return null;
        }
        // 构造根节点
        // BST 节点左小右大，中间的元素就是根节点
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 递归构建左子树
        root.left = build(nums, left, mid - 1);
        // 递归构建右子树
        root.right = build(nums, mid + 1, right);
        return root;
    }
}
// @lc code=end

