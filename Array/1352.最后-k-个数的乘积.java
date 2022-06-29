package Array;

import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=1352 lang=java
 *
 * [1352] 最后 K 个数的乘积
 */

// @lc code=start
/*
 * 同样是前缀和思想解决本题
 * 只需要考虑当加入0时的特殊情况：add(0)后之前所添加的数字乘积就为0
 * 需要在add(0)后重新记录后续乘积
 */
class ProductOfNumbers {
    // 前缀积数组
    // preProduct[i] / preProduct[j] 就是 [i, j] 之间的元素积
    ArrayList<Integer> preProduct = new ArrayList<>();

    public ProductOfNumbers() {
        // 初始化放一个 1，便于计算后续添加元素的乘积
        preProduct.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            // 如果添加的元素是 0，则前面的元素积都为0
            preProduct.clear();
            preProduct.add(1);
            return;
        }
        // 前缀积数组中每个元素
        preProduct.add(preProduct.get(preProduct.size() - 1) * num);
    }
    
    public int getProduct(int k) {
        if(preProduct.size() - 1 < k) {
            // 不足 k 个元素，是因为最后 k 个元素存在 0
            return 0;
        }
        // 计算最后 k 个元素积
        return preProduct.get(preProduct.size() - 1) / preProduct.get(preProduct.size() - 1 - k);
    }
}


/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
// @lc code=end

