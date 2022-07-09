/*
 * @lc app=leetcode.cn id=652 lang=java
 *
 * [652] 寻找重复的子树
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
  * 要想知道以自己为根的子树是不是重复的，需要知道：
  * 1. 以自己为根的子树的结构
  * 2. 以其他节点为根的子树的结构
  * 对于子树的结构，可以使用二叉树的前序/中序/后序遍历结果来描述
  * 对于其他节点，每个节点都把以自己为根的子树的样子存到一个外部的数据结构里即可。
  */
class Solution {
    // 记录所有子树以及出现的次数
    HashMap<String, Integer> count = new HashMap<>();
    // 记录重复的子树根节点
    LinkedList<TreeNode> res = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }
    private String traverse(TreeNode root) {
        if(root == null) {
            return "#";
        }
        String left = traverse(root.left);
        String right = traverse(root.right);
        // 后序位置
        String subTree = left + "," + right + "," + root.val;
        int freq = count.getOrDefault(subTree, 0);
        // 多次重复也只会被加入结果集一次
        if (freq == 1) {
            res.add(root);
        }
        // 给子树对应的出现次数加一
        count.put(subTree, freq + 1);
        return subTree;
    }
}
// @lc code=end

