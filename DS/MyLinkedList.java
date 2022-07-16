package DS;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E>{
    /**
     * 虚拟头节点
     */
    final private Node<E> head;

    /**
     * 虚拟尾节点
     */
    final private Node<E> tail;

    /**
     * 当前元素个数
     */
    private int size;

    /**
     * 双链表节点
     */
    private static class Node<E> {
        E val;
        Node<E> next;
        Node<E> prev;

        Node(E val) {
            this.val = val;
        }
    }

    /**
     * 构造函数初始化头尾节点
     */
    public MyLinkedList() {
        this.head = new Node<>(null);
        this.tail = new Node<>(null);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
    }

    // 增

    /**
     * Appends the specified element to the end of this list.
     * @param e the element to add
     */
    public void addLast(E e) {
        Node<E> node = new Node<>(e);
        Node<E> temp = tail.prev;

        // temp <-> tail
        temp.next = node;
        node.prev = temp;

        node.next = tail;
        tail.prev = node;
        // temp <-> node <-> tail

        size++;
    }

    /**
     * Inserts the specified element at the beginning of this list.
     * @param e the element to add
     */
    public void addFirst(E e) {
        Node<E> node = new Node<>(e);
        Node<E> temp = head.next;

        // head <-> temp
        temp.prev = node;
        node.next = temp;

        head.next = node;
        node.prev = head;
        // head <-> node <-> temp

        size++;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param e element to be inserted
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, E e) {
        checkPositionIndex(index);
        if(index == size) {
            addLast(e);
            return;
        }

        Node<E> node = getNode(index);
        Node<E> temp = node.prev;

        // temp <-> node
        Node<E> newNode = new Node<>(e);

        node.prev = newNode;
        temp.next = newNode;

        newNode.next = node;
        newNode.prev = temp;
        // temp <-> newNode <-> node

        size++;
    }

    /**
     * Appends the specified element to the end of this list.
     * <p>This method is equivalent to {@link #addLast}.
     *
     * @param e element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
    public boolean add(E e) {
        addLast(e);
        return true;
    }


    // 删

    /**
     * Removes and returns the first element from this list.
     * @return the first element from this list
     * @throws NoSuchElementException if this list is empty
     */
    public E removeFirst() {
        if(size < 1) {
            throw new NoSuchElementException();
        }
        Node<E> node = head.next;
        Node<E> temp = node.next;

        // head <-> node <-> temp
        head.next = temp;
        temp.prev = head;

        node.prev = null;
        node.next = null;
        // head <-> temp

        size--;

        return node.val;
    }

    /**
     * Removes and returns the last element from this list.
     * @return the last element from this list
     * @throws NoSuchElementException if this list is empty
     */
    public E removeLast() {
        if(size < 1) {
            throw new NoSuchElementException();
        }
        Node<E> node = tail.prev;
        Node<E> temp = node.prev;

        // temp <-> node <-> tail
        tail.prev = temp;
        temp.next = tail;

        node.next = null;
        node.prev = null;

        size--;

        return node.val;
    }

    /**
     * Removes the element at the specified position in this list.  Shifts any
     * subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException
     */
    public E remove(int index) {
        checkElementIndex(index);

        Node<E> node = getNode(index);
        Node<E> prev = node.prev;
        Node<E> next = node.next;

        // prev <-> node <-> next
        prev.next = next;
        next.prev = prev;

        node.prev = null;
        node.next = null;
        // prev <-> next

        size--;

        return node.val;
    }

    // 改

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     * @param index index of the element to replace
     * @param e element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException
     */
    public E set(int index, E e) {
        checkElementIndex(index);
        Node<E> node = getNode(index);

        E oldVal = node.val;
        node.val = e;

        return oldVal;
    }

    // 查

    /**
     * Returns the element at the specified position in this list.
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    public E get(int index) {
        checkElementIndex(index);

        Node<E> node = getNode(index);

        return node.val;
    }

    /**
     * Returns the first element in this list.
     * @return the first element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public E getFirst() {
        if(size < 1) {
            throw new NoSuchElementException();
        }
        return head.next.val;
    }

    /**
     * Returns the first element in this list.
     * @return the first element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public E getLast() {
        if(size < 1) {
            throw new NoSuchElementException();
        }
        return tail.prev.val;
    }

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    public int size() {
        return size;
    }

     /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the node at the specified position in this list
     * @param index index of the node to return
     * @return the node at the specified position in this list
     */
    private Node<E> getNode(int index) {
        checkElementIndex(index);
        Node<E> p = head.next;
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

    /**
     * Tells if the argument is the index of a valid position for an
     * iterator or an add operation.
     */
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    /**
     * 检查 index 索引位置是否可以存在元素
     * @param index index of the list to check.
     */
    private void checkElementIndex(int index) {
        if(!isElementIndex(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * 检查 index 索引位置是否可以添加元素
     * @param index index of the list to check.
     */
    private void checkPositionIndex(int index) {
        if(!isPositionIndex(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            Node<E> p = head.next;

            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public E next() {
                E val = p.val;
                p = p.next;
                return val;
            }
        };
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(7, 8);
        list.addFirst(10);
        list.get(0);
        list.removeFirst();
        list.removeLast();
        
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------");
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
