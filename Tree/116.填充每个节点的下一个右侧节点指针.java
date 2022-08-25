/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

/*
 * 若使用普通遍历，则不同根节点的两个节点间无法加上指针
 * 因此将其抽象为三叉树，遍历两个节点间的空隙，将相邻的两个节点看作一个节点
 * 然后将自己内部的两个节点串起来即可
 */
class Solution {
    public Node connect(Node root) {
        if(root == null) {
            return null;
        }
        // 遍历「三叉树」，连接相邻节点
        traverse(root.left, root.right);
        return root;
    }
    private void traverse(Node node1, Node node2) {
        if(node1 == null || node2 == null) {
            return;
        }
        // 将传入的两个节点串起来
        node1.next = node2;
        // 连接相同父节点的两个子节点
        traverse(node1.left, node1.right);
        traverse(node2.left, node2.right);
        // 连接跨越父节点的两个子节点
        traverse(node1.right, node2.left);
    }
}
// @lc code=end

