package LinkedList;
/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
class MyLinkedList {

    /**
     * 虚拟头节点
     */
    final private Node head;

    /**
     * 虚拟尾节点
     */
    final private Node tail;

    /**
     * 当前元素个数
     */
    private int size;

    /**
     * 双链表节点
     */
    private static class Node {
        int val;
        Node next;
        Node prev;

        Node(){}

        Node(int val) {
            this.val = val;
        }
    }

    /**
     * 构造函数初始化头尾节点
     */
    public MyLinkedList() {
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.prev = head;
        this.size = 0;
    }
    
    public int get(int index) {
        if(!isElementIndex(index)) {
            return -1;
        }

        Node node = getNode(index);

        return node.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        Node temp = head.next;

        // head <-> temp
        temp.prev = node;
        node.next = temp;

        head.next = node;
        node.prev = head;
        // head <-> node <-> temp

        size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        Node temp = tail.prev;

        // temp <-> tail
        temp.next = node;
        node.prev = temp;

        node.next = tail;
        tail.prev = node;
        // temp <-> node <-> tail

        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) {
            return;
        }
        if(index == size) {
            addAtTail(val);
            return;
        }
        if(index < 0) {
            addAtHead(val);
            return;
        }

        Node node = getNode(index);
        Node temp = node.prev;

        // temp <-> node
        Node newNode = new Node(val);

        node.prev = newNode;
        temp.next = newNode;

        newNode.next = node;
        newNode.prev = temp;
        // temp <-> newNode <-> node

        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(!isElementIndex(index)) {
            return;
        }

        Node node = getNode(index);
        Node prev = node.prev;
        Node next = node.next;

        // prev <-> node <-> next
        prev.next = next;
        next.prev = prev;

        node.prev = null;
        node.next = null;
        // prev <-> next

        size--;
    }

    /**
     * Returns the node at the specified position in this list
     * @param index index of the node to return
     * @return the node at the specified position in this list
     */
    private Node getNode(int index) {
        if(!isElementIndex(index)) {
            return null;
        }
        Node p = head.next;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p;
    }

    /**
     * Tells if the argument is the index of an existing element.
     */
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

