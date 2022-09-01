package Array;

import java.util.Stack;

/*
 * @lc app=leetcode.cn id=1475 lang=java
 *
 * [1475] 商品折扣后的最终价格
 */

// @lc code=start
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];

        // 下一个小于等于 price[i] 的价格就是优惠券折扣
        int[] nextElement = nextLessOrEqualElement(prices);
        for (int i = 0; i < prices.length; i++) {
            // 如果存在优惠券，则减少相应的价格
            if (nextElement[i] != -1) {
                res[i] = prices[i] - nextElement[i];
            } else {
                res[i] = prices[i];
            }
        }
        return res;
    }

    // 单调栈模板：计算 nums 中每个元素的下一个更小或相等的元素
    private int[] nextLessOrEqualElement(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            // 删掉 nums[i] 后面较大的元素
            while(!stack.isEmpty() && stack.peek() > nums[i]) {
                stack.pop();
            }
            // 现在栈顶就是 nums[i] 身后的更小或相等元素
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }
}
// @lc code=end

