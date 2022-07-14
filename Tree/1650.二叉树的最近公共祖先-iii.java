package Tree;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node a = p, b = q;
        while(a != b) {
            if(a == null) {
                // a 走一步，如果走到根节点，转到 q 节点
                a = q;
            } else {
                a = a.parent;
            }
            if(b == null) {
                // a 走一步，如果走到根节点，转到 q 节点
                b = p;
            } else {
                b = b.parent;
            }
        }   
        return a;
    }
}