package DP;
/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        // 定义：dp[i] 表示以 nums[i] 这个数结尾的最长递增子序列的长度
        int[] dp = new int[nums.length];
        // base case：dp 数组全都初始化为 1
        Arrays.fill(dp, 1);
    
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
    
        int res = 0;
        for(int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}

/*
 * 二分查找版
 */
// class Solution {
//     int lengthOfLIS(int[] nums) {
//         int[] top = new int[nums.length];
//         // 牌堆数初始化为 0
//         int piles = 0;
//         for (int i = 0; i < nums.length; i++) {
//             // 要处理的扑克牌
//             int poker = nums[i];
    
//             /***** 搜索左侧边界的二分查找 *****/
//             int left = 0, right = piles;
//             while (left < right) {
//                 int mid = (left + right) / 2;
//                 if (top[mid] > poker) {
//                     right = mid;
//                 } else if (top[mid] < poker) {
//                     left = mid + 1;
//                 } else {
//                     right = mid;
//                 }
//             }
            
//             // 没找到合适的牌堆，新建一堆
//             if (left == piles) piles++;
//             // 把这张牌放到牌堆顶
//             top[left] = poker;
//         }
//         // 牌堆数就是 LIS 长度
//         return piles;
//     }
// }
// @lc code=end

