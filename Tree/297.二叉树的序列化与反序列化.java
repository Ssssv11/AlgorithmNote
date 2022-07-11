import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=297 lang=java
 *
 * [297] 二叉树的序列化与反序列化
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
public class Codec {
    private String SEP = ",";
    private String NULL = "#";

    // Encodes a tree to a single string.
    // 主函数，将二叉树序列化为字符串
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }
    // 辅助函数，将二叉树存入 StringBuilder
    private void serialize(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append(NULL).append(SEP);
            return;
        }
        sb.append(root.val).append(SEP);

        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    // 主函数，将字符串反序列化为二叉树结构
    public TreeNode deserialize(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s : data.split(SEP)) {
            nodes.addLast(s);
        }
        return deserialize(nodes);
    }

    // 辅助函数，通过 nodes 列表构造二叉树
    private TreeNode deserialize(LinkedList<String> nodes) {
        if(nodes.isEmpty()) {
            return null;
        }
        // 列表最左侧就是根节点
        String first = nodes.removeFirst();
        if(first.equals(NULL)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(first));

        root.left = deserialize(nodes);
        root.right = deserialize(nodes);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end

