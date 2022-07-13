import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=341 lang=java
 *
 * [341] 扁平化嵌套列表迭代器
 */

// @lc code=start
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

 /*
  * 相当于一个 N 叉树
  * 其叶子结点为 Integer 类型，val 字段非空
  * 其他节点为 List<NestedInteger> 类型，list 字段非空，装着子节点
  * 问题转化为遍历叶子结点
  */
public class NestedIterator implements Iterator<Integer> {
    private Iterator<Integer> it;

    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> res = new LinkedList<>();
        for(NestedInteger node : nestedList) {
            traverse(node, res);
        }
        this.it = res.iterator();
    }

    @Override
    public Integer next() {
        return it.next();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    private void traverse(NestedInteger root, List<Integer> res) {
        if(root.isInteger()) {
            res.add(root.getInteger());
            return;
        }
        for(NestedInteger child : root.getList()) {
            traverse(child, res);
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
// @lc code=end

