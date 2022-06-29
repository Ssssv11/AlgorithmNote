package Array;

/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int balance = 0;
        for(int i=0; i<prices.length-1; i++){
            balance += Math.max(prices[i + 1] - prices[i], 0);
        }
        return balance;
    }
}
// @lc code=end

